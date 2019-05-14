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
		VAR=9, STRING=10, BEGIN_MARKUP=11, END_MARKUP=12, ASSIGN=13, COMMA=14, 
		EQUAL=15, LESS_THAN=16, MORE_THAN=17, PLUS=18, MINUS=19, STAR=20, SLASH=21, 
		SEMICOLON=22, LPAREN=23, RPAREN=24, LCURL=25, RCURL=26, DOT=27, REGEX_ID=28, 
		INT_REGEX=29, REAL_REGEX=30, STRING_REGEX=31, REGEX_WS=32, WS=33;
	public static final int
		RULE_identifier = 0, RULE_string = 1, RULE_unsignedNumber = 2, RULE_unsignedInteger = 3, 
		RULE_unsignedReal = 4, RULE_root = 5, RULE_body = 6, RULE_functionBody = 7, 
		RULE_declaration = 8, RULE_varDeclaration = 9, RULE_functionDefinition = 10, 
		RULE_parameters = 11, RULE_singleParameter = 12, RULE_statement = 13, 
		RULE_assignmentStatement = 14, RULE_instruction = 15, RULE_ifStatement = 16, 
		RULE_whileLoop = 17, RULE_returnStatement = 18, RULE_boolValue = 19, RULE_expression = 20, 
		RULE_expressionOperand = 21, RULE_functionCall = 22, RULE_arguments = 23, 
		RULE_singleArgument = 24, RULE_value = 25, RULE_operator = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "string", "unsignedNumber", "unsignedInteger", "unsignedReal", 
			"root", "body", "functionBody", "declaration", "varDeclaration", "functionDefinition", 
			"parameters", "singleParameter", "statement", "assignmentStatement", 
			"instruction", "ifStatement", "whileLoop", "returnStatement", "boolValue", 
			"expression", "expressionOperand", "functionCall", "arguments", "singleArgument", 
			"value", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'func'", "'if'", "'else'", "'while'", "'Integer'", "'return'", 
			"'Real'", "'claim'", "'String'", "'<?JD'", "'?JD>'", "'='", "','", "'=='", 
			"'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "';'", "'('", "')'", "'{'", 
			"'}'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "FUNCTION", "IF", "ELSE", "WHILE", "INTEGER", "RETURN", 
			"REAL", "VAR", "STRING", "BEGIN_MARKUP", "END_MARKUP", "ASSIGN", "COMMA", 
			"EQUAL", "LESS_THAN", "MORE_THAN", "PLUS", "MINUS", "STAR", "SLASH", 
			"SEMICOLON", "LPAREN", "RPAREN", "LCURL", "RCURL", "DOT", "REGEX_ID", 
			"INT_REGEX", "REAL_REGEX", "STRING_REGEX", "REGEX_WS", "WS"
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
			setState(54);
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
			setState(56);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_REGEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				unsignedInteger();
				}
				break;
			case REAL_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
			setState(62);
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
			setState(64);
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
			setState(66);
			match(BEGIN_MARKUP);
			setState(67);
			body();
			setState(68);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(70);
					declaration();
					}
					break;
				case 2:
					{
					setState(71);
					statement();
					}
					break;
				case 3:
					{
					setState(72);
					functionDefinition();
					}
					break;
				}
				}
				setState(77);
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
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(78);
					declaration();
					}
					break;
				case 2:
					{
					setState(79);
					statement();
					}
					break;
				}
				}
				setState(84);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 18, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VAR);
			setState(88);
			identifier();
			setState(89);
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
		enterRule(_localctx, 20, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUNCTION);
			setState(92);
			identifier();
			setState(93);
			parameters();
			setState(94);
			match(LCURL);
			setState(95);
			functionBody();
			setState(96);
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
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LPAREN);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REGEX_ID) {
				{
				{
				setState(99);
				singleParameter();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					singleParameter();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 24, RULE_singleParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(116);
				assignmentStatement();
				}
				break;
			case 2:
				{
				setState(117);
				functionCall();
				}
				break;
			case 3:
				{
				setState(118);
				instruction();
				}
				break;
			case 4:
				{
				setState(119);
				returnStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaDogParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaDogParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaDogParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 28, RULE_assignmentStatement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VAR);
				setState(123);
				identifier();
				setState(124);
				match(ASSIGN);
				setState(125);
				expression();
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				identifier();
				setState(129);
				match(ASSIGN);
				setState(130);
				expression();
				setState(131);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(VAR);
				setState(134);
				identifier();
				setState(135);
				match(ASSIGN);
				setState(136);
				functionCall();
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				identifier();
				setState(140);
				match(ASSIGN);
				setState(141);
				functionCall();
				setState(142);
				match(SEMICOLON);
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
		enterRule(_localctx, 30, RULE_instruction);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IF);
			setState(151);
			match(LPAREN);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152);
				boolValue();
				}
				break;
			case 2:
				{
				setState(153);
				expression();
				}
				break;
			}
			setState(156);
			match(RPAREN);
			setState(157);
			match(LCURL);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RCURL);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(165);
				match(ELSE);
				setState(166);
				match(LCURL);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
					{
					{
					setState(167);
					statement();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
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
		enterRule(_localctx, 34, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WHILE);
			setState(177);
			match(LPAREN);
			setState(178);
			boolValue();
			setState(179);
			match(RPAREN);
			setState(180);
			match(LCURL);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << REGEX_ID))) != 0)) {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
		public TerminalNode SEMICOLON() { return getToken(JavaDogParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(RETURN);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(190);
				identifier();
				}
				break;
			case 2:
				{
				setState(191);
				value();
				}
				break;
			case 3:
				{
				setState(192);
				expression();
				}
				break;
			}
			setState(195);
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
		enterRule(_localctx, 38, RULE_boolValue);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expressionOperand();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESS_THAN) | (1L << MORE_THAN) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(202);
				operator();
				setState(203);
				expressionOperand();
				}
				}
				setState(209);
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
		enterRule(_localctx, 42, RULE_expressionOperand);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
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
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier();
			setState(216);
			arguments();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(SEMICOLON);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 46, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGEX_ID) | (1L << INT_REGEX) | (1L << REAL_REGEX) | (1L << STRING_REGEX))) != 0)) {
				{
				{
				setState(224);
				singleArgument();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
					singleArgument();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		enterRule(_localctx, 48, RULE_singleArgument);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				identifier();
				}
				break;
			case INT_REGEX:
			case REAL_REGEX:
			case STRING_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_REGEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				string();
				}
				break;
			case INT_REGEX:
			case REAL_REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
		enterRule(_localctx, 52, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\5\4?\n\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t"+
		"\7\tS\n\t\f\t\16\tV\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\7\ri\n\r\f\r\16\rl\13\r\7\rn\n\r\f\r\16\rq"+
		"\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0093\n\20\3\21\3\21\5\21\u0097\n\21\3"+
		"\22\3\22\3\22\3\22\5\22\u009d\n\22\3\22\3\22\3\22\7\22\u00a2\n\22\f\22"+
		"\16\22\u00a5\13\22\3\22\3\22\3\22\3\22\7\22\u00ab\n\22\f\22\16\22\u00ae"+
		"\13\22\3\22\5\22\u00b1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00b9\n"+
		"\23\f\23\16\23\u00bc\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00c4\n"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\3\26\3\26\7\26\u00d0"+
		"\n\26\f\26\16\26\u00d3\13\26\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\3\30"+
		"\3\30\7\30\u00dd\n\30\f\30\16\30\u00e0\13\30\3\31\3\31\3\31\3\31\7\31"+
		"\u00e6\n\31\f\31\16\31\u00e9\13\31\7\31\u00eb\n\31\f\31\16\31\u00ee\13"+
		"\31\3\31\3\31\3\32\3\32\5\32\u00f4\n\32\3\33\3\33\5\33\u00f8\n\33\3\34"+
		"\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\3\3\2\21\27\2\u00ff\28\3\2\2\2\4:\3\2\2\2\6>\3\2\2\2\b@\3\2\2"+
		"\2\nB\3\2\2\2\fD\3\2\2\2\16M\3\2\2\2\20T\3\2\2\2\22W\3\2\2\2\24Y\3\2\2"+
		"\2\26]\3\2\2\2\30d\3\2\2\2\32t\3\2\2\2\34z\3\2\2\2\36\u0092\3\2\2\2 \u0096"+
		"\3\2\2\2\"\u0098\3\2\2\2$\u00b2\3\2\2\2&\u00bf\3\2\2\2(\u00c9\3\2\2\2"+
		"*\u00cb\3\2\2\2,\u00d7\3\2\2\2.\u00d9\3\2\2\2\60\u00e1\3\2\2\2\62\u00f3"+
		"\3\2\2\2\64\u00f7\3\2\2\2\66\u00f9\3\2\2\289\7\36\2\29\3\3\2\2\2:;\7!"+
		"\2\2;\5\3\2\2\2<?\5\b\5\2=?\5\n\6\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7"+
		"\37\2\2A\t\3\2\2\2BC\7 \2\2C\13\3\2\2\2DE\7\r\2\2EF\5\16\b\2FG\7\16\2"+
		"\2G\r\3\2\2\2HL\5\22\n\2IL\5\34\17\2JL\5\26\f\2KH\3\2\2\2KI\3\2\2\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OM\3\2\2\2PS\5\22\n"+
		"\2QS\5\34\17\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\21\3"+
		"\2\2\2VT\3\2\2\2WX\5\24\13\2X\23\3\2\2\2YZ\7\13\2\2Z[\5\2\2\2[\\\7\30"+
		"\2\2\\\25\3\2\2\2]^\7\4\2\2^_\5\2\2\2_`\5\30\r\2`a\7\33\2\2ab\5\20\t\2"+
		"bc\7\34\2\2c\27\3\2\2\2do\7\31\2\2ej\5\32\16\2fg\7\20\2\2gi\5\32\16\2"+
		"hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2\2s\31\3\2"+
		"\2\2tu\5\2\2\2u\33\3\2\2\2v{\5\36\20\2w{\5.\30\2x{\5 \21\2y{\5&\24\2z"+
		"v\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\35\3\2\2\2|}\7\13\2\2}~\5\2\2"+
		"\2~\177\7\17\2\2\177\u0080\5*\26\2\u0080\u0081\7\30\2\2\u0081\u0093\3"+
		"\2\2\2\u0082\u0083\5\2\2\2\u0083\u0084\7\17\2\2\u0084\u0085\5*\26\2\u0085"+
		"\u0086\7\30\2\2\u0086\u0093\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5"+
		"\2\2\2\u0089\u008a\7\17\2\2\u008a\u008b\5.\30\2\u008b\u008c\7\30\2\2\u008c"+
		"\u0093\3\2\2\2\u008d\u008e\5\2\2\2\u008e\u008f\7\17\2\2\u008f\u0090\5"+
		".\30\2\u0090\u0091\7\30\2\2\u0091\u0093\3\2\2\2\u0092|\3\2\2\2\u0092\u0082"+
		"\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008d\3\2\2\2\u0093\37\3\2\2\2\u0094"+
		"\u0097\5\"\22\2\u0095\u0097\5$\23\2\u0096\u0094\3\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097!\3\2\2\2\u0098\u0099\7\5\2\2\u0099\u009c\7\31\2\2\u009a\u009d"+
		"\5(\25\2\u009b\u009d\5*\26\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\32\2\2\u009f\u00a3\7\33\2\2\u00a0\u00a2\5"+
		"\34\17\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00b0\7\34"+
		"\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00ac\7\33\2\2\u00a9\u00ab\5\34\17\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7\34\2\2\u00b0"+
		"\u00a7\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b3\7\7\2\2"+
		"\u00b3\u00b4\7\31\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\7\32\2\2\u00b6\u00ba"+
		"\7\33\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00be\7\34\2\2\u00be%\3\2\2\2\u00bf\u00c3\7\t\2\2\u00c0"+
		"\u00c4\5\2\2\2\u00c1\u00c4\5\64\33\2\u00c2\u00c4\5*\26\2\u00c3\u00c0\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\30\2\2\u00c6\'\3\2\2\2\u00c7\u00ca\5\64\33\2\u00c8\u00ca\5*\26"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca)\3\2\2\2\u00cb\u00d1"+
		"\5,\27\2\u00cc\u00cd\5\66\34\2\u00cd\u00ce\5,\27\2\u00ce\u00d0\3\2\2\2"+
		"\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2+\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5\64\33\2\u00d5"+
		"\u00d8\5.\30\2\u00d6\u00d8\5\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\5\2\2\2\u00da\u00de"+
		"\5\60\31\2\u00db\u00dd\7\30\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df/\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00ec\7\31\2\2\u00e2\u00e7\5\62\32\2\u00e3\u00e4\7\20\2"+
		"\2\u00e4\u00e6\5\62\32\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\32"+
		"\2\2\u00f0\61\3\2\2\2\u00f1\u00f4\5\2\2\2\u00f2\u00f4\5\64\33\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\63\3\2\2\2\u00f5\u00f8\5\4\3"+
		"\2\u00f6\u00f8\5\6\4\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\65"+
		"\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\67\3\2\2\2\32>KMRTjoz\u0092\u0096\u009c"+
		"\u00a3\u00ac\u00b0\u00ba\u00c3\u00c9\u00d1\u00d7\u00de\u00e7\u00ec\u00f3"+
		"\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}