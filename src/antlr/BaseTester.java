package antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseTester extends FRIENDLYBaseListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStart(FRIENDLYParser.StartContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStart(FRIENDLYParser.StartContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunction_declaration(FRIENDLYParser.Function_declarationContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunction_declaration(FRIENDLYParser.Function_declarationContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunction_return(FRIENDLYParser.Function_returnContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunction_return(FRIENDLYParser.Function_returnContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParameter_list(FRIENDLYParser.Parameter_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParameter_list(FRIENDLYParser.Parameter_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParameters(FRIENDLYParser.ParametersContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParameters(FRIENDLYParser.ParametersContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunction_content(FRIENDLYParser.Function_contentContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunction_content(FRIENDLYParser.Function_contentContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMain_function(FRIENDLYParser.Main_functionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMain_function(FRIENDLYParser.Main_functionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVardecl_list(FRIENDLYParser.Vardecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVardecl_list(FRIENDLYParser.Vardecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar_decl(FRIENDLYParser.Var_declContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar_decl(FRIENDLYParser.Var_declContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterData_type(FRIENDLYParser.Data_typeContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitData_type(FRIENDLYParser.Data_typeContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIdentifier_list(FRIENDLYParser.Identifier_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIdentifier_list(FRIENDLYParser.Identifier_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(FRIENDLYParser.StatementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(FRIENDLYParser.StatementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterActual_params(FRIENDLYParser.Actual_paramsContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitActual_params(FRIENDLYParser.Actual_paramsContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMultiple_actual_parameters(FRIENDLYParser.Multiple_actual_parametersContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMultiple_actual_parameters(FRIENDLYParser.Multiple_actual_parametersContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturn_statement(FRIENDLYParser.Return_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturn_statement(FRIENDLYParser.Return_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIf_statement(FRIENDLYParser.If_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIf_statement(FRIENDLYParser.If_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile_statement(FRIENDLYParser.While_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile_statement(FRIENDLYParser.While_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFor_statement(FRIENDLYParser.For_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFor_statement(FRIENDLYParser.For_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement_list(FRIENDLYParser.Statement_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement_list(FRIENDLYParser.Statement_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpression(FRIENDLYParser.ExpressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression(FRIENDLYParser.ExpressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterString_expression(FRIENDLYParser.String_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitString_expression(FRIENDLYParser.String_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNum_expression(FRIENDLYParser.Num_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNum_expression(FRIENDLYParser.Num_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNum_term(FRIENDLYParser.Num_termContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNum_term(FRIENDLYParser.Num_termContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNum_factor(FRIENDLYParser.Num_factorContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNum_factor(FRIENDLYParser.Num_factorContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNum_identifier(FRIENDLYParser.Num_identifierContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNum_identifier(FRIENDLYParser.Num_identifierContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_expression(FRIENDLYParser.Bool_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_expression(FRIENDLYParser.Bool_expressionContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_expression_for(FRIENDLYParser.Bool_expression_forContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_expression_for(FRIENDLYParser.Bool_expression_forContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRel_op(FRIENDLYParser.Rel_opContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRel_op(FRIENDLYParser.Rel_opContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_logical(FRIENDLYParser.Bool_logicalContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_logical(FRIENDLYParser.Bool_logicalContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_term(FRIENDLYParser.Bool_termContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_term(FRIENDLYParser.Bool_termContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_factor(FRIENDLYParser.Bool_factorContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_factor(FRIENDLYParser.Bool_factorContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBool_identifier(FRIENDLYParser.Bool_identifierContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBool_identifier(FRIENDLYParser.Bool_identifierContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConstdecl_list(FRIENDLYParser.Constdecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConstdecl_list(FRIENDLYParser.Constdecl_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConst_statement(FRIENDLYParser.Const_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConst_statement(FRIENDLYParser.Const_statementContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConstant(FRIENDLYParser.ConstantContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConstant(FRIENDLYParser.ConstantContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSign(FRIENDLYParser.SignContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSign(FRIENDLYParser.SignContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOutput(FRIENDLYParser.OutputContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOutput(FRIENDLYParser.OutputContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOutput_list(FRIENDLYParser.Output_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOutput_list(FRIENDLYParser.Output_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInput(FRIENDLYParser.InputContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInput(FRIENDLYParser.InputContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInput_list(FRIENDLYParser.Input_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInput_list(FRIENDLYParser.Input_listContext ctx) {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

}