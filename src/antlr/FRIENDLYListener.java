// Generated from FRIENDLY.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FRIENDLYParser}.
 */
public interface FRIENDLYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FRIENDLYParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FRIENDLYParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 */
	void enterFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 */
	void exitFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_actual_parameters(FRIENDLYParser.Multiple_actual_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_actual_parameters(FRIENDLYParser.Multiple_actual_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 */
	void enterNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 */
	void exitNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_expression_for}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression_for(FRIENDLYParser.Bool_expression_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_expression_for}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression_for(FRIENDLYParser.Bool_expression_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void enterBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void exitBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl_list(FRIENDLYParser.Constdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl_list(FRIENDLYParser.Constdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(FRIENDLYParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(FRIENDLYParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#output_list}.
	 * @param ctx the parse tree
	 */
	void enterOutput_list(FRIENDLYParser.Output_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#output_list}.
	 * @param ctx the parse tree
	 */
	void exitOutput_list(FRIENDLYParser.Output_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(FRIENDLYParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(FRIENDLYParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#input_list}.
	 * @param ctx the parse tree
	 */
	void enterInput_list(FRIENDLYParser.Input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#input_list}.
	 * @param ctx the parse tree
	 */
	void exitInput_list(FRIENDLYParser.Input_listContext ctx);
}