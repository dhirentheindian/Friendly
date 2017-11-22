package view;

import antlr.*;
import antlr.Error;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class FriendlyMenu {
    private JPanel panelFriendly;
    private JButton buttonCompile;

    private JPanel panelInput;
    private JPanel panelOutput;
    private JPanel panelCentral;
    private JTextArea textOutput;
    private JPanel panelDisplay;
    private JScrollPane scrollPaneInput;
    private JScrollPane scrollPaneOutput;
    private JButton buttonReset;
    private JList<Error> listOutput;
    private LineNumberedPaper textAreaInput;
    DefaultListModel<Error> model = new DefaultListModel<>();

    private Highlighter.HighlightPainter painter;
    private int textAreaOutputColorValue=100;
    public FriendlyMenu() {
        Color c = new Color(textAreaOutputColorValue,textAreaOutputColorValue,textAreaOutputColorValue);
        listOutput.setBackground(c);
        listOutput.setForeground(Color.white);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SyntaxErrorCollector.getInstance().reset();
                model.clear();
            }
        });


        listOutput.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    JList source = (JList)e.getSource();
                    String selected ="";
                    try{
                        selected = source.getSelectedValue().toString();
                    }catch (NullPointerException npe){
                        System.out.println("NPE averted");
                    }


                    ArrayList<Error> temp = SyntaxErrorCollector.getInstance().getErrorList();
                    for(Error t:temp){
                        if(t.toString().equals(selected)){
                            DefaultHighlighter highlighter =  (DefaultHighlighter)textAreaInput.getHighlighter();
                            DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter( Color.RED );
                            highlighter.setDrawsLayeredHighlights(false); // this is the key line

                            try {
                                int start = textAreaInput.getLineStartOffset(t.getLine()-1);
                                int end = textAreaInput.getLineEndOffset(t.getLine()-1);
                                highlighter.removeAllHighlights();
                                highlighter.addHighlight(start,end,painter);
                            } catch (BadLocationException e1) {
                                e1.printStackTrace();
                            }

                        }
                    }

                }
            }
        });
        buttonCompile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a stream to hold the output
             /*   ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos);
                PrintStream old = System.out;
                System.setOut(ps);*/
                // IMPORTANT: Save the old System.out!

                // Tell Java to use your special stream

                // Print some output: goes to your special stream
                //System.out.println("Foofoofoo!");

                SyntaxErrorCollector.getInstance().reset();

                String str = textAreaInput.getText();
                String s[] = str.split("\\r?\\n");
                ArrayList<String> arrList = new ArrayList<>(Arrays.asList(s)) ;

                ANTLRInputStream input = new ANTLRInputStream(str);
                FRIENDLYLexer lexer = new FRIENDLYLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                FRIENDLYParser parser = new FRIENDLYParser(tokens);
                parser.removeErrorListeners();
                parser.setErrorHandler(new MyErrorStrategy());

                parser.addErrorListener(new CustomFRIENDLYErrorListener());

                ParseTree tree = parser.compilationUnit();
                ParseTreeWalker walker = new ParseTreeWalker();

                //walker.walk(new BaseTester(),tree);
                MyListener treeListener = new MyListener();


                // Put things back
                System.out.flush();
             //   System.setOut(old);
                // Show what happened
                if(SyntaxErrorCollector.getInstance().countErrors() == 0) {
                    model.addElement(new Error(0,0,"Code Compiled Successfully"));
                    //code will run only if there are no syntax errors.
                    walker.walk(treeListener,tree);
                    System.out.println(tree.toStringTree(parser));

                }else {
                    ArrayList<Error> eList = SyntaxErrorCollector.getInstance().getErrorList();
                    for(Error err:eList) {
                        model.addElement(err);

                    }
                }
                listOutput.setModel(model);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FriendlyMenu");

        frame.setContentPane(new FriendlyMenu().panelFriendly);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        textAreaInput = new LineNumberedPaper(999,999);

    }
}
