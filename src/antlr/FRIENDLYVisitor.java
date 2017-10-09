package antlr;
// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FRIENDLYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FRIENDLYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FRIENDLYParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#multiple_actual_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_actual_parameters(FRIENDLYParser.Multiple_actual_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_expression_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression_for(FRIENDLYParser.Bool_expression_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constdecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdecl_list(FRIENDLYParser.Constdecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(FRIENDLYParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#output_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_list(FRIENDLYParser.Output_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(FRIENDLYParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_list(FRIENDLYParser.Input_listContext ctx);
}