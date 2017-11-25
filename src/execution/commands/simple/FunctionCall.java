package execution.commands.simple;

import antlr.FRIENDLYParser.*;
import builder.ParserHandler;
import execution.commands.ICommand;
import execution.commands.evaluation.Evaluation;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import semantics.analyzers.FunctionCallVerifier;
import semantics.representations.MobiFunction;
import semantics.representations.MobiValue;
import semantics.representations.MobiValue.*;
import semantics.searching.VariableSearcher;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;

import java.util.List;

public class FunctionCall implements ICommand {
    private final static String TAG = "MobiProg_FunctionCallCommand";

    private MobiFunction mobiFunction;
    private ExpressionContext exprCtx;
    private String functionName;

    public FunctionCall(String functionName, ExpressionContext exprCtx) {
        this.functionName = functionName;
        this.exprCtx = exprCtx;

        this.searchFunction();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.exprCtx);

        this.verifyParameters();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.mapParameters();
        this.mobiFunction.execute();
    }

    private void searchFunction() {
        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
        this.mobiFunction = classScope.searchFunction(this.functionName);
    }

    private void verifyParameters() {
        if(this.exprCtx.expression(1) == null || this.exprCtx.expression(1).expressionList() == null
                || this.exprCtx.expression(1).expressionList().expression() == null) {
            return;
        }

        List<ExpressionContext> exprCtxList = this.exprCtx.expression(1).expressionList().expression();
        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            ExpressionContext parameterExprCtx = exprCtxList.get(i);
            this.mobiFunction.verifyParameterByValueAt(parameterExprCtx, i);
        }
    }

    /*
     * Maps parameters when needed
     */
    private void mapParameters() {
        if(this.exprCtx.expression(1)== null || this.exprCtx.expression(1).expressionList() == null
                || this.exprCtx.expression(1).expressionList().expression() == null) {
            return;
        }

        List<ExpressionContext> exprCtxList = this.exprCtx.expression(1).expressionList().expression();

        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            ExpressionContext parameterExprCtx = exprCtxList.get(i);

            if(this.mobiFunction.getParameterAt(i).getPrimitiveType() == PrimitiveType.ARRAY) {

                MobiValue mobiValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.mobiFunction.mapArrayAt(mobiValue, i, parameterExprCtx.getText());
            }
            else {
                Evaluation evaluationCommand = new Evaluation(parameterExprCtx);
                evaluationCommand.execute();

                this.mobiFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }
    }

    public MobiValue getReturnValue() {
        return this.mobiFunction.getReturnValue();
    }

}

