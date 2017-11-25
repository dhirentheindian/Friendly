package execution.commands.controlled;

import execution.commands.ICommand;
import execution.commands.controlled.IControlledCommand.ControlTypeEnum;

public interface IConditionalCommand extends ICommand {

    public abstract ControlTypeEnum getControlType();
    public abstract void addPositiveCommand(ICommand command);
    public abstract void addNegativeCommand(ICommand command);
}
