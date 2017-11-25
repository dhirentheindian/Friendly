package semantics.analyzers;

import antlr.FRIENDLYParser.*;
import builder.ParserHandler;
import builder.errorchecker.ParameterMismatchChecker;
import execution.commands.evaluation.Evaluation;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantics.representations.MobiFunction;
import semantics.symboltable.SymbolTableManager;
import semantics.symboltable.scopes.ClassScope;

public class FunctionCallVerifier implements ParseTreeListener {

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
        if(ctx instanceof ExpressionContext) {
            ExpressionContext exprCtx = (ExpressionContext) ctx;
            if (Evaluation.isFunctionCall(exprCtx)) {
                if(exprCtx.expression(0).Identifier() == null)
                    return;

                String functionName = exprCtx.expression(0).Identifier().getText();

                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(
                        ParserHandler.getInstance().getCurrentClassName());
                MobiFunction mobiFunction = classScope.searchFunction(functionName);


                /**See repo**/
                if (exprCtx.expression(1) != null) {
                    ParameterMismatchChecker paramsMismatchChecker = new ParameterMismatchChecker(mobiFunction, exprCtx.expression(1) );
                    paramsMismatchChecker.verify();
                }
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

}
