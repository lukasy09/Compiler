// Generated from C:/Users/JA/Desktop/Compiler/gramma\JavaDog.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaDogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, FUNCTION=2, IF=3, ELSE=4, WHILE=5, INTEGER=6, RETURN=7, REAL=8, 
		VAR=9, STRING=10, COMMENT_SIGN=11, BEGIN_MARKUP=12, END_MARKUP=13, ASSIGN=14, 
		COMMA=15, EQUAL=16, LESS_THAN=17, MORE_THAN=18, PLUS=19, MINUS=20, STAR=21, 
		SLASH=22, SEMICOLON=23, LPAREN=24, RPAREN=25, LCURL=26, RCURL=27, DOT=28, 
		REGEX_ID=29, INT_REGEX=30, REAL_REGEX=31, STRING_REGEX=32, REGEX_WS=33, 
		REGEX_COMMENT=34, WS=35;
	public static final int
		RULE_identifier = 0, RULE_string = 1, RULE_unsignedNumber = 2, RULE_unsignedInteger = 3, 
		RULE_unsignedReal = 4, RULE_root = 5, RULE_body = 6, RULE_comment = 7, 
		RULE_functionBody = 8, RULE_declaration = 9, RULE_varDeclaration = 10, 
		RULE_functionDefinition = 11, RULE_parameters = 12, RULE_singleParameter = 13, 
		RULE_statement = 14, RULE_assignmentStatement = 15, RULE_instruction = 16, 
		RULE_ifStatement = 17, RULE_whileLoop = 18, RULE_returnStatement = 19, 
		RULE_boolValue = 20, RULE_expression = 21, RULE_expressionOperand = 22, 
		RULE_functionCall = 23, RULE_arguments = 24, RULE_singleArgument = 25, 
		RULE_value = 26, RULE_operator = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "string", "unsignedNumber", "unsignedInteger", "unsignedReal", 
			"root", "body", "comment", "functionBody", "declaration", "varDeclaration", 
			"functionDefinition", "parameters", "singleParameter", "statement", "assignmentStatement", 
			"instruction", "ifStatement", "whileLoop", "returnStatement", "boolValue", 
			"expression", "expressionOperand", "functionCall", "arguments", "singleArgument", 
			"value", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'func'", "'if'", "'else'", "'while'", "'Integer'", "'return'", 
			"'Real'", "'claim'", "'String'", "'#'", "'<?JD'", "'?JD>'", "'='", "','", 
			"'=='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "';'", "'('", "')'", 
			"'{'", "'}'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "FUNCTION", "IF", "ELSE", "WHILE", "INTEGER", "RETURN", 
			"REAL", "VAR", "STRING", "COMMENT_SIGN", "BEGIN_MARKUP", "END_MARKUP", 
			"ASSIGN", "COMMA", "EQUAL", "LESS_THAN", "MORE_THAN", "PLUS", "MINUS", 
			"STAR", "SLASH", "SEMICOLON", "LPAREN", "RPAREN", "LCURL", "RCURL", "DOT", 
			"REGEX_ID", "INT_REGEX", "REAL_REGEX", "STRING_REGEX", "REGEX_WS", "REGEX_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "JavaDog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaDogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode REGEX_ID() { return getToken(JavaDogParser.REGEX_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(REGEX_ID);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_REGEX() { return getToken(JavaDogParser.STRING_REGEX, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STRING_REGEX);
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unsignedNumber);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_REGEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				unsignedInteger();
				}
				break;
			case REAL_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode INT_REGEX() { return getToken(JavaDogParser.INT_REGEX, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(INT_REGEX);
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

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode REAL_REGEX() { return getToken(JavaDogParser.REAL_REGEX, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(REAL_REGEX);
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

	public static class RootContext extends ParserRuleContext {
		public TerminalNode BEGIN_MARKUP() { return getToken(JavaDogParser.BEGIN_MARKUP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_MARKUP() { return getToken(JavaDogParser.END_MARKUP, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BEGIN_MARKUP);
			setState(69);
			body();
			setState(70);
			match(END_MARKUP);
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

	public static class BodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << COMMENT_SIGN) | (1L << REGEX_ID))) != 0)) {
				{
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(72);
					declaration();
					}
					break;
				case 2:
					{
					setState(73);
					statement();
					}
					break;
				case 3:
					{
					setState(74);
					functionDefinition();
					}
					break;
				case 4:
					{
					setState(75);
					comment();
					}
					break;
				}
				}
				setState(80);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT_SIGN() { return getTokens(JavaDogParser.COMMENT_SIGN); }
		public TerminalNode COMMENT_SIGN(int i) {
			return getToken(JavaDogParser.COMMENT_SIGN, i);
		}
		public List<TerminalNode> REGEX_ID() { return getTokens(JavaDogParser.REGEX_ID); }
		public TerminalNode REGEX_ID(int i) {
			return getToken(JavaDogParser.REGEX_ID, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(COMMENT_SIGN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REGEX_ID) {
				{
				{
				setState(82);
				match(REGEX_ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(COMMENT_SIGN);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(90);
					declaration();
					}
					break;
				case 2:
					{
					setState(91);
					statement();
					}
					break;
				}
				}
				setState(96);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			varDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaDogParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaDogParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(VAR);
			setState(100);
			identifier();
			setState(101);
			match(SEMICOLON);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JavaDogParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(JavaDogParser.LCURL, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(JavaDogParser.RCURL, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FUNCTION);
			setState(104);
			identifier();
			setState(105);
			parameters();
			setState(106);
			match(LCURL);
			setState(107);
			functionBody();
			setState(108);
			match(RCURL);
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
		public TerminalNode LPAREN() { return getToken(JavaDogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaDogParser.RPAREN, 0); }
		public List<SingleParameterContext> singleParameter() {
			return getRuleContexts(SingleParameterContext.class);
		}
		public SingleParameterContext singleParameter(int i) {
			return getRuleContext(SingleParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaDogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaDogParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LPAREN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REGEX_ID) {
				{
				{
				setState(111);
				singleParameter();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112);
					match(COMMA);
					setState(113);
					singleParameter();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class SingleParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SingleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterSingleParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitSingleParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitSingleParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleParameterContext singleParameter() throws RecognitionException {
		SingleParameterContext _localctx = new SingleParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singleParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			identifier();
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
		public TerminalNode SEMICOLON() { return getToken(JavaDogParser.SEMICOLON, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(128);
				assignmentStatement();
				}
				break;
			case 2:
				{
				setState(129);
				functionCall();
				}
				break;
			case 3:
				{
				setState(130);
				instruction();
				}
				break;
			case 4:
				{
				setState(131);
				returnStatement();
				}
				break;
			}
			setState(134);
			match(SEMICOLON);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaDogParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaDogParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStatement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(VAR);
				setState(137);
				identifier();
				setState(138);
				match(ASSIGN);
				setState(139);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				identifier();
				setState(142);
				match(ASSIGN);
				setState(143);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(VAR);
				setState(146);
				identifier();
				setState(147);
				match(ASSIGN);
				setState(148);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				identifier();
				setState(151);
				match(ASSIGN);
				setState(152);
				functionCall();
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

	public static class InstructionContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instruction);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				whileLoop();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaDogParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaDogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaDogParser.RPAREN, 0); }
		public List<TerminalNode> LCURL() { return getTokens(JavaDogParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(JavaDogParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(JavaDogParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(JavaDogParser.RCURL, i);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaDogParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			match(LPAREN);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(162);
				boolValue();
				}
				break;
			case 2:
				{
				setState(163);
				expression();
				}
				break;
			}
			setState(166);
			match(RPAREN);
			setState(167);
			match(LCURL);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(RCURL);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(175);
				match(ELSE);
				setState(176);
				match(LCURL);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
					{
					{
					setState(177);
					statement();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(RCURL);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaDogParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaDogParser.LPAREN, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaDogParser.RPAREN, 0); }
		public TerminalNode LCURL() { return getToken(JavaDogParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(JavaDogParser.RCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(LPAREN);
			setState(188);
			boolValue();
			setState(189);
			match(RPAREN);
			setState(190);
			match(LCURL);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RCURL);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaDogParser.RETURN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RETURN);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(200);
				identifier();
				}
				break;
			case 2:
				{
				setState(201);
				value();
				}
				break;
			case 3:
				{
				setState(202);
				expression();
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

	public static class BoolValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolValue);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				expression();
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
		public List<ExpressionOperandContext> expressionOperand() {
			return getRuleContexts(ExpressionOperandContext.class);
		}
		public ExpressionOperandContext expressionOperand(int i) {
			return getRuleContext(ExpressionOperandContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expressionOperand();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESS_THAN) | (1L << MORE_THAN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(210);
				operator();
				setState(211);
				expressionOperand();
				}
				}
				setState(217);
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

	public static class ExpressionOperandContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterExpressionOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitExpressionOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitExpressionOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandContext expressionOperand() throws RecognitionException {
		ExpressionOperandContext _localctx = new ExpressionOperandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionOperand);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				identifier();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaDogParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaDogParser.SEMICOLON, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			identifier();
			setState(224);
			arguments();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(SEMICOLON);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaDogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaDogParser.RPAREN, 0); }
		public List<SingleArgumentContext> singleArgument() {
			return getRuleContexts(SingleArgumentContext.class);
		}
		public SingleArgumentContext singleArgument(int i) {
			return getRuleContext(SingleArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaDogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaDogParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LPAREN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGEX_ID) | (1L << INT_REGEX) | (1L << REAL_REGEX) | (1L << STRING_REGEX))) != 0)) {
				{
				{
				setState(232);
				singleArgument();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(233);
					match(COMMA);
					setState(234);
					singleArgument();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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

	public static class SingleArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SingleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterSingleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitSingleArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitSingleArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleArgumentContext singleArgument() throws RecognitionException {
		SingleArgumentContext _localctx = new SingleArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleArgument);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				identifier();
				}
				break;
			case INT_REGEX:
			case REAL_REGEX:
			case STRING_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_REGEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				string();
				}
				break;
			case INT_REGEX:
			case REAL_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				unsignedNumber();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(JavaDogParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(JavaDogParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(JavaDogParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaDogParser.MINUS, 0); }
		public TerminalNode LESS_THAN() { return getToken(JavaDogParser.LESS_THAN, 0); }
		public TerminalNode MORE_THAN() { return getToken(JavaDogParser.MORE_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(JavaDogParser.EQUAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDogListener ) ((JavaDogListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDogVisitor ) return ((JavaDogVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESS_THAN) | (1L << MORE_THAN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4\5\4A"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\b"+
		"R\13\b\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\n\3\n\7\n_\n\n\f\n\16"+
		"\nb\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\7\16u\n\16\f\16\16\16x\13\16\7\16z\n\16\f\16\16\16}\13\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0087\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009d\n\21\3\22\3\22\5\22\u00a1\n\22\3\23\3\23\3"+
		"\23\3\23\5\23\u00a7\n\23\3\23\3\23\3\23\7\23\u00ac\n\23\f\23\16\23\u00af"+
		"\13\23\3\23\3\23\3\23\3\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23"+
		"\5\23\u00bb\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c3\n\24\f\24\16"+
		"\24\u00c6\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00ce\n\25\3\26\3\26"+
		"\5\26\u00d2\n\26\3\27\3\27\3\27\3\27\7\27\u00d8\n\27\f\27\16\27\u00db"+
		"\13\27\3\30\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\3\31\7\31\u00e5\n\31\f"+
		"\31\16\31\u00e8\13\31\3\32\3\32\3\32\3\32\7\32\u00ee\n\32\f\32\16\32\u00f1"+
		"\13\32\7\32\u00f3\n\32\f\32\16\32\u00f6\13\32\3\32\3\32\3\33\3\33\5\33"+
		"\u00fc\n\33\3\34\3\34\5\34\u0100\n\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\3\2\22\30\2\u0108"+
		"\2:\3\2\2\2\4<\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16"+
		"P\3\2\2\2\20S\3\2\2\2\22`\3\2\2\2\24c\3\2\2\2\26e\3\2\2\2\30i\3\2\2\2"+
		"\32p\3\2\2\2\34\u0080\3\2\2\2\36\u0086\3\2\2\2 \u009c\3\2\2\2\"\u00a0"+
		"\3\2\2\2$\u00a2\3\2\2\2&\u00bc\3\2\2\2(\u00c9\3\2\2\2*\u00d1\3\2\2\2,"+
		"\u00d3\3\2\2\2.\u00df\3\2\2\2\60\u00e1\3\2\2\2\62\u00e9\3\2\2\2\64\u00fb"+
		"\3\2\2\2\66\u00ff\3\2\2\28\u0101\3\2\2\2:;\7\37\2\2;\3\3\2\2\2<=\7\"\2"+
		"\2=\5\3\2\2\2>A\5\b\5\2?A\5\n\6\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC\7 "+
		"\2\2C\t\3\2\2\2DE\7!\2\2E\13\3\2\2\2FG\7\16\2\2GH\5\16\b\2HI\7\17\2\2"+
		"I\r\3\2\2\2JO\5\24\13\2KO\5\36\20\2LO\5\30\r\2MO\5\20\t\2NJ\3\2\2\2NK"+
		"\3\2\2\2NL\3\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2"+
		"RP\3\2\2\2SW\7\r\2\2TV\7\37\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XZ\3\2\2\2YW\3\2\2\2Z[\7\r\2\2[\21\3\2\2\2\\_\5\24\13\2]_\5\36\20\2"+
		"^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2"+
		"\2\2cd\5\26\f\2d\25\3\2\2\2ef\7\13\2\2fg\5\2\2\2gh\7\31\2\2h\27\3\2\2"+
		"\2ij\7\4\2\2jk\5\2\2\2kl\5\32\16\2lm\7\34\2\2mn\5\22\n\2no\7\35\2\2o\31"+
		"\3\2\2\2p{\7\32\2\2qv\5\34\17\2rs\7\21\2\2su\5\34\17\2tr\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\33\2\2\177\33\3\2\2\2\u0080"+
		"\u0081\5\2\2\2\u0081\35\3\2\2\2\u0082\u0087\5 \21\2\u0083\u0087\5\60\31"+
		"\2\u0084\u0087\5\"\22\2\u0085\u0087\5(\25\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\7\31\2\2\u0089\37\3\2\2\2\u008a\u008b\7\13\2\2\u008b"+
		"\u008c\5\2\2\2\u008c\u008d\7\20\2\2\u008d\u008e\5,\27\2\u008e\u009d\3"+
		"\2\2\2\u008f\u0090\5\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\5,\27\2\u0092"+
		"\u009d\3\2\2\2\u0093\u0094\7\13\2\2\u0094\u0095\5\2\2\2\u0095\u0096\7"+
		"\20\2\2\u0096\u0097\5\60\31\2\u0097\u009d\3\2\2\2\u0098\u0099\5\2\2\2"+
		"\u0099\u009a\7\20\2\2\u009a\u009b\5\60\31\2\u009b\u009d\3\2\2\2\u009c"+
		"\u008a\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009d!\3\2\2\2\u009e\u00a1\5$\23\2\u009f\u00a1\5&\24\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3"+
		"\u00a6\7\32\2\2\u00a4\u00a7\5*\26\2\u00a5\u00a7\5,\27\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\33\2\2\u00a9"+
		"\u00ad\7\34\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00ba\7\35\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b6\7"+
		"\34\2\2\u00b3\u00b5\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bb\7\35\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb%\3\2\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\7\32\2\2\u00be\u00bf\5"+
		"*\26\2\u00bf\u00c0\7\33\2\2\u00c0\u00c4\7\34\2\2\u00c1\u00c3\5\36\20\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\35\2\2"+
		"\u00c8\'\3\2\2\2\u00c9\u00cd\7\t\2\2\u00ca\u00ce\5\2\2\2\u00cb\u00ce\5"+
		"\66\34\2\u00cc\u00ce\5,\27\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d2\5\66\34\2\u00d0\u00d2\5,\27"+
		"\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2+\3\2\2\2\u00d3\u00d9"+
		"\5.\30\2\u00d4\u00d5\58\35\2\u00d5\u00d6\5.\30\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da-\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e0\5\66\34\2\u00dd\u00e0"+
		"\5\60\31\2\u00de\u00e0\5\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0/\3\2\2\2\u00e1\u00e2\5\2\2\2\u00e2\u00e6\5"+
		"\62\32\2\u00e3\u00e5\7\31\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\61\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00f4\7\32\2\2\u00ea\u00ef\5\64\33\2\u00eb\u00ec\7\21\2"+
		"\2\u00ec\u00ee\5\64\33\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00ea\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\33"+
		"\2\2\u00f8\63\3\2\2\2\u00f9\u00fc\5\2\2\2\u00fa\u00fc\5\66\34\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u0100\5\4\3"+
		"\2\u00fe\u0100\5\6\4\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\67"+
		"\3\2\2\2\u0101\u0102\t\2\2\2\u01029\3\2\2\2\33@NPW^`v{\u0086\u009c\u00a0"+
		"\u00a6\u00ad\u00b6\u00ba\u00c4\u00cd\u00d1\u00d9\u00df\u00e6\u00ef\u00f4"+
		"\u00fb\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}