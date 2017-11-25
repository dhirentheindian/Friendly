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
import semantics.symboltable.scopes.ClassScope;
import semantics.utils.IdentifiedTokens;
import semantics.utils.RecognizedKeywords;

public class FieldAnalyzer implements ParseTreeListener {

    private final static String TAG = "MobiProg_FieldAnalyzer";

    private ClassScope declaredClassScope;
    private IdentifiedTokens identifiedTokens;

    public FieldAnalyzer(IdentifiedTokens identifiedTokens, ClassScope declaredClassScope) {
        this.identifiedTokens = identifiedTokens;
        this.declaredClassScope = declaredClassScope;
    }

    public void analyze(VariableDeclaratorsContext varDecCtxList) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, varDecCtxList);
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
        if(ctx instanceof VariableDeclaratorContext) {
            VariableDeclaratorContext varCtx = (VariableDeclaratorContext) ctx;

            //check for duplicate declarations
            MultipleVarDecChecker multipleDeclaredChecker = new MultipleVarDecChecker(varCtx.variableDeclaratorId());
            multipleDeclaredChecker.verify();

            this.identifiedTokens.addToken(ClassAnalyzer.IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
            this.createMobiValue();

            if(varCtx.variableInitializer() != null) {

                //we do not evaluate strings.
                if(this.identifiedTokens.containsTokens(ClassAnalyzer.PRIMITIVE_TYPE_KEY)) {
                    String primitiveTypeString = this.identifiedTokens.getToken(ClassAnalyzer.PRIMITIVE_TYPE_KEY);
                    if(primitiveTypeString.contains(RecognizedKeywords.PRIMITIVE_TYPE_STRING)) {
                        this.identifiedTokens.addToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY, varCtx.variableInitializer().getText());
                        return;
                    }
                }

                Mapping mappingCommand = new Mapping(varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
                ExecutionManager.getInstance().addCommand(mappingCommand);

                MobiValue declaredMobiValue = this.declaredClassScope.searchVariableIncludingLocal(varCtx.variableDeclaratorId().getText());

                //type check the mobivalue
                TypeChecker typeChecker = new TypeChecker(declaredMobiValue, varCtx.variableInitializer().expression());
                typeChecker.verify();
            }

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    /*
     * Attempts to create an intermediate representation of the variable once a sufficient amount of info has been retrieved.
     */
    private void createMobiValue() {

        if(this.identifiedTokens.containsTokens(ClassAnalyzer.ACCESS_CONTROL_KEY, ClassAnalyzer.PRIMITIVE_TYPE_KEY, ClassAnalyzer.IDENTIFIER_KEY)) {

            String classModifierString = this.identifiedTokens.getToken(ClassAnalyzer.ACCESS_CONTROL_KEY);
            String primitiveTypeString = this.identifiedTokens.getToken(ClassAnalyzer.PRIMITIVE_TYPE_KEY);
            String identifierString = this.identifiedTokens.getToken(ClassAnalyzer.IDENTIFIER_KEY);
            String identifierValueString = null;

           // Console.log(LogType.DEBUG, "Class modifier: " +classModifierString);

            if(this.identifiedTokens.containsTokens(ClassAnalyzer.IDENTIFIER_VALUE_KEY)) {
                identifierValueString = this.identifiedTokens.getToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY);
                this.declaredClassScope.addInitializedVariableFromKeywords(classModifierString, primitiveTypeString, identifierString, identifierValueString);
            }
            else {
                this.declaredClassScope.addEmptyVariableFromKeywords(classModifierString, primitiveTypeString, identifierString);
            }

            MobiValue declaredValue = this.declaredClassScope.searchVariableIncludingLocal(identifierString);
            //verify if the declared variable is a constant
            if(this.identifiedTokens.containsTokens(ClassAnalyzer.CONST_CONTROL_KEY)) {
                declaredValue.markFinal();
            }



            //remove the following tokens
            this.identifiedTokens.removeToken(ClassAnalyzer.IDENTIFIER_KEY);
            this.identifiedTokens.removeToken(ClassAnalyzer.IDENTIFIER_VALUE_KEY);
        }
    }
}
