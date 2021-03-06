package antlr;

//import com.udojava.evalex.Expression;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.awt.Symbol;
import view.FriendlyMenu;

import javax.swing.*;
import java.math.BigDecimal;

import static java.lang.System.exit;

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
    int whileDone =0;
    int forLoopExp = 0;// 1 = geq, 2 = leq, 3 = g, 4 = l
    int error = 0;
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
    public void enterConstDeclaration(FRIENDLYParser.ConstDeclarationContext ctx) {
        String[] split = ctx.constantDeclarator(0).getText().split("=");
        Value v = new Value(ctx.typeType().getText());
        v.setValue(split[1]);
        v.setConst(true);
        SymbolTableManager.getInstance().getCurrentScope().addVariable(split[0], v);
        super.enterConstDeclaration(ctx);
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
        if (statement.substring(0, 5).equals("while")) {
            whileDone=1;
        }

        super.exitStatement(ctx);
    }
    @Override
    public void enterStatement(FRIENDLYParser.StatementContext ctx) {
        String statement = ctx.getText();
        //print statements
        if(error!=1) {
            if (forDone != 999 && whileDone != 999) {

                if (statement.substring(0, 5).equals("print")) {
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
                                if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                                    split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
                                }

                                if (variableLookup(split[0])) {
                                    forLoopCtr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                                    forLoopCeiling = Integer.parseInt(split[1]);
                                    if (forLoopExp == LESS) {
                                        for (int i = forLoopCtr; i < forLoopCeiling; i++) {
                                            SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(String.valueOf(i));

                                            loopTime(ctx);
                                        }
                                        forDone = 999;
                                    } else if (forLoopExp == LESSEQUAL) {
                                        for (int i = forLoopCtr; i <= forLoopCeiling; i++) {
                                            SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(String.valueOf(i));
                                            loopTime(ctx);
                                        }
                                        forDone = 999;
                                    }

                                }
                            }
                        }
                    }
                } else if (statement.contains("while")) {

                    if (ctx.parExpression() != null) {
                        String words = ctx.parExpression().getText().substring(1, ctx.parExpression().getText().length() - 1);

                        if (ctx.parExpression().getText().contains("<=")) {
                            String split[] = words.split("<=");
                            int ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            int ceiling = Integer.parseInt(split[1]);
                            while (ctr <= ceiling) {
                                loopTime(ctx);
                                ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());

                            }
                            whileDone = 999;
                        } else if (ctx.parExpression().getText().contains(">=")) {
                            String split[] = words.split(">=");
                            int ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            int ceiling = Integer.parseInt(split[1]);
                            while (ctr >= ceiling) {
                                loopTime(ctx);
                                ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            }
                            whileDone = 999;
                        } else if (ctx.parExpression().getText().contains("eq")) {
                            String split[] = words.split("eq");
                            int ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            int ceiling = Integer.parseInt(split[1]);
                            while (ctr == ceiling) {
                                loopTime(ctx);
                                ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            }
                            whileDone = 999;
                        } else if (ctx.parExpression().getText().contains("<")) {
                            String split[] = words.split("<");
                            int ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            int ceiling = Integer.parseInt(split[1]);
                            while (ctr < ceiling) {
                                loopTime(ctx);
                                ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            }
                            whileDone = 999;
                        } else if (ctx.parExpression().getText().contains(">")) {
                            String split[] = words.split(">");
                            int ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            int ceiling = Integer.parseInt(split[1]);
                            while (ctr > ceiling) {
                                loopTime(ctx);
                                ctr = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue());
                            }
                            whileDone = 999;
                        }
                    }


                } else if (statement.substring(statement.length() - 3, statement.length() - 1).equals("++")) {


                    String variableName = ctx.statementExpression().expression().getText().substring(0, statement.length() - 3);
                    if (!SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).getConst()) {
                        int oldVal = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).getValue());
                        int newVal = oldVal + 1;
                        SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).setValue(String.valueOf(newVal));
                    } else {
                        error = 1;
                        System.out.println("ERROR: variable '" + variableName + "' is a constant");
                    }
                }
