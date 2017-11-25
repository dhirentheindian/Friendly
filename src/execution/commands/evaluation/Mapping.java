package execution.commands.evaluation;

import antlr.FRIENDLYParser.*;
import builder.errorchecker.UndeclaredChecker;
import execution.commands.ICommand;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import semantics.analyzers.FunctionCallVerifier;
import semantics.representations.MobiValue;
import semantics.searching.VariableSearcher;
import semantics.utils.AssignmentUtils;

public class Mapping implements ICommand {
    private final static String TAG = "MobiProg_MappingCommand";

    private String identifierString;
    private ExpressionContext parentExprCtx;

    private String modifiedExp;

    public Mapping(String identifierString, ExpressionContext exprCtx) {
        this.identifierString = identifierString;
        this.parentExprCtx = exprCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.parentExprCtx);
        undeclaredChecker.verify();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.parentExprCtx);

    }


    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();

        Evaluation evaluationCommand = new Evaluation(this.parentExprCtx);
        evaluationCommand.execute();

        MobiValue mobiValue = VariableSearcher.searchVariable(this.identifierString);
        AssignmentUtils.assignAppropriateValue(mobiValue, evaluationCommand.getResult());
    }

    /*
     * Returns the modified exp, with mapped values.
     */
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}
