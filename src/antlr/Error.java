package antlr;

public class Error {

    private int line, charPosiInLine;
    private String msg;

    public Error(int line, int charPosiInLine, String msg) {
        this.line = line;
        this.charPosiInLine = charPosiInLine;
        this.msg = msg;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCharPosiInLine() {
        return charPosiInLine;
    }

    public void setCharPosiInLine(int charPosiInLine) {
        this.charPosiInLine = charPosiInLine;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Line "+getLine()+":"+getCharPosiInLine()+" " +getMsg();
    }
}