//            else if( statement.contains("=")){
//
//                statement = statement.substring(0,statement.length()-1);
//                String split[] = statement.split("=");
//                SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(split[1]);
//
//            }

            }

        }else if (statement.substring(statement.length() - 3, statement.length() - 1).equals("++")) {


            String variableName = ctx.statementExpression().expression().getText().substring(0, statement.length() - 3);
            if (!SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).getConst()) {
                int oldVal = Integer.parseInt(SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).getValue());
                int newVal = oldVal + 1;
                SymbolTableManager.getInstance().getCurrentScope().getVariable(variableName).setValue(String.valueOf(newVal));
            } else {
                error = 1;
                System.out.println("ERROR: variable '" + variableName + "' is a constant");
            }
        }

        super.enterStatement(ctx);
    }

    public boolean loopTime(FRIENDLYParser.StatementContext ctx){

        for (int x = 0; x < ctx.statement(0).block().blockStatement().size(); x++) {
            if (ctx.statement(0).block().blockStatement(x).localVariableDeclarationStatement() != null) {
                enterLocalVariableDeclaration(ctx.statement(0).block().blockStatement(x).localVariableDeclarationStatement().localVariableDeclaration());
            } else if (ctx.statement(0).block().blockStatement(x).statement() != null) {
                enterStatement(ctx.statement(0).block().blockStatement(x).statement());
            } else if (ctx.statement(0).block().blockStatement(x).typeDeclaration() != null) {
                System.out.println("Type Dec!");
            } else if (ctx.statement(0).block().blockStatement(x).commonErrorStatement() != null) {
                System.out.println("Common Error Statement");
            } else if(ctx.statement(0).block().blockStatement(x).localVariableInitStatement() != null){
                enterLocalVariableInit(ctx.statement(0).block().blockStatement(x).localVariableInitStatement().localVariableInit());
            }
        }
        return true;
    }


    @Override
    public void enterLocalVariableInit(FRIENDLYParser.LocalVariableInitContext ctx) {
        String statement  = ctx.getText();
        String[] split = statement.split("=");
        String variableType = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getType();

        String[] evalSplitAddition= split[1].split("\\+");
        double result=0;
        String equation="";
        if(!SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getConst()) {
            if (variableType.equals("int") || variableType.equals("float") || variableType.equals("double")) {
                for (int x = 0; x < evalSplitAddition.length; x++) {
                    System.out.println("EVAL CONTENT ADDITON: " + evalSplitAddition[x]);
                    if (SymbolTableManager.getInstance().getCurrentScope().getVariable(evalSplitAddition[x]) != null)
                        evalSplitAddition[x] = SymbolTableManager.getInstance().getCurrentScope().getVariable(evalSplitAddition[x]).getValue();
                    System.out.println("EVAL CONTENT ADDITON After: " + evalSplitAddition[x]);
                    equation = equation + evalSplitAddition[x] + "+";
                    result=result+Double.parseDouble(evalSplitAddition[x]);
                    System.out.println("EVAL CONTENT Equation : " + equation);
                }
                equation = equation + "0";
            }
            System.out.println("FINAL:" + equation);
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                if (variableType.equals("int") || variableType.equals("float") || variableType.equals("double")) {
                    SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(Double.toString(result));

                    //SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(new Expression(equation).eval().toString());
                } else
                    SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).setValue(split[1]);

            }
        }else {
            error = 1;
            System.out.println("ERROR: variable '"+split[0]+"' is a constant.");

        }
        super.enterLocalVariableInit(ctx);
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
            System.out.println("yaaaaa" + new Expression(split[0]+">"+(split[1])).eval().equals(new BigDecimal(1)));
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
        else if(parExp.contains(">=")){
            String[] split = parExp.split(">=");
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }

            if (new Expression(split[0]+">="+(split[1])).eval().equals(new BigDecimal(1))) {
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
        else if(parExp.contains("<=")){
            String[] split = parExp.split("<=");
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null) {
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }

            if (new Expression(split[0]+"<="+(split[1])).eval().equals(new BigDecimal(1))) {
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
//        String[] split = ctx.getText().split("=");
//
//        if (SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null) {
//            split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
//
//        }

        if (ctx.typeType().primitiveType() != null) {
            Value value = new Value(ctx.typeType().primitiveType().getText());
            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText()) != null) {
                System.out.println("ERROR: Variable Exists");
                error = 1;
                return false;
            }
            if (ctx.variableDeclarators().variableDeclarator().size() > 1) {
                for (int i = 0; i < ctx.variableDeclarators().variableDeclarator().size(); i++) {
                    if (ctx.variableDeclarators().variableDeclarator(i).variableInitializer() != null) {
                        //when the variable can be init
                        if (value.getType().equals("int")||value.getType().equals("float")||value.getType().equals("double"))
                            value.setValue(new Expression(ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText()).eval().toString());
                        else
                            value.setValue(ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText());
                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    } else if (ctx.variableDeclarators().variableDeclarator(i).variableInitializer() == null) {

                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    }
                }
            } else {
                if (ctx.variableDeclarators().variableDeclarator(0).variableInitializer() != null) {
                    if (value.getType().equals("int")||value.getType().equals("float")||value.getType().equals("double"))
                        value.setValue(new Expression(ctx.variableDeclarators().variableDeclarator(0).variableInitializer().getText()).eval().toString());
                    else
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
