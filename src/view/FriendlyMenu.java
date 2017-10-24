package view;

import antlr.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FriendlyMenu {
    private JPanel panelFriendly;
    private JButton buttonCompile;
    private JPanel panelInput;
    private JPanel panelOutput;
    private JPanel panelCentral;
    private JTextArea textInput;
    private JTextArea textOutput;
    private JPanel panelDisplay;
    private Highlighter.HighlightPainter painter;
    private int textAreaOutputColorValue=100;
    public FriendlyMenu() {
        Color c = new Color(textAreaOutputColorValue,textAreaOutputColorValue,textAreaOutputColorValue);
        textOutput.setBackground(c);
        textOutput.setForeground(Color.white);

        buttonCompile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a stream to hold the output
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos);
                // IMPORTANT: Save the old System.out!
                PrintStream old = System.out;
                // Tell Java to use your special stream
                System.setOut(ps);
                // Print some output: goes to your special stream
                //System.out.println("Foofoofoo!");
                painter = new DefaultHighlighter.DefaultHighlightPainter(Color.cyan);
                try {
                    textInput.getHighlighter().addHighlight(0,20,painter);
                } catch (BadLocationException e1) {
                    e1.printStackTrace();
                }

                String str = textInput.getText();
                ANTLRInputStream input = new ANTLRInputStream(str);
                FRIENDLYLexer lexer = new FRIENDLYLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                FRIENDLYParser parser = new FRIENDLYParser(tokens);
                parser.removeErrorListeners();
                parser.setErrorHandler(new MyErrorStrategy());

                parser.addErrorListener(new FRIENDLYErrorListener());

                ParseTree tree = parser.compilationUnit();
                ParseTreeWalker walker = new ParseTreeWalker();
                

                tokens.fill();

                walker.walk(new BaseTester(),tree);


                // Put things back
                System.out.flush();
                System.setOut(old);
                // Show what happened
                textOutput.setText(baos.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FriendlyMenu");
        frame.setContentPane(new FriendlyMenu().panelFriendly);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
