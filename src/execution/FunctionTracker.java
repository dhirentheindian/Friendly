package execution;

import semantics.representations.MobiFunction;

import java.util.Stack;

public class FunctionTracker {
    private final static String TAG = "MobiProg_CallGraphManager";

    private static FunctionTracker sharedInstance = null;

    private Stack<MobiFunction> callStack;

    public static FunctionTracker getInstance() {
        return sharedInstance;
    }

    private FunctionTracker() {
        this.callStack = new Stack<MobiFunction>();
    }

    public static void initialize() {
        sharedInstance = new FunctionTracker();
    }

    public static void reset() {

    }

    public void reportEnterFunction(MobiFunction mobiFunction) {
        this.callStack.push(mobiFunction);
    }

    public void reportExitFunction() {
        this.callStack.pop();
    }

    public MobiFunction getLatestFunction() {
        return this.callStack.peek();
    }

    /*
     * Returns true if the control flow is currently inside a function
     */
    public boolean isInsideFunction() {
        return (this.callStack.size() != 0);
    }

}

