package execution.commands.simple;

import antlr.FRIENDLYParser.*;
import builder.errorchecker.TypeChecker;
import builder.errorchecker.UndeclaredChecker;
import execution.commands.ICommand;
import execution.commands.evaluation.Evaluation;
import semantics.representations.MobiFunction;
import semantics.representations.MobiValue;
import semantics.utils.AssignmentUtils;

public class Return implements ICommand {
    private final static String TAG = "MobiProg_ReturnCommand";

    private ExpressionContext expressionCtx;
    private MobiFunction assignedMobiFunction;

    public Return(ExpressionContext expressionCtx, MobiFunction mobiFunction) {
        this.expressionCtx = expressionCtx;
        this.assignedMobiFunction = mobiFunction;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();

        MobiValue mobiValue = this.assignedMobiFunction.getReturnValue();
        TypeChecker typeChecker = new TypeChecker(mobiValue, this.expressionCtx);
        typeChecker.verify();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        Evaluation evaluationCommand = new Evaluation(this.expressionCtx);
        evaluationCommand.execute();

        MobiValue mobiValue = this.assignedMobiFunction.getReturnValue();

        AssignmentUtils.assignAppropriateValue(mobiValue, evaluationCommand.getResult());
        //Console.log(LogType.DEBUG,"Return value is: " +evaluationCommand.getResult().toEngineeringString());
    }

}
