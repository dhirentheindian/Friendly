// Generated from FRIENDLY.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FRIENDLYLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"QUOTE1", "QUOTE2", "INTEGER_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
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


	public FRIENDLYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FRIENDLY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\6\4u\n\4\r\4\16"+
		"\4v\3\5\3\5\3\5\3\5\3\6\6\6~\n\6\r\6\16\6\177\3\6\3\6\6\6\u0084\n\6\r"+
		"\6\16\6\u0085\3\6\3\6\5\6\u008a\n\6\3\6\6\6\u008d\n\6\r\6\16\6\u008e\5"+
		"\6\u0091\n\6\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\6\62\u0152\n\62\r\62\16\62\u0153\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7"+
		"\66\u0169\n\66\f\66\16\66\u016c\13\66\3\67\6\67\u016f\n\67\r\67\16\67"+
		"\u0170\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8\3\2\b\3\2\62;\5\2\62;C\\c|\4\2GGgg\6\2\"\"\62;C\\c"+
		"|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7t\3\2\2"+
		"\2\tx\3\2\2\2\13}\3\2\2\2\r\u0092\3\2\2\2\17\u009b\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00a9\3\2\2\2\25\u00b0\3\2\2\2\27\u00b4\3\2\2\2\31\u00ba\3\2"+
		"\2\2\33\u00c1\3\2\2\2\35\u00c6\3\2\2\2\37\u00cb\3\2\2\2!\u00d2\3\2\2\2"+
		"#\u00d5\3\2\2\2%\u00db\3\2\2\2\'\u00df\3\2\2\2)\u00e5\3\2\2\2+\u00ea\3"+
		"\2\2\2-\u00ef\3\2\2\2/\u00f2\3\2\2\2\61\u00f7\3\2\2\2\63\u00f9\3\2\2\2"+
		"\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0104"+
		"\3\2\2\2?\u0107\3\2\2\2A\u010b\3\2\2\2C\u010d\3\2\2\2E\u0111\3\2\2\2G"+
		"\u0113\3\2\2\2I\u0119\3\2\2\2K\u011e\3\2\2\2M\u0125\3\2\2\2O\u012d\3\2"+
		"\2\2Q\u0133\3\2\2\2S\u0136\3\2\2\2U\u0138\3\2\2\2W\u013a\3\2\2\2Y\u013c"+
		"\3\2\2\2[\u013e\3\2\2\2]\u0140\3\2\2\2_\u0142\3\2\2\2a\u0144\3\2\2\2c"+
		"\u014c\3\2\2\2e\u0155\3\2\2\2g\u015b\3\2\2\2i\u0160\3\2\2\2k\u0166\3\2"+
		"\2\2m\u016e\3\2\2\2op\7)\2\2p\4\3\2\2\2qr\7$\2\2r\6\3\2\2\2su\t\2\2\2"+
		"ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\b\3\2\2\2xy\5\3\2\2yz\t\3\2"+
		"\2z{\5\3\2\2{\n\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\60\2\2\u0082\u0084"+
		"\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0090\3\2\2\2\u0087\u0089\t\4\2\2\u0088\u008a\7/"+
		"\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u008d\t\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0087\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\f\3\2\2\2\u0092\u0096\5\5\3\2\u0093\u0095\t\5\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5\5\3\2\u009a"+
		"\16\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2"+
		"\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00a6\7\61\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7=\2\2"+
		"\u00a8\22\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\24"+
		"\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\26\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7U\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7i\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7"+
		"j\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5\34\3\2\2\2\u00c6\u00c7"+
		"\7x\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\36\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7w\2\2\u00ce"+
		"\u00cf\7d\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1 \3\2\2\2\u00d2"+
		"\u00d3\7f\2\2\u00d3\u00d4\7q\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6"+
		"\u00d7\7j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2"+
		"\u00da$\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2"+
		"\2\u00de&\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7"+
		"k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4(\3\2\2\2\u00e5\u00e6"+
		"\7u\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"*\3\2\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		".\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8\62\3\2\2\2\u00f9"+
		"\u00fa\7/\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\66\3\2\2\2\u00fd"+
		"\u00fe\7\61\2\2\u00fe8\3\2\2\2\u00ff\u0100\7\'\2\2\u0100:\3\2\2\2\u0101"+
		"\u0102\7-\2\2\u0102\u0103\7-\2\2\u0103<\3\2\2\2\u0104\u0105\7/\2\2\u0105"+
		"\u0106\7/\2\2\u0106>\3\2\2\2\u0107\u0108\7C\2\2\u0108\u0109\7P\2\2\u0109"+
		"\u010a\7F\2\2\u010a@\3\2\2\2\u010b\u010c\7~\2\2\u010cB\3\2\2\2\u010d\u010e"+
		"\7P\2\2\u010e\u010f\7Q\2\2\u010f\u0110\7V\2\2\u0110D\3\2\2\2\u0111\u0112"+
		"\7<\2\2\u0112F\3\2\2\2\u0113\u0114\7i\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7c\2\2\u0117\u0118\7v\2\2\u0118H\3\2\2\2\u0119\u011a"+
		"\7n\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2\u011c\u011d\7u\2\2\u011d"+
		"J\3\2\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120\u0121\7u\2\2\u0121"+
		"\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123\u0124\7s\2\2\u0124L\3\2\2\2\u0125"+
		"\u0126\7i\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2"+
		"\u0129\u012a\7v\2\2\u012a\u012b\7g\2\2\u012b\u012c\7s\2\2\u012cN\3\2\2"+
		"\2\u012d\u012e\7p\2\2\u012e\u012f\7q\2\2\u012f\u0130\7v\2\2\u0130\u0131"+
		"\7g\2\2\u0131\u0132\7s\2\2\u0132P\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135"+
		"\7s\2\2\u0135R\3\2\2\2\u0136\u0137\7}\2\2\u0137T\3\2\2\2\u0138\u0139\7"+
		"\177\2\2\u0139V\3\2\2\2\u013a\u013b\7]\2\2\u013bX\3\2\2\2\u013c\u013d"+
		"\7_\2\2\u013dZ\3\2\2\2\u013e\u013f\7*\2\2\u013f\\\3\2\2\2\u0140\u0141"+
		"\7+\2\2\u0141^\3\2\2\2\u0142\u0143\7.\2\2\u0143`\3\2\2\2\u0144\u0145\7"+
		"c\2\2\u0145\u0146\7t\2\2\u0146\u0147\7t\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7{\2\2\u0149\u014a\3\2\2\2\u014a\u014b\t\6\2\2\u014bb\3\2\2\2\u014c\u014d"+
		"\7h\2\2\u014d\u014e\7w\2\2\u014e\u014f\7p\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\t\6\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154d\3\2\2\2\u0155\u0156\7e\2\2\u0156\u0157"+
		"\7q\2\2\u0157\u0158\7p\2\2\u0158\u0159\7u\2\2\u0159\u015a\7v\2\2\u015a"+
		"f\3\2\2\2\u015b\u015c\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7w\2\2\u015e"+
		"\u015f\7g\2\2\u015fh\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7c\2\2\u0162"+
		"\u0163\7n\2\2\u0163\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165j\3\2\2\2\u0166"+
		"\u016a\t\6\2\2\u0167\u0169\t\3\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016bl\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016f\t\7\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\67"+
		"\2\2\u0173n\3\2\2\2\17\2v\177\u0085\u0089\u008e\u0090\u0096\u00a1\u0153"+
		"\u0168\u016a\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}