package antlr;

//import com.udojava.evalex.Expression;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.awt.Symbol;
import view.FriendlyMenu;

import javax.swing.*;
import java.math.BigDecimal;

public class MyListener extends FRIENDLYBaseListener {

    final static int GREATEREQUAL = 1;
    final static int LESSEQUAL = 2;
    final static int GREATER = 3;
    final static int LESS = 4;

    JFrame frame;
    int ifPass = 1;
    int conditionDone=0;
    int forLoopCtr = 0;
    int forLoopCeiling = 0;
    int forDone=0; // 1 is done, 0 is not done
    int forLoopExp = 0;// 1 = geq, 2 = leq, 3 = g, 4 = l
    FriendlyMenu friendlyMenu;
    public MyListener(FriendlyMenu friendlyMenu){
        this.friendlyMenu=friendlyMenu;
    }
    @Override
    public void enterCompilationUnit(FRIENDLYParser.CompilationUnitContext ctx) {
        SymbolTableManager.getInstance().AddScope("class", new Scope());

        super.enterCompilationUnit(ctx);

    }

    @Override
    public void enterVariableDeclarator(FRIENDLYParser.VariableDeclaratorContext ctx) {

          super.enterVariableDeclarator(ctx);
    }
    public boolean variableLookup(String varName){
        if(SymbolTableManager.getInstance().getCurrentScope().getVariable(varName) != null){
            return true;
        }else
            return false;
    }
    @Override
    public void enterLocalVariableDeclaration(FRIENDLYParser.LocalVariableDeclarationContext ctx) {

        //only works so far for primitive types

        if(forDone!= 999){
            if(ifPass==1) {
                localVarDec(ctx);
            }
        }
        super.enterLocalVariableDeclaration(ctx);

    }

