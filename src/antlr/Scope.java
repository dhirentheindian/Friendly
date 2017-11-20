package antlr;
import java.util.ArrayList;
import java.util.HashMap;

public class Scope {

    private HashMap<String, Value> variables;
    private HashMap<String, Function> functions;

    private Scope parent;
    private ArrayList<Scope> childScopeList;

    public Scope(){
        variables = new HashMap<>();
        functions = new HashMap<>();
        childScopeList = new ArrayList<>();
    }

    public void addVariable(String key, Value value){
        variables.put(key, value);
    }

    public Value getVariable(String key){
        return variables.get(key);
    }

    public void addFunction(String key, Function function){
        functions.put(key, function);
    }

    public Function getFunction(String key){
        return functions.get(key);
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public void addChildScope(Scope scope){
        childScopeList.add(scope);
    }
}