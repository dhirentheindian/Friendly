package antlr;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTableManager {

    private Scope currentScope;
    private static SymbolTableManager sharedInstance = null;
    private HashMap<String, Scope> scopes;

    public static SymbolTableManager getInstance() {
        if(sharedInstance == null)
            sharedInstance = new SymbolTableManager();

        return sharedInstance;
    }

    public void AddScope(String className, Scope scope){
        if (scopes == null)
            scopes = new HashMap<String, Scope>();
        scopes.put(className, scope);
        currentScope = scope;

        Function function = new Function();
        ArrayList<Value> params = new ArrayList<>();
        Value value = new Value("string");
        params.add(value);
        function.setParameters(params);
        function.setReturnValue(value);
        currentScope.addFunction("scan", function);
    }

    public Scope getScope() {
        return scopes.get("class");
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }
}