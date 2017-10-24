package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class MyErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void reportNoViableAlternative(Parser parser, NoViableAltException e) throws RecognitionException
    {
// ANTLR generates Parser subclasses from grammars and
// Parser extends Recognizer. Parameter parser is a
// pointer to the parser that detected the error
        TokenStream tokens = parser.getInputStream();
        String input;
        if ( tokens!=null ) {
            if ( e.getStartToken().getType()==Token.EOF ) input = "<EOF>";
            else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
        }
        else {
            input = "<unknown input>";
        }
        String msg = "[NO VIABLE ALTERNATIVE] Unexpected token '"+input+"'. Please recheck your input."; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }



    @Override
    protected void reportInputMismatch(Parser parser, InputMismatchException e) {
        String msg = "[INPUT MISMATCH] Input '" + e.getOffendingToken().getText() + "' is not the expected token. "+e.getExpectedTokens().toString(parser.getVocabulary()) +" was expected." ; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportUnwantedToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "[UNWANTED TOKEN] Input '"+tokenName+"' is irrelevant. Expecting '"+
                expecting.toString(recognizer.getVocabulary())+"'";
        recognizer.notifyErrorListeners(t, msg, null);
    }
    protected void reportMissingToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "[MISSING TOKEN] Expecting "+expecting.toString(recognizer.getVocabulary())+
                " at "+getTokenErrorDisplay(t) + " but token is not found";

        recognizer.notifyErrorListeners(t, msg, null);
    }


}
