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
		T__0=1, T__1=2, ABSTRACT=3, ASSERT=4, BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, 
		CATCH=9, CHAR=10, CLASS=11, CONST=12, CONTINUE=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, 
		FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, 
		INTERFACE=30, LONG=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, SUPER=42, SWITCH=43, 
		SYNCHRONIZED=44, THIS=45, THROW=46, THROWS=47, TRANSIENT=48, TRY=49, VOID=50, 
		VOLATILE=51, WHILE=52, IntegerLiteral=53, FloatingPointLiteral=54, BooleanLiteral=55, 
		CharacterLiteral=56, StringLiteral=57, NullLiteral=58, LPAREN=59, RPAREN=60, 
		LBRACE=61, RBRACE=62, LBRACK=63, RBRACK=64, SEMI=65, COMMA=66, DOT=67, 
		ASSIGN=68, GT=69, LT=70, BANG=71, TILDE=72, QUESTION=73, COLON=74, EQUAL=75, 
		LE=76, GE=77, NOTEQUAL=78, AND=79, OR=80, INC=81, DEC=82, ADD=83, SUB=84, 
		MUL=85, DIV=86, BITAND=87, BITOR=88, CARET=89, MOD=90, ADD_ASSIGN=91, 
		SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, OR_ASSIGN=96, 
		XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, URSHIFT_ASSIGN=101, 
		Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, LINE_COMMENT=107;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37, 
		RULE_typeType = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40, 
		RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43, 
		RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46, 
		RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49, 
		RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_commonErrorStatement = 70, RULE_statement = 71, 
		RULE_catchClause = 72, RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_forUpdate = 83, RULE_parExpression = 84, RULE_expressionList = 85, 
		RULE_statementExpression = 86, RULE_constantExpression = 87, RULE_expression = 88, 
		RULE_primary = 89, RULE_creator = 90, RULE_createdName = 91, RULE_innerCreator = 92, 
		RULE_arrayCreatorRest = 93, RULE_classCreatorRest = 94, RULE_explicitGenericInvocation = 95, 
		RULE_nonWildcardTypeArguments = 96, RULE_typeArgumentsOrDiamond = 97, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 98, RULE_superSuffix = 99, RULE_explicitGenericInvocationSuffix = 100, 
		RULE_arguments = 101;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "typeType", "classOrInterfaceType", "primitiveType", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterList", "formalParameter", "lastFormalParameter", "methodBody", 
		"constructorBody", "qualifiedName", "literal", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "commonErrorStatement", "statement", "catchClause", 
		"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
		"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", "enhancedForControl", 
		"forUpdate", "parExpression", "expressionList", "statementExpression", 
		"constantExpression", "expression", "primary", "creator", "createdName", 
		"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
		"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
		"superSuffix", "explicitGenericInvocationSuffix", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "'scan'", "'abstract'", "'assert'", "'boolean'", "'break'", 
		"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
		"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
		"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
		"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
		"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
		"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'eq'", "'<='", "'>='", "'neq'", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FRIENDLYParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(204);
				packageDeclaration();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(207);
				importDeclaration();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(213);
				typeDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(221);
				annotation();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(PACKAGE);
			setState(228);
			qualifiedName();
			setState(229);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IMPORT);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(232);
				match(STATIC);
				}
			}

			setState(235);
			qualifiedName();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(236);
				match(DOT);
				setState(237);
				match(MUL);
				}
			}

			setState(240);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(242);
					classOrInterfaceModifier();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(249);
					classOrInterfaceModifier();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(256);
					classOrInterfaceModifier();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(269);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CLASS);
			setState(286);
			match(Identifier);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(287);
				typeParameters();
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(290);
				match(EXTENDS);
				setState(291);
				typeType();
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(294);
				match(IMPLEMENTS);
				setState(295);
				typeList();
				}
			}

			setState(298);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LT);
			setState(301);
			typeParameter();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				typeParameter();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Identifier);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(312);
				match(EXTENDS);
				setState(313);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			typeType();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(317);
				match(BITAND);
				setState(318);
				typeType();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(FRIENDLYParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ENUM);
			setState(325);
			match(Identifier);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(326);
				match(IMPLEMENTS);
				setState(327);
				typeList();
				}
			}

			setState(330);
			match(LBRACE);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(331);
				enumConstants();
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(334);
				match(COMMA);
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(337);
				enumBodyDeclarations();
				}
			}

			setState(340);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			enumConstant();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					match(COMMA);
					setState(344);
					enumConstant();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(350);
				annotation();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(Identifier);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(357);
				arguments();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(360);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SEMI);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(364);
				classBodyDeclaration();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(INTERFACE);
			setState(371);
			match(Identifier);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(372);
				typeParameters();
				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(375);
				match(EXTENDS);
				setState(376);
				typeList();
				}
			}

			setState(379);
			interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			typeType();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				typeType();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LBRACE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(390);
				classBodyDeclaration();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(LBRACE);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(399);
				interfaceBodyDeclaration();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(408);
					match(STATIC);
					}
				}

				setState(411);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						modifier();
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(418);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(432);
				typeType();
				}
				break;
			case VOID:
				{
				setState(433);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			match(Identifier);
			setState(437);
			formalParameters();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(438);
				match(LBRACK);
				setState(439);
				match(RBRACK);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(445);
				match(THROWS);
				setState(446);
				qualifiedNameList();
				}
			}

			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(449);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(450);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			typeParameters();
			setState(454);
			methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Identifier);
			setState(457);
			formalParameters();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(458);
				match(THROWS);
				setState(459);
				qualifiedNameList();
				}
			}

			setState(462);
			constructorBody();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			typeParameters();
			setState(465);
			constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeType();
			setState(468);
			variableDeclarators();
			setState(469);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						modifier();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(477);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeType();
			setState(491);
			constantDeclarator();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492);
				match(COMMA);
				setState(493);
				constantDeclarator();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(Identifier);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(502);
				match(LBRACK);
				setState(503);
				match(RBRACK);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(ASSIGN);
			setState(510);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(512);
				typeType();
				}
				break;
			case VOID:
				{
				setState(513);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516);
			match(Identifier);
			setState(517);
			formalParameters();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(518);
				match(LBRACK);
				setState(519);
				match(RBRACK);
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(525);
				match(THROWS);
				setState(526);
				qualifiedNameList();
				}
			}

			setState(529);
			match(SEMI);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			typeParameters();
			setState(532);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			variableDeclarator();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(535);
				match(COMMA);
				setState(536);
				variableDeclarator();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			variableDeclaratorId();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(543);
				match(ASSIGN);
				setState(544);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(Identifier);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(548);
				match(LBRACK);
				setState(549);
				match(RBRACK);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(LBRACE);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(560);
				variableInitializer();
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						match(COMMA);
						setState(562);
						variableInitializer();
						}
						} 
					}
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(568);
					match(COMMA);
					}
				}

				}
			}

			setState(573);
			match(RBRACE);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Identifier);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeType);
		try {
			int _alt;
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				classOrInterfaceType();
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						match(LBRACK);
						setState(579);
						match(RBRACK);
						}
						} 
					}
					setState(584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				primitiveType();
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						match(LBRACK);
						setState(587);
						match(RBRACK);
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(FRIENDLYParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FRIENDLYParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Identifier);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(596);
				typeArguments();
				}
				break;
			}
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					match(DOT);
					setState(600);
					match(Identifier);
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(601);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LT);
			setState(612);
			typeArgument();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(613);
				match(COMMA);
				setState(614);
				typeArgument();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(QUESTION);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(624);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(625);
					typeType();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			qualifiedName();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(631);
				match(COMMA);
				setState(632);
				qualifiedName();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LPAREN);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(639);
				formalParameterList();
				}
			}

			setState(642);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				formalParameter();
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						match(COMMA);
						setState(646);
						formalParameter();
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(652);
					match(COMMA);
					setState(653);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(659);
				variableModifier();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			typeType();
			setState(666);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(668);
				variableModifier();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			typeType();
			setState(675);
			match(ELLIPSIS);
			setState(676);
			variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			block();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			block();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(FRIENDLYParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FRIENDLYParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(Identifier);
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(683);
					match(DOT);
					setState(684);
					match(Identifier);
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(FRIENDLYParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(FRIENDLYParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(FRIENDLYParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(FRIENDLYParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(FRIENDLYParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(AT);
			setState(693);
			annotationName();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(694);
				match(LPAREN);
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(695);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(696);
					elementValue();
					}
					break;
				}
				setState(699);
				match(RPAREN);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			qualifiedName();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			elementValuePair();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(705);
				match(COMMA);
				setState(706);
				elementValuePair();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(Identifier);
			setState(713);
			match(ASSIGN);
			setState(714);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValue);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(LBRACE);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(722);
				elementValue();
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(723);
						match(COMMA);
						setState(724);
						elementValue();
						}
						} 
					}
					setState(729);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(732);
				match(COMMA);
				}
			}

			setState(735);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(AT);
			setState(738);
			match(INTERFACE);
			setState(739);
			match(Identifier);
			setState(740);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(LBRACE);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(743);
				annotationTypeElementDeclaration();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(751);
						modifier();
						}
						} 
					}
					setState(756);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(757);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementRest);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				typeType();
				setState(762);
				annotationMethodOrConstantRest();
				setState(763);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				classDeclaration();
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(766);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				interfaceDeclaration();
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(770);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				enumDeclaration();
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(774);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
				annotationTypeDeclaration();
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(778);
					match(SEMI);
					}
					break;
				}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationMethodOrConstantRest);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(Identifier);
			setState(788);
			match(LPAREN);
			setState(789);
			match(RPAREN);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(790);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(DEFAULT);
			setState(796);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(LBRACE);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				{
				setState(799);
				blockStatement();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CommonErrorStatementContext commonErrorStatement() {
			return getRuleContext(CommonErrorStatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				commonErrorStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				typeDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			localVariableDeclaration();
			setState(814);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(816);
				variableModifier();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			typeType();
			setState(823);
			variableDeclarators();
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

	public static class CommonErrorStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public CommonErrorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonErrorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCommonErrorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCommonErrorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCommonErrorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonErrorStatementContext commonErrorStatement() throws RecognitionException {
		CommonErrorStatementContext _localctx = new CommonErrorStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_commonErrorStatement);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				match(LPAREN);
				setState(826);
				expression(0);
				setState(827);
				match(RPAREN);
				setState(828);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by having too many ')'. ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(LPAREN);
				setState(832);
				expression(0);
				notifyErrorListeners("Uneven parentheses; may be caused by missing a closing ')'. ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				match(LPAREN);
				setState(836);
				match(LPAREN);
				setState(837);
				expression(0);
				setState(838);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by having too many '('. ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				expression(0);
				setState(842);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by missing an opening '('. ");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(845);
				match(DO);
				setState(846);
				statement();
				setState(847);
				match(WHILE);
				setState(848);
				parExpression();
				notifyErrorListeners("Missing ';' at the end of the line.");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(851);
				match(RETURN);
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(852);
					expression(0);
					}
					break;
				}
				notifyErrorListeners("Missing ';' at the end of the line.");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(856);
				match(BREAK);
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(857);
					match(Identifier);
					}
					break;
				}
				notifyErrorListeners("Missing ';' at the end of the line.");
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(FRIENDLYParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(FRIENDLYParser.StringLiteral, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
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
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				match(ASSERT);
				setState(865);
				expression(0);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(866);
					match(COLON);
					setState(867);
					expression(0);
					}
				}

				setState(870);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(IF);
				setState(873);
				parExpression();
				setState(874);
				statement();
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(875);
					match(ELSE);
					setState(876);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				match(FOR);
				setState(880);
				match(LPAREN);
				setState(881);
				forControl();
				setState(882);
				match(RPAREN);
				setState(883);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(885);
				match(WHILE);
				setState(886);
				parExpression();
				setState(887);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				match(DO);
				setState(890);
				statement();
				setState(891);
				match(WHILE);
				setState(892);
				parExpression();
				setState(893);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(895);
				match(TRY);
				setState(896);
				block();
				setState(906);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(898); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(897);
						catchClause();
						}
						}
						setState(900); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(902);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(905);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(908);
				match(TRY);
				setState(909);
				resourceSpecification();
				setState(910);
				block();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(911);
					catchClause();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(917);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(920);
				match(SWITCH);
				setState(921);
				parExpression();
				setState(922);
				match(LBRACE);
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(923);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(928);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(929);
					switchLabel();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(937);
				match(SYNCHRONIZED);
				setState(938);
				parExpression();
				setState(939);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(941);
				match(RETURN);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(942);
					expression(0);
					}
				}

				setState(945);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(946);
				match(THROW);
				setState(947);
				expression(0);
				setState(948);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(950);
				match(BREAK);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(951);
					match(Identifier);
					}
				}

				setState(954);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(955);
				match(CONTINUE);
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(956);
					match(Identifier);
					}
				}

				setState(959);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(960);
				match(T__0);
				setState(961);
				match(LPAREN);
				setState(962);
				match(Identifier);
				setState(963);
				match(RPAREN);
				setState(964);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(965);
				match(T__0);
				setState(966);
				match(LPAREN);
				setState(967);
				match(StringLiteral);
				setState(968);
				match(RPAREN);
				setState(969);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(970);
				match(T__1);
				setState(971);
				match(LPAREN);
				setState(972);
				match(Identifier);
				setState(973);
				match(RPAREN);
				setState(974);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(975);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(976);
				statementExpression();
				setState(977);
				match(SEMI);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(979);
				match(Identifier);
				setState(980);
				match(COLON);
				setState(981);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(CATCH);
			setState(985);
			match(LPAREN);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(986);
				variableModifier();
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992);
			catchType();
			setState(993);
			match(Identifier);
			setState(994);
			match(RPAREN);
			setState(995);
			block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			qualifiedName();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(998);
				match(BITOR);
				setState(999);
				qualifiedName();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(FINALLY);
			setState(1006);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(LPAREN);
			setState(1009);
			resources();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1010);
				match(SEMI);
				}
			}

			setState(1013);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			resource();
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1016);
					match(SEMI);
					setState(1017);
					resource();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1023);
				variableModifier();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029);
			classOrInterfaceType();
			setState(1030);
			variableDeclaratorId();
			setState(1031);
			match(ASSIGN);
			setState(1032);
			expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1034);
				switchLabel();
				}
				}
				setState(1037); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
				blockStatement();
				}
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				match(CASE);
				setState(1045);
				constantExpression();
				setState(1046);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(CASE);
				setState(1049);
				enumConstantName();
				setState(1050);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052);
				match(DEFAULT);
				setState(1053);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1057);
					forInit();
					}
				}

				setState(1060);
				match(SEMI);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(1061);
					expression(0);
					}
				}

				setState(1064);
				match(SEMI);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(1065);
					forUpdate();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1074);
				variableModifier();
				}
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1080);
			typeType();
			setState(1081);
			variableDeclaratorId();
			setState(1082);
			match(COLON);
			setState(1083);
			expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(LPAREN);
			setState(1088);
			expression(0);
			setState(1089);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			expression(0);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1092);
				match(COMMA);
				setState(1093);
				expression(0);
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			expression(0);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			expression(0);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1104);
				primary();
				}
				break;
			case 2:
				{
				setState(1105);
				match(NEW);
				setState(1106);
				creator();
				}
				break;
			case 3:
				{
				setState(1107);
				match(LPAREN);
				setState(1108);
				typeType();
				setState(1109);
				match(RPAREN);
				setState(1110);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1112);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81)) | (1L << (DEC - 81)) | (1L << (ADD - 81)) | (1L << (SUB - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1113);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1114);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1115);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1119);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (MUL - 85)) | (1L << (DIV - 85)) | (1L << (MOD - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1120);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1122);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1123);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1132);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
						case 1:
							{
							setState(1125);
							match(LT);
							setState(1126);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1127);
							match(GT);
							setState(1128);
							match(GT);
							setState(1129);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1130);
							match(GT);
							setState(1131);
							match(GT);
							}
							break;
						}
						setState(1134);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1136);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (LE - 69)) | (1L << (GE - 69)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1137);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1139);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1140);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1142);
						match(BITAND);
						setState(1143);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1145);
						match(CARET);
						setState(1146);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1148);
						match(BITOR);
						setState(1149);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1151);
						match(AND);
						setState(1152);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1154);
						match(OR);
						setState(1155);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1157);
						match(QUESTION);
						setState(1158);
						expression(0);
						setState(1159);
						match(COLON);
						setState(1160);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1163);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68)) | (1L << (ADD_ASSIGN - 68)) | (1L << (SUB_ASSIGN - 68)) | (1L << (MUL_ASSIGN - 68)) | (1L << (DIV_ASSIGN - 68)) | (1L << (AND_ASSIGN - 68)) | (1L << (OR_ASSIGN - 68)) | (1L << (XOR_ASSIGN - 68)) | (1L << (MOD_ASSIGN - 68)) | (1L << (LSHIFT_ASSIGN - 68)) | (1L << (RSHIFT_ASSIGN - 68)) | (1L << (URSHIFT_ASSIGN - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1164);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1165);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1166);
						match(DOT);
						setState(1167);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1169);
						match(DOT);
						setState(1170);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1172);
						match(DOT);
						setState(1173);
						match(NEW);
						setState(1175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1174);
							nonWildcardTypeArguments();
							}
						}

						setState(1177);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1179);
						match(DOT);
						setState(1180);
						match(SUPER);
						setState(1181);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1182);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1183);
						match(DOT);
						setState(1184);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1186);
						match(LBRACK);
						setState(1187);
						expression(0);
						setState(1188);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1191);
						match(LPAREN);
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
							{
							setState(1192);
							expressionList();
							}
						}

						setState(1195);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1197);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1199);
						match(INSTANCEOF);
						setState(1200);
						typeType();
						}
						break;
					}
					} 
				}
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_primary);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(LPAREN);
				setState(1207);
				expression(0);
				setState(1208);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1212);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1214);
				typeType();
				setState(1215);
				match(DOT);
				setState(1216);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1218);
				match(VOID);
				setState(1219);
				match(DOT);
				setState(1220);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1221);
				nonWildcardTypeArguments();
				setState(1225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1222);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1223);
					match(THIS);
					setState(1224);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_creator);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				nonWildcardTypeArguments();
				setState(1230);
				createdName();
				setState(1231);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				createdName();
				setState(1236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1234);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1235);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(FRIENDLYParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FRIENDLYParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_createdName);
		int _la;
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				match(Identifier);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1241);
					typeArgumentsOrDiamond();
					}
				}

				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1244);
					match(DOT);
					setState(1245);
					match(Identifier);
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1246);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(Identifier);
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1258);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1261);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(LBRACK);
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1264);
				match(RBRACK);
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1265);
					match(LBRACK);
					setState(1266);
					match(RBRACK);
					}
					}
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1272);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1273);
				expression(0);
				setState(1274);
				match(RBRACK);
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1275);
						match(LBRACK);
						setState(1276);
						expression(0);
						setState(1277);
						match(RBRACK);
						}
						} 
					}
					setState(1283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1284);
						match(LBRACK);
						setState(1285);
						match(RBRACK);
						}
						} 
					}
					setState(1290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			arguments();
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1294);
				classBody();
				}
				break;
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			nonWildcardTypeArguments();
			setState(1298);
			explicitGenericInvocationSuffix();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(LT);
			setState(1301);
			typeList();
			setState(1302);
			match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeArgumentsOrDiamond);
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(LT);
				setState(1305);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				match(LT);
				setState(1310);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				nonWildcardTypeArguments();
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_superSuffix);
		try {
			setState(1320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				match(DOT);
				setState(1316);
				match(Identifier);
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1317);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				match(SUPER);
				setState(1323);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				match(Identifier);
				setState(1325);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(LPAREN);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(1329);
				expressionList();
				}
			}

			setState(1332);
			match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 88:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 22);
		case 16:
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0539\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\5\2\u00d0\n\2\3\2\7"+
		"\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2"+
		"\3\2\3\2\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\u00ec\n\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\3\5\7\5\u00f6\n\5\f\5"+
		"\16\5\u00f9\13\5\3\5\3\5\7\5\u00fd\n\5\f\5\16\5\u0100\13\5\3\5\3\5\7\5"+
		"\u0104\n\5\f\5\16\5\u0107\13\5\3\5\3\5\7\5\u010b\n\5\f\5\16\5\u010e\13"+
		"\5\3\5\3\5\5\5\u0112\n\5\3\6\3\6\5\6\u0116\n\6\3\7\3\7\5\7\u011a\n\7\3"+
		"\b\3\b\5\b\u011e\n\b\3\t\3\t\3\t\5\t\u0123\n\t\3\t\3\t\5\t\u0127\n\t\3"+
		"\t\3\t\5\t\u012b\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0133\n\n\f\n\16\n\u0136"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u013d\n\13\3\f\3\f\3\f\7\f\u0142\n\f"+
		"\f\f\16\f\u0145\13\f\3\r\3\r\3\r\3\r\5\r\u014b\n\r\3\r\3\r\5\r\u014f\n"+
		"\r\3\r\5\r\u0152\n\r\3\r\5\r\u0155\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u015c"+
		"\n\16\f\16\16\16\u015f\13\16\3\17\7\17\u0162\n\17\f\17\16\17\u0165\13"+
		"\17\3\17\3\17\5\17\u0169\n\17\3\17\5\17\u016c\n\17\3\20\3\20\7\20\u0170"+
		"\n\20\f\20\16\20\u0173\13\20\3\21\3\21\3\21\5\21\u0178\n\21\3\21\3\21"+
		"\5\21\u017c\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0183\n\22\f\22\16\22\u0186"+
		"\13\22\3\23\3\23\7\23\u018a\n\23\f\23\16\23\u018d\13\23\3\23\3\23\3\24"+
		"\3\24\7\24\u0193\n\24\f\24\16\24\u0196\13\24\3\24\3\24\3\25\3\25\5\25"+
		"\u019c\n\25\3\25\3\25\7\25\u01a0\n\25\f\25\16\25\u01a3\13\25\3\25\5\25"+
		"\u01a6\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b1\n"+
		"\26\3\27\3\27\5\27\u01b5\n\27\3\27\3\27\3\27\3\27\7\27\u01bb\n\27\f\27"+
		"\16\27\u01be\13\27\3\27\3\27\5\27\u01c2\n\27\3\27\3\27\5\27\u01c6\n\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01cf\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u01db\n\34\f\34\16\34\u01de\13\34"+
		"\3\34\3\34\5\34\u01e2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01eb"+
		"\n\35\3\36\3\36\3\36\3\36\7\36\u01f1\n\36\f\36\16\36\u01f4\13\36\3\36"+
		"\3\36\3\37\3\37\3\37\7\37\u01fb\n\37\f\37\16\37\u01fe\13\37\3\37\3\37"+
		"\3\37\3 \3 \5 \u0205\n \3 \3 \3 \3 \7 \u020b\n \f \16 \u020e\13 \3 \3"+
		" \5 \u0212\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u021c\n\"\f\"\16\"\u021f"+
		"\13\"\3#\3#\3#\5#\u0224\n#\3$\3$\3$\7$\u0229\n$\f$\16$\u022c\13$\3%\3"+
		"%\5%\u0230\n%\3&\3&\3&\3&\7&\u0236\n&\f&\16&\u0239\13&\3&\5&\u023c\n&"+
		"\5&\u023e\n&\3&\3&\3\'\3\'\3(\3(\3(\7(\u0247\n(\f(\16(\u024a\13(\3(\3"+
		"(\3(\7(\u024f\n(\f(\16(\u0252\13(\5(\u0254\n(\3)\3)\5)\u0258\n)\3)\3)"+
		"\3)\5)\u025d\n)\7)\u025f\n)\f)\16)\u0262\13)\3*\3*\3+\3+\3+\3+\7+\u026a"+
		"\n+\f+\16+\u026d\13+\3+\3+\3,\3,\3,\3,\5,\u0275\n,\5,\u0277\n,\3-\3-\3"+
		"-\7-\u027c\n-\f-\16-\u027f\13-\3.\3.\5.\u0283\n.\3.\3.\3/\3/\3/\7/\u028a"+
		"\n/\f/\16/\u028d\13/\3/\3/\5/\u0291\n/\3/\5/\u0294\n/\3\60\7\60\u0297"+
		"\n\60\f\60\16\60\u029a\13\60\3\60\3\60\3\60\3\61\7\61\u02a0\n\61\f\61"+
		"\16\61\u02a3\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\7\64\u02b0\n\64\f\64\16\64\u02b3\13\64\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u02bc\n\66\3\66\5\66\u02bf\n\66\3\67\3\67\38\38\38\78\u02c6"+
		"\n8\f8\168\u02c9\138\39\39\39\39\3:\3:\3:\5:\u02d2\n:\3;\3;\3;\3;\7;\u02d8"+
		"\n;\f;\16;\u02db\13;\5;\u02dd\n;\3;\5;\u02e0\n;\3;\3;\3<\3<\3<\3<\3<\3"+
		"=\3=\7=\u02eb\n=\f=\16=\u02ee\13=\3=\3=\3>\7>\u02f3\n>\f>\16>\u02f6\13"+
		">\3>\3>\5>\u02fa\n>\3?\3?\3?\3?\3?\3?\5?\u0302\n?\3?\3?\5?\u0306\n?\3"+
		"?\3?\5?\u030a\n?\3?\3?\5?\u030e\n?\5?\u0310\n?\3@\3@\5@\u0314\n@\3A\3"+
		"A\3A\3A\5A\u031a\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0323\nD\fD\16D\u0326\13D"+
		"\3D\3D\3E\3E\3E\3E\5E\u032e\nE\3F\3F\3F\3G\7G\u0334\nG\fG\16G\u0337\13"+
		"G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0358\nH\3H\3H\3H\5H\u035d\nH\3H\5H\u0360"+
		"\nH\3I\3I\3I\3I\3I\5I\u0367\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0370\nI\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u0385\nI\rI\16"+
		"I\u0386\3I\5I\u038a\nI\3I\5I\u038d\nI\3I\3I\3I\3I\7I\u0393\nI\fI\16I\u0396"+
		"\13I\3I\5I\u0399\nI\3I\3I\3I\3I\7I\u039f\nI\fI\16I\u03a2\13I\3I\7I\u03a5"+
		"\nI\fI\16I\u03a8\13I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03b2\nI\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u03bb\nI\3I\3I\3I\5I\u03c0\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03d9\nI\3J\3J\3J\7J\u03de"+
		"\nJ\fJ\16J\u03e1\13J\3J\3J\3J\3J\3J\3K\3K\3K\7K\u03eb\nK\fK\16K\u03ee"+
		"\13K\3L\3L\3L\3M\3M\3M\5M\u03f6\nM\3M\3M\3N\3N\3N\7N\u03fd\nN\fN\16N\u0400"+
		"\13N\3O\7O\u0403\nO\fO\16O\u0406\13O\3O\3O\3O\3O\3O\3P\6P\u040e\nP\rP"+
		"\16P\u040f\3P\6P\u0413\nP\rP\16P\u0414\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u0421\nQ\3R\3R\5R\u0425\nR\3R\3R\5R\u0429\nR\3R\3R\5R\u042d\nR\5R\u042f"+
		"\nR\3S\3S\5S\u0433\nS\3T\7T\u0436\nT\fT\16T\u0439\13T\3T\3T\3T\3T\3T\3"+
		"U\3U\3V\3V\3V\3V\3W\3W\3W\7W\u0449\nW\fW\16W\u044c\13W\3X\3X\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u045f\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u046f\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u049a\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\5Z\u04ac\nZ\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u04b4\nZ\fZ\16Z\u04b7\13Z\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u04cc\n[\5"+
		"[\u04ce\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04d7\n\\\5\\\u04d9\n\\\3]"+
		"\3]\5]\u04dd\n]\3]\3]\3]\5]\u04e2\n]\7]\u04e4\n]\f]\16]\u04e7\13]\3]\5"+
		"]\u04ea\n]\3^\3^\5^\u04ee\n^\3^\3^\3_\3_\3_\3_\7_\u04f6\n_\f_\16_\u04f9"+
		"\13_\3_\3_\3_\3_\3_\3_\3_\7_\u0502\n_\f_\16_\u0505\13_\3_\3_\7_\u0509"+
		"\n_\f_\16_\u050c\13_\5_\u050e\n_\3`\3`\5`\u0512\n`\3a\3a\3a\3b\3b\3b\3"+
		"b\3c\3c\3c\5c\u051e\nc\3d\3d\3d\5d\u0523\nd\3e\3e\3e\3e\5e\u0529\ne\5"+
		"e\u052b\ne\3f\3f\3f\3f\5f\u0531\nf\3g\3g\5g\u0535\ng\3g\3g\3g\2\3\u00b2"+
		"h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\17\6\2\"\"..\62\62"+
		"\65\65\6\2\5\5\26\26%\'*+\n\2\7\7\t\t\f\f\22\22\30\30\37\37!!))\4\2\25"+
		"\25,,\3\2\67<\3\2SV\3\2IJ\4\2WX\\\\\3\2UV\4\2GHNO\4\2MMPP\4\2FF]g\3\2"+
		"ST\2\u05b6\2\u00cf\3\2\2\2\4\u00e2\3\2\2\2\6\u00e9\3\2\2\2\b\u0111\3\2"+
		"\2\2\n\u0115\3\2\2\2\f\u0119\3\2\2\2\16\u011d\3\2\2\2\20\u011f\3\2\2\2"+
		"\22\u012e\3\2\2\2\24\u0139\3\2\2\2\26\u013e\3\2\2\2\30\u0146\3\2\2\2\32"+
		"\u0158\3\2\2\2\34\u0163\3\2\2\2\36\u016d\3\2\2\2 \u0174\3\2\2\2\"\u017f"+
		"\3\2\2\2$\u0187\3\2\2\2&\u0190\3\2\2\2(\u01a5\3\2\2\2*\u01b0\3\2\2\2,"+
		"\u01b4\3\2\2\2.\u01c7\3\2\2\2\60\u01ca\3\2\2\2\62\u01d2\3\2\2\2\64\u01d5"+
		"\3\2\2\2\66\u01e1\3\2\2\28\u01ea\3\2\2\2:\u01ec\3\2\2\2<\u01f7\3\2\2\2"+
		">\u0204\3\2\2\2@\u0215\3\2\2\2B\u0218\3\2\2\2D\u0220\3\2\2\2F\u0225\3"+
		"\2\2\2H\u022f\3\2\2\2J\u0231\3\2\2\2L\u0241\3\2\2\2N\u0253\3\2\2\2P\u0255"+
		"\3\2\2\2R\u0263\3\2\2\2T\u0265\3\2\2\2V\u0276\3\2\2\2X\u0278\3\2\2\2Z"+
		"\u0280\3\2\2\2\\\u0293\3\2\2\2^\u0298\3\2\2\2`\u02a1\3\2\2\2b\u02a8\3"+
		"\2\2\2d\u02aa\3\2\2\2f\u02ac\3\2\2\2h\u02b4\3\2\2\2j\u02b6\3\2\2\2l\u02c0"+
		"\3\2\2\2n\u02c2\3\2\2\2p\u02ca\3\2\2\2r\u02d1\3\2\2\2t\u02d3\3\2\2\2v"+
		"\u02e3\3\2\2\2x\u02e8\3\2\2\2z\u02f9\3\2\2\2|\u030f\3\2\2\2~\u0313\3\2"+
		"\2\2\u0080\u0315\3\2\2\2\u0082\u031b\3\2\2\2\u0084\u031d\3\2\2\2\u0086"+
		"\u0320\3\2\2\2\u0088\u032d\3\2\2\2\u008a\u032f\3\2\2\2\u008c\u0335\3\2"+
		"\2\2\u008e\u035f\3\2\2\2\u0090\u03d8\3\2\2\2\u0092\u03da\3\2\2\2\u0094"+
		"\u03e7\3\2\2\2\u0096\u03ef\3\2\2\2\u0098\u03f2\3\2\2\2\u009a\u03f9\3\2"+
		"\2\2\u009c\u0404\3\2\2\2\u009e\u040d\3\2\2\2\u00a0\u0420\3\2\2\2\u00a2"+
		"\u042e\3\2\2\2\u00a4\u0432\3\2\2\2\u00a6\u0437\3\2\2\2\u00a8\u043f\3\2"+
		"\2\2\u00aa\u0441\3\2\2\2\u00ac\u0445\3\2\2\2\u00ae\u044d\3\2\2\2\u00b0"+
		"\u044f\3\2\2\2\u00b2\u045e\3\2\2\2\u00b4\u04cd\3\2\2\2\u00b6\u04d8\3\2"+
		"\2\2\u00b8\u04e9\3\2\2\2\u00ba\u04eb\3\2\2\2\u00bc\u04f1\3\2\2\2\u00be"+
		"\u050f\3\2\2\2\u00c0\u0513\3\2\2\2\u00c2\u0516\3\2\2\2\u00c4\u051d\3\2"+
		"\2\2\u00c6\u0522\3\2\2\2\u00c8\u052a\3\2\2\2\u00ca\u0530\3\2\2\2\u00cc"+
		"\u0532\3\2\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\5\b\5\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\2\2\3\u00de\3\3\2\2\2\u00df\u00e1"+
		"\5j\66\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7$"+
		"\2\2\u00e6\u00e7\5f\64\2\u00e7\u00e8\7C\2\2\u00e8\5\3\2\2\2\u00e9\u00eb"+
		"\7\35\2\2\u00ea\u00ec\7*\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00f0\5f\64\2\u00ee\u00ef\7E\2\2\u00ef\u00f1\7W\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\7C\2\2\u00f3\7\3\2\2\2\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0112\5\20\t\2\u00fb\u00fd\5\f\7\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0112\5\30\r\2\u0102"+
		"\u0104\5\f\7\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0112\5 \21\2\u0109\u010b\5\f\7\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0112\5v<\2\u0110\u0112\7C\2\2\u0111\u00f7\3\2\2"+
		"\2\u0111\u00fe\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\t\3\2\2\2\u0113\u0116\5\f\7\2\u0114\u0116\t\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\13\3\2\2\2\u0117\u011a\5j\66"+
		"\2\u0118\u011a\t\3\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\r"+
		"\3\2\2\2\u011b\u011e\7\26\2\2\u011c\u011e\5j\66\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\17\3\2\2\2\u011f\u0120\7\r\2\2\u0120\u0122"+
		"\7h\2\2\u0121\u0123\5\22\n\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0125\7\25\2\2\u0125\u0127\5N(\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\7\34\2\2\u0129"+
		"\u012b\5\"\22\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3"+
		"\2\2\2\u012c\u012d\5$\23\2\u012d\21\3\2\2\2\u012e\u012f\7H\2\2\u012f\u0134"+
		"\5\24\13\2\u0130\u0131\7D\2\2\u0131\u0133\5\24\13\2\u0132\u0130\3\2\2"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7G\2\2\u0138\23\3\2\2\2\u0139"+
		"\u013c\7h\2\2\u013a\u013b\7\25\2\2\u013b\u013d\5\26\f\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\25\3\2\2\2\u013e\u0143\5N(\2\u013f\u0140"+
		"\7Y\2\2\u0140\u0142\5N(\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\27\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u0147\7\24\2\2\u0147\u014a\7h\2\2\u0148\u0149\7\34\2\2\u0149"+
		"\u014b\5\"\22\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3"+
		"\2\2\2\u014c\u014e\7?\2\2\u014d\u014f\5\32\16\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0152\7D\2\2\u0151\u0150\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\5\36\20\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7@"+
		"\2\2\u0157\31\3\2\2\2\u0158\u015d\5\34\17\2\u0159\u015a\7D\2\2\u015a\u015c"+
		"\5\34\17\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\33\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162"+
		"\5j\66\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\7h"+
		"\2\2\u0167\u0169\5\u00ccg\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u016c\5$\23\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\35\3\2\2\2\u016d\u0171\7C\2\2\u016e\u0170\5(\25\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\37\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7 \2\2\u0175\u0177\7h\2\2"+
		"\u0176\u0178\5\22\n\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b"+
		"\3\2\2\2\u0179\u017a\7\25\2\2\u017a\u017c\5\"\22\2\u017b\u0179\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5&\24\2\u017e!\3"+
		"\2\2\2\u017f\u0184\5N(\2\u0180\u0181\7D\2\2\u0181\u0183\5N(\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"#\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018b\7?\2\2\u0188\u018a\5(\25\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7@\2\2\u018f"+
		"%\3\2\2\2\u0190\u0194\7?\2\2\u0191\u0193\5\66\34\2\u0192\u0191\3\2\2\2"+
		"\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7@\2\2\u0198\'\3\2\2\2\u0199"+
		"\u01a6\7C\2\2\u019a\u019c\7*\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019d\u01a6\5\u0086D\2\u019e\u01a0\5\n\6\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5*\26\2\u01a5"+
		"\u0199\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6)\3\2\2\2"+
		"\u01a7\u01b1\5,\27\2\u01a8\u01b1\5.\30\2\u01a9\u01b1\5\64\33\2\u01aa\u01b1"+
		"\5\60\31\2\u01ab\u01b1\5\62\32\2\u01ac\u01b1\5 \21\2\u01ad\u01b1\5v<\2"+
		"\u01ae\u01b1\5\20\t\2\u01af\u01b1\5\30\r\2\u01b0\u01a7\3\2\2\2\u01b0\u01a8"+
		"\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0"+
		"\u01ac\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1+\3\2\2\2\u01b2\u01b5\5N(\2\u01b3\u01b5\7\64\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7"+
		"\u01bc\5Z.\2\u01b8\u01b9\7A\2\2\u01b9\u01bb\7B\2\2\u01ba\u01b8\3\2\2\2"+
		"\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c2\5X-\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c6\5b"+
		"\62\2\u01c4\u01c6\7C\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"-\3\2\2\2\u01c7\u01c8\5\22\n\2\u01c8\u01c9\5,\27\2\u01c9/\3\2\2\2\u01ca"+
		"\u01cb\7h\2\2\u01cb\u01ce\5Z.\2\u01cc\u01cd\7\61\2\2\u01cd\u01cf\5X-\2"+
		"\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1"+
		"\5d\63\2\u01d1\61\3\2\2\2\u01d2\u01d3\5\22\n\2\u01d3\u01d4\5\60\31\2\u01d4"+
		"\63\3\2\2\2\u01d5\u01d6\5N(\2\u01d6\u01d7\5B\"\2\u01d7\u01d8\7C\2\2\u01d8"+
		"\65\3\2\2\2\u01d9\u01db\5\n\6\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2"+
		"\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e2\58\35\2\u01e0\u01e2\7C\2\2\u01e1\u01dc\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\67\3\2\2\2\u01e3\u01eb\5:\36\2\u01e4\u01eb\5> \2"+
		"\u01e5\u01eb\5@!\2\u01e6\u01eb\5 \21\2\u01e7\u01eb\5v<\2\u01e8\u01eb\5"+
		"\20\t\2\u01e9\u01eb\5\30\r\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01eb9\3\2\2\2\u01ec\u01ed\5N(\2\u01ed\u01f2"+
		"\5<\37\2\u01ee\u01ef\7D\2\2\u01ef\u01f1\5<\37\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7C\2\2\u01f6;\3\2\2\2\u01f7\u01fc"+
		"\7h\2\2\u01f8\u01f9\7A\2\2\u01f9\u01fb\7B\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7F\2\2\u0200\u0201\5H%\2\u0201=\3"+
		"\2\2\2\u0202\u0205\5N(\2\u0203\u0205\7\64\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7h\2\2\u0207\u020c\5Z."+
		"\2\u0208\u0209\7A\2\2\u0209\u020b\7B\2\2\u020a\u0208\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0210\7\61\2\2\u0210\u0212\5X-\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7C\2\2\u0214"+
		"?\3\2\2\2\u0215\u0216\5\22\n\2\u0216\u0217\5> \2\u0217A\3\2\2\2\u0218"+
		"\u021d\5D#\2\u0219\u021a\7D\2\2\u021a\u021c\5D#\2\u021b\u0219\3\2\2\2"+
		"\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021eC\3"+
		"\2\2\2\u021f\u021d\3\2\2\2\u0220\u0223\5F$\2\u0221\u0222\7F\2\2\u0222"+
		"\u0224\5H%\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224E\3\2\2\2\u0225"+
		"\u022a\7h\2\2\u0226\u0227\7A\2\2\u0227\u0229\7B\2\2\u0228\u0226\3\2\2"+
		"\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bG"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u0230\5J&\2\u022e\u0230\5\u00b2Z\2"+
		"\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230I\3\2\2\2\u0231\u023d\7"+
		"?\2\2\u0232\u0237\5H%\2\u0233\u0234\7D\2\2\u0234\u0236\5H%\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\7D\2\2\u023b\u023a\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u0232\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7@\2\2\u0240K\3\2\2\2\u0241"+
		"\u0242\7h\2\2\u0242M\3\2\2\2\u0243\u0248\5P)\2\u0244\u0245\7A\2\2\u0245"+
		"\u0247\7B\2\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u0254\3\2\2\2\u024a\u0248\3\2\2\2\u024b"+
		"\u0250\5R*\2\u024c\u024d\7A\2\2\u024d\u024f\7B\2\2\u024e\u024c\3\2\2\2"+
		"\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0243\3\2\2\2\u0253\u024b\3\2\2\2\u0254"+
		"O\3\2\2\2\u0255\u0257\7h\2\2\u0256\u0258\5T+\2\u0257\u0256\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0260\3\2\2\2\u0259\u025a\7E\2\2\u025a\u025c\7h\2"+
		"\2\u025b\u025d\5T+\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f"+
		"\3\2\2\2\u025e\u0259\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261Q\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\t\4\2\2"+
		"\u0264S\3\2\2\2\u0265\u0266\7H\2\2\u0266\u026b\5V,\2\u0267\u0268\7D\2"+
		"\2\u0268\u026a\5V,\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\7G\2\2\u026fU\3\2\2\2\u0270\u0277\5N(\2\u0271\u0274\7K\2\2\u0272"+
		"\u0273\t\5\2\2\u0273\u0275\5N(\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275\u0277\3\2\2\2\u0276\u0270\3\2\2\2\u0276\u0271\3\2\2\2\u0277W"+
		"\3\2\2\2\u0278\u027d\5f\64\2\u0279\u027a\7D\2\2\u027a\u027c\5f\64\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027eY\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282\7=\2\2\u0281\u0283"+
		"\5\\/\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\7>\2\2\u0285[\3\2\2\2\u0286\u028b\5^\60\2\u0287\u0288\7D\2\2\u0288"+
		"\u028a\5^\60\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028b\u028c\3\2\2\2\u028c\u0290\3\2\2\2\u028d\u028b\3\2\2\2\u028e"+
		"\u028f\7D\2\2\u028f\u0291\5`\61\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0294\3\2\2\2\u0292\u0294\5`\61\2\u0293\u0286\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294]\3\2\2\2\u0295\u0297\5\16\b\2\u0296\u0295\3\2\2\2"+
		"\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b"+
		"\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\5N(\2\u029c\u029d\5F$\2\u029d"+
		"_\3\2\2\2\u029e\u02a0\5\16\b\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2"+
		"\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1"+
		"\3\2\2\2\u02a4\u02a5\5N(\2\u02a5\u02a6\7j\2\2\u02a6\u02a7\5F$\2\u02a7"+
		"a\3\2\2\2\u02a8\u02a9\5\u0086D\2\u02a9c\3\2\2\2\u02aa\u02ab\5\u0086D\2"+
		"\u02abe\3\2\2\2\u02ac\u02b1\7h\2\2\u02ad\u02ae\7E\2\2\u02ae\u02b0\7h\2"+
		"\2\u02af\u02ad\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2g\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\t\6\2\2\u02b5"+
		"i\3\2\2\2\u02b6\u02b7\7i\2\2\u02b7\u02be\5l\67\2\u02b8\u02bb\7=\2\2\u02b9"+
		"\u02bc\5n8\2\u02ba\u02bc\5r:\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2"+
		"\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\7>\2\2\u02be\u02b8"+
		"\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfk\3\2\2\2\u02c0\u02c1\5f\64\2\u02c1"+
		"m\3\2\2\2\u02c2\u02c7\5p9\2\u02c3\u02c4\7D\2\2\u02c4\u02c6\5p9\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8o\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7h\2\2\u02cb\u02cc"+
		"\7F\2\2\u02cc\u02cd\5r:\2\u02cdq\3\2\2\2\u02ce\u02d2\5\u00b2Z\2\u02cf"+
		"\u02d2\5j\66\2\u02d0\u02d2\5t;\2\u02d1\u02ce\3\2\2\2\u02d1\u02cf\3\2\2"+
		"\2\u02d1\u02d0\3\2\2\2\u02d2s\3\2\2\2\u02d3\u02dc\7?\2\2\u02d4\u02d9\5"+
		"r:\2\u02d5\u02d6\7D\2\2\u02d6\u02d8\5r:\2\u02d7\u02d5\3\2\2\2\u02d8\u02db"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dc\u02d4\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02e0\7D\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e2\7@\2\2\u02e2u\3\2\2\2\u02e3\u02e4\7i\2\2\u02e4"+
		"\u02e5\7 \2\2\u02e5\u02e6\7h\2\2\u02e6\u02e7\5x=\2\u02e7w\3\2\2\2\u02e8"+
		"\u02ec\7?\2\2\u02e9\u02eb\5z>\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2"+
		"\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec"+
		"\3\2\2\2\u02ef\u02f0\7@\2\2\u02f0y\3\2\2\2\u02f1\u02f3\5\n\6\2\u02f2\u02f1"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\5|?\2\u02f8\u02fa\7C\2"+
		"\2\u02f9\u02f4\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa{\3\2\2\2\u02fb\u02fc"+
		"\5N(\2\u02fc\u02fd\5~@\2\u02fd\u02fe\7C\2\2\u02fe\u0310\3\2\2\2\u02ff"+
		"\u0301\5\20\t\2\u0300\u0302\7C\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0310\3\2\2\2\u0303\u0305\5 \21\2\u0304\u0306\7C\2\2\u0305"+
		"\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0310\3\2\2\2\u0307\u0309\5\30"+
		"\r\2\u0308\u030a\7C\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u0310\3\2\2\2\u030b\u030d\5v<\2\u030c\u030e\7C\2\2\u030d\u030c\3\2\2"+
		"\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u02fb\3\2\2\2\u030f\u02ff"+
		"\3\2\2\2\u030f\u0303\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u030b\3\2\2\2\u0310"+
		"}\3\2\2\2\u0311\u0314\5\u0080A\2\u0312\u0314\5\u0082B\2\u0313\u0311\3"+
		"\2\2\2\u0313\u0312\3\2\2\2\u0314\177\3\2\2\2\u0315\u0316\7h\2\2\u0316"+
		"\u0317\7=\2\2\u0317\u0319\7>\2\2\u0318\u031a\5\u0084C\2\u0319\u0318\3"+
		"\2\2\2\u0319\u031a\3\2\2\2\u031a\u0081\3\2\2\2\u031b\u031c\5B\"\2\u031c"+
		"\u0083\3\2\2\2\u031d\u031e\7\20\2\2\u031e\u031f\5r:\2\u031f\u0085\3\2"+
		"\2\2\u0320\u0324\7?\2\2\u0321\u0323\5\u0088E\2\u0322\u0321\3\2\2\2\u0323"+
		"\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2"+
		"\2\2\u0326\u0324\3\2\2\2\u0327\u0328\7@\2\2\u0328\u0087\3\2\2\2\u0329"+
		"\u032e\5\u008aF\2\u032a\u032e\5\u0090I\2\u032b\u032e\5\u008eH\2\u032c"+
		"\u032e\5\b\5\2\u032d\u0329\3\2\2\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032c\3\2\2\2\u032e\u0089\3\2\2\2\u032f\u0330\5\u008cG\2\u0330"+
		"\u0331\7C\2\2\u0331\u008b\3\2\2\2\u0332\u0334\5\16\b\2\u0333\u0332\3\2"+
		"\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\5N(\2\u0339\u033a\5B\""+
		"\2\u033a\u008d\3\2\2\2\u033b\u033c\7=\2\2\u033c\u033d\5\u00b2Z\2\u033d"+
		"\u033e\7>\2\2\u033e\u033f\7>\2\2\u033f\u0340\bH\1\2\u0340\u0360\3\2\2"+
		"\2\u0341\u0342\7=\2\2\u0342\u0343\5\u00b2Z\2\u0343\u0344\bH\1\2\u0344"+
		"\u0360\3\2\2\2\u0345\u0346\7=\2\2\u0346\u0347\7=\2\2\u0347\u0348\5\u00b2"+
		"Z\2\u0348\u0349\7>\2\2\u0349\u034a\bH\1\2\u034a\u0360\3\2\2\2\u034b\u034c"+
		"\5\u00b2Z\2\u034c\u034d\7>\2\2\u034d\u034e\bH\1\2\u034e\u0360\3\2\2\2"+
		"\u034f\u0350\7\21\2\2\u0350\u0351\5\u0090I\2\u0351\u0352\7\66\2\2\u0352"+
		"\u0353\5\u00aaV\2\u0353\u0354\bH\1\2\u0354\u0360\3\2\2\2\u0355\u0357\7"+
		"(\2\2\u0356\u0358\5\u00b2Z\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u0360\bH\1\2\u035a\u035c\7\b\2\2\u035b\u035d\7h\2"+
		"\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360"+
		"\bH\1\2\u035f\u033b\3\2\2\2\u035f\u0341\3\2\2\2\u035f\u0345\3\2\2\2\u035f"+
		"\u034b\3\2\2\2\u035f\u034f\3\2\2\2\u035f\u0355\3\2\2\2\u035f\u035a\3\2"+
		"\2\2\u0360\u008f\3\2\2\2\u0361\u03d9\5\u0086D\2\u0362\u0363\7\6\2\2\u0363"+
		"\u0366\5\u00b2Z\2\u0364\u0365\7L\2\2\u0365\u0367\5\u00b2Z\2\u0366\u0364"+
		"\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7C\2\2\u0369"+
		"\u03d9\3\2\2\2\u036a\u036b\7\32\2\2\u036b\u036c\5\u00aaV\2\u036c\u036f"+
		"\5\u0090I\2\u036d\u036e\7\23\2\2\u036e\u0370\5\u0090I\2\u036f\u036d\3"+
		"\2\2\2\u036f\u0370\3\2\2\2\u0370\u03d9\3\2\2\2\u0371\u0372\7\31\2\2\u0372"+
		"\u0373\7=\2\2\u0373\u0374\5\u00a2R\2\u0374\u0375\7>\2\2\u0375\u0376\5"+
		"\u0090I\2\u0376\u03d9\3\2\2\2\u0377\u0378\7\66\2\2\u0378\u0379\5\u00aa"+
		"V\2\u0379\u037a\5\u0090I\2\u037a\u03d9\3\2\2\2\u037b\u037c\7\21\2\2\u037c"+
		"\u037d\5\u0090I\2\u037d\u037e\7\66\2\2\u037e\u037f\5\u00aaV\2\u037f\u0380"+
		"\7C\2\2\u0380\u03d9\3\2\2\2\u0381\u0382\7\63\2\2\u0382\u038c\5\u0086D"+
		"\2\u0383\u0385\5\u0092J\2\u0384\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u038a\5\u0096"+
		"L\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u038d\5\u0096L\2\u038c\u0384\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u03d9"+
		"\3\2\2\2\u038e\u038f\7\63\2\2\u038f\u0390\5\u0098M\2\u0390\u0394\5\u0086"+
		"D\2\u0391\u0393\5\u0092J\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2"+
		"\2\2\u0397\u0399\5\u0096L\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u03d9\3\2\2\2\u039a\u039b\7-\2\2\u039b\u039c\5\u00aaV\2\u039c\u03a0\7"+
		"?\2\2\u039d\u039f\5\u009eP\2\u039e\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a6\3\2\2\2\u03a2\u03a0\3\2"+
		"\2\2\u03a3\u03a5\5\u00a0Q\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2"+
		"\2\2\u03a9\u03aa\7@\2\2\u03aa\u03d9\3\2\2\2\u03ab\u03ac\7.\2\2\u03ac\u03ad"+
		"\5\u00aaV\2\u03ad\u03ae\5\u0086D\2\u03ae\u03d9\3\2\2\2\u03af\u03b1\7("+
		"\2\2\u03b0\u03b2\5\u00b2Z\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03d9\7C\2\2\u03b4\u03b5\7\60\2\2\u03b5\u03b6\5\u00b2"+
		"Z\2\u03b6\u03b7\7C\2\2\u03b7\u03d9\3\2\2\2\u03b8\u03ba\7\b\2\2\u03b9\u03bb"+
		"\7h\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03d9\7C\2\2\u03bd\u03bf\7\17\2\2\u03be\u03c0\7h\2\2\u03bf\u03be\3\2"+
		"\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03d9\7C\2\2\u03c2"+
		"\u03c3\7\3\2\2\u03c3\u03c4\7=\2\2\u03c4\u03c5\7h\2\2\u03c5\u03c6\7>\2"+
		"\2\u03c6\u03d9\7C\2\2\u03c7\u03c8\7\3\2\2\u03c8\u03c9\7=\2\2\u03c9\u03ca"+
		"\7;\2\2\u03ca\u03cb\7>\2\2\u03cb\u03d9\7C\2\2\u03cc\u03cd\7\4\2\2\u03cd"+
		"\u03ce\7=\2\2\u03ce\u03cf\7h\2\2\u03cf\u03d0\7>\2\2\u03d0\u03d9\7C\2\2"+
		"\u03d1\u03d9\7C\2\2\u03d2\u03d3\5\u00aeX\2\u03d3\u03d4\7C\2\2\u03d4\u03d9"+
		"\3\2\2\2\u03d5\u03d6\7h\2\2\u03d6\u03d7\7L\2\2\u03d7\u03d9\5\u0090I\2"+
		"\u03d8\u0361\3\2\2\2\u03d8\u0362\3\2\2\2\u03d8\u036a\3\2\2\2\u03d8\u0371"+
		"\3\2\2\2\u03d8\u0377\3\2\2\2\u03d8\u037b\3\2\2\2\u03d8\u0381\3\2\2\2\u03d8"+
		"\u038e\3\2\2\2\u03d8\u039a\3\2\2\2\u03d8\u03ab\3\2\2\2\u03d8\u03af\3\2"+
		"\2\2\u03d8\u03b4\3\2\2\2\u03d8\u03b8\3\2\2\2\u03d8\u03bd\3\2\2\2\u03d8"+
		"\u03c2\3\2\2\2\u03d8\u03c7\3\2\2\2\u03d8\u03cc\3\2\2\2\u03d8\u03d1\3\2"+
		"\2\2\u03d8\u03d2\3\2\2\2\u03d8\u03d5\3\2\2\2\u03d9\u0091\3\2\2\2\u03da"+
		"\u03db\7\13\2\2\u03db\u03df\7=\2\2\u03dc\u03de\5\16\b\2\u03dd\u03dc\3"+
		"\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e2\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e3\5\u0094K\2\u03e3\u03e4"+
		"\7h\2\2\u03e4\u03e5\7>\2\2\u03e5\u03e6\5\u0086D\2\u03e6\u0093\3\2\2\2"+
		"\u03e7\u03ec\5f\64\2\u03e8\u03e9\7Z\2\2\u03e9\u03eb\5f\64\2\u03ea\u03e8"+
		"\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u0095\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7\27\2\2\u03f0\u03f1\5"+
		"\u0086D\2\u03f1\u0097\3\2\2\2\u03f2\u03f3\7=\2\2\u03f3\u03f5\5\u009aN"+
		"\2\u03f4\u03f6\7C\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03f8\7>\2\2\u03f8\u0099\3\2\2\2\u03f9\u03fe\5\u009cO\2"+
		"\u03fa\u03fb\7C\2\2\u03fb\u03fd\5\u009cO\2\u03fc\u03fa\3\2\2\2\u03fd\u0400"+
		"\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u009b\3\2\2\2\u0400"+
		"\u03fe\3\2\2\2\u0401\u0403\5\16\b\2\u0402\u0401\3\2\2\2\u0403\u0406\3"+
		"\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0407\u0408\5P)\2\u0408\u0409\5F$\2\u0409\u040a\7F\2\2"+
		"\u040a\u040b\5\u00b2Z\2\u040b\u009d\3\2\2\2\u040c\u040e\5\u00a0Q\2\u040d"+
		"\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0412\3\2\2\2\u0411\u0413\5\u0088E\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u009f\3\2"+
		"\2\2\u0416\u0417\7\n\2\2\u0417\u0418\5\u00b0Y\2\u0418\u0419\7L\2\2\u0419"+
		"\u0421\3\2\2\2\u041a\u041b\7\n\2\2\u041b\u041c\5L\'\2\u041c\u041d\7L\2"+
		"\2\u041d\u0421\3\2\2\2\u041e\u041f\7\20\2\2\u041f\u0421\7L\2\2\u0420\u0416"+
		"\3\2\2\2\u0420\u041a\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u00a1\3\2\2\2\u0422"+
		"\u042f\5\u00a6T\2\u0423\u0425\5\u00a4S\2\u0424\u0423\3\2\2\2\u0424\u0425"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\7C\2\2\u0427\u0429\5\u00b2Z\2"+
		"\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c"+
		"\7C\2\2\u042b\u042d\5\u00a8U\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2"+
		"\u042d\u042f\3\2\2\2\u042e\u0422\3\2\2\2\u042e\u0424\3\2\2\2\u042f\u00a3"+
		"\3\2\2\2\u0430\u0433\5\u008cG\2\u0431\u0433\5\u00acW\2\u0432\u0430\3\2"+
		"\2\2\u0432\u0431\3\2\2\2\u0433\u00a5\3\2\2\2\u0434\u0436\5\16\b\2\u0435"+
		"\u0434\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2"+
		"\2\2\u0438\u043a\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b\5N(\2\u043b\u043c"+
		"\5F$\2\u043c\u043d\7L\2\2\u043d\u043e\5\u00b2Z\2\u043e\u00a7\3\2\2\2\u043f"+
		"\u0440\5\u00acW\2\u0440\u00a9\3\2\2\2\u0441\u0442\7=\2\2\u0442\u0443\5"+
		"\u00b2Z\2\u0443\u0444\7>\2\2\u0444\u00ab\3\2\2\2\u0445\u044a\5\u00b2Z"+
		"\2\u0446\u0447\7D\2\2\u0447\u0449\5\u00b2Z\2\u0448\u0446\3\2\2\2\u0449"+
		"\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u00ad\3\2"+
		"\2\2\u044c\u044a\3\2\2\2\u044d\u044e\5\u00b2Z\2\u044e\u00af\3\2\2\2\u044f"+
		"\u0450\5\u00b2Z\2\u0450\u00b1\3\2\2\2\u0451\u0452\bZ\1\2\u0452\u045f\5"+
		"\u00b4[\2\u0453\u0454\7#\2\2\u0454\u045f\5\u00b6\\\2\u0455\u0456\7=\2"+
		"\2\u0456\u0457\5N(\2\u0457\u0458\7>\2\2\u0458\u0459\5\u00b2Z\23\u0459"+
		"\u045f\3\2\2\2\u045a\u045b\t\7\2\2\u045b\u045f\5\u00b2Z\21\u045c\u045d"+
		"\t\b\2\2\u045d\u045f\5\u00b2Z\20\u045e\u0451\3\2\2\2\u045e\u0453\3\2\2"+
		"\2\u045e\u0455\3\2\2\2\u045e\u045a\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u04b5"+
		"\3\2\2\2\u0460\u0461\f\17\2\2\u0461\u0462\t\t\2\2\u0462\u04b4\5\u00b2"+
		"Z\20\u0463\u0464\f\16\2\2\u0464\u0465\t\n\2\2\u0465\u04b4\5\u00b2Z\17"+
		"\u0466\u046e\f\r\2\2\u0467\u0468\7H\2\2\u0468\u046f\7H\2\2\u0469\u046a"+
		"\7G\2\2\u046a\u046b\7G\2\2\u046b\u046f\7G\2\2\u046c\u046d\7G\2\2\u046d"+
		"\u046f\7G\2\2\u046e\u0467\3\2\2\2\u046e\u0469\3\2\2\2\u046e\u046c\3\2"+
		"\2\2\u046f\u0470\3\2\2\2\u0470\u04b4\5\u00b2Z\16\u0471\u0472\f\f\2\2\u0472"+
		"\u0473\t\13\2\2\u0473\u04b4\5\u00b2Z\r\u0474\u0475\f\n\2\2\u0475\u0476"+
		"\t\f\2\2\u0476\u04b4\5\u00b2Z\13\u0477\u0478\f\t\2\2\u0478\u0479\7Y\2"+
		"\2\u0479\u04b4\5\u00b2Z\n\u047a\u047b\f\b\2\2\u047b\u047c\7[\2\2\u047c"+
		"\u04b4\5\u00b2Z\t\u047d\u047e\f\7\2\2\u047e\u047f\7Z\2\2\u047f\u04b4\5"+
		"\u00b2Z\b\u0480\u0481\f\6\2\2\u0481\u0482\7Q\2\2\u0482\u04b4\5\u00b2Z"+
		"\7\u0483\u0484\f\5\2\2\u0484\u0485\7R\2\2\u0485\u04b4\5\u00b2Z\6\u0486"+
		"\u0487\f\4\2\2\u0487\u0488\7K\2\2\u0488\u0489\5\u00b2Z\2\u0489\u048a\7"+
		"L\2\2\u048a\u048b\5\u00b2Z\5\u048b\u04b4\3\2\2\2\u048c\u048d\f\3\2\2\u048d"+
		"\u048e\t\r\2\2\u048e\u04b4\5\u00b2Z\3\u048f\u0490\f\33\2\2\u0490\u0491"+
		"\7E\2\2\u0491\u04b4\7h\2\2\u0492\u0493\f\32\2\2\u0493\u0494\7E\2\2\u0494"+
		"\u04b4\7/\2\2\u0495\u0496\f\31\2\2\u0496\u0497\7E\2\2\u0497\u0499\7#\2"+
		"\2\u0498\u049a\5\u00c2b\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u04b4\5\u00ba^\2\u049c\u049d\f\30\2\2\u049d\u049e"+
		"\7E\2\2\u049e\u049f\7,\2\2\u049f\u04b4\5\u00c8e\2\u04a0\u04a1\f\27\2\2"+
		"\u04a1\u04a2\7E\2\2\u04a2\u04b4\5\u00c0a\2\u04a3\u04a4\f\26\2\2\u04a4"+
		"\u04a5\7A\2\2\u04a5\u04a6\5\u00b2Z\2\u04a6\u04a7\7B\2\2\u04a7\u04b4\3"+
		"\2\2\2\u04a8\u04a9\f\25\2\2\u04a9\u04ab\7=\2\2\u04aa\u04ac\5\u00acW\2"+
		"\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b4"+
		"\7>\2\2\u04ae\u04af\f\22\2\2\u04af\u04b4\t\16\2\2\u04b0\u04b1\f\13\2\2"+
		"\u04b1\u04b2\7\36\2\2\u04b2\u04b4\5N(\2\u04b3\u0460\3\2\2\2\u04b3\u0463"+
		"\3\2\2\2\u04b3\u0466\3\2\2\2\u04b3\u0471\3\2\2\2\u04b3\u0474\3\2\2\2\u04b3"+
		"\u0477\3\2\2\2\u04b3\u047a\3\2\2\2\u04b3\u047d\3\2\2\2\u04b3\u0480\3\2"+
		"\2\2\u04b3\u0483\3\2\2\2\u04b3\u0486\3\2\2\2\u04b3\u048c\3\2\2\2\u04b3"+
		"\u048f\3\2\2\2\u04b3\u0492\3\2\2\2\u04b3\u0495\3\2\2\2\u04b3\u049c\3\2"+
		"\2\2\u04b3\u04a0\3\2\2\2\u04b3\u04a3\3\2\2\2\u04b3\u04a8\3\2\2\2\u04b3"+
		"\u04ae\3\2\2\2\u04b3\u04b0\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2"+
		"\2\2\u04b5\u04b6\3\2\2\2\u04b6\u00b3\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8"+
		"\u04b9\7=\2\2\u04b9\u04ba\5\u00b2Z\2\u04ba\u04bb\7>\2\2\u04bb\u04ce\3"+
		"\2\2\2\u04bc\u04ce\7/\2\2\u04bd\u04ce\7,\2\2\u04be\u04ce\5h\65\2\u04bf"+
		"\u04ce\7h\2\2\u04c0\u04c1\5N(\2\u04c1\u04c2\7E\2\2\u04c2\u04c3\7\r\2\2"+
		"\u04c3\u04ce\3\2\2\2\u04c4\u04c5\7\64\2\2\u04c5\u04c6\7E\2\2\u04c6\u04ce"+
		"\7\r\2\2\u04c7\u04cb\5\u00c2b\2\u04c8\u04cc\5\u00caf\2\u04c9\u04ca\7/"+
		"\2\2\u04ca\u04cc\5\u00ccg\2\u04cb\u04c8\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc"+
		"\u04ce\3\2\2\2\u04cd\u04b8\3\2\2\2\u04cd\u04bc\3\2\2\2\u04cd\u04bd\3\2"+
		"\2\2\u04cd\u04be\3\2\2\2\u04cd\u04bf\3\2\2\2\u04cd\u04c0\3\2\2\2\u04cd"+
		"\u04c4\3\2\2\2\u04cd\u04c7\3\2\2\2\u04ce\u00b5\3\2\2\2\u04cf\u04d0\5\u00c2"+
		"b\2\u04d0\u04d1\5\u00b8]\2\u04d1\u04d2\5\u00be`\2\u04d2\u04d9\3\2\2\2"+
		"\u04d3\u04d6\5\u00b8]\2\u04d4\u04d7\5\u00bc_\2\u04d5\u04d7\5\u00be`\2"+
		"\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04cf"+
		"\3\2\2\2\u04d8\u04d3\3\2\2\2\u04d9\u00b7\3\2\2\2\u04da\u04dc\7h\2\2\u04db"+
		"\u04dd\5\u00c4c\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e5"+
		"\3\2\2\2\u04de\u04df\7E\2\2\u04df\u04e1\7h\2\2\u04e0\u04e2\5\u00c4c\2"+
		"\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04de"+
		"\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04ea\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04ea\5R*\2\u04e9\u04da\3\2\2"+
		"\2\u04e9\u04e8\3\2\2\2\u04ea\u00b9\3\2\2\2\u04eb\u04ed\7h\2\2\u04ec\u04ee"+
		"\5\u00c6d\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2"+
		"\2\u04ef\u04f0\5\u00be`\2\u04f0\u00bb\3\2\2\2\u04f1\u050d\7A\2\2\u04f2"+
		"\u04f7\7B\2\2\u04f3\u04f4\7A\2\2\u04f4\u04f6\7B\2\2\u04f5\u04f3\3\2\2"+
		"\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa"+
		"\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u050e\5J&\2\u04fb\u04fc\5\u00b2Z\2"+
		"\u04fc\u0503\7B\2\2\u04fd\u04fe\7A\2\2\u04fe\u04ff\5\u00b2Z\2\u04ff\u0500"+
		"\7B\2\2\u0500\u0502\3\2\2\2\u0501\u04fd\3\2\2\2\u0502\u0505\3\2\2\2\u0503"+
		"\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u050a\3\2\2\2\u0505\u0503\3\2"+
		"\2\2\u0506\u0507\7A\2\2\u0507\u0509\7B\2\2\u0508\u0506\3\2\2\2\u0509\u050c"+
		"\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050e\3\2\2\2\u050c"+
		"\u050a\3\2\2\2\u050d\u04f2\3\2\2\2\u050d\u04fb\3\2\2\2\u050e\u00bd\3\2"+
		"\2\2\u050f\u0511\5\u00ccg\2\u0510\u0512\5$\23\2\u0511\u0510\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u00bf\3\2\2\2\u0513\u0514\5\u00c2b\2\u0514\u0515"+
		"\5\u00caf\2\u0515\u00c1\3\2\2\2\u0516\u0517\7H\2\2\u0517\u0518\5\"\22"+
		"\2\u0518\u0519\7G\2\2\u0519\u00c3\3\2\2\2\u051a\u051b\7H\2\2\u051b\u051e"+
		"\7G\2\2\u051c\u051e\5T+\2\u051d\u051a\3\2\2\2\u051d\u051c\3\2\2\2\u051e"+
		"\u00c5\3\2\2\2\u051f\u0520\7H\2\2\u0520\u0523\7G\2\2\u0521\u0523\5\u00c2"+
		"b\2\u0522\u051f\3\2\2\2\u0522\u0521\3\2\2\2\u0523\u00c7\3\2\2\2\u0524"+
		"\u052b\5\u00ccg\2\u0525\u0526\7E\2\2\u0526\u0528\7h\2\2\u0527\u0529\5"+
		"\u00ccg\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2\2\2"+
		"\u052a\u0524\3\2\2\2\u052a\u0525\3\2\2\2\u052b\u00c9\3\2\2\2\u052c\u052d"+
		"\7,\2\2\u052d\u0531\5\u00c8e\2\u052e\u052f\7h\2\2\u052f\u0531\5\u00cc"+
		"g\2\u0530\u052c\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u00cb\3\2\2\2\u0532"+
		"\u0534\7=\2\2\u0533\u0535\5\u00acW\2\u0534\u0533\3\2\2\2\u0534\u0535\3"+
		"\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\7>\2\2\u0537\u00cd\3\2\2\2\u009a"+
		"\u00cf\u00d4\u00da\u00e2\u00eb\u00f0\u00f7\u00fe\u0105\u010c\u0111\u0115"+
		"\u0119\u011d\u0122\u0126\u012a\u0134\u013c\u0143\u014a\u014e\u0151\u0154"+
		"\u015d\u0163\u0168\u016b\u0171\u0177\u017b\u0184\u018b\u0194\u019b\u01a1"+
		"\u01a5\u01b0\u01b4\u01bc\u01c1\u01c5\u01ce\u01dc\u01e1\u01ea\u01f2\u01fc"+
		"\u0204\u020c\u0211\u021d\u0223\u022a\u022f\u0237\u023b\u023d\u0248\u0250"+
		"\u0253\u0257\u025c\u0260\u026b\u0274\u0276\u027d\u0282\u028b\u0290\u0293"+
		"\u0298\u02a1\u02b1\u02bb\u02be\u02c7\u02d1\u02d9\u02dc\u02df\u02ec\u02f4"+
		"\u02f9\u0301\u0305\u0309\u030d\u030f\u0313\u0319\u0324\u032d\u0335\u0357"+
		"\u035c\u035f\u0366\u036f\u0386\u0389\u038c\u0394\u0398\u03a0\u03a6\u03b1"+
		"\u03ba\u03bf\u03d8\u03df\u03ec\u03f5\u03fe\u0404\u040f\u0414\u0420\u0424"+
		"\u0428\u042c\u042e\u0432\u0437\u044a\u045e\u046e\u0499\u04ab\u04b3\u04b5"+
		"\u04cb\u04cd\u04d6\u04d8\u04dc\u04e1\u04e5\u04e9\u04ed\u04f7\u0503\u050a"+
		"\u050d\u0511\u051d\u0522\u0528\u052a\u0530\u0534";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}