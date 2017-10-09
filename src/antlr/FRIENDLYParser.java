package antlr;
// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FRIENDLYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE1=1, QUOTE2=2, INTEGER_LITERAL=3, CHAR_LITERAL=4, FLOAT_LITERAL=5, 
		STRING_LITERAL=6, COMMENT_BLOCK=7, TERMINATOR=8, RETURN_KEYWORD=9, INTEGER_KEYWORD=10, 
		FLOAT_KEYWORD=11, STRING_KEYWORD=12, CHAR_KEYWORD=13, VOID_KEYWORD=14, 
		DOUBLE_KEYWORD=15, DO_LOOP=16, WHILE_LOOP=17, FOR_LOOP=18, OUTPUT_FUNCTION=19, 
		INPUT_FUNCTION=20, MAIN_KEYWORD=21, IF_STATEMENT=22, ELSE_STATEMENT=23, 
		ADDITION_OPERATOR=24, SUBTRACTION_OPERATOR=25, MULTIPLICATION_OPERATOR=26, 
		DIVISION_OPERATOR=27, MODULO_OPERATOR=28, INCREMENTAL_OPERATOR=29, DECREMENTAL_OPERATOR=30, 
		AND_operator=31, OR_operator=32, NOT_operator=33, ASSIGNMENT_OPERATOR=34, 
		GREATER_THAN_OPERATOR=35, LESS_THAN_OPERATOR=36, LESS_EQUAL_OPERATOR=37, 
		GREATER_EQUAL_OPERATOR=38, NOT_EQUAL_OPERATOR=39, EQUALS_OPERATOR=40, 
		OPEN_BRACE=41, CLOSE_BRACE=42, OPEN_BRACKET=43, CLOSE_BRACKET=44, OPEN_PAR=45, 
		CLOSE_PAR=46, COMMA=47, ARRAY_IDENTIFIER=48, FUNCTION_IDENTIFIER=49, CONSTANT_KEYWORD=50, 
		TRUE_LITERAL=51, FALSE_LITERAL=52, VARIABLE_IDENTIFIER=53, WS=54;
	public static final int
		RULE_start = 0, RULE_funcdecl_list = 1, RULE_function_declaration = 2, 
		RULE_function_return = 3, RULE_function_noreturn = 4, RULE_parameter_list = 5, 
		RULE_parameters = 6, RULE_function_content = 7, RULE_main_function = 8, 
		RULE_vardecl_list = 9, RULE_var_decl = 10, RULE_data_type = 11, RULE_identifier_list = 12, 
		RULE_statement = 13, RULE_assignment_statement = 14, RULE_funccall_statement = 15, 
		RULE_actual_parameter_list = 16, RULE_actual_params = 17, RULE_multiple_actual_parameters = 18, 
		RULE_return_statement = 19, RULE_if_statement = 20, RULE_while_statement = 21, 
		RULE_do_while_statement = 22, RULE_for_statement = 23, RULE_statement_list = 24, 
		RULE_expression = 25, RULE_string_expression = 26, RULE_num_expression = 27, 
		RULE_num_term = 28, RULE_num_factor = 29, RULE_num_identifier = 30, RULE_bool_expression = 31, 
		RULE_bool_expression_for = 32, RULE_rel_op = 33, RULE_bool_logical = 34, 
		RULE_bool_term = 35, RULE_bool_factor = 36, RULE_bool_identifier = 37, 
		RULE_constdecl_list = 38, RULE_const_statement = 39, RULE_constant = 40, 
		RULE_sign = 41, RULE_output = 42, RULE_output_list = 43, RULE_input = 44, 
		RULE_input_list = 45;
	public static final String[] ruleNames = {
		"start", "funcdecl_list", "function_declaration", "function_return", "function_noreturn", 
		"parameter_list", "parameters", "function_content", "main_function", "vardecl_list", 
		"var_decl", "data_type", "identifier_list", "statement", "assignment_statement", 
		"funccall_statement", "actual_parameter_list", "actual_params", "multiple_actual_parameters", 
		"return_statement", "if_statement", "while_statement", "do_while_statement", 
		"for_statement", "statement_list", "expression", "string_expression", 
		"num_expression", "num_term", "num_factor", "num_identifier", "bool_expression", 
		"bool_expression_for", "rel_op", "bool_logical", "bool_term", "bool_factor", 
		"bool_identifier", "constdecl_list", "const_statement", "constant", "sign", 
		"output", "output_list", "input", "input_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'\"'", null, null, null, null, null, "';'", "'return'", 
		"'int'", "'float'", "'String'", "'char'", "'void'", "'double'", "'do'", 
		"'while'", "'for'", "'print'", "'scan'", "'main'", "'if'", "'else'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'AND'", "'|'", "'NOT'", "':'", 
		"'great'", "'less'", "'lesseq'", "'greateq'", "'noteq'", "'eq'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "','", null, null, "'const'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUOTE1", "QUOTE2", "INTEGER_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
		"STRING_LITERAL", "COMMENT_BLOCK", "TERMINATOR", "RETURN_KEYWORD", "INTEGER_KEYWORD", 
		"FLOAT_KEYWORD", "STRING_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", "DOUBLE_KEYWORD", 
		"DO_LOOP", "WHILE_LOOP", "FOR_LOOP", "OUTPUT_FUNCTION", "INPUT_FUNCTION", 
		"MAIN_KEYWORD", "IF_STATEMENT", "ELSE_STATEMENT", "ADDITION_OPERATOR", 
		"SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", 
		"MODULO_OPERATOR", "INCREMENTAL_OPERATOR", "DECREMENTAL_OPERATOR", "AND_operator", 
		"OR_operator", "NOT_operator", "ASSIGNMENT_OPERATOR", "GREATER_THAN_OPERATOR", 
		"LESS_THAN_OPERATOR", "LESS_EQUAL_OPERATOR", "GREATER_EQUAL_OPERATOR", 
		"NOT_EQUAL_OPERATOR", "EQUALS_OPERATOR", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ARRAY_IDENTIFIER", 
		"FUNCTION_IDENTIFIER", "CONSTANT_KEYWORD", "TRUE_LITERAL", "FALSE_LITERAL", 
		"VARIABLE_IDENTIFIER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FRIENDLY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FRIENDLYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT_KEYWORD) {
				{
				setState(92);
				constdecl_list();
				}
			}

			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(95);
				funcdecl_list();
				}
				break;
			}
			setState(98);
			main_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcdecl_listContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public Funcdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFuncdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFuncdecl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFuncdecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcdecl_listContext funcdecl_list() throws RecognitionException {
		Funcdecl_listContext _localctx = new Funcdecl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			function_declaration();
			setState(101);
			funcdecl_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KEYWORD:
			case STRING_KEYWORD:
			case CHAR_KEYWORD:
			case DOUBLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				function_return();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				function_noreturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(FRIENDLYParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFunction_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_return);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				data_type();
				setState(108);
				match(FUNCTION_IDENTIFIER);
				setState(109);
				match(OPEN_PAR);
				setState(110);
				parameter_list();
				setState(111);
				match(CLOSE_PAR);
				setState(112);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				data_type();
				setState(115);
				match(FUNCTION_IDENTIFIER);
				setState(116);
				match(OPEN_PAR);
				setState(117);
				match(CLOSE_PAR);
				setState(118);
				function_content();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_noreturnContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(FRIENDLYParser.VOID_KEYWORD, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(FRIENDLYParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFunction_noreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFunction_noreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_noreturn);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VOID_KEYWORD);
				setState(123);
				match(FUNCTION_IDENTIFIER);
				setState(124);
				match(OPEN_PAR);
				setState(125);
				parameter_list();
				setState(126);
				match(CLOSE_PAR);
				setState(127);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(VOID_KEYWORD);
				setState(130);
				match(FUNCTION_IDENTIFIER);
				setState(131);
				match(OPEN_PAR);
				setState(132);
				match(CLOSE_PAR);
				setState(133);
				function_content();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FRIENDLYParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				var_decl();
				setState(139);
				match(COMMA);
				setState(140);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				var_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_contentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FRIENDLYParser.OPEN_BRACE, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(FRIENDLYParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Function_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFunction_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFunction_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFunction_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_contentContext function_content() throws RecognitionException {
		Function_contentContext _localctx = new Function_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(OPEN_BRACE);
			setState(146);
			vardecl_list();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN_KEYWORD) | (1L << DO_LOOP) | (1L << WHILE_LOOP) | (1L << FOR_LOOP) | (1L << IF_STATEMENT) | (1L << OPEN_BRACE) | (1L << FUNCTION_IDENTIFIER) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				setState(147);
				statement_list();
				}
			}

			setState(150);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(FRIENDLYParser.VOID_KEYWORD, 0); }
		public TerminalNode MAIN_KEYWORD() { return getToken(FRIENDLYParser.MAIN_KEYWORD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(VOID_KEYWORD);
			setState(153);
			match(MAIN_KEYWORD);
			setState(154);
			match(OPEN_PAR);
			setState(155);
			match(CLOSE_PAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(156);
				function_content();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVardecl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVardecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl_list);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				var_decl();
				setState(160);
				match(TERMINATOR);
				setState(161);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				var_decl();
				setState(164);
				match(TERMINATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			data_type();
			setState(169);
			identifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_KEYWORD() { return getToken(FRIENDLYParser.INTEGER_KEYWORD, 0); }
		public TerminalNode DOUBLE_KEYWORD() { return getToken(FRIENDLYParser.DOUBLE_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(FRIENDLYParser.CHAR_KEYWORD, 0); }
		public TerminalNode STRING_KEYWORD() { return getToken(FRIENDLYParser.STRING_KEYWORD, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(FRIENDLYParser.COMMA, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier_list);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(VARIABLE_IDENTIFIER);
				setState(174);
				match(COMMA);
				setState(175);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(FRIENDLYParser.OPEN_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(FRIENDLYParser.CLOSE_BRACE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				assignment_statement();
				}
				break;
			case FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				funccall_statement();
				}
				break;
			case IF_STATEMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				if_statement();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				while_statement();
				}
				break;
			case DO_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				do_while_statement();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				for_statement();
				}
				break;
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				return_statement();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(OPEN_BRACE);
				setState(187);
				statement_list();
				setState(188);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(FRIENDLYParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(VARIABLE_IDENTIFIER);
			setState(193);
			match(ASSIGNMENT_OPERATOR);
			setState(194);
			expression();
			setState(195);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funccall_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(FRIENDLYParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFunccall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFunccall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funccall_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(FUNCTION_IDENTIFIER);
				setState(198);
				match(OPEN_PAR);
				setState(199);
				actual_parameter_list();
				setState(200);
				match(CLOSE_PAR);
				setState(201);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(FUNCTION_IDENTIFIER);
				setState(204);
				match(OPEN_PAR);
				setState(205);
				match(CLOSE_PAR);
				setState(206);
				match(TERMINATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitActual_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitActual_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			actual_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_paramsContext extends ParserRuleContext {
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Multiple_actual_parametersContext multiple_actual_parameters() {
			return getRuleContext(Multiple_actual_parametersContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FRIENDLYParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(FRIENDLYParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(FRIENDLYParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitActual_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitActual_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_actual_params);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				funccall_statement();
				setState(212);
				multiple_actual_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(VARIABLE_IDENTIFIER);
				setState(215);
				multiple_actual_parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(INTEGER_LITERAL);
				setState(217);
				multiple_actual_parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(FLOAT_LITERAL);
				setState(219);
				multiple_actual_parameters();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(CHAR_LITERAL);
				setState(221);
				multiple_actual_parameters();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(STRING_LITERAL);
				setState(223);
				multiple_actual_parameters();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				expression();
				setState(225);
				multiple_actual_parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_actual_parametersContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(FRIENDLYParser.COMMA, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Multiple_actual_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_actual_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterMultiple_actual_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitMultiple_actual_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitMultiple_actual_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_actual_parametersContext multiple_actual_parameters() throws RecognitionException {
		Multiple_actual_parametersContext _localctx = new Multiple_actual_parametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiple_actual_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(COMMA);
			setState(230);
			actual_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(FRIENDLYParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(RETURN_KEYWORD);
			setState(233);
			expression();
			setState(234);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_STATEMENT() { return getToken(FRIENDLYParser.IF_STATEMENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_STATEMENT() { return getToken(FRIENDLYParser.ELSE_STATEMENT, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(IF_STATEMENT);
				setState(237);
				match(OPEN_PAR);
				setState(238);
				bool_expression();
				setState(239);
				match(CLOSE_PAR);
				setState(240);
				statement();
				setState(241);
				match(ELSE_STATEMENT);
				setState(242);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IF_STATEMENT);
				setState(245);
				match(OPEN_PAR);
				setState(246);
				bool_expression();
				setState(247);
				match(CLOSE_PAR);
				setState(248);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(FRIENDLYParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(WHILE_LOOP);
			setState(253);
			match(OPEN_PAR);
			setState(254);
			bool_expression();
			setState(255);
			match(CLOSE_PAR);
			setState(256);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO_LOOP() { return getToken(FRIENDLYParser.DO_LOOP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(FRIENDLYParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(DO_LOOP);
			setState(259);
			statement();
			setState(260);
			match(WHILE_LOOP);
			setState(261);
			match(OPEN_PAR);
			setState(262);
			bool_expression_for();
			setState(263);
			match(CLOSE_PAR);
			setState(264);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(FRIENDLYParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(FRIENDLYParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FRIENDLYParser.TERMINATOR, i);
		}
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(FOR_LOOP);
			setState(267);
			match(OPEN_PAR);
			setState(268);
			assignment_statement();
			setState(269);
			match(TERMINATOR);
			setState(270);
			bool_expression_for();
			setState(271);
			match(TERMINATOR);
			setState(272);
			assignment_statement();
			setState(273);
			match(CLOSE_PAR);
			setState(274);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement_list);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				statement();
				setState(277);
				statement_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(FRIENDLYParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				bool_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(FUNCTION_IDENTIFIER);
				setState(286);
				match(OPEN_PAR);
				setState(287);
				actual_parameter_list();
				setState(288);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(FUNCTION_IDENTIFIER);
				setState(291);
				match(OPEN_PAR);
				setState(292);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ADDITION_OPERATOR() { return getToken(FRIENDLYParser.ADDITION_OPERATOR, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public TerminalNode NOT_operator() { return getToken(FRIENDLYParser.NOT_operator, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(FRIENDLYParser.SUBTRACTION_OPERATOR, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitString_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string_expression);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(VARIABLE_IDENTIFIER);
				setState(296);
				match(ADDITION_OPERATOR);
				setState(297);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(STRING_LITERAL);
				setState(299);
				match(ADDITION_OPERATOR);
				setState(300);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(NOT_operator);
				setState(304);
				string_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(SUBTRACTION_OPERATOR);
				setState(306);
				string_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_expressionContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode ADDITION_OPERATOR() { return getToken(FRIENDLYParser.ADDITION_OPERATOR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(FRIENDLYParser.SUBTRACTION_OPERATOR, 0); }
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNum_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_num_expression);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				num_term();
				setState(310);
				match(ADDITION_OPERATOR);
				setState(311);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				num_term();
				setState(314);
				match(SUBTRACTION_OPERATOR);
				setState(315);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				num_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_termContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(FRIENDLYParser.MULTIPLICATION_OPERATOR, 0); }
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode DIVISION_OPERATOR() { return getToken(FRIENDLYParser.DIVISION_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(FRIENDLYParser.MODULO_OPERATOR, 0); }
		public TerminalNode INCREMENTAL_OPERATOR() { return getToken(FRIENDLYParser.INCREMENTAL_OPERATOR, 0); }
		public TerminalNode DECREMENTAL_OPERATOR() { return getToken(FRIENDLYParser.DECREMENTAL_OPERATOR, 0); }
		public Num_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNum_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNum_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNum_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_termContext num_term() throws RecognitionException {
		Num_termContext _localctx = new Num_termContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_num_term);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				num_factor();
				setState(321);
				match(MULTIPLICATION_OPERATOR);
				setState(322);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				num_factor();
				setState(325);
				match(DIVISION_OPERATOR);
				setState(326);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				num_factor();
				setState(329);
				match(MODULO_OPERATOR);
				setState(330);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				num_factor();
				setState(333);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				num_factor();
				setState(336);
				match(DECREMENTAL_OPERATOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				num_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(FRIENDLYParser.CHAR_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FRIENDLYParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(FRIENDLYParser.FLOAT_LITERAL, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(FRIENDLYParser.GREATER_THAN_OPERATOR, 0); }
		public Num_identifierContext num_identifier() {
			return getRuleContext(Num_identifierContext.class,0);
		}
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNum_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNum_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_num_factor);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(OPEN_PAR);
				setState(342);
				num_expression();
				setState(343);
				match(CLOSE_PAR);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(CHAR_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(FLOAT_LITERAL);
				}
				break;
			case GREATER_THAN_OPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(GREATER_THAN_OPERATOR);
				setState(349);
				num_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public Num_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNum_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNum_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNum_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_identifierContext num_identifier() throws RecognitionException {
		Num_identifierContext _localctx = new Num_identifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode TRUE_LITERAL() { return getToken(FRIENDLYParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(FRIENDLYParser.FALSE_LITERAL, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_expression);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SUBTRACTION_OPERATOR:
			case NOT_operator:
			case GREATER_THAN_OPERATOR:
			case OPEN_PAR:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				bool_expression_for();
				}
				break;
			case TRUE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(TRUE_LITERAL);
				}
				break;
			case FALSE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(FALSE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expression_forContext extends ParserRuleContext {
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUALS_OPERATOR() { return getToken(FRIENDLYParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(FRIENDLYParser.NOT_EQUAL_OPERATOR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Bool_expression_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_expression_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_expression_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_expression_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expression_forContext bool_expression_for() throws RecognitionException {
		Bool_expression_forContext _localctx = new Bool_expression_forContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool_expression_for);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				num_expression();
				setState(360);
				rel_op();
				setState(361);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				string_expression();
				setState(364);
				match(EQUALS_OPERATOR);
				setState(365);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				string_expression();
				setState(368);
				match(NOT_EQUAL_OPERATOR);
				setState(369);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				bool_logical();
				setState(372);
				match(EQUALS_OPERATOR);
				setState(373);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				bool_logical();
				setState(376);
				match(NOT_EQUAL_OPERATOR);
				setState(377);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				bool_logical();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQUALS_OPERATOR() { return getToken(FRIENDLYParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(FRIENDLYParser.NOT_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_EQUAL_OPERATOR() { return getToken(FRIENDLYParser.LESS_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_EQUAL_OPERATOR() { return getToken(FRIENDLYParser.GREATER_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(FRIENDLYParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(FRIENDLYParser.GREATER_THAN_OPERATOR, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << LESS_EQUAL_OPERATOR) | (1L << GREATER_EQUAL_OPERATOR) | (1L << NOT_EQUAL_OPERATOR) | (1L << EQUALS_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_logicalContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode OR_operator() { return getToken(FRIENDLYParser.OR_operator, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_logical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_logical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_logicalContext bool_logical() throws RecognitionException {
		Bool_logicalContext _localctx = new Bool_logicalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool_logical);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				bool_term();
				setState(385);
				match(OR_operator);
				setState(386);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				bool_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public TerminalNode AND_operator() { return getToken(FRIENDLYParser.AND_operator, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bool_term);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				bool_factor();
				setState(392);
				match(AND_operator);
				setState(393);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				bool_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_operator() { return getToken(FRIENDLYParser.NOT_operator, 0); }
		public Bool_identifierContext bool_identifier() {
			return getRuleContext(Bool_identifierContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bool_factor);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(OPEN_PAR);
				setState(399);
				bool_logical();
				setState(400);
				match(CLOSE_PAR);
				}
				break;
			case NOT_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(NOT_operator);
				setState(403);
				bool_logical();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				bool_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public Bool_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBool_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBool_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBool_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_identifierContext bool_identifier() throws RecognitionException {
		Bool_identifierContext _localctx = new Bool_identifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constdecl_listContext extends ParserRuleContext {
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Constdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstdecl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstdecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constdecl_listContext constdecl_list() throws RecognitionException {
		Constdecl_listContext _localctx = new Constdecl_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constdecl_list);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				const_statement();
				setState(410);
				constdecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				const_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_statementContext extends ParserRuleContext {
		public TerminalNode CONSTANT_KEYWORD() { return getToken(FRIENDLYParser.CONSTANT_KEYWORD, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(FRIENDLYParser.ASSIGNMENT_OPERATOR, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConst_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConst_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(CONSTANT_KEYWORD);
			setState(416);
			data_type();
			setState(417);
			match(VARIABLE_IDENTIFIER);
			setState(418);
			match(ASSIGNMENT_OPERATOR);
			setState(419);
			constant();
			setState(420);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(FRIENDLYParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(FRIENDLYParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(FRIENDLYParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constant);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				sign();
				setState(423);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				sign();
				setState(426);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				match(INTEGER_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				match(FLOAT_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(FRIENDLYParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(FRIENDLYParser.SUBTRACTION_OPERATOR, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT_FUNCTION() { return getToken(FRIENDLYParser.OUTPUT_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(FRIENDLYParser.OPEN_PAR, 0); }
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(FRIENDLYParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(OUTPUT_FUNCTION);
			setState(437);
			match(OPEN_PAR);
			setState(438);
			output_list();
			setState(439);
			match(CLOSE_PAR);
			setState(440);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Output_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterOutput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitOutput_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitOutput_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_listContext output_list() throws RecognitionException {
		Output_listContext _localctx = new Output_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_output_list);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				funccall_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(FRIENDLYParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(FRIENDLYParser.ASSIGNMENT_OPERATOR, 0); }
		public TerminalNode INPUT_FUNCTION() { return getToken(FRIENDLYParser.INPUT_FUNCTION, 0); }
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(FRIENDLYParser.TERMINATOR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(VARIABLE_IDENTIFIER);
			setState(448);
			match(ASSIGNMENT_OPERATOR);
			setState(449);
			match(INPUT_FUNCTION);
			setState(450);
			input_list();
			setState(451);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_listContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(FRIENDLYParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FRIENDLYParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(FRIENDLYParser.CHAR_LITERAL, 0); }
		public Input_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInput_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInput_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_listContext input_list() throws RecognitionException {
		Input_listContext _localctx = new Input_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_input_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\5\2c\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0089\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\5\t\u0097\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00b4"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00d2\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e6\n\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00fd\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u011b\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0128\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0136\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0141\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0156\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0161\n\37\3 \3 \3!\3!\3!\5!\u0168\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u017f\n\"\3#"+
		"\3#\3$\3$\3$\3$\3$\5$\u0188\n$\3%\3%\3%\3%\3%\5%\u018f\n%\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u0198\n&\3\'\3\'\3(\3(\3(\3(\5(\u01a0\n(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01b3\n*\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\5-\u01c0\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6"+
		"\5\2\f\f\16\17\21\21\3\2%*\3\2\32\33\4\2\5\6\b\b\2\u01dc\2_\3\2\2\2\4"+
		"f\3\2\2\2\6k\3\2\2\2\bz\3\2\2\2\n\u0088\3\2\2\2\f\u008a\3\2\2\2\16\u0091"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u009a\3\2\2\2\24\u00a8\3\2\2\2\26\u00aa\3"+
		"\2\2\2\30\u00ad\3\2\2\2\32\u00b3\3\2\2\2\34\u00c0\3\2\2\2\36\u00c2\3\2"+
		"\2\2 \u00d1\3\2\2\2\"\u00d3\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00ea"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u00fe\3\2\2\2.\u0104\3\2\2\2\60\u010c\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u0127\3\2\2\2\66\u0135\3\2\2\28\u0140\3\2\2\2:\u0155"+
		"\3\2\2\2<\u0160\3\2\2\2>\u0162\3\2\2\2@\u0167\3\2\2\2B\u017e\3\2\2\2D"+
		"\u0180\3\2\2\2F\u0187\3\2\2\2H\u018e\3\2\2\2J\u0197\3\2\2\2L\u0199\3\2"+
		"\2\2N\u019f\3\2\2\2P\u01a1\3\2\2\2R\u01b2\3\2\2\2T\u01b4\3\2\2\2V\u01b6"+
		"\3\2\2\2X\u01bf\3\2\2\2Z\u01c1\3\2\2\2\\\u01c7\3\2\2\2^`\5N(\2_^\3\2\2"+
		"\2_`\3\2\2\2`b\3\2\2\2ac\5\4\3\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\22"+
		"\n\2e\3\3\2\2\2fg\5\6\4\2gh\5\4\3\2h\5\3\2\2\2il\5\b\5\2jl\5\n\6\2ki\3"+
		"\2\2\2kj\3\2\2\2l\7\3\2\2\2mn\5\30\r\2no\7\63\2\2op\7/\2\2pq\5\f\7\2q"+
		"r\7\60\2\2rs\5\20\t\2s{\3\2\2\2tu\5\30\r\2uv\7\63\2\2vw\7/\2\2wx\7\60"+
		"\2\2xy\5\20\t\2y{\3\2\2\2zm\3\2\2\2zt\3\2\2\2{\t\3\2\2\2|}\7\20\2\2}~"+
		"\7\63\2\2~\177\7/\2\2\177\u0080\5\f\7\2\u0080\u0081\7\60\2\2\u0081\u0082"+
		"\5\20\t\2\u0082\u0089\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085\7\63\2"+
		"\2\u0085\u0086\7/\2\2\u0086\u0087\7\60\2\2\u0087\u0089\5\20\t\2\u0088"+
		"|\3\2\2\2\u0088\u0083\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\r\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\61\2\2\u008e\u008f\5\16"+
		"\b\2\u008f\u0092\3\2\2\2\u0090\u0092\5\26\f\2\u0091\u008c\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\7+\2\2\u0094\u0096\5\24\13"+
		"\2\u0095\u0097\5\62\32\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7,\2\2\u0099\21\3\2\2\2\u009a\u009b\7\20\2"+
		"\2\u009b\u009c\7\27\2\2\u009c\u009d\7/\2\2\u009d\u009f\7\60\2\2\u009e"+
		"\u00a0\5\20\t\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\23\3\2\2"+
		"\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\5\24\13\2\u00a4"+
		"\u00a9\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7\n\2\2\u00a7\u00a9\3"+
		"\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\25\3\2\2\2\u00aa"+
		"\u00ab\5\30\r\2\u00ab\u00ac\5\32\16\2\u00ac\27\3\2\2\2\u00ad\u00ae\t\2"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\67\2\2\u00b0\u00b1\7\61\2\2\u00b1"+
		"\u00b4\5\32\16\2\u00b2\u00b4\7\67\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00c1\5\36\20\2\u00b6\u00c1\5 \21\2\u00b7"+
		"\u00c1\5*\26\2\u00b8\u00c1\5,\27\2\u00b9\u00c1\5.\30\2\u00ba\u00c1\5\60"+
		"\31\2\u00bb\u00c1\5(\25\2\u00bc\u00bd\7+\2\2\u00bd\u00be\5\62\32\2\u00be"+
		"\u00bf\7,\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b6\3\2"+
		"\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0"+
		"\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\35\3\2\2"+
		"\2\u00c2\u00c3\7\67\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\5\64\33\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7\63\2\2\u00c8\u00c9\7/\2"+
		"\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00d2\3\2\2\2\u00cd\u00ce\7\63\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0\7\60"+
		"\2\2\u00d0\u00d2\7\n\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2"+
		"!\3\2\2\2\u00d3\u00d4\5$\23\2\u00d4#\3\2\2\2\u00d5\u00d6\5 \21\2\u00d6"+
		"\u00d7\5&\24\2\u00d7\u00e6\3\2\2\2\u00d8\u00d9\7\67\2\2\u00d9\u00e6\5"+
		"&\24\2\u00da\u00db\7\5\2\2\u00db\u00e6\5&\24\2\u00dc\u00dd\7\7\2\2\u00dd"+
		"\u00e6\5&\24\2\u00de\u00df\7\6\2\2\u00df\u00e6\5&\24\2\u00e0\u00e1\7\b"+
		"\2\2\u00e1\u00e6\5&\24\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\5&\24\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00da\3\2"+
		"\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\5$\23\2"+
		"\u00e9\'\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\5\64\33\2\u00ec\u00ed"+
		"\7\n\2\2\u00ed)\3\2\2\2\u00ee\u00ef\7\30\2\2\u00ef\u00f0\7/\2\2\u00f0"+
		"\u00f1\5@!\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\7"+
		"\31\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00fd\3\2\2\2\u00f6\u00f7\7\30\2\2"+
		"\u00f7\u00f8\7/\2\2\u00f8\u00f9\5@!\2\u00f9\u00fa\7\60\2\2\u00fa\u00fb"+
		"\5\34\17\2\u00fb\u00fd\3\2\2\2\u00fc\u00ee\3\2\2\2\u00fc\u00f6\3\2\2\2"+
		"\u00fd+\3\2\2\2\u00fe\u00ff\7\23\2\2\u00ff\u0100\7/\2\2\u0100\u0101\5"+
		"@!\2\u0101\u0102\7\60\2\2\u0102\u0103\5\34\17\2\u0103-\3\2\2\2\u0104\u0105"+
		"\7\22\2\2\u0105\u0106\5\34\17\2\u0106\u0107\7\23\2\2\u0107\u0108\7/\2"+
		"\2\u0108\u0109\5B\"\2\u0109\u010a\7\60\2\2\u010a\u010b\7\n\2\2\u010b/"+
		"\3\2\2\2\u010c\u010d\7\24\2\2\u010d\u010e\7/\2\2\u010e\u010f\5\36\20\2"+
		"\u010f\u0110\7\n\2\2\u0110\u0111\5B\"\2\u0111\u0112\7\n\2\2\u0112\u0113"+
		"\5\36\20\2\u0113\u0114\7\60\2\2\u0114\u0115\5\34\17\2\u0115\61\3\2\2\2"+
		"\u0116\u0117\5\34\17\2\u0117\u0118\5\62\32\2\u0118\u011b\3\2\2\2\u0119"+
		"\u011b\5\34\17\2\u011a\u0116\3\2\2\2\u011a\u0119\3\2\2\2\u011b\63\3\2"+
		"\2\2\u011c\u0128\5\66\34\2\u011d\u0128\58\35\2\u011e\u0128\5@!\2\u011f"+
		"\u0120\7\63\2\2\u0120\u0121\7/\2\2\u0121\u0122\5\"\22\2\u0122\u0123\7"+
		"\60\2\2\u0123\u0128\3\2\2\2\u0124\u0125\7\63\2\2\u0125\u0126\7/\2\2\u0126"+
		"\u0128\7\60\2\2\u0127\u011c\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u011e\3"+
		"\2\2\2\u0127\u011f\3\2\2\2\u0127\u0124\3\2\2\2\u0128\65\3\2\2\2\u0129"+
		"\u012a\7\67\2\2\u012a\u012b\7\32\2\2\u012b\u0136\5\66\34\2\u012c\u012d"+
		"\7\b\2\2\u012d\u012e\7\32\2\2\u012e\u0136\5\66\34\2\u012f\u0136\7\67\2"+
		"\2\u0130\u0136\7\b\2\2\u0131\u0132\7#\2\2\u0132\u0136\5\66\34\2\u0133"+
		"\u0134\7\33\2\2\u0134\u0136\5\66\34\2\u0135\u0129\3\2\2\2\u0135\u012c"+
		"\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\67\3\2\2\2\u0137\u0138\5:\36\2\u0138\u0139\7\32\2"+
		"\2\u0139\u013a\58\35\2\u013a\u0141\3\2\2\2\u013b\u013c\5:\36\2\u013c\u013d"+
		"\7\33\2\2\u013d\u013e\58\35\2\u013e\u0141\3\2\2\2\u013f\u0141\5:\36\2"+
		"\u0140\u0137\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013f\3\2\2\2\u01419\3"+
		"\2\2\2\u0142\u0143\5<\37\2\u0143\u0144\7\34\2\2\u0144\u0145\5:\36\2\u0145"+
		"\u0156\3\2\2\2\u0146\u0147\5<\37\2\u0147\u0148\7\35\2\2\u0148\u0149\5"+
		":\36\2\u0149\u0156\3\2\2\2\u014a\u014b\5<\37\2\u014b\u014c\7\36\2\2\u014c"+
		"\u014d\5:\36\2\u014d\u0156\3\2\2\2\u014e\u014f\5<\37\2\u014f\u0150\7\37"+
		"\2\2\u0150\u0156\3\2\2\2\u0151\u0152\5<\37\2\u0152\u0153\7 \2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0156\5<\37\2\u0155\u0142\3\2\2\2\u0155\u0146\3\2"+
		"\2\2\u0155\u014a\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u0151\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156;\3\2\2\2\u0157\u0158\7/\2\2\u0158\u0159\58\35\2\u0159"+
		"\u015a\7\60\2\2\u015a\u0161\3\2\2\2\u015b\u0161\7\6\2\2\u015c\u0161\7"+
		"\5\2\2\u015d\u0161\7\7\2\2\u015e\u015f\7%\2\2\u015f\u0161\5> \2\u0160"+
		"\u0157\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161=\3\2\2\2\u0162\u0163\7\b\2\2\u0163?\3\2"+
		"\2\2\u0164\u0168\5B\"\2\u0165\u0168\7\65\2\2\u0166\u0168\7\66\2\2\u0167"+
		"\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168A\3\2\2\2"+
		"\u0169\u016a\58\35\2\u016a\u016b\5D#\2\u016b\u016c\58\35\2\u016c\u017f"+
		"\3\2\2\2\u016d\u016e\5\66\34\2\u016e\u016f\7*\2\2\u016f\u0170\5\66\34"+
		"\2\u0170\u017f\3\2\2\2\u0171\u0172\5\66\34\2\u0172\u0173\7)\2\2\u0173"+
		"\u0174\5\66\34\2\u0174\u017f\3\2\2\2\u0175\u0176\5F$\2\u0176\u0177\7*"+
		"\2\2\u0177\u0178\5@!\2\u0178\u017f\3\2\2\2\u0179\u017a\5F$\2\u017a\u017b"+
		"\7)\2\2\u017b\u017c\5@!\2\u017c\u017f\3\2\2\2\u017d\u017f\5F$\2\u017e"+
		"\u0169\3\2\2\2\u017e\u016d\3\2\2\2\u017e\u0171\3\2\2\2\u017e\u0175\3\2"+
		"\2\2\u017e\u0179\3\2\2\2\u017e\u017d\3\2\2\2\u017fC\3\2\2\2\u0180\u0181"+
		"\t\3\2\2\u0181E\3\2\2\2\u0182\u0183\5H%\2\u0183\u0184\7\"\2\2\u0184\u0185"+
		"\5F$\2\u0185\u0188\3\2\2\2\u0186\u0188\5H%\2\u0187\u0182\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188G\3\2\2\2\u0189\u018a\5J&\2\u018a\u018b\7!\2\2\u018b"+
		"\u018c\5H%\2\u018c\u018f\3\2\2\2\u018d\u018f\5J&\2\u018e\u0189\3\2\2\2"+
		"\u018e\u018d\3\2\2\2\u018fI\3\2\2\2\u0190\u0191\7/\2\2\u0191\u0192\5F"+
		"$\2\u0192\u0193\7\60\2\2\u0193\u0198\3\2\2\2\u0194\u0195\7#\2\2\u0195"+
		"\u0198\5F$\2\u0196\u0198\5L\'\2\u0197\u0190\3\2\2\2\u0197\u0194\3\2\2"+
		"\2\u0197\u0196\3\2\2\2\u0198K\3\2\2\2\u0199\u019a\7\b\2\2\u019aM\3\2\2"+
		"\2\u019b\u019c\5P)\2\u019c\u019d\5N(\2\u019d\u01a0\3\2\2\2\u019e\u01a0"+
		"\5P)\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2\2\2\u01a0O\3\2\2\2\u01a1\u01a2"+
		"\7\64\2\2\u01a2\u01a3\5\30\r\2\u01a3\u01a4\7\67\2\2\u01a4\u01a5\7$\2\2"+
		"\u01a5\u01a6\5R*\2\u01a6\u01a7\7\n\2\2\u01a7Q\3\2\2\2\u01a8\u01a9\5T+"+
		"\2\u01a9\u01aa\7\5\2\2\u01aa\u01b3\3\2\2\2\u01ab\u01ac\5T+\2\u01ac\u01ad"+
		"\7\7\2\2\u01ad\u01b3\3\2\2\2\u01ae\u01b3\7\6\2\2\u01af\u01b3\7\b\2\2\u01b0"+
		"\u01b3\7\5\2\2\u01b1\u01b3\7\7\2\2\u01b2\u01a8\3\2\2\2\u01b2\u01ab\3\2"+
		"\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3S\3\2\2\2\u01b4\u01b5\t\4\2\2\u01b5U\3\2\2\2\u01b6"+
		"\u01b7\7\25\2\2\u01b7\u01b8\7/\2\2\u01b8\u01b9\5X-\2\u01b9\u01ba\7\60"+
		"\2\2\u01ba\u01bb\7\n\2\2\u01bbW\3\2\2\2\u01bc\u01c0\5\64\33\2\u01bd\u01c0"+
		"\7\67\2\2\u01be\u01c0\5 \21\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2"+
		"\u01bf\u01be\3\2\2\2\u01c0Y\3\2\2\2\u01c1\u01c2\7\67\2\2\u01c2\u01c3\7"+
		"$\2\2\u01c3\u01c4\7\26\2\2\u01c4\u01c5\5\\/\2\u01c5\u01c6\7\n\2\2\u01c6"+
		"[\3\2\2\2\u01c7\u01c8\t\5\2\2\u01c8]\3\2\2\2\36_bkz\u0088\u0091\u0096"+
		"\u009f\u00a8\u00b3\u00c0\u00d1\u00e5\u00fc\u011a\u0127\u0135\u0140\u0155"+
		"\u0160\u0167\u017e\u0187\u018e\u0197\u019f\u01b2\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}