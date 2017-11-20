package antlr;

public class MyListener extends FRIENDLYBaseListener {
    public MyListener(){

    }
    @Override
    public void enterCompilationUnit(FRIENDLYParser.CompilationUnitContext ctx) {
        super.enterCompilationUnit(ctx);
    }
}
