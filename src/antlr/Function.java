package antlr;
import java.util.ArrayList;

public class Function {
    private ArrayList<Value> parameters;
    private Value returnValue;

    public ArrayList<Value> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Value> parameters) {
        this.parameters = parameters;
    }

    public Value getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Value returnValue) {
        this.returnValue = returnValue;
    }
}