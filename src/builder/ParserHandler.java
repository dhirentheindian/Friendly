package builder;

import antlr.FRIENDLYLexer;
import antlr.FRIENDLYParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import semantics.implementors.FRIENDLYBaseImplementor;

public class ParserHandler {

    private final static String TAG = "MobiProg_ParserHandler";
    private static ParserHandler sharedInstance = null;

    public static ParserHandler getInstance() {
        if(sharedInstance == null) {
            sharedInstance = new ParserHandler();
        }

        return sharedInstance;
    }

    private FRIENDLYLexer sharedLexer;
    private FRIENDLYParser sharedParser;

    private String currentClassName; //the current class being parsed

    private ParserHandler() {

    }

    public void parseText(String className, String textToParse) {
        this.currentClassName = className.replace(".mobi", "");
        this.sharedLexer = new FRIENDLYLexer(new ANTLRInputStream(textToParse));
        CommonTokenStream tokens = new CommonTokenStream(this.sharedLexer);
        this.sharedParser = new FRIENDLYParser(tokens);
        this.sharedParser.removeErrorListeners();
        this.sharedParser.addErrorListener(BuildChecker.getInstance());

        ParserRuleContext parserRuleContext = this.sharedParser.compilationUnit();
        //Console.log(LogType.DEBUG, parserRuleContext.toStringTree(this.sharedParser));
//        System.out.println("" + parserRuleContext.toStringTree(this.sharedParser));
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(new FRIENDLYBaseImplementor(), parserRuleContext);

        //Console.log(LogType.VERBOSE, "Finished parsing. Compiled executables. Click RUN to execute");
    }

    /*
     * Returns the class name being parsed
     */
    public String getCurrentClassName() {
        return this.currentClassName;
    }
}