// Generated from FRIENDLY.g4 by ANTLR 4.7
package antlr;
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
		VOLATILE=51, WHILE=52, STRING=53, IntegerLiteral=54, FloatingPointLiteral=55, 
		BooleanLiteral=56, CharacterLiteral=57, StringLiteral=58, NullLiteral=59, 
		LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, LBRACK=64, RBRACK=65, SEMI=66, 
		COMMA=67, DOT=68, ASSIGN=69, GT=70, LT=71, BANG=72, TILDE=73, QUESTION=74, 
		COLON=75, EQUAL=76, LE=77, GE=78, NOTEQUAL=79, AND=80, OR=81, INC=82, 
		DEC=83, ADD=84, SUB=85, MUL=86, DIV=87, BITAND=88, BITOR=89, CARET=90, 
		MOD=91, ADD_ASSIGN=92, SUB_ASSIGN=93, MUL_ASSIGN=94, DIV_ASSIGN=95, AND_ASSIGN=96, 
		OR_ASSIGN=97, XOR_ASSIGN=98, MOD_ASSIGN=99, LSHIFT_ASSIGN=100, RSHIFT_ASSIGN=101, 
		URSHIFT_ASSIGN=102, Identifier=103, AT=104, ELLIPSIS=105, WS=106, COMMENT=107, 
		LINE_COMMENT=108;
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
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableInitStatement = 68, 
		RULE_localVariableDeclarationStatement = 69, RULE_localVariableInit = 70, 
		RULE_localVariableDeclaration = 71, RULE_commonErrorStatement = 72, RULE_statement = 73, 
		RULE_printExpression = 74, RULE_printContent = 75, RULE_catchClause = 76, 
		RULE_catchType = 77, RULE_finallyBlock = 78, RULE_resourceSpecification = 79, 
		RULE_resources = 80, RULE_resource = 81, RULE_switchBlockStatementGroup = 82, 
		RULE_switchLabel = 83, RULE_forControl = 84, RULE_forInit = 85, RULE_enhancedForControl = 86, 
		RULE_forUpdate = 87, RULE_parExpression = 88, RULE_expressionList = 89, 
		RULE_statementExpression = 90, RULE_constantExpression = 91, RULE_expression = 92, 
		RULE_primary = 93, RULE_creator = 94, RULE_createdName = 95, RULE_innerCreator = 96, 
		RULE_arrayCreatorRest = 97, RULE_classCreatorRest = 98, RULE_explicitGenericInvocation = 99, 
		RULE_nonWildcardTypeArguments = 100, RULE_typeArgumentsOrDiamond = 101, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 102, RULE_superSuffix = 103, 
		RULE_explicitGenericInvocationSuffix = 104, RULE_arguments = 105;
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
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableInitStatement", 
		"localVariableDeclarationStatement", "localVariableInit", "localVariableDeclaration", 
		"commonErrorStatement", "statement", "printExpression", "printContent", 
		"catchClause", "catchType", "finallyBlock", "resourceSpecification", "resources", 
		"resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
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
		"'while'", "'string'", null, null, null, null, null, "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'eq'", "'<='", "'>='", "'neq'", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "STRING", "IntegerLiteral", 
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(212);
				packageDeclaration();
				}
				break;
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(215);
				importDeclaration();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(221);
				typeDeclaration();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(229);
				annotation();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(PACKAGE);
			setState(236);
			qualifiedName();
			setState(237);
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
			setState(239);
			match(IMPORT);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(240);
				match(STATIC);
				}
			}

			setState(243);
			qualifiedName();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(244);
				match(DOT);
				setState(245);
				match(MUL);
				}
			}

			setState(248);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(250);
					classOrInterfaceModifier();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(257);
					classOrInterfaceModifier();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(264);
					classOrInterfaceModifier();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(271);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(277);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
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
			setState(283);
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
				setState(281);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
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
				setState(286);
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
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
			setState(293);
			match(CLASS);
			setState(294);
			match(Identifier);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(295);
				typeParameters();
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(298);
				match(EXTENDS);
				setState(299);
				typeType();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(302);
				match(IMPLEMENTS);
				setState(303);
				typeList();
				}
			}

			setState(306);
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
			setState(308);
			match(LT);
			setState(309);
			typeParameter();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				typeParameter();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
			setState(319);
			match(Identifier);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(320);
				match(EXTENDS);
				setState(321);
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
			setState(324);
			typeType();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(325);
				match(BITAND);
				setState(326);
				typeType();
				}
				}
				setState(331);
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
			setState(332);
			match(ENUM);
			setState(333);
			match(Identifier);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(334);
				match(IMPLEMENTS);
				setState(335);
				typeList();
				}
			}

			setState(338);
			match(LBRACE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(339);
				enumConstants();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(342);
				match(COMMA);
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(345);
				enumBodyDeclarations();
				}
			}

			setState(348);
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
			setState(350);
			enumConstant();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					match(COMMA);
					setState(352);
					enumConstant();
					}
					} 
				}
				setState(357);
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
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(358);
				annotation();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(Identifier);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(365);
				arguments();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(368);
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
			setState(371);
			match(SEMI);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << STRING) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(372);
				classBodyDeclaration();
				}
				}
				setState(377);
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
			setState(378);
			match(INTERFACE);
			setState(379);
			match(Identifier);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(380);
				typeParameters();
				}
			}

			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(383);
				match(EXTENDS);
				setState(384);
				typeList();
				}
			}

			setState(387);
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
			setState(389);
			typeType();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				typeType();
				}
				}
				setState(396);
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
			setState(397);
			match(LBRACE);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << STRING) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(398);
				classBodyDeclaration();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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
			setState(406);
			match(LBRACE);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(407);
				interfaceBodyDeclaration();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
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
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(416);
					match(STATIC);
					}
				}

				setState(419);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(420);
						modifier();
						}
						} 
					}
					setState(425);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(426);
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
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(436);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
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
			setState(442);
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
			case STRING:
			case Identifier:
				{
				setState(440);
				typeType();
				}
				break;
			case VOID:
				{
				setState(441);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(444);
			match(Identifier);
			setState(445);
			formalParameters();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(446);
				match(LBRACK);
				setState(447);
				match(RBRACK);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(453);
				match(THROWS);
				setState(454);
				qualifiedNameList();
				}
			}

			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(457);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(458);
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
			setState(461);
			typeParameters();
			setState(462);
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
			setState(464);
			match(Identifier);
			setState(465);
			formalParameters();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(466);
				match(THROWS);
				setState(467);
				qualifiedNameList();
				}
			}

			setState(470);
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
			setState(472);
			typeParameters();
			setState(473);
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
			setState(475);
			typeType();
			setState(476);
			variableDeclarators();
			setState(477);
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
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
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
			case STRING:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(479);
						modifier();
						}
						} 
					}
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(485);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				constDeclaration();
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
			case VOID:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				interfaceMethodDeclaration();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				genericInterfaceMethodDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				interfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				annotationTypeDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				classDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 7);
				{
				setState(495);
				enumDeclaration();
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
			setState(498);
			match(CONST);
			setState(499);
			typeType();
			setState(500);
			constantDeclarator();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				constantDeclarator();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
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
			setState(510);
			match(Identifier);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(511);
				match(LBRACK);
				setState(512);
				match(RBRACK);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			match(ASSIGN);
			setState(519);
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
			setState(523);
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
			case STRING:
			case Identifier:
				{
				setState(521);
				typeType();
				}
				break;
			case VOID:
				{
				setState(522);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(525);
			match(Identifier);
			setState(526);
			formalParameters();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(527);
				match(LBRACK);
				setState(528);
				match(RBRACK);
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(534);
				match(THROWS);
				setState(535);
				qualifiedNameList();
				}
			}

			setState(538);
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
			setState(540);
			typeParameters();
			setState(541);
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
			setState(543);
			variableDeclarator();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(544);
				match(COMMA);
				setState(545);
				variableDeclarator();
				}
				}
				setState(550);
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
			setState(551);
			variableDeclaratorId();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(552);
				match(ASSIGN);
				setState(553);
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
			setState(556);
			match(Identifier);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(557);
				match(LBRACK);
				setState(558);
				match(RBRACK);
				}
				}
				setState(563);
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
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
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
			case STRING:
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
				setState(565);
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
			setState(568);
			match(LBRACE);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(569);
				variableInitializer();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						match(COMMA);
						setState(571);
						variableInitializer();
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(577);
					match(COMMA);
					}
				}

				}
			}

			setState(582);
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
			setState(584);
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
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				classOrInterfaceType();
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						match(LBRACK);
						setState(588);
						match(RBRACK);
						}
						} 
					}
					setState(593);
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
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				primitiveType();
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(LBRACK);
						setState(596);
						match(RBRACK);
						}
						} 
					}
					setState(601);
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
			setState(604);
			match(Identifier);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(605);
				typeArguments();
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(DOT);
					setState(609);
					match(Identifier);
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(610);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(617);
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
			setState(618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0)) ) {
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
			setState(620);
			match(LT);
			setState(621);
			typeArgument();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				typeArgument();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
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
			setState(637);
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
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(QUESTION);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(633);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(634);
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
			setState(639);
			qualifiedName();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(640);
				match(COMMA);
				setState(641);
				qualifiedName();
				}
				}
				setState(646);
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
			setState(647);
			match(LPAREN);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(648);
				formalParameterList();
				}
			}

			setState(651);
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
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				formalParameter();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						match(COMMA);
						setState(655);
						formalParameter();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(661);
					match(COMMA);
					setState(662);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
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
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(677);
				variableModifier();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			typeType();
			setState(684);
			match(ELLIPSIS);
			setState(685);
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
			setState(687);
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
			setState(689);
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
			setState(691);
			match(Identifier);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(692);
					match(DOT);
					setState(693);
					match(Identifier);
					}
					} 
				}
				setState(698);
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
			setState(699);
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
			setState(701);
			match(AT);
			setState(702);
			annotationName();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(703);
				match(LPAREN);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(704);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(705);
					elementValue();
					}
					break;
				}
				setState(708);
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
			setState(711);
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
			setState(713);
			elementValuePair();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(714);
				match(COMMA);
				setState(715);
				elementValuePair();
				}
				}
				setState(720);
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
			setState(721);
			match(Identifier);
			setState(722);
			match(ASSIGN);
			setState(723);
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
			setState(728);
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
			case STRING:
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
				setState(725);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
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
			setState(730);
			match(LBRACE);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(731);
				elementValue();
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(732);
						match(COMMA);
						setState(733);
						elementValue();
						}
						} 
					}
					setState(738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(741);
				match(COMMA);
				}
			}

			setState(744);
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
			setState(746);
			match(AT);
			setState(747);
			match(INTERFACE);
			setState(748);
			match(Identifier);
			setState(749);
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
			setState(751);
			match(LBRACE);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(752);
				annotationTypeElementDeclaration();
				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(758);
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
			setState(768);
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
			case STRING:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(760);
						modifier();
						}
						} 
					}
					setState(765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(766);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
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
			setState(790);
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
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				typeType();
				setState(771);
				annotationMethodOrConstantRest();
				setState(772);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				classDeclaration();
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(775);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				interfaceDeclaration();
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(779);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				enumDeclaration();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(783);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(786);
				annotationTypeDeclaration();
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(787);
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
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
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
			setState(796);
			match(Identifier);
			setState(797);
			match(LPAREN);
			setState(798);
			match(RPAREN);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(799);
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
			setState(802);
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
			setState(804);
			match(DEFAULT);
			setState(805);
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
			setState(807);
			match(LBRACE);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(808);
				blockStatement();
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
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
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public LocalVariableInitStatementContext localVariableInitStatement() {
			return getRuleContext(LocalVariableInitStatementContext.class,0);
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
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				localVariableDeclarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				localVariableInitStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				commonErrorStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
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

	public static class LocalVariableInitStatementContext extends ParserRuleContext {
		public LocalVariableInitContext localVariableInit() {
			return getRuleContext(LocalVariableInitContext.class,0);
		}
		public LocalVariableInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLocalVariableInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLocalVariableInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLocalVariableInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableInitStatementContext localVariableInitStatement() throws RecognitionException {
		LocalVariableInitStatementContext _localctx = new LocalVariableInitStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableInitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			localVariableInit();
			setState(825);
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
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			localVariableDeclaration();
			setState(828);
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

	public static class LocalVariableInitContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public LocalVariableInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterLocalVariableInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitLocalVariableInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitLocalVariableInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableInitContext localVariableInit() throws RecognitionException {
		LocalVariableInitContext _localctx = new LocalVariableInitContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			variableDeclaratorId();
			setState(831);
			match(ASSIGN);
			setState(832);
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
		enterRule(_localctx, 142, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(834);
				variableModifier();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			typeType();
			setState(841);
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
		enterRule(_localctx, 144, RULE_commonErrorStatement);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(LPAREN);
				setState(844);
				expression(0);
				setState(845);
				match(RPAREN);
				setState(846);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by having too many ')'. ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(LPAREN);
				setState(850);
				expression(0);
				notifyErrorListeners("Uneven parentheses; may be caused by missing a closing ')'. ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(LPAREN);
				setState(854);
				match(LPAREN);
				setState(855);
				expression(0);
				setState(856);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by having too many '('. ");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(859);
				expression(0);
				setState(860);
				match(RPAREN);
				notifyErrorListeners("Uneven parentheses; may be caused by missing an opening '('. ");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				match(DO);
				setState(864);
				statement();
				setState(865);
				match(WHILE);
				setState(866);
				parExpression();
				notifyErrorListeners("Missing ';' at the end of the line.");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(869);
				match(RETURN);
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(870);
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
				setState(874);
				match(BREAK);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(875);
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
		public PrintContentContext printContent() {
			return getRuleContext(PrintContentContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(ASSERT);
				setState(883);
				expression(0);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(884);
					match(COLON);
					setState(885);
					expression(0);
					}
				}

				setState(888);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				match(IF);
				setState(891);
				parExpression();
				setState(892);
				statement();
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(893);
					match(ELSE);
					setState(894);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				match(FOR);
				setState(898);
				match(LPAREN);
				setState(899);
				forControl();
				setState(900);
				match(RPAREN);
				setState(901);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(903);
				match(WHILE);
				setState(904);
				parExpression();
				setState(905);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				match(DO);
				setState(908);
				statement();
				setState(909);
				match(WHILE);
				setState(910);
				parExpression();
				setState(911);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(913);
				match(TRY);
				setState(914);
				block();
				setState(924);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(916); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(915);
						catchClause();
						}
						}
						setState(918); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(920);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(923);
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
				setState(926);
				match(TRY);
				setState(927);
				resourceSpecification();
				setState(928);
				block();
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(929);
					catchClause();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(935);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(938);
				match(SWITCH);
				setState(939);
				parExpression();
				setState(940);
				match(LBRACE);
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(941);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(947);
					switchLabel();
					}
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(953);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(955);
				match(SYNCHRONIZED);
				setState(956);
				parExpression();
				setState(957);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(959);
				match(RETURN);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(960);
					expression(0);
					}
				}

				setState(963);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(964);
				match(THROW);
				setState(965);
				expression(0);
				setState(966);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(968);
				match(BREAK);
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(969);
					match(Identifier);
					}
				}

				setState(972);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(973);
				match(CONTINUE);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(974);
					match(Identifier);
					}
				}

				setState(977);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(978);
				match(T__0);
				setState(979);
				match(LPAREN);
				setState(980);
				printContent();
				setState(981);
				match(RPAREN);
				setState(982);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(984);
				match(T__1);
				setState(985);
				match(LPAREN);
				setState(986);
				match(Identifier);
				setState(987);
				match(RPAREN);
				setState(988);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(989);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(990);
				statementExpression();
				setState(991);
				match(SEMI);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(993);
				match(Identifier);
				setState(994);
				match(COLON);
				setState(995);
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

	public static class PrintExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FRIENDLYParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(FRIENDLYParser.StringLiteral, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_printExpression);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				match(StringLiteral);
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

	public static class PrintContentContext extends ParserRuleContext {
		public List<PrintExpressionContext> printExpression() {
			return getRuleContexts(PrintExpressionContext.class);
		}
		public PrintExpressionContext printExpression(int i) {
			return getRuleContext(PrintExpressionContext.class,i);
		}
		public PrintContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).enterPrintContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FRIENDLYListener ) ((FRIENDLYListener)listener).exitPrintContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FRIENDLYVisitor ) return ((FRIENDLYVisitor<? extends T>)visitor).visitPrintContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContentContext printContent() throws RecognitionException {
		PrintContentContext _localctx = new PrintContentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_printContent);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				printExpression();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(1005);
					match(ADD);
					setState(1006);
					printExpression();
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		enterRule(_localctx, 152, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(CATCH);
			setState(1016);
			match(LPAREN);
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1017);
				variableModifier();
				}
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
			catchType();
			setState(1024);
			match(Identifier);
			setState(1025);
			match(RPAREN);
			setState(1026);
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
		enterRule(_localctx, 154, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			qualifiedName();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1029);
				match(BITOR);
				setState(1030);
				qualifiedName();
				}
				}
				setState(1035);
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
		enterRule(_localctx, 156, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(FINALLY);
			setState(1037);
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
		enterRule(_localctx, 158, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(LPAREN);
			setState(1040);
			resources();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1041);
				match(SEMI);
				}
			}

			setState(1044);
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
		enterRule(_localctx, 160, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			resource();
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					match(SEMI);
					setState(1048);
					resource();
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		enterRule(_localctx, 162, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1054);
				variableModifier();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			classOrInterfaceType();
			setState(1061);
			variableDeclaratorId();
			setState(1062);
			match(ASSIGN);
			setState(1063);
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
		enterRule(_localctx, 164, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1065);
				switchLabel();
				}
				}
				setState(1068); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1071); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1070);
				blockStatement();
				}
				}
				setState(1073); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0) );
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
		enterRule(_localctx, 166, RULE_switchLabel);
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(CASE);
				setState(1076);
				constantExpression();
				setState(1077);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				match(CASE);
				setState(1080);
				enumConstantName();
				setState(1081);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1083);
				match(DEFAULT);
				setState(1084);
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
		enterRule(_localctx, 168, RULE_forControl);
		int _la;
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1088);
					forInit();
					}
				}

				setState(1091);
				match(SEMI);
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1092);
					expression(0);
					}
				}

				setState(1095);
				match(SEMI);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1096);
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
		enterRule(_localctx, 170, RULE_forInit);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
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
		enterRule(_localctx, 172, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1105);
				variableModifier();
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
			typeType();
			setState(1112);
			variableDeclaratorId();
			setState(1113);
			match(COLON);
			setState(1114);
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
		enterRule(_localctx, 174, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 176, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(LPAREN);
			setState(1119);
			expression(0);
			setState(1120);
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
		enterRule(_localctx, 178, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			expression(0);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1123);
				match(COMMA);
				setState(1124);
				expression(0);
				}
				}
				setState(1129);
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
		enterRule(_localctx, 180, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
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
		enterRule(_localctx, 182, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1135);
				primary();
				}
				break;
			case 2:
				{
				setState(1136);
				match(NEW);
				setState(1137);
				creator();
				}
				break;
			case 3:
				{
				setState(1138);
				match(LPAREN);
				setState(1139);
				typeType();
				setState(1140);
				match(RPAREN);
				setState(1141);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (ADD - 82)) | (1L << (SUB - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1144);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1145);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1146);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1150);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1151);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1153);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1154);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1163);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(1156);
							match(LT);
							setState(1157);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1158);
							match(GT);
							setState(1159);
							match(GT);
							setState(1160);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1161);
							match(GT);
							setState(1162);
							match(GT);
							}
							break;
						}
						setState(1165);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1167);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GT - 70)) | (1L << (LT - 70)) | (1L << (LE - 70)) | (1L << (GE - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1168);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1170);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1171);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1173);
						match(BITAND);
						setState(1174);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1176);
						match(CARET);
						setState(1177);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1179);
						match(BITOR);
						setState(1180);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1182);
						match(AND);
						setState(1183);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1185);
						match(OR);
						setState(1186);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1188);
						match(QUESTION);
						setState(1189);
						expression(0);
						setState(1190);
						match(COLON);
						setState(1191);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1194);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1195);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1197);
						match(DOT);
						setState(1198);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1200);
						match(DOT);
						setState(1201);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1203);
						match(DOT);
						setState(1204);
						match(NEW);
						setState(1206);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1205);
							nonWildcardTypeArguments();
							}
						}

						setState(1208);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1210);
						match(DOT);
						setState(1211);
						match(SUPER);
						setState(1212);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1214);
						match(DOT);
						setState(1215);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1216);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1217);
						match(LBRACK);
						setState(1218);
						expression(0);
						setState(1219);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1222);
						match(LPAREN);
						setState(1224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
							{
							setState(1223);
							expressionList();
							}
						}

						setState(1226);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1227);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1228);
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
						setState(1229);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1230);
						match(INSTANCEOF);
						setState(1231);
						typeType();
						}
						break;
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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
		enterRule(_localctx, 186, RULE_primary);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				match(LPAREN);
				setState(1238);
				expression(0);
				setState(1239);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1244);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1245);
				typeType();
				setState(1246);
				match(DOT);
				setState(1247);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1249);
				match(VOID);
				setState(1250);
				match(DOT);
				setState(1251);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1252);
				nonWildcardTypeArguments();
				setState(1256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1253);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1254);
					match(THIS);
					setState(1255);
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
		enterRule(_localctx, 188, RULE_creator);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				nonWildcardTypeArguments();
				setState(1261);
				createdName();
				setState(1262);
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
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				createdName();
				setState(1267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1265);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1266);
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
		enterRule(_localctx, 190, RULE_createdName);
		int _la;
		try {
			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				match(Identifier);
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1272);
					typeArgumentsOrDiamond();
					}
				}

				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1275);
					match(DOT);
					setState(1276);
					match(Identifier);
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1277);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1284);
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
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
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
		enterRule(_localctx, 192, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(Identifier);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1289);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1292);
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
		enterRule(_localctx, 194, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(LBRACK);
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1295);
				match(RBRACK);
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1296);
					match(LBRACK);
					setState(1297);
					match(RBRACK);
					}
					}
					setState(1302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1303);
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
			case STRING:
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
				setState(1304);
				expression(0);
				setState(1305);
				match(RBRACK);
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1306);
						match(LBRACK);
						setState(1307);
						expression(0);
						setState(1308);
						match(RBRACK);
						}
						} 
					}
					setState(1314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1315);
						match(LBRACK);
						setState(1316);
						match(RBRACK);
						}
						} 
					}
					setState(1321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		enterRule(_localctx, 196, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			arguments();
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1325);
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
		enterRule(_localctx, 198, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			nonWildcardTypeArguments();
			setState(1329);
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
		enterRule(_localctx, 200, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(LT);
			setState(1332);
			typeList();
			setState(1333);
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
		enterRule(_localctx, 202, RULE_typeArgumentsOrDiamond);
		try {
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335);
				match(LT);
				setState(1336);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
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
		enterRule(_localctx, 204, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(LT);
				setState(1341);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
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
		enterRule(_localctx, 206, RULE_superSuffix);
		try {
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(DOT);
				setState(1347);
				match(Identifier);
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1348);
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
		enterRule(_localctx, 208, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(SUPER);
				setState(1354);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				match(Identifier);
				setState(1356);
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
		enterRule(_localctx, 210, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(LPAREN);
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << STRING) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(1360);
				expressionList();
				}
			}

			setState(1363);
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
		case 92:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0558\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\5\2\u00d8\n\2\3\2\7\2\u00db\n\2\f\2\16\2\u00de\13\2\3\2\7\2\u00e1"+
		"\n\2\f\2\16\2\u00e4\13\2\3\2\3\2\3\3\7\3\u00e9\n\3\f\3\16\3\u00ec\13\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00f4\n\4\3\4\3\4\3\4\5\4\u00f9\n\4\3\4\3"+
		"\4\3\5\7\5\u00fe\n\5\f\5\16\5\u0101\13\5\3\5\3\5\7\5\u0105\n\5\f\5\16"+
		"\5\u0108\13\5\3\5\3\5\7\5\u010c\n\5\f\5\16\5\u010f\13\5\3\5\3\5\7\5\u0113"+
		"\n\5\f\5\16\5\u0116\13\5\3\5\3\5\5\5\u011a\n\5\3\6\3\6\5\6\u011e\n\6\3"+
		"\7\3\7\5\7\u0122\n\7\3\b\3\b\5\b\u0126\n\b\3\t\3\t\3\t\5\t\u012b\n\t\3"+
		"\t\3\t\5\t\u012f\n\t\3\t\3\t\5\t\u0133\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"\u013b\n\n\f\n\16\n\u013e\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u0145\n\13"+
		"\3\f\3\f\3\f\7\f\u014a\n\f\f\f\16\f\u014d\13\f\3\r\3\r\3\r\3\r\5\r\u0153"+
		"\n\r\3\r\3\r\5\r\u0157\n\r\3\r\5\r\u015a\n\r\3\r\5\r\u015d\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u0164\n\16\f\16\16\16\u0167\13\16\3\17\7\17\u016a"+
		"\n\17\f\17\16\17\u016d\13\17\3\17\3\17\5\17\u0171\n\17\3\17\5\17\u0174"+
		"\n\17\3\20\3\20\7\20\u0178\n\20\f\20\16\20\u017b\13\20\3\21\3\21\3\21"+
		"\5\21\u0180\n\21\3\21\3\21\5\21\u0184\n\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u018b\n\22\f\22\16\22\u018e\13\22\3\23\3\23\7\23\u0192\n\23\f\23\16"+
		"\23\u0195\13\23\3\23\3\23\3\24\3\24\7\24\u019b\n\24\f\24\16\24\u019e\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u01a4\n\25\3\25\3\25\7\25\u01a8\n\25\f\25"+
		"\16\25\u01ab\13\25\3\25\5\25\u01ae\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01b9\n\26\3\27\3\27\5\27\u01bd\n\27\3\27\3\27\3"+
		"\27\3\27\7\27\u01c3\n\27\f\27\16\27\u01c6\13\27\3\27\3\27\5\27\u01ca\n"+
		"\27\3\27\3\27\5\27\u01ce\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u01d7\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u01e3"+
		"\n\34\f\34\16\34\u01e6\13\34\3\34\3\34\5\34\u01ea\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01f3\n\35\3\36\3\36\3\36\3\36\3\36\7\36\u01fa"+
		"\n\36\f\36\16\36\u01fd\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u0204\n\37"+
		"\f\37\16\37\u0207\13\37\3\37\3\37\3\37\3 \3 \5 \u020e\n \3 \3 \3 \3 \7"+
		" \u0214\n \f \16 \u0217\13 \3 \3 \5 \u021b\n \3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\7\"\u0225\n\"\f\"\16\"\u0228\13\"\3#\3#\3#\5#\u022d\n#\3$\3$\3$\7$"+
		"\u0232\n$\f$\16$\u0235\13$\3%\3%\5%\u0239\n%\3&\3&\3&\3&\7&\u023f\n&\f"+
		"&\16&\u0242\13&\3&\5&\u0245\n&\5&\u0247\n&\3&\3&\3\'\3\'\3(\3(\3(\7(\u0250"+
		"\n(\f(\16(\u0253\13(\3(\3(\3(\7(\u0258\n(\f(\16(\u025b\13(\5(\u025d\n"+
		"(\3)\3)\5)\u0261\n)\3)\3)\3)\5)\u0266\n)\7)\u0268\n)\f)\16)\u026b\13)"+
		"\3*\3*\3+\3+\3+\3+\7+\u0273\n+\f+\16+\u0276\13+\3+\3+\3,\3,\3,\3,\5,\u027e"+
		"\n,\5,\u0280\n,\3-\3-\3-\7-\u0285\n-\f-\16-\u0288\13-\3.\3.\5.\u028c\n"+
		".\3.\3.\3/\3/\3/\7/\u0293\n/\f/\16/\u0296\13/\3/\3/\5/\u029a\n/\3/\5/"+
		"\u029d\n/\3\60\7\60\u02a0\n\60\f\60\16\60\u02a3\13\60\3\60\3\60\3\60\3"+
		"\61\7\61\u02a9\n\61\f\61\16\61\u02ac\13\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\7\64\u02b9\n\64\f\64\16\64\u02bc\13\64\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u02c5\n\66\3\66\5\66\u02c8\n\66"+
		"\3\67\3\67\38\38\38\78\u02cf\n8\f8\168\u02d2\138\39\39\39\39\3:\3:\3:"+
		"\5:\u02db\n:\3;\3;\3;\3;\7;\u02e1\n;\f;\16;\u02e4\13;\5;\u02e6\n;\3;\5"+
		";\u02e9\n;\3;\3;\3<\3<\3<\3<\3<\3=\3=\7=\u02f4\n=\f=\16=\u02f7\13=\3="+
		"\3=\3>\7>\u02fc\n>\f>\16>\u02ff\13>\3>\3>\5>\u0303\n>\3?\3?\3?\3?\3?\3"+
		"?\5?\u030b\n?\3?\3?\5?\u030f\n?\3?\3?\5?\u0313\n?\3?\3?\5?\u0317\n?\5"+
		"?\u0319\n?\3@\3@\5@\u031d\n@\3A\3A\3A\3A\5A\u0323\nA\3B\3B\3C\3C\3C\3"+
		"D\3D\7D\u032c\nD\fD\16D\u032f\13D\3D\3D\3E\3E\3E\3E\3E\3E\5E\u0339\nE"+
		"\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\7I\u0346\nI\fI\16I\u0349\13I\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\5J\u036a\nJ\3J\3J\3J\5J\u036f\nJ\3J\5J\u0372\nJ\3K\3"+
		"K\3K\3K\3K\5K\u0379\nK\3K\3K\3K\3K\3K\3K\3K\5K\u0382\nK\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\6K\u0397\nK\rK\16K\u0398\3"+
		"K\5K\u039c\nK\3K\5K\u039f\nK\3K\3K\3K\3K\7K\u03a5\nK\fK\16K\u03a8\13K"+
		"\3K\5K\u03ab\nK\3K\3K\3K\3K\7K\u03b1\nK\fK\16K\u03b4\13K\3K\7K\u03b7\n"+
		"K\fK\16K\u03ba\13K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03c4\nK\3K\3K\3K\3K\3K"+
		"\3K\3K\5K\u03cd\nK\3K\3K\3K\5K\u03d2\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03e7\nK\3L\3L\3L\5L\u03ec\nL\3M\3M\3M"+
		"\3M\7M\u03f2\nM\fM\16M\u03f5\13M\3M\5M\u03f8\nM\3N\3N\3N\7N\u03fd\nN\f"+
		"N\16N\u0400\13N\3N\3N\3N\3N\3N\3O\3O\3O\7O\u040a\nO\fO\16O\u040d\13O\3"+
		"P\3P\3P\3Q\3Q\3Q\5Q\u0415\nQ\3Q\3Q\3R\3R\3R\7R\u041c\nR\fR\16R\u041f\13"+
		"R\3S\7S\u0422\nS\fS\16S\u0425\13S\3S\3S\3S\3S\3S\3T\6T\u042d\nT\rT\16"+
		"T\u042e\3T\6T\u0432\nT\rT\16T\u0433\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0440"+
		"\nU\3V\3V\5V\u0444\nV\3V\3V\5V\u0448\nV\3V\3V\5V\u044c\nV\5V\u044e\nV"+
		"\3W\3W\5W\u0452\nW\3X\7X\u0455\nX\fX\16X\u0458\13X\3X\3X\3X\3X\3X\3Y\3"+
		"Y\3Z\3Z\3Z\3Z\3[\3[\3[\7[\u0468\n[\f[\16[\u046b\13[\3\\\3\\\3]\3]\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u047e\n^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\5^\u048e\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\5^\u04b9\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\5^\u04cb\n^\3^\3^\3^\3^\3^\3^\7^\u04d3\n^\f^\16^\u04d6\13^\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u04eb\n_\5_"+
		"\u04ed\n_\3`\3`\3`\3`\3`\3`\3`\5`\u04f6\n`\5`\u04f8\n`\3a\3a\5a\u04fc"+
		"\na\3a\3a\3a\5a\u0501\na\7a\u0503\na\fa\16a\u0506\13a\3a\5a\u0509\na\3"+
		"b\3b\5b\u050d\nb\3b\3b\3c\3c\3c\3c\7c\u0515\nc\fc\16c\u0518\13c\3c\3c"+
		"\3c\3c\3c\3c\3c\7c\u0521\nc\fc\16c\u0524\13c\3c\3c\7c\u0528\nc\fc\16c"+
		"\u052b\13c\5c\u052d\nc\3d\3d\5d\u0531\nd\3e\3e\3e\3f\3f\3f\3f\3g\3g\3"+
		"g\5g\u053d\ng\3h\3h\3h\5h\u0542\nh\3i\3i\3i\3i\5i\u0548\ni\5i\u054a\n"+
		"i\3j\3j\3j\3j\5j\u0550\nj\3k\3k\5k\u0554\nk\3k\3k\3k\2\3\u00bal\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\2\17"+
		"\6\2\"\"..\62\62\65\65\6\2\5\5\26\26%\'*+\13\2\7\7\t\t\f\f\22\22\30\30"+
		"\37\37!!))\67\67\4\2\25\25,,\3\28=\3\2TW\3\2JK\4\2XY]]\3\2VW\4\2HIOP\4"+
		"\2NNQQ\4\2GG^h\3\2TU\2\u05d7\2\u00d7\3\2\2\2\4\u00ea\3\2\2\2\6\u00f1\3"+
		"\2\2\2\b\u0119\3\2\2\2\n\u011d\3\2\2\2\f\u0121\3\2\2\2\16\u0125\3\2\2"+
		"\2\20\u0127\3\2\2\2\22\u0136\3\2\2\2\24\u0141\3\2\2\2\26\u0146\3\2\2\2"+
		"\30\u014e\3\2\2\2\32\u0160\3\2\2\2\34\u016b\3\2\2\2\36\u0175\3\2\2\2 "+
		"\u017c\3\2\2\2\"\u0187\3\2\2\2$\u018f\3\2\2\2&\u0198\3\2\2\2(\u01ad\3"+
		"\2\2\2*\u01b8\3\2\2\2,\u01bc\3\2\2\2.\u01cf\3\2\2\2\60\u01d2\3\2\2\2\62"+
		"\u01da\3\2\2\2\64\u01dd\3\2\2\2\66\u01e9\3\2\2\28\u01f2\3\2\2\2:\u01f4"+
		"\3\2\2\2<\u0200\3\2\2\2>\u020d\3\2\2\2@\u021e\3\2\2\2B\u0221\3\2\2\2D"+
		"\u0229\3\2\2\2F\u022e\3\2\2\2H\u0238\3\2\2\2J\u023a\3\2\2\2L\u024a\3\2"+
		"\2\2N\u025c\3\2\2\2P\u025e\3\2\2\2R\u026c\3\2\2\2T\u026e\3\2\2\2V\u027f"+
		"\3\2\2\2X\u0281\3\2\2\2Z\u0289\3\2\2\2\\\u029c\3\2\2\2^\u02a1\3\2\2\2"+
		"`\u02aa\3\2\2\2b\u02b1\3\2\2\2d\u02b3\3\2\2\2f\u02b5\3\2\2\2h\u02bd\3"+
		"\2\2\2j\u02bf\3\2\2\2l\u02c9\3\2\2\2n\u02cb\3\2\2\2p\u02d3\3\2\2\2r\u02da"+
		"\3\2\2\2t\u02dc\3\2\2\2v\u02ec\3\2\2\2x\u02f1\3\2\2\2z\u0302\3\2\2\2|"+
		"\u0318\3\2\2\2~\u031c\3\2\2\2\u0080\u031e\3\2\2\2\u0082\u0324\3\2\2\2"+
		"\u0084\u0326\3\2\2\2\u0086\u0329\3\2\2\2\u0088\u0338\3\2\2\2\u008a\u033a"+
		"\3\2\2\2\u008c\u033d\3\2\2\2\u008e\u0340\3\2\2\2\u0090\u0347\3\2\2\2\u0092"+
		"\u0371\3\2\2\2\u0094\u03e6\3\2\2\2\u0096\u03eb\3\2\2\2\u0098\u03f7\3\2"+
		"\2\2\u009a\u03f9\3\2\2\2\u009c\u0406\3\2\2\2\u009e\u040e\3\2\2\2\u00a0"+
		"\u0411\3\2\2\2\u00a2\u0418\3\2\2\2\u00a4\u0423\3\2\2\2\u00a6\u042c\3\2"+
		"\2\2\u00a8\u043f\3\2\2\2\u00aa\u044d\3\2\2\2\u00ac\u0451\3\2\2\2\u00ae"+
		"\u0456\3\2\2\2\u00b0\u045e\3\2\2\2\u00b2\u0460\3\2\2\2\u00b4\u0464\3\2"+
		"\2\2\u00b6\u046c\3\2\2\2\u00b8\u046e\3\2\2\2\u00ba\u047d\3\2\2\2\u00bc"+
		"\u04ec\3\2\2\2\u00be\u04f7\3\2\2\2\u00c0\u0508\3\2\2\2\u00c2\u050a\3\2"+
		"\2\2\u00c4\u0510\3\2\2\2\u00c6\u052e\3\2\2\2\u00c8\u0532\3\2\2\2\u00ca"+
		"\u0535\3\2\2\2\u00cc\u053c\3\2\2\2\u00ce\u0541\3\2\2\2\u00d0\u0549\3\2"+
		"\2\2\u00d2\u054f\3\2\2\2\u00d4\u0551\3\2\2\2\u00d6\u00d8\5\4\3\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\5\6"+
		"\4\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e2\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\b"+
		"\5\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\2"+
		"\2\3\u00e6\3\3\2\2\2\u00e7\u00e9\5j\66\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00ee\u00ef\5f\64\2\u00ef\u00f0\7D\2"+
		"\2\u00f0\5\3\2\2\2\u00f1\u00f3\7\35\2\2\u00f2\u00f4\7*\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\5f\64\2\u00f6"+
		"\u00f7\7F\2\2\u00f7\u00f9\7X\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7D\2\2\u00fb\7\3\2\2\2\u00fc\u00fe"+
		"\5\f\7\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u011a\5\20"+
		"\t\2\u0103\u0105\5\f\7\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u011a\5\30\r\2\u010a\u010c\5\f\7\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u011a\5 \21\2\u0111\u0113\5\f\7\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011a\5v<\2\u0118\u011a"+
		"\7D\2\2\u0119\u00ff\3\2\2\2\u0119\u0106\3\2\2\2\u0119\u010d\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0118\3\2\2\2\u011a\t\3\2\2\2\u011b\u011e\5\f\7\2"+
		"\u011c\u011e\t\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\13"+
		"\3\2\2\2\u011f\u0122\5j\66\2\u0120\u0122\t\3\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\r\3\2\2\2\u0123\u0126\7\26\2\2\u0124\u0126\5j\66"+
		"\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\17\3\2\2\2\u0127\u0128"+
		"\7\r\2\2\u0128\u012a\7i\2\2\u0129\u012b\5\22\n\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012d\7\25\2\2\u012d\u012f\5"+
		"N(\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u0131\7\34\2\2\u0131\u0133\5\"\22\2\u0132\u0130\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5$\23\2\u0135\21\3\2\2\2\u0136"+
		"\u0137\7I\2\2\u0137\u013c\5\24\13\2\u0138\u0139\7E\2\2\u0139\u013b\5\24"+
		"\13\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7H"+
		"\2\2\u0140\23\3\2\2\2\u0141\u0144\7i\2\2\u0142\u0143\7\25\2\2\u0143\u0145"+
		"\5\26\f\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\25\3\2\2\2\u0146"+
		"\u014b\5N(\2\u0147\u0148\7Z\2\2\u0148\u014a\5N(\2\u0149\u0147\3\2\2\2"+
		"\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\27"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\24\2\2\u014f\u0152\7i\2\2\u0150"+
		"\u0151\7\34\2\2\u0151\u0153\5\"\22\2\u0152\u0150\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\7@\2\2\u0155\u0157\5\32\16\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u015a\7E"+
		"\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u015d\5\36\20\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015f\7A\2\2\u015f\31\3\2\2\2\u0160\u0165\5\34\17\2\u0161"+
		"\u0162\7E\2\2\u0162\u0164\5\34\17\2\u0163\u0161\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\33\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\5j\66\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0170\7i\2\2\u016f\u0171\5\u00d4k\2\u0170\u016f\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\5$\23\2\u0173"+
		"\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\35\3\2\2\2\u0175\u0179\7D\2\2"+
		"\u0176\u0178\5(\25\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\37\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7 \2\2\u017d\u017f\7i\2\2\u017e\u0180\5\22\n\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u0182\7\25\2\2\u0182"+
		"\u0184\5\"\22\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3"+
		"\2\2\2\u0185\u0186\5&\24\2\u0186!\3\2\2\2\u0187\u018c\5N(\2\u0188\u0189"+
		"\7E\2\2\u0189\u018b\5N(\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d#\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0193\7@\2\2\u0190\u0192\5(\25\2\u0191\u0190\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\7A\2\2\u0197%\3\2\2\2\u0198\u019c\7@\2\2\u0199"+
		"\u019b\5\66\34\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3"+
		"\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a0\7A\2\2\u01a0\'\3\2\2\2\u01a1\u01ae\7D\2\2\u01a2\u01a4\7*\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ae\5\u0086"+
		"D\2\u01a6\u01a8\5\n\6\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ac\u01ae\5*\26\2\u01ad\u01a1\3\2\2\2\u01ad\u01a3\3\2\2\2\u01ad"+
		"\u01a9\3\2\2\2\u01ae)\3\2\2\2\u01af\u01b9\5,\27\2\u01b0\u01b9\5.\30\2"+
		"\u01b1\u01b9\5\64\33\2\u01b2\u01b9\5\60\31\2\u01b3\u01b9\5\62\32\2\u01b4"+
		"\u01b9\5 \21\2\u01b5\u01b9\5v<\2\u01b6\u01b9\5\20\t\2\u01b7\u01b9\5\30"+
		"\r\2\u01b8\u01af\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8"+
		"\u01b2\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9+\3\2\2\2\u01ba\u01bd"+
		"\5N(\2\u01bb\u01bd\7\64\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\7i\2\2\u01bf\u01c4\5Z.\2\u01c0\u01c1\7B\2\2"+
		"\u01c1\u01c3\7C\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7\61\2\2\u01c8\u01ca\5X-\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01ce\5b\62\2\u01cc\u01ce\7D\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce-\3\2\2\2\u01cf\u01d0\5\22\n\2"+
		"\u01d0\u01d1\5,\27\2\u01d1/\3\2\2\2\u01d2\u01d3\7i\2\2\u01d3\u01d6\5Z"+
		".\2\u01d4\u01d5\7\61\2\2\u01d5\u01d7\5X-\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\5d\63\2\u01d9\61\3\2\2\2\u01da"+
		"\u01db\5\22\n\2\u01db\u01dc\5\60\31\2\u01dc\63\3\2\2\2\u01dd\u01de\5N"+
		"(\2\u01de\u01df\5B\"\2\u01df\u01e0\7D\2\2\u01e0\65\3\2\2\2\u01e1\u01e3"+
		"\5\n\6\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\58"+
		"\35\2\u01e8\u01ea\7D\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\67\3\2\2\2\u01eb\u01f3\5:\36\2\u01ec\u01f3\5> \2\u01ed\u01f3\5@!\2\u01ee"+
		"\u01f3\5 \21\2\u01ef\u01f3\5v<\2\u01f0\u01f3\5\20\t\2\u01f1\u01f3\5\30"+
		"\r\2\u01f2\u01eb\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2"+
		"\u01ee\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f39\3\2\2\2\u01f4\u01f5\7\16\2\2\u01f5\u01f6\5N(\2\u01f6\u01fb"+
		"\5<\37\2\u01f7\u01f8\7E\2\2\u01f8\u01fa\5<\37\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7D\2\2\u01ff;\3\2\2\2\u0200\u0205"+
		"\7i\2\2\u0201\u0202\7B\2\2\u0202\u0204\7C\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7G\2\2\u0209\u020a\5H%\2\u020a=\3"+
		"\2\2\2\u020b\u020e\5N(\2\u020c\u020e\7\64\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7i\2\2\u0210\u0215\5Z."+
		"\2\u0211\u0212\7B\2\2\u0212\u0214\7C\2\2\u0213\u0211\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021a\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u0219\7\61\2\2\u0219\u021b\5X-\2\u021a\u0218\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7D\2\2\u021d"+
		"?\3\2\2\2\u021e\u021f\5\22\n\2\u021f\u0220\5> \2\u0220A\3\2\2\2\u0221"+
		"\u0226\5D#\2\u0222\u0223\7E\2\2\u0223\u0225\5D#\2\u0224\u0222\3\2\2\2"+
		"\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227C\3"+
		"\2\2\2\u0228\u0226\3\2\2\2\u0229\u022c\5F$\2\u022a\u022b\7G\2\2\u022b"+
		"\u022d\5H%\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dE\3\2\2\2\u022e"+
		"\u0233\7i\2\2\u022f\u0230\7B\2\2\u0230\u0232\7C\2\2\u0231\u022f\3\2\2"+
		"\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234G"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0239\5J&\2\u0237\u0239\5\u00ba^\2"+
		"\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239I\3\2\2\2\u023a\u0246\7"+
		"@\2\2\u023b\u0240\5H%\2\u023c\u023d\7E\2\2\u023d\u023f\5H%\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\7E\2\2\u0244\u0243\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u023b\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7A\2\2\u0249K\3\2\2\2\u024a"+
		"\u024b\7i\2\2\u024bM\3\2\2\2\u024c\u0251\5P)\2\u024d\u024e\7B\2\2\u024e"+
		"\u0250\7C\2\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u025d\3\2\2\2\u0253\u0251\3\2\2\2\u0254"+
		"\u0259\5R*\2\u0255\u0256\7B\2\2\u0256\u0258\7C\2\2\u0257\u0255\3\2\2\2"+
		"\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u024c\3\2\2\2\u025c\u0254\3\2\2\2\u025d"+
		"O\3\2\2\2\u025e\u0260\7i\2\2\u025f\u0261\5T+\2\u0260\u025f\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0269\3\2\2\2\u0262\u0263\7F\2\2\u0263\u0265\7i\2"+
		"\2\u0264\u0266\5T+\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268"+
		"\3\2\2\2\u0267\u0262\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026aQ\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\t\4\2\2"+
		"\u026dS\3\2\2\2\u026e\u026f\7I\2\2\u026f\u0274\5V,\2\u0270\u0271\7E\2"+
		"\2\u0271\u0273\5V,\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"\u0278\7H\2\2\u0278U\3\2\2\2\u0279\u0280\5N(\2\u027a\u027d\7L\2\2\u027b"+
		"\u027c\t\5\2\2\u027c\u027e\5N(\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2"+
		"\2\u027e\u0280\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u027a\3\2\2\2\u0280W"+
		"\3\2\2\2\u0281\u0286\5f\64\2\u0282\u0283\7E\2\2\u0283\u0285\5f\64\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287Y\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028b\7>\2\2\u028a\u028c"+
		"\5\\/\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028e\7?\2\2\u028e[\3\2\2\2\u028f\u0294\5^\60\2\u0290\u0291\7E\2\2\u0291"+
		"\u0293\5^\60\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0294\u0295\3\2\2\2\u0295\u0299\3\2\2\2\u0296\u0294\3\2\2\2\u0297"+
		"\u0298\7E\2\2\u0298\u029a\5`\61\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u029d\3\2\2\2\u029b\u029d\5`\61\2\u029c\u028f\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d]\3\2\2\2\u029e\u02a0\5\16\b\2\u029f\u029e\3\2\2\2"+
		"\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4"+
		"\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5\5N(\2\u02a5\u02a6\5F$\2\u02a6"+
		"_\3\2\2\2\u02a7\u02a9\5\16\b\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2"+
		"\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa"+
		"\3\2\2\2\u02ad\u02ae\5N(\2\u02ae\u02af\7k\2\2\u02af\u02b0\5F$\2\u02b0"+
		"a\3\2\2\2\u02b1\u02b2\5\u0086D\2\u02b2c\3\2\2\2\u02b3\u02b4\5\u0086D\2"+
		"\u02b4e\3\2\2\2\u02b5\u02ba\7i\2\2\u02b6\u02b7\7F\2\2\u02b7\u02b9\7i\2"+
		"\2\u02b8\u02b6\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bbg\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\t\6\2\2\u02be"+
		"i\3\2\2\2\u02bf\u02c0\7j\2\2\u02c0\u02c7\5l\67\2\u02c1\u02c4\7>\2\2\u02c2"+
		"\u02c5\5n8\2\u02c3\u02c5\5r:\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2"+
		"\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\7?\2\2\u02c7\u02c1"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8k\3\2\2\2\u02c9\u02ca\5f\64\2\u02ca"+
		"m\3\2\2\2\u02cb\u02d0\5p9\2\u02cc\u02cd\7E\2\2\u02cd\u02cf\5p9\2\u02ce"+
		"\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2"+
		"\2\2\u02d1o\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7i\2\2\u02d4\u02d5"+
		"\7G\2\2\u02d5\u02d6\5r:\2\u02d6q\3\2\2\2\u02d7\u02db\5\u00ba^\2\u02d8"+
		"\u02db\5j\66\2\u02d9\u02db\5t;\2\u02da\u02d7\3\2\2\2\u02da\u02d8\3\2\2"+
		"\2\u02da\u02d9\3\2\2\2\u02dbs\3\2\2\2\u02dc\u02e5\7@\2\2\u02dd\u02e2\5"+
		"r:\2\u02de\u02df\7E\2\2\u02df\u02e1\5r:\2\u02e0\u02de\3\2\2\2\u02e1\u02e4"+
		"\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02dd\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2"+
		"\2\2\u02e7\u02e9\7E\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\7A\2\2\u02ebu\3\2\2\2\u02ec\u02ed\7j\2\2\u02ed"+
		"\u02ee\7 \2\2\u02ee\u02ef\7i\2\2\u02ef\u02f0\5x=\2\u02f0w\3\2\2\2\u02f1"+
		"\u02f5\7@\2\2\u02f2\u02f4\5z>\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2"+
		"\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02f9\7A\2\2\u02f9y\3\2\2\2\u02fa\u02fc\5\n\6\2\u02fb\u02fa"+
		"\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0303\5|?\2\u0301\u0303\7D\2"+
		"\2\u0302\u02fd\3\2\2\2\u0302\u0301\3\2\2\2\u0303{\3\2\2\2\u0304\u0305"+
		"\5N(\2\u0305\u0306\5~@\2\u0306\u0307\7D\2\2\u0307\u0319\3\2\2\2\u0308"+
		"\u030a\5\20\t\2\u0309\u030b\7D\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u0319\3\2\2\2\u030c\u030e\5 \21\2\u030d\u030f\7D\2\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0319\3\2\2\2\u0310\u0312\5\30"+
		"\r\2\u0311\u0313\7D\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0319\3\2\2\2\u0314\u0316\5v<\2\u0315\u0317\7D\2\2\u0316\u0315\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0304\3\2\2\2\u0318\u0308"+
		"\3\2\2\2\u0318\u030c\3\2\2\2\u0318\u0310\3\2\2\2\u0318\u0314\3\2\2\2\u0319"+
		"}\3\2\2\2\u031a\u031d\5\u0080A\2\u031b\u031d\5\u0082B\2\u031c\u031a\3"+
		"\2\2\2\u031c\u031b\3\2\2\2\u031d\177\3\2\2\2\u031e\u031f\7i\2\2\u031f"+
		"\u0320\7>\2\2\u0320\u0322\7?\2\2\u0321\u0323\5\u0084C\2\u0322\u0321\3"+
		"\2\2\2\u0322\u0323\3\2\2\2\u0323\u0081\3\2\2\2\u0324\u0325\5B\"\2\u0325"+
		"\u0083\3\2\2\2\u0326\u0327\7\20\2\2\u0327\u0328\5r:\2\u0328\u0085\3\2"+
		"\2\2\u0329\u032d\7@\2\2\u032a\u032c\5\u0088E\2\u032b\u032a\3\2\2\2\u032c"+
		"\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7A\2\2\u0331\u0087\3\2\2\2\u0332"+
		"\u0339\5:\36\2\u0333\u0339\5\u008cG\2\u0334\u0339\5\u008aF\2\u0335\u0339"+
		"\5\u0094K\2\u0336\u0339\5\u0092J\2\u0337\u0339\5\b\5\2\u0338\u0332\3\2"+
		"\2\2\u0338\u0333\3\2\2\2\u0338\u0334\3\2\2\2\u0338\u0335\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u0089\3\2\2\2\u033a\u033b\5\u008e"+
		"H\2\u033b\u033c\7D\2\2\u033c\u008b\3\2\2\2\u033d\u033e\5\u0090I\2\u033e"+
		"\u033f\7D\2\2\u033f\u008d\3\2\2\2\u0340\u0341\5F$\2\u0341\u0342\7G\2\2"+
		"\u0342\u0343\5H%\2\u0343\u008f\3\2\2\2\u0344\u0346\5\16\b\2\u0345\u0344"+
		"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\5N(\2\u034b\u034c\5B\""+
		"\2\u034c\u0091\3\2\2\2\u034d\u034e\7>\2\2\u034e\u034f\5\u00ba^\2\u034f"+
		"\u0350\7?\2\2\u0350\u0351\7?\2\2\u0351\u0352\bJ\1\2\u0352\u0372\3\2\2"+
		"\2\u0353\u0354\7>\2\2\u0354\u0355\5\u00ba^\2\u0355\u0356\bJ\1\2\u0356"+
		"\u0372\3\2\2\2\u0357\u0358\7>\2\2\u0358\u0359\7>\2\2\u0359\u035a\5\u00ba"+
		"^\2\u035a\u035b\7?\2\2\u035b\u035c\bJ\1\2\u035c\u0372\3\2\2\2\u035d\u035e"+
		"\5\u00ba^\2\u035e\u035f\7?\2\2\u035f\u0360\bJ\1\2\u0360\u0372\3\2\2\2"+
		"\u0361\u0362\7\21\2\2\u0362\u0363\5\u0094K\2\u0363\u0364\7\66\2\2\u0364"+
		"\u0365\5\u00b2Z\2\u0365\u0366\bJ\1\2\u0366\u0372\3\2\2\2\u0367\u0369\7"+
		"(\2\2\u0368\u036a\5\u00ba^\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u0372\bJ\1\2\u036c\u036e\7\b\2\2\u036d\u036f\7i\2"+
		"\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372"+
		"\bJ\1\2\u0371\u034d\3\2\2\2\u0371\u0353\3\2\2\2\u0371\u0357\3\2\2\2\u0371"+
		"\u035d\3\2\2\2\u0371\u0361\3\2\2\2\u0371\u0367\3\2\2\2\u0371\u036c\3\2"+
		"\2\2\u0372\u0093\3\2\2\2\u0373\u03e7\5\u0086D\2\u0374\u0375\7\6\2\2\u0375"+
		"\u0378\5\u00ba^\2\u0376\u0377\7M\2\2\u0377\u0379\5\u00ba^\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7D\2\2\u037b"+
		"\u03e7\3\2\2\2\u037c\u037d\7\32\2\2\u037d\u037e\5\u00b2Z\2\u037e\u0381"+
		"\5\u0094K\2\u037f\u0380\7\23\2\2\u0380\u0382\5\u0094K\2\u0381\u037f\3"+
		"\2\2\2\u0381\u0382\3\2\2\2\u0382\u03e7\3\2\2\2\u0383\u0384\7\31\2\2\u0384"+
		"\u0385\7>\2\2\u0385\u0386\5\u00aaV\2\u0386\u0387\7?\2\2\u0387\u0388\5"+
		"\u0094K\2\u0388\u03e7\3\2\2\2\u0389\u038a\7\66\2\2\u038a\u038b\5\u00b2"+
		"Z\2\u038b\u038c\5\u0094K\2\u038c\u03e7\3\2\2\2\u038d\u038e\7\21\2\2\u038e"+
		"\u038f\5\u0094K\2\u038f\u0390\7\66\2\2\u0390\u0391\5\u00b2Z\2\u0391\u0392"+
		"\7D\2\2\u0392\u03e7\3\2\2\2\u0393\u0394\7\63\2\2\u0394\u039e\5\u0086D"+
		"\2\u0395\u0397\5\u009aN\2\u0396\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u039c\5\u009e"+
		"P\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039f\5\u009eP\2\u039e\u0396\3\2\2\2\u039e\u039d\3\2\2\2\u039f\u03e7"+
		"\3\2\2\2\u03a0\u03a1\7\63\2\2\u03a1\u03a2\5\u00a0Q\2\u03a2\u03a6\5\u0086"+
		"D\2\u03a3\u03a5\5\u009aN\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2"+
		"\2\2\u03a9\u03ab\5\u009eP\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03e7\3\2\2\2\u03ac\u03ad\7-\2\2\u03ad\u03ae\5\u00b2Z\2\u03ae\u03b2\7"+
		"@\2\2\u03af\u03b1\5\u00a6T\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b8\3\2\2\2\u03b4\u03b2\3\2"+
		"\2\2\u03b5\u03b7\5\u00a8U\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03bc\7A\2\2\u03bc\u03e7\3\2\2\2\u03bd\u03be\7.\2\2\u03be\u03bf"+
		"\5\u00b2Z\2\u03bf\u03c0\5\u0086D\2\u03c0\u03e7\3\2\2\2\u03c1\u03c3\7("+
		"\2\2\u03c2\u03c4\5\u00ba^\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03e7\7D\2\2\u03c6\u03c7\7\60\2\2\u03c7\u03c8\5\u00ba"+
		"^\2\u03c8\u03c9\7D\2\2\u03c9\u03e7\3\2\2\2\u03ca\u03cc\7\b\2\2\u03cb\u03cd"+
		"\7i\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03e7\7D\2\2\u03cf\u03d1\7\17\2\2\u03d0\u03d2\7i\2\2\u03d1\u03d0\3\2"+
		"\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03e7\7D\2\2\u03d4"+
		"\u03d5\7\3\2\2\u03d5\u03d6\7>\2\2\u03d6\u03d7\5\u0098M\2\u03d7\u03d8\7"+
		"?\2\2\u03d8\u03d9\7D\2\2\u03d9\u03e7\3\2\2\2\u03da\u03db\7\4\2\2\u03db"+
		"\u03dc\7>\2\2\u03dc\u03dd\7i\2\2\u03dd\u03de\7?\2\2\u03de\u03e7\7D\2\2"+
		"\u03df\u03e7\7D\2\2\u03e0\u03e1\5\u00b6\\\2\u03e1\u03e2\7D\2\2\u03e2\u03e7"+
		"\3\2\2\2\u03e3\u03e4\7i\2\2\u03e4\u03e5\7M\2\2\u03e5\u03e7\5\u0094K\2"+
		"\u03e6\u0373\3\2\2\2\u03e6\u0374\3\2\2\2\u03e6\u037c\3\2\2\2\u03e6\u0383"+
		"\3\2\2\2\u03e6\u0389\3\2\2\2\u03e6\u038d\3\2\2\2\u03e6\u0393\3\2\2\2\u03e6"+
		"\u03a0\3\2\2\2\u03e6\u03ac\3\2\2\2\u03e6\u03bd\3\2\2\2\u03e6\u03c1\3\2"+
		"\2\2\u03e6\u03c6\3\2\2\2\u03e6\u03ca\3\2\2\2\u03e6\u03cf\3\2\2\2\u03e6"+
		"\u03d4\3\2\2\2\u03e6\u03da\3\2\2\2\u03e6\u03df\3\2\2\2\u03e6\u03e0\3\2"+
		"\2\2\u03e6\u03e3\3\2\2\2\u03e7\u0095\3\2\2\2\u03e8\u03ec\3\2\2\2\u03e9"+
		"\u03ec\7i\2\2\u03ea\u03ec\7<\2\2\u03eb\u03e8\3\2\2\2\u03eb\u03e9\3\2\2"+
		"\2\u03eb\u03ea\3\2\2\2\u03ec\u0097\3\2\2\2\u03ed\u03f8\3\2\2\2\u03ee\u03f3"+
		"\5\u0096L\2\u03ef\u03f0\7V\2\2\u03f0\u03f2\5\u0096L\2\u03f1\u03ef\3\2"+
		"\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f8\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03ed\3\2"+
		"\2\2\u03f7\u03ee\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8\u0099\3\2\2\2\u03f9"+
		"\u03fa\7\13\2\2\u03fa\u03fe\7>\2\2\u03fb\u03fd\5\16\b\2\u03fc\u03fb\3"+
		"\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0401\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\5\u009cO\2\u0402\u0403"+
		"\7i\2\2\u0403\u0404\7?\2\2\u0404\u0405\5\u0086D\2\u0405\u009b\3\2\2\2"+
		"\u0406\u040b\5f\64\2\u0407\u0408\7[\2\2\u0408\u040a\5f\64\2\u0409\u0407"+
		"\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u009d\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\7\27\2\2\u040f\u0410\5"+
		"\u0086D\2\u0410\u009f\3\2\2\2\u0411\u0412\7>\2\2\u0412\u0414\5\u00a2R"+
		"\2\u0413\u0415\7D\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416"+
		"\3\2\2\2\u0416\u0417\7?\2\2\u0417\u00a1\3\2\2\2\u0418\u041d\5\u00a4S\2"+
		"\u0419\u041a\7D\2\2\u041a\u041c\5\u00a4S\2\u041b\u0419\3\2\2\2\u041c\u041f"+
		"\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u00a3\3\2\2\2\u041f"+
		"\u041d\3\2\2\2\u0420\u0422\5\16\b\2\u0421\u0420\3\2\2\2\u0422\u0425\3"+
		"\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0426\u0427\5P)\2\u0427\u0428\5F$\2\u0428\u0429\7G\2\2"+
		"\u0429\u042a\5\u00ba^\2\u042a\u00a5\3\2\2\2\u042b\u042d\5\u00a8U\2\u042c"+
		"\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0431\3\2\2\2\u0430\u0432\5\u0088E\2\u0431\u0430\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u00a7\3\2"+
		"\2\2\u0435\u0436\7\n\2\2\u0436\u0437\5\u00b8]\2\u0437\u0438\7M\2\2\u0438"+
		"\u0440\3\2\2\2\u0439\u043a\7\n\2\2\u043a\u043b\5L\'\2\u043b\u043c\7M\2"+
		"\2\u043c\u0440\3\2\2\2\u043d\u043e\7\20\2\2\u043e\u0440\7M\2\2\u043f\u0435"+
		"\3\2\2\2\u043f\u0439\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u00a9\3\2\2\2\u0441"+
		"\u044e\5\u00aeX\2\u0442\u0444\5\u00acW\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\7D\2\2\u0446\u0448\5\u00ba^\2"+
		"\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b"+
		"\7D\2\2\u044a\u044c\5\u00b0Y\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2"+
		"\u044c\u044e\3\2\2\2\u044d\u0441\3\2\2\2\u044d\u0443\3\2\2\2\u044e\u00ab"+
		"\3\2\2\2\u044f\u0452\5\u0090I\2\u0450\u0452\5\u00b4[\2\u0451\u044f\3\2"+
		"\2\2\u0451\u0450\3\2\2\2\u0452\u00ad\3\2\2\2\u0453\u0455\5\16\b\2\u0454"+
		"\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2"+
		"\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\5N(\2\u045a\u045b"+
		"\5F$\2\u045b\u045c\7M\2\2\u045c\u045d\5\u00ba^\2\u045d\u00af\3\2\2\2\u045e"+
		"\u045f\5\u00b4[\2\u045f\u00b1\3\2\2\2\u0460\u0461\7>\2\2\u0461\u0462\5"+
		"\u00ba^\2\u0462\u0463\7?\2\2\u0463\u00b3\3\2\2\2\u0464\u0469\5\u00ba^"+
		"\2\u0465\u0466\7E\2\2\u0466\u0468\5\u00ba^\2\u0467\u0465\3\2\2\2\u0468"+
		"\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u00b5\3\2"+
		"\2\2\u046b\u0469\3\2\2\2\u046c\u046d\5\u00ba^\2\u046d\u00b7\3\2\2\2\u046e"+
		"\u046f\5\u00ba^\2\u046f\u00b9\3\2\2\2\u0470\u0471\b^\1\2\u0471\u047e\5"+
		"\u00bc_\2\u0472\u0473\7#\2\2\u0473\u047e\5\u00be`\2\u0474\u0475\7>\2\2"+
		"\u0475\u0476\5N(\2\u0476\u0477\7?\2\2\u0477\u0478\5\u00ba^\23\u0478\u047e"+
		"\3\2\2\2\u0479\u047a\t\7\2\2\u047a\u047e\5\u00ba^\21\u047b\u047c\t\b\2"+
		"\2\u047c\u047e\5\u00ba^\20\u047d\u0470\3\2\2\2\u047d\u0472\3\2\2\2\u047d"+
		"\u0474\3\2\2\2\u047d\u0479\3\2\2\2\u047d\u047b\3\2\2\2\u047e\u04d4\3\2"+
		"\2\2\u047f\u0480\f\17\2\2\u0480\u0481\t\t\2\2\u0481\u04d3\5\u00ba^\20"+
		"\u0482\u0483\f\16\2\2\u0483\u0484\t\n\2\2\u0484\u04d3\5\u00ba^\17\u0485"+
		"\u048d\f\r\2\2\u0486\u0487\7I\2\2\u0487\u048e\7I\2\2\u0488\u0489\7H\2"+
		"\2\u0489\u048a\7H\2\2\u048a\u048e\7H\2\2\u048b\u048c\7H\2\2\u048c\u048e"+
		"\7H\2\2\u048d\u0486\3\2\2\2\u048d\u0488\3\2\2\2\u048d\u048b\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u04d3\5\u00ba^\16\u0490\u0491\f\f\2\2\u0491\u0492"+
		"\t\13\2\2\u0492\u04d3\5\u00ba^\r\u0493\u0494\f\n\2\2\u0494\u0495\t\f\2"+
		"\2\u0495\u04d3\5\u00ba^\13\u0496\u0497\f\t\2\2\u0497\u0498\7Z\2\2\u0498"+
		"\u04d3\5\u00ba^\n\u0499\u049a\f\b\2\2\u049a\u049b\7\\\2\2\u049b\u04d3"+
		"\5\u00ba^\t\u049c\u049d\f\7\2\2\u049d\u049e\7[\2\2\u049e\u04d3\5\u00ba"+
		"^\b\u049f\u04a0\f\6\2\2\u04a0\u04a1\7R\2\2\u04a1\u04d3\5\u00ba^\7\u04a2"+
		"\u04a3\f\5\2\2\u04a3\u04a4\7S\2\2\u04a4\u04d3\5\u00ba^\6\u04a5\u04a6\f"+
		"\4\2\2\u04a6\u04a7\7L\2\2\u04a7\u04a8\5\u00ba^\2\u04a8\u04a9\7M\2\2\u04a9"+
		"\u04aa\5\u00ba^\5\u04aa\u04d3\3\2\2\2\u04ab\u04ac\f\3\2\2\u04ac\u04ad"+
		"\t\r\2\2\u04ad\u04d3\5\u00ba^\3\u04ae\u04af\f\33\2\2\u04af\u04b0\7F\2"+
		"\2\u04b0\u04d3\7i\2\2\u04b1\u04b2\f\32\2\2\u04b2\u04b3\7F\2\2\u04b3\u04d3"+
		"\7/\2\2\u04b4\u04b5\f\31\2\2\u04b5\u04b6\7F\2\2\u04b6\u04b8\7#\2\2\u04b7"+
		"\u04b9\5\u00caf\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba"+
		"\3\2\2\2\u04ba\u04d3\5\u00c2b\2\u04bb\u04bc\f\30\2\2\u04bc\u04bd\7F\2"+
		"\2\u04bd\u04be\7,\2\2\u04be\u04d3\5\u00d0i\2\u04bf\u04c0\f\27\2\2\u04c0"+
		"\u04c1\7F\2\2\u04c1\u04d3\5\u00c8e\2\u04c2\u04c3\f\26\2\2\u04c3\u04c4"+
		"\7B\2\2\u04c4\u04c5\5\u00ba^\2\u04c5\u04c6\7C\2\2\u04c6\u04d3\3\2\2\2"+
		"\u04c7\u04c8\f\25\2\2\u04c8\u04ca\7>\2\2\u04c9\u04cb\5\u00b4[\2\u04ca"+
		"\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04d3\7?"+
		"\2\2\u04cd\u04ce\f\22\2\2\u04ce\u04d3\t\16\2\2\u04cf\u04d0\f\13\2\2\u04d0"+
		"\u04d1\7\36\2\2\u04d1\u04d3\5N(\2\u04d2\u047f\3\2\2\2\u04d2\u0482\3\2"+
		"\2\2\u04d2\u0485\3\2\2\2\u04d2\u0490\3\2\2\2\u04d2\u0493\3\2\2\2\u04d2"+
		"\u0496\3\2\2\2\u04d2\u0499\3\2\2\2\u04d2\u049c\3\2\2\2\u04d2\u049f\3\2"+
		"\2\2\u04d2\u04a2\3\2\2\2\u04d2\u04a5\3\2\2\2\u04d2\u04ab\3\2\2\2\u04d2"+
		"\u04ae\3\2\2\2\u04d2\u04b1\3\2\2\2\u04d2\u04b4\3\2\2\2\u04d2\u04bb\3\2"+
		"\2\2\u04d2\u04bf\3\2\2\2\u04d2\u04c2\3\2\2\2\u04d2\u04c7\3\2\2\2\u04d2"+
		"\u04cd\3\2\2\2\u04d2\u04cf\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2"+
		"\2\2\u04d4\u04d5\3\2\2\2\u04d5\u00bb\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7"+
		"\u04d8\7>\2\2\u04d8\u04d9\5\u00ba^\2\u04d9\u04da\7?\2\2\u04da\u04ed\3"+
		"\2\2\2\u04db\u04ed\7/\2\2\u04dc\u04ed\7,\2\2\u04dd\u04ed\5h\65\2\u04de"+
		"\u04ed\7i\2\2\u04df\u04e0\5N(\2\u04e0\u04e1\7F\2\2\u04e1\u04e2\7\r\2\2"+
		"\u04e2\u04ed\3\2\2\2\u04e3\u04e4\7\64\2\2\u04e4\u04e5\7F\2\2\u04e5\u04ed"+
		"\7\r\2\2\u04e6\u04ea\5\u00caf\2\u04e7\u04eb\5\u00d2j\2\u04e8\u04e9\7/"+
		"\2\2\u04e9\u04eb\5\u00d4k\2\u04ea\u04e7\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ed\3\2\2\2\u04ec\u04d7\3\2\2\2\u04ec\u04db\3\2\2\2\u04ec\u04dc\3\2"+
		"\2\2\u04ec\u04dd\3\2\2\2\u04ec\u04de\3\2\2\2\u04ec\u04df\3\2\2\2\u04ec"+
		"\u04e3\3\2\2\2\u04ec\u04e6\3\2\2\2\u04ed\u00bd\3\2\2\2\u04ee\u04ef\5\u00ca"+
		"f\2\u04ef\u04f0\5\u00c0a\2\u04f0\u04f1\5\u00c6d\2\u04f1\u04f8\3\2\2\2"+
		"\u04f2\u04f5\5\u00c0a\2\u04f3\u04f6\5\u00c4c\2\u04f4\u04f6\5\u00c6d\2"+
		"\u04f5\u04f3\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04ee"+
		"\3\2\2\2\u04f7\u04f2\3\2\2\2\u04f8\u00bf\3\2\2\2\u04f9\u04fb\7i\2\2\u04fa"+
		"\u04fc\5\u00ccg\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u0504"+
		"\3\2\2\2\u04fd\u04fe\7F\2\2\u04fe\u0500\7i\2\2\u04ff\u0501\5\u00ccg\2"+
		"\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u04fd"+
		"\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0509\3\2\2\2\u0506\u0504\3\2\2\2\u0507\u0509\5R*\2\u0508\u04f9\3\2\2"+
		"\2\u0508\u0507\3\2\2\2\u0509\u00c1\3\2\2\2\u050a\u050c\7i\2\2\u050b\u050d"+
		"\5\u00ceh\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2"+
		"\2\u050e\u050f\5\u00c6d\2\u050f\u00c3\3\2\2\2\u0510\u052c\7B\2\2\u0511"+
		"\u0516\7C\2\2\u0512\u0513\7B\2\2\u0513\u0515\7C\2\2\u0514\u0512\3\2\2"+
		"\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519"+
		"\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u052d\5J&\2\u051a\u051b\5\u00ba^\2"+
		"\u051b\u0522\7C\2\2\u051c\u051d\7B\2\2\u051d\u051e\5\u00ba^\2\u051e\u051f"+
		"\7C\2\2\u051f\u0521\3\2\2\2\u0520\u051c\3\2\2\2\u0521\u0524\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0529\3\2\2\2\u0524\u0522\3\2"+
		"\2\2\u0525\u0526\7B\2\2\u0526\u0528\7C\2\2\u0527\u0525\3\2\2\2\u0528\u052b"+
		"\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052d\3\2\2\2\u052b"+
		"\u0529\3\2\2\2\u052c\u0511\3\2\2\2\u052c\u051a\3\2\2\2\u052d\u00c5\3\2"+
		"\2\2\u052e\u0530\5\u00d4k\2\u052f\u0531\5$\23\2\u0530\u052f\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u00c7\3\2\2\2\u0532\u0533\5\u00caf\2\u0533\u0534"+
		"\5\u00d2j\2\u0534\u00c9\3\2\2\2\u0535\u0536\7I\2\2\u0536\u0537\5\"\22"+
		"\2\u0537\u0538\7H\2\2\u0538\u00cb\3\2\2\2\u0539\u053a\7I\2\2\u053a\u053d"+
		"\7H\2\2\u053b\u053d\5T+\2\u053c\u0539\3\2\2\2\u053c\u053b\3\2\2\2\u053d"+
		"\u00cd\3\2\2\2\u053e\u053f\7I\2\2\u053f\u0542\7H\2\2\u0540\u0542\5\u00ca"+
		"f\2\u0541\u053e\3\2\2\2\u0541\u0540\3\2\2\2\u0542\u00cf\3\2\2\2\u0543"+
		"\u054a\5\u00d4k\2\u0544\u0545\7F\2\2\u0545\u0547\7i\2\2\u0546\u0548\5"+
		"\u00d4k\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2"+
		"\u0549\u0543\3\2\2\2\u0549\u0544\3\2\2\2\u054a\u00d1\3\2\2\2\u054b\u054c"+
		"\7,\2\2\u054c\u0550\5\u00d0i\2\u054d\u054e\7i\2\2\u054e\u0550\5\u00d4"+
		"k\2\u054f\u054b\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u00d3\3\2\2\2\u0551"+
		"\u0553\7>\2\2\u0552\u0554\5\u00b4[\2\u0553\u0552\3\2\2\2\u0553\u0554\3"+
		"\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\7?\2\2\u0556\u00d5\3\2\2\2\u009d"+
		"\u00d7\u00dc\u00e2\u00ea\u00f3\u00f8\u00ff\u0106\u010d\u0114\u0119\u011d"+
		"\u0121\u0125\u012a\u012e\u0132\u013c\u0144\u014b\u0152\u0156\u0159\u015c"+
		"\u0165\u016b\u0170\u0173\u0179\u017f\u0183\u018c\u0193\u019c\u01a3\u01a9"+
		"\u01ad\u01b8\u01bc\u01c4\u01c9\u01cd\u01d6\u01e4\u01e9\u01f2\u01fb\u0205"+
		"\u020d\u0215\u021a\u0226\u022c\u0233\u0238\u0240\u0244\u0246\u0251\u0259"+
		"\u025c\u0260\u0265\u0269\u0274\u027d\u027f\u0286\u028b\u0294\u0299\u029c"+
		"\u02a1\u02aa\u02ba\u02c4\u02c7\u02d0\u02da\u02e2\u02e5\u02e8\u02f5\u02fd"+
		"\u0302\u030a\u030e\u0312\u0316\u0318\u031c\u0322\u032d\u0338\u0347\u0369"+
		"\u036e\u0371\u0378\u0381\u0398\u039b\u039e\u03a6\u03aa\u03b2\u03b8\u03c3"+
		"\u03cc\u03d1\u03e6\u03eb\u03f3\u03f7\u03fe\u040b\u0414\u041d\u0423\u042e"+
		"\u0433\u043f\u0443\u0447\u044b\u044d\u0451\u0456\u0469\u047d\u048d\u04b8"+
		"\u04ca\u04d2\u04d4\u04ea\u04ec\u04f5\u04f7\u04fb\u0500\u0504\u0508\u050c"+
		"\u0516\u0522\u0529\u052c\u0530\u053c\u0541\u0547\u0549\u054f\u0553";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}