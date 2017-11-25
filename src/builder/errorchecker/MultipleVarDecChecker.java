/**
 *
 */
package builder.errorchecker;

import antlr.FRIENDLYParser.*;
import builder.BuildChecker;
import builder.ErrorRepository;
import builder.ParserHandler;
import execution.ExecutionManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.representations.MobiFunction;
import semantics.representations.MobiValue;
import semantics.searching.VariableSearcher;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;
import semantics.symboltable.scopes.LocalScopeCreator;

/**
 * Checks for multiple declarations of variables.
 * @author NeilDG
 *
 */
public class MultipleVarDecChecker implements IErrorChecker, ParseTreeListener {
    private final static String TAG = "MobiProg_MultipleVarDecChecker";

    private VariableDeclaratorIdContext varDecIdCtx;
    private int lineNumber;

    public MultipleVarDecChecker(VariableDeclaratorIdContext varDecIdCtx) {
        this.varDecIdCtx = varDecIdCtx;

        Token firstToken = this.varDecIdCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see IErrorChecker#verify()
     */
    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.varDecIdCtx);
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
        if(ctx instanceof VariableDeclaratorIdContext) {
            VariableDeclaratorIdContext varDecCtx = (VariableDeclaratorIdContext) ctx;
            this.verifyVariableOrConst(varDecCtx.getText());
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyVariableOrConst(String identifierString) {
        MobiValue mobiValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            MobiFunction mobiFunction = ExecutionManager.getInstance().getCurrentFunction();
            mobiValue = VariableSearcher.searchVariableInFunction(mobiFunction, identifierString);
        }

        //if after function finding, mobi value is still null, search local scope
        if(mobiValue == null) {
            mobiValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, LocalScopeCreator.getInstance().getActiveLocalScope());
        }

        //if mobi value is still null, search class
        if(mobiValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            mobiValue = VariableSearcher.searchVariableInClass(classScope, identifierString);
        }


        if(mobiValue != null) {
            BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_VARIABLE, "", identifierString, this.lineNumber);
        }
    }


}
