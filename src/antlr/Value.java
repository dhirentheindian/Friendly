package antlr;
public class Value {
    private boolean initialized;
    private String type;
    private String value;
    private boolean isConst;

    public Value(){
        isConst = false;
    }

    public Value(String type){
        this.type = type;

    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }

    public boolean getConst(){
        return isConst;
    }
    public boolean isInitialized() {

        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return isConst + " " + value + " " + type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}