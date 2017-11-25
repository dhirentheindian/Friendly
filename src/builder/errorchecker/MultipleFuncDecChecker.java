/**
 *
 */
package builder.errorchecker;

import antlr.FRIENDLYParser.*;
import builder.BuildChecker;
import builder.ErrorRepository;
import builder.ParserHandler;
import org.antlr.v4.runtime.Token;
import semantics.representations.MobiFunction;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;


/**
 * Checks for duplicate function declarations
 * @author NeilDG
 *
 */
public class MultipleFuncDecChecker implements IErrorChecker {
    private final static String TAG = "MobiProg_MultipleFuncDecChecker";

    private MethodDeclarationContext methodDecCtx;
    private int lineNumber;

    public MultipleFuncDecChecker(MethodDeclarationContext methodDecCtx) {
        this.methodDecCtx = methodDecCtx;

        Token firstToken = methodDecCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see IErrorChecker#verify()
     */
    @Override
    public void verify() {
        this.verifyFunctionCall(this.methodDecCtx.Identifier().getText());
    }

    private void verifyFunctionCall(String identifierString) {

        ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                ParserHandler.getInstance().getCurrentClassName());
        MobiFunction mobiFunction = classScope.searchFunction(identifierString);

        if(mobiFunction != null) {
            BuildChecker.reportCustomError(ErrorRepository.MULTIPLE_FUNCTION, "", identifierString, this.lineNumber);
        }
    }

}
