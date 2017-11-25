package execution.adders;

import execution.commands.ICommand;

public interface IExecutionAdder {
    public abstract void addCommand(ICommand command);
}
