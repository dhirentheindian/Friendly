package antlr;

import org.antlr.v4.runtime.*;

public class MyErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void reportNoViableAlternative(Parser parser, NoViableAltException e) throws RecognitionException
    {
// ANTLR generates Parser subclasses from grammars and
// Parser extends Recognizer. Parameter parser is a
// pointer to the parser that detected the error
        String msg = "No viable alternative for token '"+e.getOffendingToken()+"'"; // nonstandard msg

        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportInputMismatch(Parser parser, InputMismatchException e) {
        String msg = "Input '" + e.getOffendingToken().getText() + "' is not the expected token." ; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }

}
