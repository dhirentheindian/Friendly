package builder.errorchecker;

import antlr.FRIENDLYParser.*;
import builder.BuildChecker;
import builder.ErrorRepository;
import builder.ParserHandler;
import execution.ExecutionManager;
import execution.commands.evaluation.Evaluation;
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

public class ConstChecker implements IErrorChecker, ParseTreeListener {
    private final static String TAG = "MobiProg_ConstChecker";

    private ExpressionContext exprCtx;
    private int lineNumber;

    public ConstChecker(ExpressionContext exprCtx) {
        this.exprCtx = exprCtx;

        Token firstToken = this.exprCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.exprCtx);
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
        if(ctx instanceof ExpressionContext) {
            ExpressionContext exprCtx = (ExpressionContext) ctx;
            if(Evaluation.isVariableOrConst(exprCtx)) {
                this.verifyVariableOrConst(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyVariableOrConst(ExpressionContext varExprCtx) {
        MobiValue mobiValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            MobiFunction mobiFunction = ExecutionManager.getInstance().getCurrentFunction();
            mobiValue = VariableSearcher.searchVariableInFunction(mobiFunction, varExprCtx.primary().Identifier().getText());
        }

        //if after function finding, mobi value is still null, search class
        if(mobiValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            mobiValue = VariableSearcher.searchVariableInClassIncludingLocal(classScope, varExprCtx.primary().Identifier().getText());
        }

        if(mobiValue != null && mobiValue.isFinal()) {
            BuildChecker.reportCustomError(ErrorRepository.CONST_REASSIGNMENT, "", varExprCtx.getText(), this.lineNumber);
        }
    }

}
