package antlr;
public class Value {
    private boolean initialized;
    private String type;
    private String value;

    public Value(){

    }

    public Value(String type){
        this.type = type;

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

    public void setValue(String value) {
        this.value = value;
    }
}