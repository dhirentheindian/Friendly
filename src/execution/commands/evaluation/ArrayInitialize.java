package execution.commands.evaluation;

import antlr.FRIENDLYParser.*;
import execution.commands.ICommand;
import semantics.representations.MobiArray;

public class ArrayInitialize implements ICommand {
    private final static String TAG = "ArrayInitializeCommand";

    private MobiArray assignedMobiArray;
    private ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitialize(MobiArray mobiArray, ArrayCreatorRestContext arrayCreatorCtx) {
        this.assignedMobiArray = mobiArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            Evaluation evaluationCommand = new Evaluation(exprCtx);
            evaluationCommand.execute();

            this.assignedMobiArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }

}
