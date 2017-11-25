package semantics.analyzers;

import antlr.FRIENDLYParser.*;
import builder.errorchecker.MultipleVarDecChecker;
import builder.errorchecker.TypeChecker;
import execution.ExecutionManager;
import execution.commands.evaluation.Mapping;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.representations.MobiValue;
import semantics.symboltable.scopes.LocalScope;
import semantics.symboltable.scopes.LocalScopeCreator;
import semantics.utils.IdentifiedTokens;
import semantics.utils.RecognizedKeywords;


public class LocalVariableAnalyzer implements ParseTreeListener {

    private final static String TAG = "MobiProg_LocalVariableAnalyzer";

    private final static String PRIMITIVE_TYPE_KEY = "PRIMITIVE_TYPE_KEY";
    private final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
    private final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";

    private IdentifiedTokens identifiedTokens;
    private boolean executeMappingImmediate = false;
    private boolean hasPassedArrayDeclaration = false;

    public LocalVariableAnalyzer() {

    }

    public void analyze(LocalVariableDeclarationContext localVarDecCtx) {
        this.identifiedTokens = new IdentifiedTokens();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, localVarDecCtx);

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        this.analyzeVariables(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void analyzeVariables(ParserRuleContext ctx) {
        if(ctx instanceof TypeTypeContext) {
            TypeTypeContext typeCtx = (TypeTypeContext) ctx;
            //clear tokens for reuse
            this.identifiedTokens.clearTokens();

            if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
                PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
                this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());

            }

            //check if its array declaration
            else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
                //Console.log(LogType.DEBUG, "Primitive array declaration: " +typeCtx.getText());
                ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokens, LocalScopeCreator.getInstance().getActiveLocalScope());
                arrayAnalyzer.analyze(typeCtx.getParent());
                this.hasPassedArrayDeclaration = true;
            }

            //this is for class type ctx
            else {
                //a string identified
                if(typeCtx.classOrInterfaceType().getText().contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
                    ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
                    this.identifiedTokens.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
                }
            }


        }

        else if(ctx instanceof VariableDeclaratorContext) {

            VariableDeclaratorContext varCtx = (VariableDeclaratorContext) ctx;

            if(this.hasPassedArrayDeclaration) {
                return;
            }

            //check for duplicate declarations
            if(this.executeMappingImmediate == false) {
                MultipleVarDecChecker multipleDeclaredChecker = new MultipleVarDecChecker(varCtx.variableDeclaratorId());
                multipleDeclaredChecker.verify();
            }

            this.identifiedTokens.addToken(IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
            this.createMobiValue();

            if(varCtx.variableInitializer() != null) {

                //we do not evaluate strings.
                if(this.identifiedTokens.containsTokens(PRIMITIVE_TYPE_KEY)) {
                    String primitiveTypeString = this.identifiedTokens.getToken(PRIMITIVE_TYPE_KEY);
                    if(primitiveTypeString.contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
                        this.identifiedTokens.addToken(IDENTIFIER_VALUE_KEY, varCtx.variableInitializer().getText());
                    }
                }

                this.processMapping(varCtx);

                LocalScope localScope = LocalScopeCreator.getInstance().getActiveLocalScope();
                MobiValue declaredMobiValue = localScope.searchVariableIncludingLocal(varCtx.variableDeclaratorId().getText());

                //type check the mobivalue
                TypeChecker typeChecker = new TypeChecker(declaredMobiValue, varCtx.variableInitializer().expression());
                typeChecker.verify();
            }

        }

    }

    /*
     * Local variable analyzer is also used for loops. Whenever there is a loop,
     * mapping command should be executed immediately to update the value in the symbol table.
     * Otherwise, it proceeds normally.
     */
    private void processMapping(VariableDeclaratorContext varCtx) {
        if(this.executeMappingImmediate) {
            Mapping mappingCommand = new Mapping(varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
            mappingCommand.execute();
        }
        else {
            Mapping mappingCommand = new Mapping(varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
            ExecutionManager.getInstance().addCommand(mappingCommand);
        }
    }

    public void markImmediateExecution() {
        this.executeMappingImmediate = true;
    }

    /*
     * Attempts to create an intermediate representation of the variable once a sufficient amount of info has been retrieved.
     */
    private void createMobiValue() {

        if(this.identifiedTokens.containsTokens(PRIMITIVE_TYPE_KEY, IDENTIFIER_KEY)) {

            String primitiveTypeString = this.identifiedTokens.getToken(PRIMITIVE_TYPE_KEY);
            String identifierString = this.identifiedTokens.getToken(IDENTIFIER_KEY);
            String identifierValueString = null;

            LocalScope localScope = LocalScopeCreator.getInstance().getActiveLocalScope();

            if(this.identifiedTokens.containsTokens(IDENTIFIER_VALUE_KEY)) {
                identifierValueString = this.identifiedTokens.getToken(IDENTIFIER_VALUE_KEY);
                localScope.addInitializedVariableFromKeywords(primitiveTypeString, identifierString, identifierValueString);
            }
            else {
                localScope.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
            }

            //remove the following tokens
            this.identifiedTokens.removeToken(IDENTIFIER_KEY);
            this.identifiedTokens.removeToken(IDENTIFIER_VALUE_KEY);

        }
    }
}
