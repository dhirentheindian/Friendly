package semantics.searching;

import builder.ParserHandler;
import execution.FunctionTracker;
import semantics.representations.MobiFunction;
import semantics.representations.MobiValue;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;
import semantics.symboltable.scopes.LocalScopeCreator;

public class VariableSearcher {
    private final static String TAG = "VariableSearcher";

    public static MobiValue searchVariable(String identifierString) {
        MobiValue mobiValue = null;

        if(FunctionTracker.getInstance().isInsideFunction()) {
            mobiValue = searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(mobiValue == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            mobiValue = searchVariableInClassIncludingLocal(classScope, identifierString);
        }

        return mobiValue;
    }

    public static MobiValue searchVariableInFunction(MobiFunction mobiFunction, String identifierString) {
        MobiValue mobiValue = null;

        if(mobiFunction.hasParameter(identifierString)) {
            mobiValue = mobiFunction.getParameter(identifierString);
        }
        else {
            mobiValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, mobiFunction.getParentLocalScope());
        }

        return mobiValue;
    }

    public static MobiValue searchVariableInClassIncludingLocal(ClassScope classScope, String identifierString) {
        return classScope.searchVariableIncludingLocal(identifierString);
    }

    public static MobiValue searchVariableInClass(ClassScope classScope, String identifierString) {
        return classScope.searchVariable(identifierString);
    }

}