    @Override
    public void exitStatement(FRIENDLYParser.StatementContext ctx) {
        String statement = ctx.getText();
        if (statement.substring(0, 2).equals("if")) {
            ifPass = 1;
        }
        if (statement.substring(0, 3).equals("for")) {
            forDone=1;
        }

        super.exitStatement(ctx);
    }
    @Override
    public void enterStatement(FRIENDLYParser.StatementContext ctx) {
        String statement = ctx.getText();
        //print statements
        if(forDone != 999) {

            if (statement.substring(0, 6).equals("print(")) {
//            if(ctx.StringLiteral() != null){
//                String toPrint = ctx.StringLiteral().getText();
//                toPrint = toPrint.substring(1,toPrint.length()-1);
//                System.out.println(toPrint);
//            }else if(ctx.Identifier() != null){
//                Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText());
//                System.out.println(v.getValue());
//            }

                if (ctx.printContent().printExpression().size() == 1) {
                    if (ctx.printContent().printExpression().get(0).StringLiteral() != null) {
                        String line = ctx.printContent().printExpression().get(0).StringLiteral().getText();
                        line = line.substring(1, line.length() - 1);
                        System.out.println(line);
                        //System.out.println(new Expression(line).eval());
                    } else {
                        Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.printContent().printExpression().get(0).Identifier().getText());
                        System.out.println(v.getValue());
                    }

                    friendlyMenu.refreshPrintScreen();
                } else if (ctx.printContent().printExpression().size() > 1) {
                    String mumble = "";
                    for (int i = 0; i < ctx.printContent().printExpression().size(); i++) {
                        if (ctx.printContent().printExpression().get(i).StringLiteral() != null) {
                            String line = ctx.printContent().printExpression().get(i).StringLiteral().getText();
                            line = line.substring(1, line.length() - 1);
                            mumble += line;
                        } else {
                            Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.printContent().printExpression().get(i).Identifier().getText());
                            mumble += v.getValue();
                        }
                    }
                    System.out.println(mumble);
                }


            } else if (statement.substring(0, 5).equals("scan(")) {

                //scanning code & then put the input in setValue below...
                String expectedType = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText()).getType();
                String s = (String) JOptionPane.showInputDialog("What is your input for " + expectedType + " " + ctx.Identifier().getText() + "?");
                SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText()).setValue(s);


            } else if (statement.substring(0, 2).equals("if")) {
                ctx = this.conditionalStatement(ctx);
                if (ctx.statement().size() > 0) {
//                System.out.println(ctx.getText());
//                for(int x=0;x<ctx.statement().size();x++)
//                System.out.println(ctx.statement().get(x).getText());
                }


            } else if (statement.substring(0, 3).equals("for")) {
                if (ctx.forControl().forInit().localVariableDeclaration() != null) {
                    //variable declared successfully
                    if (localVarDec(ctx.forControl().forInit().localVariableDeclaration())) {

                        //expression exists
                        if (ctx.forControl().expression() != null) {
                            String forExp = ctx.forControl().expression().getText();
                            String split[] = new String[2];
                            if (forExp.contains(">=")) {
                                split = forExp.split(">=");
                                forLoopExp = GREATEREQUAL;
                            } else if (forExp.contains("<=")) {
                                split = forExp.split("<=");
                                forLoopExp = LESSEQUAL;
                            } else if (forExp.contains(">")) {
                                split = forExp.split(">");
                                forLoopExp = GREATER;
                            } else if (forExp.contains("<")) {
                                split = forExp.split("<");
                                forLoopExp = LESS;
                            }
                            if (variableLookup(split[0])) {
                                forLoopCtr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                                forLoopCeiling = Integer.parseInt(split[1]);
                                if (forLoopExp == LESS) {
                                    for (int i = forLoopCtr; i < forLoopCeiling; i++) {
                                        SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(String.valueOf(i));
                                        
                                        forLoopTime(ctx);
                                    }
                                    forDone = 999;
                                } else if (forLoopExp == LESSEQUAL) {
                                    for (int i = forLoopCtr; i <= forLoopCeiling; i++) {
                                        SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(String.valueOf(i));
                                        forLoopTime(ctx);
                                    }
                                    forDone = 999;
                                }

                            }
                        }
                    }
                }
            }

        }



        super.enterStatement(ctx);
    }

    public boolean forLoopTime(FRIENDLYParser.StatementContext ctx){

        for (int x = 0; x < ctx.statement(0).block().blockStatement().size(); x++) {
            if (ctx.statement(0).block().blockStatement(x).localVariableDeclarationStatement() != null) {
                enterLocalVariableDeclarationStatement(ctx.statement(0).block().blockStatement(x).localVariableDeclarationStatement());
            } else if (ctx.statement(0).block().blockStatement(x).statement() != null) {
                enterStatement(ctx.statement(0).block().blockStatement(x).statement());
            } else if (ctx.statement(0).block().blockStatement(x).typeDeclaration() != null) {
                System.out.println("Type Dec!");
            } else if (ctx.statement(0).block().blockStatement(x).commonErrorStatement() != null) {
                System.out.println("Common Error Statement");
            }
        }
        return true;
    }
    public FRIENDLYParser.StatementContext conditionalStatement(FRIENDLYParser.StatementContext ctx){
        String parExp = ctx.parExpression().getText();
        parExp = parExp.substring(1, parExp.length() - 1);

        if(parExp.contains("eq")) {
            String[] split = parExp.split("eq");
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }
            System.out.println(new Expression(split[0]+"=="+(split[1])).eval());

            if (new Expression(split[0]+"=="+(split[1])).eval().equals(new BigDecimal(1))) {
                if(ctx.getChildCount()>3)
                    ctx.removeLastChild();
            }
            else{
                ParseTree child = ctx.getChild(ctx.getChildCount()-1);
                for(int x=0;x<ctx.getChildCount();x++)
                    ctx.removeLastChild();

                ctx.addAnyChild(child);
            }
        }
        else if(parExp.contains("<")){
            String[] split = parExp.split("<");
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }

            if (new Expression(split[0]+"<"+(split[1])).eval().equals(new BigDecimal(1))) {
                if(ctx.getChildCount()>3)
                    ctx.removeLastChild();
            }
            else{
                ParseTree child = ctx.getChild(ctx.getChildCount()-1);
                for(int x=0;x<ctx.getChildCount();x++)
                    ctx.removeLastChild();

                ctx.addAnyChild(child);
            }
        }
        else if(parExp.contains(">")){
            String[] split = parExp.split(">");
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }

            if (new Expression(split[0]+">"+(split[1])).eval().equals(new BigDecimal(1))) {
                if(ctx.getChildCount()>3)
                    ctx.removeLastChild();
            }
            else{
                ParseTree child = ctx.getChild(ctx.getChildCount()-1);
                for(int x=0;x<ctx.getChildCount();x++)
                    ctx.removeLastChild();

                ctx.addAnyChild(child);

            }
        }
        return ctx;
    }


    @Override
    public void enterMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx) {

        //ctx.Identifier()
        super.enterMethodDeclaration(ctx);

    }
    public boolean localVarDec(FRIENDLYParser.LocalVariableDeclarationContext ctx){
        if (ctx.typeType().primitiveType() != null) {
            Value value = new Value(ctx.typeType().primitiveType().getText());

            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText()) != null) {
                System.out.println(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText()+" ERROR: Variable Exists");
                return false;
            }
            if (ctx.variableDeclarators().variableDeclarator().size() > 1) {
                for (int i = 0; i < ctx.variableDeclarators().variableDeclarator().size(); i++) {
                    if (ctx.variableDeclarators().variableDeclarator(i).variableInitializer() != null) {
                        //when the variable can be init
                        value.setValue(ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText());
                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    } else if (ctx.variableDeclarators().variableDeclarator(i).variableInitializer() == null) {

                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    }
                }
            } else {
                if (ctx.variableDeclarators().variableDeclarator(0).variableInitializer() != null) {
                    value.setValue(ctx.variableDeclarators().variableDeclarator(0).variableInitializer().getText());
                }
                SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText(), value);
            }
            return true;
        } else if (ctx.typeType().classOrInterfaceType() != null) {
            Value value = new Value(ctx.typeType().classOrInterfaceType().getText());
        }
        return false;
    }

}
