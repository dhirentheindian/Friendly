package semantics.analyzers;

import antlr.FRIENDLYParser.*;
import builder.ParserHandler;
import execution.ExecutionManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;
import semantics.symboltable.scopes.LocalScope;
import semantics.symboltable.scopes.LocalScopeCreator;

public class MainAnalyzer implements ParseTreeListener {

    public MainAnalyzer() {

    }


    public void analyze(MainDeclarationContext ctx) {
        if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
            ExecutionManager.getInstance().reportFoundEntryPoint(ParserHandler.getInstance().getCurrentClassName());

            //automatically create a local scope for main() whose parent is the class scope
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            LocalScope localScope = LocalScopeCreator.getInstance().openLocalScope();
            localScope.setParent(classScope);
            classScope.setParentLocalScope(localScope);

            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, ctx);


        }
        else {
           // Console.log(LogType.DEBUG, "Already found main in " +ExecutionManager.getInstance().getEntryClassName());
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof MethodBodyContext) {
            BlockContext blockCtx = ((MethodBodyContext) ctx).block();

            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
            blockAnalyzer.analyze(blockCtx);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }
}
