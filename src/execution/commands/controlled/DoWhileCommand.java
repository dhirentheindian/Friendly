package execution.commands.controlled;

import antlr.FRIENDLYParser.*;
import execution.ExecutionManager;
import execution.ExecutionMonitor;
import execution.commands.ICommand;

public class DoWhileCommand extends WhileCommand {

    private final static String TAG = "MobiProg_DoWhileCommand";

    public DoWhileCommand(ParExpressionContext parExprCtr) {
        super(parExprCtr);
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.executeFirstCommandSequence();
        super.execute();
    }

    /*
     * Executes the first command sequence before actually executing the behavior for the while command
     */
    private void executeFirstCommandSequence() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try {
            for(ICommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
        }
    }

    @Override
    public IControlledCommand.ControlTypeEnum getControlType() {
        return IControlledCommand.ControlTypeEnum.DO_WHILE_CONTROL;
    }
}
