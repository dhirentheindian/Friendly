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
        Value value = new Value(ctx.typeType().primitiveType().getText());

        if(SymbolTableManager.getInstance().getCurrentScope().getVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText())!=null){
            System.out.println("VAR EXISTS :/");
            return;
        }
        value.setValue(ctx.variableDeclarators().variableDeclarator(0).variableInitializer().getText());
        System.out.println( SymbolTableManager.getInstance().getCurrentScope().getVariablesSize());
        SymbolTableManager.getInstance().getCurrentScope().addVariable(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText(), value);
        System.out.println( SymbolTableManager.getInstance().getCurrentScope().getVariablesSize());

        super.enterLocalVariableDeclaration(ctx);

    }
}
