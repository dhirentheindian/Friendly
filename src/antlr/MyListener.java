package antlr;

import sun.awt.Symbol;

public class MyListener extends FRIENDLYBaseListener {
    public MyListener(){

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

        super.enterLocalVariableDeclaration(ctx);

    }

    @Override
    public void enterStatement(FRIENDLYParser.StatementContext ctx) {
        //print statements
        if(ctx.getText().contains("print(")){
            if(ctx.StringLiteral() != null){
                String toPrint = ctx.StringLiteral().getText();
                toPrint = toPrint.substring(1,toPrint.length()-1);
                System.out.println(toPrint);
            }else if(ctx.Identifier() != null){
                Value v = SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.Identifier().getText());
                System.out.println(v.getValue());
            }

         }

        super.enterStatement(ctx);
    }

    @Override
    public void enterMethodDeclaration(FRIENDLYParser.MethodDeclarationContext ctx) {

        //ctx.Identifier()
        super.enterMethodDeclaration(ctx);

    }
}
