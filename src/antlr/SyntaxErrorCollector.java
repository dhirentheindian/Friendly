package antlr;
import java.util.ArrayList;

public class SyntaxErrorCollector {
    private static SyntaxErrorCollector instance = null;

    private ArrayList<String> errors;
    private ArrayList<Error> errorList;

    public static SyntaxErrorCollector getInstance() {
        if(instance == null) {
            instance = new SyntaxErrorCollector();
        }
        return instance;
    }

    private SyntaxErrorCollector() {
        reset();
    }

    public void reset() {
        errors = new ArrayList<String>();
        errorList = new ArrayList<Error>();
    }

    public String recordError(int line, int charPositionInLine, String msg) {

        errorList.add(new Error(line,charPositionInLine,msg));
        StringBuilder sb = new StringBuilder();

        String error = sb.append("line ").append(line).append(":").append(charPositionInLine).append(" ").append(msg).toString();
        if(errors.add(error)) {
            return error;
        }else {
            return null;
        }
    }

    public String listErrors() {
        StringBuilder sb = new StringBuilder();
        for(String e: errors) {
            sb.append(e).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    public int countErrors() {
        return errors.size();
    }

    public ArrayList<Error> getErrorList() {
        return errorList;
    }
}