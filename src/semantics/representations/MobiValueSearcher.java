package semantics.representations;

import builder.ParserHandler;
import execution.FunctionTracker;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;
import semantics.symboltable.scopes.LocalScopeCreator;

public class MobiValueSearcher {
    private final static String TAG = "MobiProg_MobiValueSearcher";

    public static MobiValue searchMobiValue(String identifier) {

        MobiValue mobiValue = null;
        if(FunctionTracker.getInstance().isInsideFunction()) {
            MobiFunction mobiFunction = FunctionTracker.getInstance().getLatestFunction();

            if(mobiFunction.hasParameter(identifier)) {
                mobiValue =  mobiFunction.getParameter(identifier);
            }
            else {
                mobiValue = LocalScopeCreator.searchVariableInLocalIterative(identifier, mobiFunction.getParentLocalScope());
            }
        }

        if(mobiValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            mobiValue = classScope.searchVariableIncludingLocal(identifier);
        }

        return mobiValue;

    }
}

