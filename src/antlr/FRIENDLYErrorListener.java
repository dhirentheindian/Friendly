package antlr;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import javax.swing.*;
import java.awt.*;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class FRIENDLYErrorListener implements org.antlr.v4.runtime.ANTLRErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        StringBuilder buf = new StringBuilder();
       // buf.append("rule stack: "+stack+" ");
        buf.append("line "+i+":"+i1+" at "+
                o+": "+s);
        SyntaxErrorCollector.getInstance().recordError(i, i1, s);
       // System.out.println(buf);
//        dialog.setTitle("Syntax error");
//        dialog.pack();
//        dialog.setLocationRelativeTo(null);
//        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        dialog.setVisible(true);
    }



    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
