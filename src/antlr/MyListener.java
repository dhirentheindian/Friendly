package antlr;

import sun.awt.Symbol;
import view.FriendlyMenu;

import javax.swing.*;

public class MyListener extends FRIENDLYBaseListener {
    JFrame frame;

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

    @Override
    public void enterLocalVariableDeclaration(FRIENDLYParser.LocalVariableDeclarationContext ctx) {

        //only works so far for primitive types

        if(ctx.typeType().primitiveType() != null) {
            Value value = new Value(ctx.typeType().primitiveType().getText());

            if (SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText()) != null) {
                System.out.println("ERROR: Variable Exists" );
                return;
            }
            if(ctx.variableDeclarators().variableDeclarator().size() > 1){
                for(int i = 0; i < ctx.variableDeclarators().variableDeclarator().size(); i++){
                    if(ctx.variableDeclarators().variableDeclarator(i).variableInitializer()!=null){
                        //when the variable can be init
                        value.setValue(ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText());
                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    }else if(ctx.variableDeclarators().variableDeclarator(i).variableInitializer() == null){

                        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText(), value);
                    }
                }
            }else {
                if (ctx.variableDeclarators().variableDeclarator(0).variableInitializer() != null) {
                    value.setValue(ctx.variableDeclarators().variableDeclarator(0).variableInitializer().getText());
                }
                SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText(), value);
            }
        }
        else if(ctx.typeType().classOrInterfaceType()!=null){
            Value value = new Value(ctx.typeType().classOrInterfaceType().getText());
            
        }

        super.enterLocalVariableDeclaration(ctx);

    }

    @Override
    public void enterStatement(FRIENDLYParser.StatementContext ctx) {
        String statement = ctx.getText();
        //print statements


        if(statement.substring(0,6).equals("print(")){
//            if(ctx.StringLiteral() != null){
//                String toPrint = ctx.StringLiteral().getText();
//                toPrint = toPrint.substring(1,toPrint.length()-1);
//                System.out.println(toPrint);
//            }else if(ctx.Identifier() != null){
//                Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText());
//                System.out.println(v.getValue());
//            }

            if(ctx.printContent().printExpression().size()==1){
                if(ctx.printContent().printExpression().get(0).StringLiteral()!=null) {
                    String line = ctx.printContent().printExpression().get(0).StringLiteral().getText();
                    line = line.substring(1,line.length()-1);
                    System.out.println(line);
                }
                else {
                    Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.printContent().printExpression().get(0).Identifier().getText());
                    System.out.println(v.getValue());
                }

                friendlyMenu.refreshPrintScreen();
            }else if (ctx.printContent().printExpression().size() > 1){
                String mumble = "";
                for (int i = 0; i < ctx.printContent().printExpression().size();i++){
                    if(ctx.printContent().printExpression().get(i).StringLiteral()!=null) {
                        String line = ctx.printContent().printExpression().get(i).StringLiteral().getText();
                        line = line.substring(1, line.length() - 1);
                        mumble += line;
                    }
                    else {
                        Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.printContent().printExpression().get(i).Identifier().getText());
                        mumble +=  v.getValue();
                    }
                }
                System.out.println(mumble);
            }



         }else if(statement.substring(0,5).equals("scan(")){

            //scanning code & then put the input in setValue below...
            String expectedType = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText()).getType();
            String s = (String) JOptionPane.showInputDialog("What is your input for "+ expectedType+" "+ctx.Identifier().getText() +"?");
            SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText()).setValue(s);


        }else if(statement.substring(0,2).equals("if")){

            System.out.println(ctx.parExpression().expression().expression().size());

            String parExp = ctx.parExpression().getText();
            parExp = parExp.substring(1,parExp.length()-1);

            String[] split = parExp.split("eq");
            if(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]) != null){
                split[0] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[0]).getValue();
            }
            if(SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]) != null){
                split[1] = SymbolTableManager.getInstance().getCurrentScope().getVariable(split[1]).getValue();
            }

            if(split[0].equals(split[1])){
                System.out.println("post malone!");
            }


        }else if(statement.contains("do")){

        }else if(statement.contains("for")){

        }else if(statement.contains("while")){

        }else if(statement.contains("switch")){

        }

        super.enterStatement(ctx);
    }

    @Override
    public void enterMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx) {

        //ctx.Identifier()
        super.enterMethodDeclaration(ctx);

    }
}
