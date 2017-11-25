/**
 *
 */
package builder.errorchecker;

import java.util.List;

import antlr.FRIENDLYParser.*;
import builder.BuildChecker;
import builder.ErrorRepository;
import semantics.representations.MobiFunction;

/**
 * Just checks if the number of parameters to be passed is equal to the required number
 * @author NeilDG
 *
 */
public class ParameterMismatchChecker implements IErrorChecker {
    private final static String TAG = "MobiProg_ParameterMismatchChecker";

    private MobiFunction mobiFunction;
    private List<ExpressionContext> exprCtxList;
    private int lineNumber;

    public ParameterMismatchChecker(MobiFunction mobiFunction, ExpressionContext argumentsCtx) {
        this.mobiFunction = mobiFunction;

        if(argumentsCtx.expressionList() != null) {
            this.exprCtxList = argumentsCtx.expressionList().expression();
        }

        this.lineNumber = argumentsCtx.getStart().getLine();
    }

    /* (non-Javadoc)
     * @see IErrorChecker#verify()
     */
    @Override
    public void verify() {
        if(this.mobiFunction == null) {
            return;
        }

        if(this.exprCtxList == null && this.mobiFunction.getParameterValueSize() != 0) {
            BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.mobiFunction.getFunctionName(), this.lineNumber);
        }
        else if(this.exprCtxList != null && this.exprCtxList.size() != this.mobiFunction.getParameterValueSize()) {
            BuildChecker.reportCustomError(ErrorRepository.PARAMETER_COUNT_MISMATCH, "", this.mobiFunction.getFunctionName(), this.lineNumber);
        }
    }

}
