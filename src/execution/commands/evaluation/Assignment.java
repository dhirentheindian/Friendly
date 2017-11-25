package execution.commands.evaluation;

import antlr.FRIENDLYLexer;
import antlr.FRIENDLYParser.*;
import builder.errorchecker.ConstChecker;
import builder.errorchecker.TypeChecker;
import builder.errorchecker.UndeclaredChecker;
import execution.ExecutionManager;
import execution.commands.ICommand;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.analyzers.FunctionCallVerifier;
import semantics.representations.MobiArray;
import semantics.representations.MobiValue;
import semantics.searching.VariableSearcher;
import semantics.utils.AssignmentUtils;

import java.util.List;

public class Assignment implements ICommand {

    private final static String TAG = "MobiProg_NewAssignmentCommand";

    private ExpressionContext leftHandExprCtx;
    private ExpressionContext rightHandExprCtx;

    public Assignment(ExpressionContext leftHandExprCtx,
                             ExpressionContext rightHandExprCtx) {
        this.leftHandExprCtx = leftHandExprCtx;
        this.rightHandExprCtx = rightHandExprCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx);
        undeclaredChecker.verify();

        ConstChecker constChecker = new ConstChecker(this.leftHandExprCtx);
        constChecker.verify();

        undeclaredChecker = new UndeclaredChecker(this.rightHandExprCtx);
        undeclaredChecker.verify();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.rightHandExprCtx);

        //type check the mobivalue
        MobiValue mobiValue;
        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            mobiValue = VariableSearcher.searchVariableInFunction(ExecutionManager.getInstance().getCurrentFunction(), this.leftHandExprCtx.getText());
        }
        else {
            mobiValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
        }

        TypeChecker typeChecker = new TypeChecker(mobiValue, this.rightHandExprCtx);
        typeChecker.verify();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        Evaluation evaluationCommand = new Evaluation(this.rightHandExprCtx);
        evaluationCommand.execute();

        if(this.isLeftHandArrayAccessor()) {
            this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
        }
        else {
            MobiValue mobiValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
            AssignmentUtils.assignAppropriateValue(mobiValue, evaluationCommand.getResult());
        }
    }

    private boolean isLeftHandArrayAccessor() {
        List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(FRIENDLYLexer.LBRACK);
        List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(FRIENDLYLexer.RBRACK);

        return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
    }

    private void handleArrayAssignment(String resultString) {
        TerminalNode identifierNode = this.leftHandExprCtx.expression(0).primary().Identifier();
        ExpressionContext arrayIndexExprCtx = this.leftHandExprCtx.expression(1);

        MobiValue mobiValue = VariableSearcher.searchVariable(identifierNode.getText());
        MobiArray mobiArray = (MobiArray) mobiValue.getValue();

        Evaluation evaluationCommand = new Evaluation(arrayIndexExprCtx);
        evaluationCommand.execute();

        //create a new array value to replace value at specified index
        MobiValue newArrayValue = new MobiValue(null, mobiArray.getPrimitiveType());
        newArrayValue.setValue(resultString);
        mobiArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }
}
