package antlr;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Driver {
	public static void main(String[] args) {
	//    try {
			Scanner sc = new Scanner(System.in);




			String str = sc.nextLine();
	        ANTLRInputStream input = new ANTLRInputStream(str);
//new FileInputStream(new File("C:/Users/Deran/Desktop/dhiren.txt"))
	        FRIENDLYLexer lexer = new FRIENDLYLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        FRIENDLYParser parser = new FRIENDLYParser(tokens);
			parser.addErrorListener(new CustomFRIENDLYErrorListener());

			ParseTree tree = parser.compilationUnit();
			ParseTreeWalker walker = new ParseTreeWalker();


			tokens.fill();

			System.out.println(tree.toStringTree(parser));
			walker.walk(new BaseTester(),tree);


/*	    } catch (IOException e) {
	        e.printStackTrace();
	    }*/
	}
}
