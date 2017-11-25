package execution.commands.evaluation;

import builder.ParserHandler;
import execution.commands.ICommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import antlr.FRIENDLYParser.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.representations.MobiFunction;
import semantics.representations.MobiValue;
import semantics.searching.VariableSearcher;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;
import semantics.utils.Expression;
import semantics.utils.RecognizedKeywords;



import java.math.BigDecimal;
import java.util.List;

public class Evaluation implements ICommand, ParseTreeListener {
    private final static String TAG = "MobiProg_EvaluationCommand";

    private ExpressionContext parentExprCtx;
    private String modifiedExp;
    private BigDecimal resultValue;

    public Evaluation(ExpressionContext exprCtx) {
        this.parentExprCtx = exprCtx;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();

        //catch rules if the value has direct boolean flags
        if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_TRUE)) {
            this.resultValue = new BigDecimal(1);
        }
        else if(this.modifiedExp.contains(RecognizedKeywords.BOOLEAN_FALSE)) {
            this.resultValue = new BigDecimal(0);
        }
        else {
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.parentExprCtx);

            Expression evalEx = new Expression(this.modifiedExp);
            //Log.i(TAG,"Modified exp to eval: " +this.modifiedExp);
            this.resultValue = evalEx.eval();
        }

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof ExpressionContext) {
            ExpressionContext exprCtx = (ExpressionContext) ctx;
            if (Evaluation.isFunctionCall(exprCtx)) {
                this.evaluateFunctionCall(exprCtx);
            }

            else if (Evaluation.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public static boolean isFunctionCall(ExpressionContext exprCtx) {

        /* Check Repo **/
        if (exprCtx.expression(1) != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVariableOrConst(ExpressionContext exprCtx) {
        if (exprCtx.primary() != null && exprCtx.primary().Identifier() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void evaluateFunctionCall(ExpressionContext exprCtx) {
        String functionName = exprCtx.expression(0).Identifier().getText();

        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                ParserHandler.getInstance().getCurrentClassName());
        MobiFunction mobiFunction = classScope.searchFunction(functionName);

        if (exprCtx.expression(1).expressionList() != null) {
            List<ExpressionContext> exprCtxList = exprCtx.expression(0)
                    .expressionList().expression();

            for (int i = 0; i < exprCtxList.size(); i++) {
                ExpressionContext parameterExprCtx = exprCtxList.get(i);

                Evaluation evaluationCommand = new Evaluation(parameterExprCtx);
                evaluationCommand.execute();

                mobiFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }

        mobiFunction.execute();

        //Log.i(TAG, "Before modified EXP function call: " +this.modifiedExp);
        this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                mobiFunction.getReturnValue().getValue().toString());
        //Log.i(TAG, "After modified EXP function call: " +this.modifiedExp);

    }

    private void evaluateVariable(ExpressionContext exprCtx) {
        MobiValue mobiValue = VariableSearcher
                .searchVariable(exprCtx.getText());

        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                mobiValue.getValue().toString());
    }

    /*
     * Returns the result
     */
    public BigDecimal getResult() {
        return this.resultValue;
    }
}

