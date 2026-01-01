// Generated from /home/ali/IdeaProjects/Flask_Compiler/src/ANTLR/PythonParser.g4 by ANTLR 4.13.2
package gen.ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAB_IN=1, TAB_OUT=2, EXPR_START=3, STMT_START=4, COMMENT_START=5, IMPORT=6, 
		FROM=7, TRUE=8, FALSE=9, NONE=10, IF=11, ELIF=12, ELSE=13, FOR=14, WHILE=15, 
		DEF=16, RETURN=17, PRINT=18, CLASS=19, SELF=20, BREAK=21, CONTINUE=22, 
		PASS=23, TRY=24, EXCEPT=25, FINALLY=26, S_AND=27, S_OR=28, NOT=29, IN=30, 
		IS=31, AS=32, SET=33, PIPE=34, GLOBAL=35, PLUS=36, MINUS=37, MULTIPLY=38, 
		SLASH=39, MOD=40, LT=41, GT=42, LTE=43, GTE=44, EQUAL=45, NEQ=46, STRICT_EQ=47, 
		STRICT_NEQ=48, ASSIGN=49, AND=50, OR=51, LPAREN=52, RPAREN=53, LBRACK=54, 
		RBRACK=55, LCBRACK=56, RCBRACK=57, COLON=58, SEMI=59, COMMA=60, DOT=61, 
		HASHTAG=62, AT=63, HTML_START=64, NUMBER=65, STRING=66, TRIPLE_STRING=67, 
		IDENTIFIER=68, COMMENT=69, WS=70, EXPR_END=71, STMT_END=72, COMMENT_END=73, 
		JINJA_PIPE=74, JINJA_DOT=75, JINJA_LPAREN=76, JINJA_RPAREN=77, JINJA_COMMA=78, 
		JINJA_COLON=79, JINJA_IF=80, JINJA_ELIF=81, JINJA_ELSE=82, JINJA_ENDIF=83, 
		JINJA_FOR=84, JINJA_ENDFOR=85, JINJA_SET=86, JINJA_BLOCK=87, JINJA_ENDBLOCK=88, 
		JINJA_EXTENDS=89, JINJA_INCLUDE=90, JINJA_IGNORE=91, JINJA_MISSING=92, 
		JINJA_WITH=93, JINJA_ENDWITH=94, JINJA_WITHOUT=95, JINJA_CONTEXT=96, JINJA_WS=97, 
		CSS_WS=98, CSS_PROPERTY_START=99, CSS_PROPERTY_END=100, CSS_COLON=101, 
		CSS_SEMI=102, CSS_NUMBER=103, CSS_TYPE=104, CSS_COM_S=105, CSS_COM_E=106, 
		STYLE_END=107, CSS_ID=108, CSS_HEX=109, CSS_UNKOWN=110, HTML_STYLE_START=111, 
		HTML_END=112, TAG_OPEN=113, TAG_CLOSE=114, TAG_SLASH=115, HTML_ASSIGN=116, 
		HTML_TAG_NAME=117, HTML_ATTR_NAME=118, HTML_TEXT=119, HTML_WS=120;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_compoundStatement = 3, 
		RULE_assignment = 4, RULE_value = 5, RULE_list = 6, RULE_listComprehension = 7, 
		RULE_tuple = 8, RULE_elements = 9, RULE_json = 10, RULE_jsonData = 11, 
		RULE_expressions = 12, RULE_comparisonExpressions = 13, RULE_mathematicalExpressions = 14, 
		RULE_logicalExpressions = 15, RULE_valuesExp = 16, RULE_atom = 17, RULE_primaryAtom = 18, 
		RULE_postfix = 19, RULE_globalStatement = 20, RULE_pythonImport = 21, 
		RULE_importSyntax = 22, RULE_fromImport = 23, RULE_importSource = 24, 
		RULE_importList = 25, RULE_importName = 26, RULE_aliasName = 27, RULE_printStatement = 28, 
		RULE_printArgs = 29, RULE_block = 30, RULE_ifStatement = 31, RULE_ifBlock = 32, 
		RULE_elifBlock = 33, RULE_elseBlock = 34, RULE_forLoop = 35, RULE_whileLoop = 36, 
		RULE_function = 37, RULE_parameters = 38, RULE_parameter = 39, RULE_returnStatement = 40, 
		RULE_tripleString = 41, RULE_functionCall = 42, RULE_argument = 43, RULE_decorator_rule = 44, 
		RULE_classDef = 45, RULE_baseClass = 46, RULE_jinjaBody = 47, RULE_jinjaExpression = 48, 
		RULE_jinjaFilter = 49, RULE_jinjaComment = 50, RULE_jinjaStatement = 51, 
		RULE_jinjaStatementContent = 52, RULE_jinjaIfStatements = 53, RULE_jinjaIf = 54, 
		RULE_jinjaElif = 55, RULE_jinjaElse = 56, RULE_jinjaFor = 57, RULE_jinjaSet = 58, 
		RULE_jiniaExtends = 59, RULE_jinjaInclude = 60, RULE_jinjaBlock = 61, 
		RULE_jinjaLocalVariable = 62, RULE_templateBody = 63, RULE_html = 64, 
		RULE_htmlElement = 65, RULE_htmlTag = 66, RULE_styleTag = 67, RULE_genericHtml = 68, 
		RULE_selfClosingTag = 69, RULE_htmlAttributes = 70, RULE_attributeValue = 71, 
		RULE_htmlText = 72, RULE_htmlTextPart = 73, RULE_css = 74, RULE_cssSelector = 75, 
		RULE_selectorName = 76, RULE_cssKeyValue = 77, RULE_cssValue = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "compoundStatement", "assignment", 
			"value", "list", "listComprehension", "tuple", "elements", "json", "jsonData", 
			"expressions", "comparisonExpressions", "mathematicalExpressions", "logicalExpressions", 
			"valuesExp", "atom", "primaryAtom", "postfix", "globalStatement", "pythonImport", 
			"importSyntax", "fromImport", "importSource", "importList", "importName", 
			"aliasName", "printStatement", "printArgs", "block", "ifStatement", "ifBlock", 
			"elifBlock", "elseBlock", "forLoop", "whileLoop", "function", "parameters", 
			"parameter", "returnStatement", "tripleString", "functionCall", "argument", 
			"decorator_rule", "classDef", "baseClass", "jinjaBody", "jinjaExpression", 
			"jinjaFilter", "jinjaComment", "jinjaStatement", "jinjaStatementContent", 
			"jinjaIfStatements", "jinjaIf", "jinjaElif", "jinjaElse", "jinjaFor", 
			"jinjaSet", "jiniaExtends", "jinjaInclude", "jinjaBlock", "jinjaLocalVariable", 
			"templateBody", "html", "htmlElement", "htmlTag", "styleTag", "genericHtml", 
			"selfClosingTag", "htmlAttributes", "attributeValue", "htmlText", "htmlTextPart", 
			"css", "cssSelector", "selectorName", "cssKeyValue", "cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{{'", "'{%'", "'{#'", "'import'", "'from'", null, 
			null, null, null, null, null, null, "'while'", "'def'", "'return'", "'print'", 
			null, "'self'", "'break'", "'continue'", "'pass'", "'try'", "'except'", 
			"'finally'", null, null, null, null, null, "'as'", null, null, "'global'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'['", "']'", null, null, null, null, 
			null, null, "'#'", "'@'", "'<html>'", null, null, null, null, null, null, 
			"'}}'", "'%}'", "'#}'", null, null, null, null, null, null, null, null, 
			null, "'endif'", null, "'endfor'", null, "'block'", "'endblock'", "'extends'", 
			"'include'", "'ignore'", "'missing'", "'with'", "'endwith'", "'without'", 
			"'context'", null, null, null, null, null, null, null, null, "'/*'", 
			"'*/'", "'</style>'", null, null, null, "'<style>'", "'</html>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAB_IN", "TAB_OUT", "EXPR_START", "STMT_START", "COMMENT_START", 
			"IMPORT", "FROM", "TRUE", "FALSE", "NONE", "IF", "ELIF", "ELSE", "FOR", 
			"WHILE", "DEF", "RETURN", "PRINT", "CLASS", "SELF", "BREAK", "CONTINUE", 
			"PASS", "TRY", "EXCEPT", "FINALLY", "S_AND", "S_OR", "NOT", "IN", "IS", 
			"AS", "SET", "PIPE", "GLOBAL", "PLUS", "MINUS", "MULTIPLY", "SLASH", 
			"MOD", "LT", "GT", "LTE", "GTE", "EQUAL", "NEQ", "STRICT_EQ", "STRICT_NEQ", 
			"ASSIGN", "AND", "OR", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LCBRACK", 
			"RCBRACK", "COLON", "SEMI", "COMMA", "DOT", "HASHTAG", "AT", "HTML_START", 
			"NUMBER", "STRING", "TRIPLE_STRING", "IDENTIFIER", "COMMENT", "WS", "EXPR_END", 
			"STMT_END", "COMMENT_END", "JINJA_PIPE", "JINJA_DOT", "JINJA_LPAREN", 
			"JINJA_RPAREN", "JINJA_COMMA", "JINJA_COLON", "JINJA_IF", "JINJA_ELIF", 
			"JINJA_ELSE", "JINJA_ENDIF", "JINJA_FOR", "JINJA_ENDFOR", "JINJA_SET", 
			"JINJA_BLOCK", "JINJA_ENDBLOCK", "JINJA_EXTENDS", "JINJA_INCLUDE", "JINJA_IGNORE", 
			"JINJA_MISSING", "JINJA_WITH", "JINJA_ENDWITH", "JINJA_WITHOUT", "JINJA_CONTEXT", 
			"JINJA_WS", "CSS_WS", "CSS_PROPERTY_START", "CSS_PROPERTY_END", "CSS_COLON", 
			"CSS_SEMI", "CSS_NUMBER", "CSS_TYPE", "CSS_COM_S", "CSS_COM_E", "STYLE_END", 
			"CSS_ID", "CSS_HEX", "CSS_UNKOWN", "HTML_STYLE_START", "HTML_END", "TAG_OPEN", 
			"TAG_CLOSE", "TAG_SLASH", "HTML_ASSIGN", "HTML_TAG_NAME", "HTML_ATTR_NAME", 
			"HTML_TEXT", "HTML_WS"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842974316049416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044439L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public JinjaBodyContext jinjaBody() {
			return getRuleContext(JinjaBodyContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PythonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PythonParser.SEMI, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				jinjaBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				css();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				simpleStatement();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(170);
					match(SEMI);
					setState(171);
					simpleStatement();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				html();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public PythonImportContext pythonImport() {
			return getRuleContext(PythonImportContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				pythonImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				globalStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compoundStatement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				forLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				classDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				expressions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IDENTIFIER);
			setState(197);
			match(ASSIGN);
			setState(198);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TripleStringContext tripleString() {
			return getRuleContext(TripleStringContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				tripleString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				expressions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				tuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				json();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				listComprehension();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LBRACK);
			setState(211);
			elements();
			setState(212);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LBRACK);
			setState(215);
			atom();
			setState(216);
			match(FOR);
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(IN);
			setState(219);
			value();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(220);
				match(IF);
				setState(221);
				expressions();
				}
			}

			setState(224);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LPAREN);
			setState(227);
			elements();
			setState(228);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2162097257046867971L) != 0)) {
				{
				setState(230);
				value();
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				value();
				}
				}
				setState(239);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(PythonParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(PythonParser.RCBRACK, 0); }
		public List<JsonDataContext> jsonData() {
			return getRuleContexts(JsonDataContext.class);
		}
		public JsonDataContext jsonData(int i) {
			return getRuleContext(JsonDataContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LCBRACK);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(241);
				jsonData();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					jsonData();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251);
			match(RCBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonDataContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJsonData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJsonData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJsonData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonDataContext jsonData() throws RecognitionException {
		JsonDataContext _localctx = new JsonDataContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jsonData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(STRING);
			setState(254);
			match(COLON);
			setState(255);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public LogicalExpressionsContext logicalExpressions() {
			return getRuleContext(LogicalExpressionsContext.class,0);
		}
		public ComparisonExpressionsContext comparisonExpressions() {
			return getRuleContext(ComparisonExpressionsContext.class,0);
		}
		public MathematicalExpressionsContext mathematicalExpressions() {
			return getRuleContext(MathematicalExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressions);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				logicalExpressions(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				comparisonExpressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				mathematicalExpressions(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionsContext extends ParserRuleContext {
		public ComparisonExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpressions; }
	 
		public ComparisonExpressionsContext() { }
		public void copyFrom(ComparisonExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MembershipTestContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public MembershipTestContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMembershipTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMembershipTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMembershipTest(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public LtExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLtExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLtExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLtExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public LteExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLteExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLteExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLteExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public EqExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictEqExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode STRICT_EQ() { return getToken(PythonParser.STRICT_EQ, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public StrictEqExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrictEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrictEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrictEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictNeqExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode STRICT_NEQ() { return getToken(PythonParser.STRICT_NEQ, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public StrictNeqExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrictNeqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrictNeqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrictNeqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public GteExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGteExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGteExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGteExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public NeExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtExpContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public GtExpContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGtExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGtExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGtExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdComparisonContext extends ComparisonExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public IdComparisonContext(ComparisonExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionsContext comparisonExpressions() throws RecognitionException {
		ComparisonExpressionsContext _localctx = new ComparisonExpressionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparisonExpressions);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LtExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((LtExpContext)_localctx).left = mathematicalExpressions(0);
				setState(263);
				match(LT);
				setState(264);
				((LtExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 2:
				_localctx = new GtExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				((GtExpContext)_localctx).left = mathematicalExpressions(0);
				setState(267);
				match(GT);
				setState(268);
				((GtExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 3:
				_localctx = new LteExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				((LteExpContext)_localctx).left = mathematicalExpressions(0);
				setState(271);
				match(LTE);
				setState(272);
				((LteExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 4:
				_localctx = new GteExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				((GteExpContext)_localctx).left = mathematicalExpressions(0);
				setState(275);
				match(GTE);
				setState(276);
				((GteExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 5:
				_localctx = new EqExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				((EqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(279);
				match(EQUAL);
				setState(280);
				((EqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 6:
				_localctx = new StrictEqExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				((StrictEqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(283);
				match(STRICT_EQ);
				setState(284);
				((StrictEqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 7:
				_localctx = new NeExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				((NeExpContext)_localctx).left = mathematicalExpressions(0);
				setState(287);
				match(NEQ);
				setState(288);
				((NeExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 8:
				_localctx = new StrictNeqExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				((StrictNeqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(291);
				match(STRICT_NEQ);
				setState(292);
				((StrictNeqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 9:
				_localctx = new IdComparisonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				((IdComparisonContext)_localctx).left = mathematicalExpressions(0);
				setState(295);
				match(IS);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(296);
					match(NOT);
					}
				}

				setState(299);
				((IdComparisonContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 10:
				_localctx = new MembershipTestContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				((MembershipTestContext)_localctx).left = mathematicalExpressions(0);
				setState(302);
				match(IN);
				setState(303);
				((MembershipTestContext)_localctx).right = mathematicalExpressions(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalExpressionsContext extends ParserRuleContext {
		public MathematicalExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalExpressions; }
	 
		public MathematicalExpressionsContext() { }
		public void copyFrom(MathematicalExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpContext extends MathematicalExpressionsContext {
		public ValuesExpContext valuesExp() {
			return getRuleContext(ValuesExpContext.class,0);
		}
		public ValueExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValueExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValueExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExpContext extends MathematicalExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode MULTIPLY() { return getToken(PythonParser.MULTIPLY, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public MulExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExpContext extends MathematicalExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public ModExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterModExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitModExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitModExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpContext extends MathematicalExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public AddExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExpContext extends MathematicalExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public DivExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExpContext extends MathematicalExpressionsContext {
		public MathematicalExpressionsContext left;
		public MathematicalExpressionsContext right;
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public List<MathematicalExpressionsContext> mathematicalExpressions() {
			return getRuleContexts(MathematicalExpressionsContext.class);
		}
		public MathematicalExpressionsContext mathematicalExpressions(int i) {
			return getRuleContext(MathematicalExpressionsContext.class,i);
		}
		public SubExpContext(MathematicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalExpressionsContext mathematicalExpressions() throws RecognitionException {
		return mathematicalExpressions(0);
	}

	private MathematicalExpressionsContext mathematicalExpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathematicalExpressionsContext _localctx = new MathematicalExpressionsContext(_ctx, _parentState);
		MathematicalExpressionsContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_mathematicalExpressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(308);
			valuesExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((AddExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(311);
						match(PLUS);
						setState(312);
						((AddExpContext)_localctx).right = mathematicalExpressions(7);
						}
						break;
					case 2:
						{
						_localctx = new SubExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((SubExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(313);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(314);
						match(MINUS);
						setState(315);
						((SubExpContext)_localctx).right = mathematicalExpressions(6);
						}
						break;
					case 3:
						{
						_localctx = new MulExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((MulExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(MULTIPLY);
						setState(318);
						((MulExpContext)_localctx).right = mathematicalExpressions(5);
						}
						break;
					case 4:
						{
						_localctx = new DivExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((DivExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(SLASH);
						setState(321);
						((DivExpContext)_localctx).right = mathematicalExpressions(4);
						}
						break;
					case 5:
						{
						_localctx = new ModExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((ModExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						match(MOD);
						setState(324);
						((ModExpContext)_localctx).right = mathematicalExpressions(3);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionsContext extends ParserRuleContext {
		public LogicalExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpressions; }
	 
		public LogicalExpressionsContext() { }
		public void copyFrom(LogicalExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpContext extends LogicalExpressionsContext {
		public LogicalExpressionsContext item;
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public LogicalExpressionsContext logicalExpressions() {
			return getRuleContext(LogicalExpressionsContext.class,0);
		}
		public NotExpContext(LogicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends LogicalExpressionsContext {
		public LogicalExpressionsContext left;
		public LogicalExpressionsContext right;
		public List<LogicalExpressionsContext> logicalExpressions() {
			return getRuleContexts(LogicalExpressionsContext.class);
		}
		public LogicalExpressionsContext logicalExpressions(int i) {
			return getRuleContext(LogicalExpressionsContext.class,i);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public TerminalNode S_AND() { return getToken(PythonParser.S_AND, 0); }
		public AndExpContext(LogicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompAsLogicalContext extends LogicalExpressionsContext {
		public ComparisonExpressionsContext comparisonExpressions() {
			return getRuleContext(ComparisonExpressionsContext.class,0);
		}
		public CompAsLogicalContext(LogicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompAsLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompAsLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompAsLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuesAsLogicalContext extends LogicalExpressionsContext {
		public ValuesExpContext valuesExp() {
			return getRuleContext(ValuesExpContext.class,0);
		}
		public ValuesAsLogicalContext(LogicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValuesAsLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValuesAsLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValuesAsLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpContext extends LogicalExpressionsContext {
		public LogicalExpressionsContext left;
		public LogicalExpressionsContext right;
		public List<LogicalExpressionsContext> logicalExpressions() {
			return getRuleContexts(LogicalExpressionsContext.class);
		}
		public LogicalExpressionsContext logicalExpressions(int i) {
			return getRuleContext(LogicalExpressionsContext.class,i);
		}
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public TerminalNode S_OR() { return getToken(PythonParser.S_OR, 0); }
		public OrExpContext(LogicalExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionsContext logicalExpressions() throws RecognitionException {
		return logicalExpressions(0);
	}

	private LogicalExpressionsContext logicalExpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionsContext _localctx = new LogicalExpressionsContext(_ctx, _parentState);
		LogicalExpressionsContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalExpressions, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				match(NOT);
				setState(332);
				((NotExpContext)_localctx).item = logicalExpressions(3);
				}
				break;
			case 2:
				{
				_localctx = new CompAsLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				comparisonExpressions();
				}
				break;
			case 3:
				{
				_localctx = new ValuesAsLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				valuesExp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new LogicalExpressionsContext(_parentctx, _parentState));
						((AndExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpressions);
						setState(337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(338);
						_la = _input.LA(1);
						if ( !(_la==S_AND || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						((AndExpContext)_localctx).right = logicalExpressions(6);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new LogicalExpressionsContext(_parentctx, _parentState));
						((OrExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpressions);
						setState(340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(341);
						_la = _input.LA(1);
						if ( !(_la==S_OR || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						((OrExpContext)_localctx).right = logicalExpressions(5);
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesExpContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValuesExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValuesExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValuesExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValuesExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesExpContext valuesExp() throws RecognitionException {
		ValuesExpContext _localctx = new ValuesExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valuesExp);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomWithAccessContext extends AtomContext {
		public PrimaryAtomContext primaryAtom() {
			return getRuleContext(PrimaryAtomContext.class,0);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public AtomWithAccessContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomWithAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomWithAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomWithAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom);
		try {
			int _alt;
			_localctx = new AtomWithAccessContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			primaryAtom();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					postfix();
					}
					} 
				}
				setState(358);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomContext extends ParserRuleContext {
		public PrimaryAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryAtom; }
	 
		public PrimaryAtomContext() { }
		public void copyFrom(PrimaryAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends PrimaryAtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends PrimaryAtomContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends PrimaryAtomContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends PrimaryAtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends PrimaryAtomContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryAtomContext primaryAtom() throws RecognitionException {
		PrimaryAtomContext _localctx = new PrimaryAtomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryAtom);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAccessContext extends PostfixContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DotAccessContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDotAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDotAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDotAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessContext extends PostfixContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public IndexAccessContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_postfix);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new DotAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(DOT);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(367);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(368);
					functionCall();
					}
					break;
				}
				}
				break;
			case LBRACK:
				_localctx = new IndexAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(LBRACK);
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(372);
					expressions();
					}
					break;
				case 2:
					{
					setState(373);
					atom();
					}
					break;
				}
				setState(376);
				match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(GLOBAL);
			setState(381);
			match(IDENTIFIER);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PythonImportContext extends ParserRuleContext {
		public ImportSyntaxContext importSyntax() {
			return getRuleContext(ImportSyntaxContext.class,0);
		}
		public FromImportContext fromImport() {
			return getRuleContext(FromImportContext.class,0);
		}
		public PythonImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pythonImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPythonImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPythonImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPythonImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PythonImportContext pythonImport() throws RecognitionException {
		PythonImportContext _localctx = new PythonImportContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pythonImport);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				importSyntax();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				fromImport();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSyntaxContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public ImportSourceContext importSource() {
			return getRuleContext(ImportSourceContext.class,0);
		}
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public ImportSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSyntaxContext importSyntax() throws RecognitionException {
		ImportSyntaxContext _localctx = new ImportSyntaxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_importSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IMPORT);
			setState(394);
			importSource();
			setState(395);
			importName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromImportContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public ImportSourceContext importSource() {
			return getRuleContext(ImportSourceContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public FromImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFromImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFromImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFromImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromImportContext fromImport() throws RecognitionException {
		FromImportContext _localctx = new FromImportContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fromImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(FROM);
			setState(398);
			importSource();
			setState(399);
			match(IMPORT);
			setState(400);
			importList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSourceContext extends ParserRuleContext {
		public ImportSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSource; }
	 
		public ImportSourceContext() { }
		public void copyFrom(ImportSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportIDContext extends ImportSourceContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public ImportIDContext(ImportSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportSTRContext extends ImportSourceContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public ImportSTRContext(ImportSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportSTR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSourceContext importSource() throws RecognitionException {
		ImportSourceContext _localctx = new ImportSourceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importSource);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ImportIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new ImportSTRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportNameContext> importName() {
			return getRuleContexts(ImportNameContext.class);
		}
		public ImportNameContext importName(int i) {
			return getRuleContext(ImportNameContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			importName();
			{
			setState(407);
			match(COMMA);
			setState(408);
			importName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(411);
				aliasName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasNameContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(AS);
			setState(415);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public PrintArgsContext printArgs() {
			return getRuleContext(PrintArgsContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(PRINT);
			setState(418);
			match(LPAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2162097257046867971L) != 0)) {
				{
				setState(419);
				printArgs();
				}
			}

			setState(422);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintArgsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public PrintArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrintArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrintArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrintArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgsContext printArgs() throws RecognitionException {
		PrintArgsContext _localctx = new PrintArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printArgs);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				value();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(425);
					match(COMMA);
					setState(426);
					value();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				expressions();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1589770668463882243L) != 0)) {
					{
					{
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(433);
						match(COMMA);
						}
					}

					setState(436);
					expressions();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCBRACK() { return getToken(PythonParser.LCBRACK, 0); }
		public TerminalNode RCBRACK() { return getToken(PythonParser.RCBRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LCBRACK);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842974316049416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044439L) != 0)) {
				{
				{
				setState(445);
				statement();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(RCBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			ifBlock();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(454);
				elifBlock();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(460);
				elseBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public LogicalExpressionsContext condition;
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LogicalExpressionsContext logicalExpressions() {
			return getRuleContext(LogicalExpressionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(IF);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(464);
				match(LPAREN);
				}
			}

			setState(467);
			((IfBlockContext)_localctx).condition = logicalExpressions(0);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(468);
				match(RPAREN);
				}
			}

			setState(471);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifBlockContext extends ParserRuleContext {
		public LogicalExpressionsContext condition;
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LogicalExpressionsContext logicalExpressions() {
			return getRuleContext(LogicalExpressionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(ELIF);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(474);
				match(LPAREN);
				}
			}

			setState(477);
			((ElifBlockContext)_localctx).condition = logicalExpressions(0);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(478);
				match(RPAREN);
				}
			}

			setState(481);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ELSE);
			setState(484);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ValueContext iterable;
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(FOR);
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(IN);
			setState(489);
			((ForLoopContext)_localctx).iterable = value();
			setState(490);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(WHILE);
			setState(493);
			match(LPAREN);
			setState(494);
			expressions();
			setState(495);
			match(RPAREN);
			setState(496);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Decorator_ruleContext> decorator_rule() {
			return getRuleContexts(Decorator_ruleContext.class);
		}
		public Decorator_ruleContext decorator_rule(int i) {
			return getRuleContext(Decorator_ruleContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(498);
				decorator_rule();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(DEF);
			setState(505);
			match(IDENTIFIER);
			setState(506);
			match(LPAREN);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(507);
				parameters();
				}
			}

			setState(510);
			match(RPAREN);
			setState(511);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			parameter();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(514);
				match(COMMA);
				setState(515);
				parameter();
				}
				}
				setState(520);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(IDENTIFIER);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(522);
				match(ASSIGN);
				setState(523);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnValueContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ReturnValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(RETURN);
			setState(527);
			value();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(528);
				match(COMMA);
				setState(529);
				value();
				}
				}
				setState(534);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TripleStringContext extends ParserRuleContext {
		public TerminalNode TRIPLE_STRING() { return getToken(PythonParser.TRIPLE_STRING, 0); }
		public TripleStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTripleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTripleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTripleString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripleStringContext tripleString() throws RecognitionException {
		TripleStringContext _localctx = new TripleStringContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tripleString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(TRIPLE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(IDENTIFIER);
			setState(538);
			match(LPAREN);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2162097257046867971L) != 0)) {
				{
				{
				setState(539);
				argument();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(547);
				match(IDENTIFIER);
				setState(548);
				match(ASSIGN);
				}
				break;
			}
			setState(551);
			value();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(552);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decorator_ruleContext extends ParserRuleContext {
		public Decorator_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator_rule; }
	 
		public Decorator_ruleContext() { }
		public void copyFrom(Decorator_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends Decorator_ruleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public DecoratorContext(Decorator_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decorator_ruleContext decorator_rule() throws RecognitionException {
		Decorator_ruleContext _localctx = new Decorator_ruleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_decorator_rule);
		try {
			_localctx = new DecoratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(AT);
			setState(556);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Decorator_ruleContext> decorator_rule() {
			return getRuleContexts(Decorator_ruleContext.class);
		}
		public Decorator_ruleContext decorator_rule(int i) {
			return getRuleContext(Decorator_ruleContext.class,i);
		}
		public BaseClassContext baseClass() {
			return getRuleContext(BaseClassContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(558);
				decorator_rule();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
			match(CLASS);
			setState(565);
			match(IDENTIFIER);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(566);
				baseClass();
				}
			}

			setState(569);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseClassContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public BaseClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBaseClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBaseClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBaseClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClassContext baseClass() throws RecognitionException {
		BaseClassContext _localctx = new BaseClassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_baseClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			match(LPAREN);
			setState(572);
			match(IDENTIFIER);
			setState(573);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBodyContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBodyContext jinjaBody() throws RecognitionException {
		JinjaBodyContext _localctx = new JinjaBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jinjaBody);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				jinjaExpression();
				}
				break;
			case STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				jinjaStatement();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				jinjaComment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode EXPR_START() { return getToken(PythonParser.EXPR_START, 0); }
		public TerminalNode EXPR_END() { return getToken(PythonParser.EXPR_END, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<JinjaFilterContext> jinjaFilter() {
			return getRuleContexts(JinjaFilterContext.class);
		}
		public JinjaFilterContext jinjaFilter(int i) {
			return getRuleContext(JinjaFilterContext.class,i);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jinjaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(EXPR_START);
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(581);
				atom();
				}
				break;
			case 2:
				{
				setState(582);
				expressions();
				}
				break;
			case 3:
				{
				setState(583);
				value();
				}
				break;
			}
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(586);
				jinjaFilter();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilterContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(PythonParser.PIPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public JinjaFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaFilterContext jinjaFilter() throws RecognitionException {
		JinjaFilterContext _localctx = new JinjaFilterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_jinjaFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(PIPE);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(595);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(596);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT_START() { return getToken(PythonParser.COMMENT_START, 0); }
		public TerminalNode COMMENT_END() { return getToken(PythonParser.COMMENT_END, 0); }
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_jinjaComment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(COMMENT_START);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(600);
					matchWildcard();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(606);
			match(COMMENT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends ParserRuleContext {
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public JinjaStatementContentContext jinjaStatementContent() {
			return getRuleContext(JinjaStatementContentContext.class,0);
		}
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(STMT_START);
			setState(609);
			jinjaStatementContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContentContext extends ParserRuleContext {
		public JinjaIfStatementsContext jinjaIfStatements() {
			return getRuleContext(JinjaIfStatementsContext.class,0);
		}
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaSetContext jinjaSet() {
			return getRuleContext(JinjaSetContext.class,0);
		}
		public JiniaExtendsContext jiniaExtends() {
			return getRuleContext(JiniaExtendsContext.class,0);
		}
		public JinjaIncludeContext jinjaInclude() {
			return getRuleContext(JinjaIncludeContext.class,0);
		}
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaLocalVariableContext jinjaLocalVariable() {
			return getRuleContext(JinjaLocalVariableContext.class,0);
		}
		public ImportSyntaxContext importSyntax() {
			return getRuleContext(ImportSyntaxContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public FromImportContext fromImport() {
			return getRuleContext(FromImportContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public JinjaStatementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatementContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaStatementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaStatementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaStatementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContentContext jinjaStatementContent() throws RecognitionException {
		JinjaStatementContentContext _localctx = new JinjaStatementContentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_jinjaStatementContent);
		try {
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				jinjaIfStatements();
				}
				break;
			case JINJA_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				jinjaFor();
				}
				break;
			case JINJA_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				jinjaSet();
				}
				break;
			case JINJA_EXTENDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				jiniaExtends();
				}
				break;
			case JINJA_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
				jinjaInclude();
				}
				break;
			case JINJA_BLOCK:
				enterOuterAlt(_localctx, 6);
				{
				setState(616);
				jinjaBlock();
				}
				break;
			case JINJA_WITH:
				enterOuterAlt(_localctx, 7);
				{
				setState(617);
				jinjaLocalVariable();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(618);
				importSyntax();
				setState(619);
				match(STMT_END);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 9);
				{
				setState(621);
				fromImport();
				setState(622);
				match(STMT_END);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(624);
				match(PRINT);
				setState(625);
				expressions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStatementsContext extends ParserRuleContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ENDIF() { return getToken(PythonParser.JINJA_ENDIF, 0); }
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public List<JinjaElifContext> jinjaElif() {
			return getRuleContexts(JinjaElifContext.class);
		}
		public JinjaElifContext jinjaElif(int i) {
			return getRuleContext(JinjaElifContext.class,i);
		}
		public JinjaElseContext jinjaElse() {
			return getRuleContext(JinjaElseContext.class,0);
		}
		public JinjaIfStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIfStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaIfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaIfStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaIfStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfStatementsContext jinjaIfStatements() throws RecognitionException {
		JinjaIfStatementsContext _localctx = new JinjaIfStatementsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jinjaIfStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			jinjaIf();
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(629);
					jinjaElif();
					}
					} 
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(635);
				jinjaElse();
				}
				break;
			}
			setState(638);
			match(STMT_START);
			setState(639);
			match(JINJA_ENDIF);
			setState(640);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends ParserRuleContext {
		public ExpressionsContext condition;
		public TerminalNode JINJA_IF() { return getToken(PythonParser.JINJA_IF, 0); }
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(JINJA_IF);
			setState(643);
			((JinjaIfContext)_localctx).condition = expressions();
			setState(644);
			match(STMT_END);
			setState(645);
			templateBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElifContext extends ParserRuleContext {
		public ExpressionsContext condition;
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(PythonParser.JINJA_ELIF, 0); }
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public JinjaElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElifContext jinjaElif() throws RecognitionException {
		JinjaElifContext _localctx = new JinjaElifContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jinjaElif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(STMT_START);
			setState(648);
			match(JINJA_ELIF);
			setState(649);
			((JinjaElifContext)_localctx).condition = expressions();
			setState(650);
			match(STMT_END);
			setState(651);
			templateBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElseContext extends ParserRuleContext {
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(PythonParser.JINJA_ELSE, 0); }
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseContext jinjaElse() throws RecognitionException {
		JinjaElseContext _localctx = new JinjaElseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jinjaElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(STMT_START);
			setState(654);
			match(JINJA_ELSE);
			setState(655);
			match(STMT_END);
			setState(656);
			templateBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends ParserRuleContext {
		public TerminalNode JINJA_FOR() { return getToken(PythonParser.JINJA_FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> STMT_END() { return getTokens(PythonParser.STMT_END); }
		public TerminalNode STMT_END(int i) {
			return getToken(PythonParser.STMT_END, i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ENDFOR() { return getToken(PythonParser.JINJA_ENDFOR, 0); }
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jinjaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(JINJA_FOR);
			setState(659);
			match(IDENTIFIER);
			setState(660);
			match(IN);
			setState(661);
			value();
			setState(662);
			match(STMT_END);
			setState(663);
			templateBody();
			setState(664);
			match(STMT_START);
			setState(665);
			match(JINJA_ENDFOR);
			setState(666);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSetContext extends ParserRuleContext {
		public TerminalNode JINJA_SET() { return getToken(PythonParser.JINJA_SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public JinjaSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSetContext jinjaSet() throws RecognitionException {
		JinjaSetContext _localctx = new JinjaSetContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jinjaSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(JINJA_SET);
			setState(669);
			match(IDENTIFIER);
			setState(670);
			match(ASSIGN);
			setState(671);
			expressions();
			setState(672);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JiniaExtendsContext extends ParserRuleContext {
		public TerminalNode JINJA_EXTENDS() { return getToken(PythonParser.JINJA_EXTENDS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public JiniaExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jiniaExtends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJiniaExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJiniaExtends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJiniaExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JiniaExtendsContext jiniaExtends() throws RecognitionException {
		JiniaExtendsContext _localctx = new JiniaExtendsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jiniaExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(JINJA_EXTENDS);
			setState(675);
			atom();
			setState(676);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIncludeContext extends ParserRuleContext {
		public TerminalNode JINJA_INCLUDE() { return getToken(PythonParser.JINJA_INCLUDE, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(PythonParser.STMT_END, 0); }
		public TerminalNode JINJA_IGNORE() { return getToken(PythonParser.JINJA_IGNORE, 0); }
		public TerminalNode JINJA_MISSING() { return getToken(PythonParser.JINJA_MISSING, 0); }
		public TerminalNode JINJA_CONTEXT() { return getToken(PythonParser.JINJA_CONTEXT, 0); }
		public TerminalNode JINJA_WITH() { return getToken(PythonParser.JINJA_WITH, 0); }
		public TerminalNode JINJA_WITHOUT() { return getToken(PythonParser.JINJA_WITHOUT, 0); }
		public JinjaIncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaInclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIncludeContext jinjaInclude() throws RecognitionException {
		JinjaIncludeContext _localctx = new JinjaIncludeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_jinjaInclude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(JINJA_INCLUDE);
			setState(679);
			atom();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IGNORE) {
				{
				setState(680);
				match(JINJA_IGNORE);
				setState(681);
				match(JINJA_MISSING);
				}
			}

			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_WITH || _la==JINJA_WITHOUT) {
				{
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==JINJA_WITH || _la==JINJA_WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				match(JINJA_CONTEXT);
				}
			}

			setState(688);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK() { return getToken(PythonParser.JINJA_BLOCK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STMT_END() { return getTokens(PythonParser.STMT_END); }
		public TerminalNode STMT_END(int i) {
			return getToken(PythonParser.STMT_END, i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ENDBLOCK() { return getToken(PythonParser.JINJA_ENDBLOCK, 0); }
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_jinjaBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(JINJA_BLOCK);
			setState(691);
			match(IDENTIFIER);
			setState(692);
			match(STMT_END);
			setState(693);
			templateBody();
			setState(694);
			match(STMT_START);
			setState(695);
			match(JINJA_ENDBLOCK);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(696);
				match(IDENTIFIER);
				}
			}

			setState(699);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaLocalVariableContext extends ParserRuleContext {
		public TerminalNode JINJA_WITH() { return getToken(PythonParser.JINJA_WITH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<TerminalNode> STMT_END() { return getTokens(PythonParser.STMT_END); }
		public TerminalNode STMT_END(int i) {
			return getToken(PythonParser.STMT_END, i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TerminalNode STMT_START() { return getToken(PythonParser.STMT_START, 0); }
		public TerminalNode JINJA_ENDWITH() { return getToken(PythonParser.JINJA_ENDWITH, 0); }
		public JinjaLocalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaLocalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaLocalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaLocalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaLocalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaLocalVariableContext jinjaLocalVariable() throws RecognitionException {
		JinjaLocalVariableContext _localctx = new JinjaLocalVariableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_jinjaLocalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(JINJA_WITH);
			setState(702);
			match(IDENTIFIER);
			setState(703);
			match(ASSIGN);
			setState(704);
			expressions();
			setState(705);
			match(STMT_END);
			setState(706);
			templateBody();
			setState(707);
			match(STMT_START);
			setState(708);
			match(JINJA_ENDWITH);
			setState(709);
			match(STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBodyContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<JinjaBodyContext> jinjaBody() {
			return getRuleContexts(JinjaBodyContext.class);
		}
		public JinjaBodyContext jinjaBody(int i) {
			return getRuleContext(JinjaBodyContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_templateBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(714);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(711);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(712);
						jinjaBody();
						}
						break;
					case 3:
						{
						setState(713);
						statement();
						}
						break;
					}
					} 
				}
				setState(718);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode HTML_START() { return getToken(PythonParser.HTML_START, 0); }
		public TerminalNode HTML_END() { return getToken(PythonParser.HTML_END, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(HTML_START);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524344L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 31877041112481803L) != 0)) {
				{
				{
				setState(720);
				htmlElement();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(HTML_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public JinjaBodyContext jinjaBody() {
			return getRuleContext(JinjaBodyContext.class,0);
		}
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlElement);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				htmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				selfClosingTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				jinjaBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				htmlText();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public StyleTagContext styleTag() {
			return getRuleContext(StyleTagContext.class,0);
		}
		public GenericHtmlContext genericHtml() {
			return getRuleContext(GenericHtmlContext.class,0);
		}
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlTag);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_STYLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				styleTag();
				}
				break;
			case TAG_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				genericHtml();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleTagContext extends ParserRuleContext {
		public TerminalNode HTML_STYLE_START() { return getToken(PythonParser.HTML_STYLE_START, 0); }
		public TerminalNode STYLE_END() { return getToken(PythonParser.STYLE_END, 0); }
		public List<CssContext> css() {
			return getRuleContexts(CssContext.class);
		}
		public CssContext css(int i) {
			return getRuleContext(CssContext.class,i);
		}
		public StyleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleTagContext styleTag() throws RecognitionException {
		StyleTagContext _localctx = new StyleTagContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_styleTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(HTML_STYLE_START);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 140737488355331L) != 0)) {
				{
				{
				setState(739);
				css();
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
			match(STYLE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericHtmlContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> TAG_OPEN() { return getTokens(PythonParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(PythonParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(PythonParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(PythonParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH() { return getToken(PythonParser.TAG_SLASH, 0); }
		public List<TerminalNode> HTML_TAG_NAME() { return getTokens(PythonParser.HTML_TAG_NAME); }
		public TerminalNode HTML_TAG_NAME(int i) {
			return getToken(PythonParser.HTML_TAG_NAME, i);
		}
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public GenericHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGenericHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGenericHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenericHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericHtmlContext genericHtml() throws RecognitionException {
		GenericHtmlContext _localctx = new GenericHtmlContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_genericHtml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(TAG_OPEN);
			setState(748);
			((GenericHtmlContext)_localctx).name = match(HTML_TAG_NAME);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) {
				{
				{
				setState(749);
				htmlAttributes();
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
			match(TAG_CLOSE);
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(756);
					htmlElement();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(762);
			match(TAG_OPEN);
			setState(763);
			match(TAG_SLASH);
			setState(764);
			match(HTML_TAG_NAME);
			setState(765);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public Token name;
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH() { return getToken(PythonParser.TAG_SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(PythonParser.HTML_TAG_NAME, 0); }
		public List<HtmlAttributesContext> htmlAttributes() {
			return getRuleContexts(HtmlAttributesContext.class);
		}
		public HtmlAttributesContext htmlAttributes(int i) {
			return getRuleContext(HtmlAttributesContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(TAG_OPEN);
			setState(768);
			((SelfClosingTagContext)_localctx).name = match(HTML_TAG_NAME);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) {
				{
				{
				setState(769);
				htmlAttributes();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			match(TAG_SLASH);
			setState(776);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public TerminalNode HTML_ASSIGN() { return getToken(PythonParser.HTML_ASSIGN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public TerminalNode HTML_ATTR_NAME() { return getToken(PythonParser.HTML_ATTR_NAME, 0); }
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(779);
			match(HTML_ASSIGN);
			setState(780);
			attributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumAttrValueContext extends AttributeValueContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JnjiaAttrValueContext extends AttributeValueContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JnjiaAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJnjiaAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJnjiaAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJnjiaAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrAttrValueContext extends AttributeValueContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StrAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAttrValueContext extends AttributeValueContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_attributeValue);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StrAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				match(IDENTIFIER);
				}
				break;
			case EXPR_START:
				_localctx = new JnjiaAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(785);
				jinjaExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public HtmlTextPartContext htmlTextPart;
		public List<HtmlTextPartContext> parts = new ArrayList<HtmlTextPartContext>();
		public List<HtmlTextPartContext> htmlTextPart() {
			return getRuleContexts(HtmlTextPartContext.class);
		}
		public HtmlTextPartContext htmlTextPart(int i) {
			return getRuleContext(HtmlTextPartContext.class,i);
		}
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_htmlText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(789); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(788);
					((HtmlTextContext)_localctx).htmlTextPart = htmlTextPart();
					((HtmlTextContext)_localctx).parts.add(((HtmlTextContext)_localctx).htmlTextPart);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(791); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextPartContext extends ParserRuleContext {
		public HtmlTextPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTextPart; }
	 
		public HtmlTextPartContext() { }
		public void copyFrom(HtmlTextPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAsTextContext extends HtmlTextPartContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public ClassAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassAsText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTextContext extends HtmlTextPartContext {
		public TerminalNode HTML_TEXT() { return getToken(PythonParser.HTML_TEXT, 0); }
		public NormalTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNormalText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNormalText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNormalText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagAsTextContext extends HtmlTextPartContext {
		public TerminalNode HTML_TAG_NAME() { return getToken(PythonParser.HTML_TAG_NAME, 0); }
		public TagAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTagAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTagAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTagAsText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAsTextContext extends HtmlTextPartContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdAsText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedTextContext extends HtmlTextPartContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public QuotedTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitQuotedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitQuotedText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrAsTextContext extends HtmlTextPartContext {
		public TerminalNode HTML_ATTR_NAME() { return getToken(PythonParser.HTML_ATTR_NAME, 0); }
		public AttrAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttrAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttrAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttrAsText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAsTextContext extends HtmlTextPartContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterJinjaAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitJinjaAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitJinjaAsText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAsTextContext extends HtmlTextPartContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberAsTextContext(HtmlTextPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumberAsText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumberAsText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberAsText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextPartContext htmlTextPart() throws RecognitionException {
		HtmlTextPartContext _localctx = new HtmlTextPartContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_htmlTextPart);
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new NormalTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(HTML_TEXT);
				}
				break;
			case STRING:
				_localctx = new QuotedTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(STRING);
				}
				break;
			case HTML_TAG_NAME:
				_localctx = new TagAsTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				match(HTML_TAG_NAME);
				}
				break;
			case HTML_ATTR_NAME:
				_localctx = new AttrAsTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				match(HTML_ATTR_NAME);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAsTextContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				match(IDENTIFIER);
				}
				break;
			case CLASS:
				_localctx = new ClassAsTextContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(798);
				match(CLASS);
				}
				break;
			case NUMBER:
				_localctx = new NumberAsTextContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(799);
				match(NUMBER);
				}
				break;
			case EXPR_START:
				_localctx = new JinjaAsTextContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(800);
				jinjaExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_PROPERTY_START() { return getToken(PythonParser.CSS_PROPERTY_START, 0); }
		public TerminalNode CSS_PROPERTY_END() { return getToken(PythonParser.CSS_PROPERTY_END, 0); }
		public List<CssKeyValueContext> cssKeyValue() {
			return getRuleContexts(CssKeyValueContext.class);
		}
		public CssKeyValueContext cssKeyValue(int i) {
			return getRuleContext(CssKeyValueContext.class,i);
		}
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			cssSelector(0);
			setState(804);
			match(CSS_PROPERTY_START);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(805);
				cssKeyValue();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(CSS_PROPERTY_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
	 
		public CssSelectorContext() { }
		public void copyFrom(CssSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendantSelectorContext extends CssSelectorContext {
		public CssSelectorContext left;
		public CssSelectorContext right;
		public TerminalNode CSS_WS() { return getToken(PythonParser.CSS_WS, 0); }
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public DescendantSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDescendantSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDescendantSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends CssSelectorContext {
		public TerminalNode HASHTAG() { return getToken(PythonParser.HASHTAG, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public IdSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends CssSelectorContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public ClassSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends CssSelectorContext {
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public SimpleSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		return cssSelector(0);
	}

	private CssSelectorContext cssSelector(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, _parentState);
		CssSelectorContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_cssSelector, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				_localctx = new ClassSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(814);
				match(DOT);
				setState(815);
				selectorName();
				}
				break;
			case HASHTAG:
				{
				_localctx = new IdSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(816);
				match(HASHTAG);
				setState(817);
				selectorName();
				}
				break;
			case CSS_ID:
				{
				_localctx = new SimpleSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(818);
				selectorName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DescendantSelectorContext(new CssSelectorContext(_parentctx, _parentState));
					((DescendantSelectorContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cssSelector);
					setState(821);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(822);
					match(CSS_WS);
					setState(823);
					((DescendantSelectorContext)_localctx).right = cssSelector(2);
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorNameContext extends ParserRuleContext {
		public List<TerminalNode> CSS_ID() { return getTokens(PythonParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(PythonParser.CSS_ID, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PythonParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PythonParser.MINUS, i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_selectorName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(CSS_ID);
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					match(MINUS);
					setState(831);
					match(CSS_ID);
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyValueContext extends ParserRuleContext {
		public TerminalNode CSS_ID() { return getToken(PythonParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(PythonParser.CSS_COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(PythonParser.CSS_SEMI, 0); }
		public CssKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyValueContext cssKeyValue() throws RecognitionException {
		CssKeyValueContext _localctx = new CssKeyValueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cssKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(CSS_ID);
			setState(838);
			match(CSS_COLON);
			setState(839);
			cssValue();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(840);
				match(CSS_SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStrValueContext extends CssValueContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public CssStrValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssStrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssStrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdValueContext extends CssValueContext {
		public TerminalNode CSS_ID() { return getToken(PythonParser.CSS_ID, 0); }
		public CssIdValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssIdValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssIdValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumValueContext extends CssValueContext {
		public TerminalNode CSS_NUMBER() { return getToken(PythonParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_TYPE() { return getToken(PythonParser.CSS_TYPE, 0); }
		public CssNumValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssNumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssNumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssNumValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssJinjaValueContext extends CssValueContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public CssJinjaValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssJinjaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssJinjaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssJinjaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHexValueContext extends CssValueContext {
		public TerminalNode CSS_HEX() { return getToken(PythonParser.CSS_HEX, 0); }
		public CssHexValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCssHexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCssHexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCssHexValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_cssValue);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_HEX:
				_localctx = new CssHexValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(CSS_HEX);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(CSS_NUMBER);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_TYPE) {
					{
					setState(845);
					match(CSS_TYPE);
					}
				}

				}
				break;
			case CSS_ID:
				_localctx = new CssIdValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				match(CSS_ID);
				}
				break;
			case STRING:
				_localctx = new CssStrValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(STRING);
				}
				break;
			case EXPR_START:
				_localctx = new CssJinjaValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				jinjaExpression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return mathematicalExpressions_sempred((MathematicalExpressionsContext)_localctx, predIndex);
		case 15:
			return logicalExpressions_sempred((LogicalExpressionsContext)_localctx, predIndex);
		case 75:
			return cssSelector_sempred((CssSelectorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathematicalExpressions_sempred(MathematicalExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalExpressions_sempred(LogicalExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cssSelector_sempred(CssSelectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001x\u0356\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000\u0005\u0000"+
		"\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u00ad\b\u0001\n\u0001\f\u0001\u00b0\t\u0001\u0001\u0001\u0003\u0001"+
		"\u00b3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00bb\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c3\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00d1\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00df\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t\u00e8\b\t\u0001\t\u0001\t\u0005"+
		"\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00f5\b\n\n\n\f\n\u00f8\t\n\u0003\n\u00fa\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0105"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u012a\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0132"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0146\b\u000e\n\u000e\f\u000e\u0149\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0150\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0158\b\u000f\n\u000f\f\u000f\u015b\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u015f\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0163"+
		"\b\u0011\n\u0011\f\u0011\u0166\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u016d\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0172\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0177\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017b\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0181"+
		"\b\u0014\n\u0014\f\u0014\u0184\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0188\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0195\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u019d\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01a5\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01ac\b\u001d\n\u001d\f\u001d\u01af\t\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01b3\b\u001d\u0001\u001d\u0005\u001d\u01b6\b\u001d\n\u001d\f\u001d"+
		"\u01b9\t\u001d\u0003\u001d\u01bb\b\u001d\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01bf\b\u001e\n\u001e\f\u001e\u01c2\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01c8\b\u001f\n\u001f\f\u001f\u01cb"+
		"\t\u001f\u0001\u001f\u0003\u001f\u01ce\b\u001f\u0001 \u0001 \u0003 \u01d2"+
		"\b \u0001 \u0001 \u0003 \u01d6\b \u0001 \u0001 \u0001!\u0001!\u0003!\u01dc"+
		"\b!\u0001!\u0001!\u0003!\u01e0\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0005%\u01f4\b%\n%\f%\u01f7\t%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01fd\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005"+
		"&\u0205\b&\n&\f&\u0208\t&\u0001\'\u0001\'\u0001\'\u0003\'\u020d\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u0213\b(\n(\f(\u0216\t(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0005*\u021d\b*\n*\f*\u0220\t*\u0001*\u0001*\u0001+\u0001"+
		"+\u0003+\u0226\b+\u0001+\u0001+\u0003+\u022a\b+\u0001,\u0001,\u0001,\u0001"+
		"-\u0005-\u0230\b-\n-\f-\u0233\t-\u0001-\u0001-\u0001-\u0003-\u0238\b-"+
		"\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003"+
		"/\u0243\b/\u00010\u00010\u00010\u00010\u00030\u0249\b0\u00010\u00050\u024c"+
		"\b0\n0\f0\u024f\t0\u00010\u00010\u00011\u00011\u00011\u00031\u0256\b1"+
		"\u00012\u00012\u00052\u025a\b2\n2\f2\u025d\t2\u00012\u00012\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0273\b4\u00015\u0001"+
		"5\u00055\u0277\b5\n5\f5\u027a\t5\u00015\u00035\u027d\b5\u00015\u00015"+
		"\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u02ab\b<\u0001<\u0001<\u0003<\u02af\b<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u02ba\b=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0005?\u02cb\b?\n?\f?\u02ce\t?\u0001@\u0001"+
		"@\u0005@\u02d2\b@\n@\f@\u02d5\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u02dd\bA\u0001B\u0001B\u0003B\u02e1\bB\u0001C\u0001C\u0005C\u02e5"+
		"\bC\nC\fC\u02e8\tC\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u02ef\bD"+
		"\nD\fD\u02f2\tD\u0001D\u0001D\u0005D\u02f6\bD\nD\fD\u02f9\tD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0005E\u0303\bE\nE\fE\u0306"+
		"\tE\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u0313\bG\u0001H\u0004H\u0316\bH\u000bH\fH\u0317\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u0322\bI\u0001"+
		"J\u0001J\u0001J\u0005J\u0327\bJ\nJ\fJ\u032a\tJ\u0001J\u0001J\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0003K\u0334\bK\u0001K\u0001K\u0001K\u0005"+
		"K\u0339\bK\nK\fK\u033c\tK\u0001L\u0001L\u0001L\u0005L\u0341\bL\nL\fL\u0344"+
		"\tL\u0001M\u0001M\u0001M\u0001M\u0003M\u034a\bM\u0001N\u0001N\u0001N\u0003"+
		"N\u034f\bN\u0001N\u0001N\u0001N\u0003N\u0354\bN\u0001N\u0001\u025b\u0003"+
		"\u001c\u001e\u0096O\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u0000\u0004\u0002\u0000\u001b\u001b22\u0002"+
		"\u0000\u001c\u001c33\u0002\u0000]]__\u0003\u0000\u0013\u0013DDvv\u0391"+
		"\u0000\u00a1\u0001\u0000\u0000\u0000\u0002\u00b2\u0001\u0000\u0000\u0000"+
		"\u0004\u00ba\u0001\u0000\u0000\u0000\u0006\u00c2\u0001\u0000\u0000\u0000"+
		"\b\u00c4\u0001\u0000\u0000\u0000\n\u00d0\u0001\u0000\u0000\u0000\f\u00d2"+
		"\u0001\u0000\u0000\u0000\u000e\u00d6\u0001\u0000\u0000\u0000\u0010\u00e2"+
		"\u0001\u0000\u0000\u0000\u0012\u00e7\u0001\u0000\u0000\u0000\u0014\u00f0"+
		"\u0001\u0000\u0000\u0000\u0016\u00fd\u0001\u0000\u0000\u0000\u0018\u0104"+
		"\u0001\u0000\u0000\u0000\u001a\u0131\u0001\u0000\u0000\u0000\u001c\u0133"+
		"\u0001\u0000\u0000\u0000\u001e\u014f\u0001\u0000\u0000\u0000 \u015e\u0001"+
		"\u0000\u0000\u0000\"\u0160\u0001\u0000\u0000\u0000$\u016c\u0001\u0000"+
		"\u0000\u0000&\u017a\u0001\u0000\u0000\u0000(\u017c\u0001\u0000\u0000\u0000"+
		"*\u0187\u0001\u0000\u0000\u0000,\u0189\u0001\u0000\u0000\u0000.\u018d"+
		"\u0001\u0000\u0000\u00000\u0194\u0001\u0000\u0000\u00002\u0196\u0001\u0000"+
		"\u0000\u00004\u019a\u0001\u0000\u0000\u00006\u019e\u0001\u0000\u0000\u0000"+
		"8\u01a1\u0001\u0000\u0000\u0000:\u01ba\u0001\u0000\u0000\u0000<\u01bc"+
		"\u0001\u0000\u0000\u0000>\u01c5\u0001\u0000\u0000\u0000@\u01cf\u0001\u0000"+
		"\u0000\u0000B\u01d9\u0001\u0000\u0000\u0000D\u01e3\u0001\u0000\u0000\u0000"+
		"F\u01e6\u0001\u0000\u0000\u0000H\u01ec\u0001\u0000\u0000\u0000J\u01f5"+
		"\u0001\u0000\u0000\u0000L\u0201\u0001\u0000\u0000\u0000N\u0209\u0001\u0000"+
		"\u0000\u0000P\u020e\u0001\u0000\u0000\u0000R\u0217\u0001\u0000\u0000\u0000"+
		"T\u0219\u0001\u0000\u0000\u0000V\u0225\u0001\u0000\u0000\u0000X\u022b"+
		"\u0001\u0000\u0000\u0000Z\u0231\u0001\u0000\u0000\u0000\\\u023b\u0001"+
		"\u0000\u0000\u0000^\u0242\u0001\u0000\u0000\u0000`\u0244\u0001\u0000\u0000"+
		"\u0000b\u0252\u0001\u0000\u0000\u0000d\u0257\u0001\u0000\u0000\u0000f"+
		"\u0260\u0001\u0000\u0000\u0000h\u0272\u0001\u0000\u0000\u0000j\u0274\u0001"+
		"\u0000\u0000\u0000l\u0282\u0001\u0000\u0000\u0000n\u0287\u0001\u0000\u0000"+
		"\u0000p\u028d\u0001\u0000\u0000\u0000r\u0292\u0001\u0000\u0000\u0000t"+
		"\u029c\u0001\u0000\u0000\u0000v\u02a2\u0001\u0000\u0000\u0000x\u02a6\u0001"+
		"\u0000\u0000\u0000z\u02b2\u0001\u0000\u0000\u0000|\u02bd\u0001\u0000\u0000"+
		"\u0000~\u02cc\u0001\u0000\u0000\u0000\u0080\u02cf\u0001\u0000\u0000\u0000"+
		"\u0082\u02dc\u0001\u0000\u0000\u0000\u0084\u02e0\u0001\u0000\u0000\u0000"+
		"\u0086\u02e2\u0001\u0000\u0000\u0000\u0088\u02eb\u0001\u0000\u0000\u0000"+
		"\u008a\u02ff\u0001\u0000\u0000\u0000\u008c\u030a\u0001\u0000\u0000\u0000"+
		"\u008e\u0312\u0001\u0000\u0000\u0000\u0090\u0315\u0001\u0000\u0000\u0000"+
		"\u0092\u0321\u0001\u0000\u0000\u0000\u0094\u0323\u0001\u0000\u0000\u0000"+
		"\u0096\u0333\u0001\u0000\u0000\u0000\u0098\u033d\u0001\u0000\u0000\u0000"+
		"\u009a\u0345\u0001\u0000\u0000\u0000\u009c\u0353\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0000\u0000\u0001"+
		"\u00a5\u0001\u0001\u0000\u0000\u0000\u00a6\u00b3\u0003^/\u0000\u00a7\u00b3"+
		"\u0003\u0006\u0003\u0000\u00a8\u00b3\u0003\u0094J\u0000\u00a9\u00ae\u0003"+
		"\u0004\u0002\u0000\u00aa\u00ab\u0005;\u0000\u0000\u00ab\u00ad\u0003\u0004"+
		"\u0002\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0003\u0080@\u0000\u00b2\u00a6\u0001\u0000\u0000"+
		"\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000\u00b2\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u0003\u0001\u0000\u0000\u0000\u00b4\u00bb\u0003*\u0015\u0000"+
		"\u00b5\u00bb\u0003\b\u0004\u0000\u00b6\u00bb\u00038\u001c\u0000\u00b7"+
		"\u00bb\u0003P(\u0000\u00b8\u00bb\u0003T*\u0000\u00b9\u00bb\u0003(\u0014"+
		"\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0005\u0001\u0000\u0000\u0000\u00bc\u00c3\u0003>\u001f\u0000"+
		"\u00bd\u00c3\u0003F#\u0000\u00be\u00c3\u0003H$\u0000\u00bf\u00c3\u0003"+
		"J%\u0000\u00c0\u00c3\u0003Z-\u0000\u00c1\u00c3\u0003\u0018\f\u0000\u00c2"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2"+
		"\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u0007\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005D\u0000\u0000\u00c5\u00c6"+
		"\u00051\u0000\u0000\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\t\u0001\u0000"+
		"\u0000\u0000\u00c8\u00d1\u0003R)\u0000\u00c9\u00d1\u0003\"\u0011\u0000"+
		"\u00ca\u00d1\u0003\u0018\f\u0000\u00cb\u00d1\u0003\f\u0006\u0000\u00cc"+
		"\u00d1\u0003\u0010\b\u0000\u00cd\u00d1\u0003\u0014\n\u0000\u00ce\u00d1"+
		"\u0003T*\u0000\u00cf\u00d1\u0003\u000e\u0007\u0000\u00d0\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u000b\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u00056\u0000\u0000\u00d3\u00d4\u0003\u0012\t"+
		"\u0000\u00d4\u00d5\u00057\u0000\u0000\u00d5\r\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u00056\u0000\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8"+
		"\u00d9\u0005\u000e\u0000\u0000\u00d9\u00da\u0005D\u0000\u0000\u00da\u00db"+
		"\u0005\u001e\u0000\u0000\u00db\u00de\u0003\n\u0005\u0000\u00dc\u00dd\u0005"+
		"\u000b\u0000\u0000\u00dd\u00df\u0003\u0018\f\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u00057\u0000\u0000\u00e1\u000f\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u00054\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000"+
		"\u00e4\u00e5\u00055\u0000\u0000\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0003\n\u0005\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005<\u0000\u0000\u00ea\u00ec\u0003\n\u0005\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0013\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f9\u0005"+
		"8\u0000\u0000\u00f1\u00f6\u0003\u0016\u000b\u0000\u00f2\u00f3\u0005<\u0000"+
		"\u0000\u00f3\u00f5\u0003\u0016\u000b\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u00059\u0000\u0000\u00fc\u0015\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005B\u0000\u0000\u00fe\u00ff\u0005:\u0000\u0000\u00ff\u0100"+
		"\u0003\n\u0005\u0000\u0100\u0017\u0001\u0000\u0000\u0000\u0101\u0105\u0003"+
		"\u001e\u000f\u0000\u0102\u0105\u0003\u001a\r\u0000\u0103\u0105\u0003\u001c"+
		"\u000e\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0019\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0003\u001c\u000e\u0000\u0107\u0108\u0005)\u0000"+
		"\u0000\u0108\u0109\u0003\u001c\u000e\u0000\u0109\u0132\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0003\u001c\u000e\u0000\u010b\u010c\u0005*\u0000\u0000"+
		"\u010c\u010d\u0003\u001c\u000e\u0000\u010d\u0132\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0003\u001c\u000e\u0000\u010f\u0110\u0005+\u0000\u0000\u0110"+
		"\u0111\u0003\u001c\u000e\u0000\u0111\u0132\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0003\u001c\u000e\u0000\u0113\u0114\u0005,\u0000\u0000\u0114\u0115"+
		"\u0003\u001c\u000e\u0000\u0115\u0132\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0003\u001c\u000e\u0000\u0117\u0118\u0005-\u0000\u0000\u0118\u0119\u0003"+
		"\u001c\u000e\u0000\u0119\u0132\u0001\u0000\u0000\u0000\u011a\u011b\u0003"+
		"\u001c\u000e\u0000\u011b\u011c\u0005/\u0000\u0000\u011c\u011d\u0003\u001c"+
		"\u000e\u0000\u011d\u0132\u0001\u0000\u0000\u0000\u011e\u011f\u0003\u001c"+
		"\u000e\u0000\u011f\u0120\u0005.\u0000\u0000\u0120\u0121\u0003\u001c\u000e"+
		"\u0000\u0121\u0132\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u001c\u000e"+
		"\u0000\u0123\u0124\u00050\u0000\u0000\u0124\u0125\u0003\u001c\u000e\u0000"+
		"\u0125\u0132\u0001\u0000\u0000\u0000\u0126\u0127\u0003\u001c\u000e\u0000"+
		"\u0127\u0129\u0005\u001f\u0000\u0000\u0128\u012a\u0005\u001d\u0000\u0000"+
		"\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u001c\u000e\u0000"+
		"\u012c\u0132\u0001\u0000\u0000\u0000\u012d\u012e\u0003\u001c\u000e\u0000"+
		"\u012e\u012f\u0005\u001e\u0000\u0000\u012f\u0130\u0003\u001c\u000e\u0000"+
		"\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0106\u0001\u0000\u0000\u0000"+
		"\u0131\u010a\u0001\u0000\u0000\u0000\u0131\u010e\u0001\u0000\u0000\u0000"+
		"\u0131\u0112\u0001\u0000\u0000\u0000\u0131\u0116\u0001\u0000\u0000\u0000"+
		"\u0131\u011a\u0001\u0000\u0000\u0000\u0131\u011e\u0001\u0000\u0000\u0000"+
		"\u0131\u0122\u0001\u0000\u0000\u0000\u0131\u0126\u0001\u0000\u0000\u0000"+
		"\u0131\u012d\u0001\u0000\u0000\u0000\u0132\u001b\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0006\u000e\uffff\uffff\u0000\u0134\u0135\u0003 \u0010\u0000"+
		"\u0135\u0147\u0001\u0000\u0000\u0000\u0136\u0137\n\u0006\u0000\u0000\u0137"+
		"\u0138\u0005$\u0000\u0000\u0138\u0146\u0003\u001c\u000e\u0007\u0139\u013a"+
		"\n\u0005\u0000\u0000\u013a\u013b\u0005%\u0000\u0000\u013b\u0146\u0003"+
		"\u001c\u000e\u0006\u013c\u013d\n\u0004\u0000\u0000\u013d\u013e\u0005&"+
		"\u0000\u0000\u013e\u0146\u0003\u001c\u000e\u0005\u013f\u0140\n\u0003\u0000"+
		"\u0000\u0140\u0141\u0005\'\u0000\u0000\u0141\u0146\u0003\u001c\u000e\u0004"+
		"\u0142\u0143\n\u0002\u0000\u0000\u0143\u0144\u0005(\u0000\u0000\u0144"+
		"\u0146\u0003\u001c\u000e\u0003\u0145\u0136\u0001\u0000\u0000\u0000\u0145"+
		"\u0139\u0001\u0000\u0000\u0000\u0145\u013c\u0001\u0000\u0000\u0000\u0145"+
		"\u013f\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u001d\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0006\u000f\uffff\uffff\u0000"+
		"\u014b\u014c\u0005\u001d\u0000\u0000\u014c\u0150\u0003\u001e\u000f\u0003"+
		"\u014d\u0150\u0003\u001a\r\u0000\u014e\u0150\u0003 \u0010\u0000\u014f"+
		"\u014a\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0159\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\n\u0005\u0000\u0000\u0152\u0153\u0007\u0000\u0000\u0000\u0153\u0158"+
		"\u0003\u001e\u000f\u0006\u0154\u0155\n\u0004\u0000\u0000\u0155\u0156\u0007"+
		"\u0001\u0000\u0000\u0156\u0158\u0003\u001e\u000f\u0005\u0157\u0151\u0001"+
		"\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0158\u015b\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u001f\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0003\"\u0011\u0000\u015d\u015f\u0003T"+
		"*\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000"+
		"\u0000\u015f!\u0001\u0000\u0000\u0000\u0160\u0164\u0003$\u0012\u0000\u0161"+
		"\u0163\u0003&\u0013\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165#\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0167\u016d\u0005D\u0000\u0000\u0168\u016d\u0005A\u0000"+
		"\u0000\u0169\u016d\u0005B\u0000\u0000\u016a\u016d\u0005\b\u0000\u0000"+
		"\u016b\u016d\u0005\t\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c"+
		"\u0168\u0001\u0000\u0000\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"%\u0001\u0000\u0000\u0000\u016e\u0171\u0005=\u0000\u0000\u016f\u0172\u0005"+
		"D\u0000\u0000\u0170\u0172\u0003T*\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u017b\u0001\u0000\u0000"+
		"\u0000\u0173\u0176\u00056\u0000\u0000\u0174\u0177\u0003\u0018\f\u0000"+
		"\u0175\u0177\u0003\"\u0011\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u00057\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u016e"+
		"\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000\u0000\u0000\u017b\'\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005#\u0000\u0000\u017d\u0182\u0005D\u0000"+
		"\u0000\u017e\u017f\u0005<\u0000\u0000\u017f\u0181\u0005D\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		")\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188"+
		"\u0003,\u0016\u0000\u0186\u0188\u0003.\u0017\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188+\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005\u0006\u0000\u0000\u018a\u018b\u00030\u0018\u0000"+
		"\u018b\u018c\u00034\u001a\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0007\u0000\u0000\u018e\u018f\u00030\u0018\u0000\u018f\u0190\u0005"+
		"\u0006\u0000\u0000\u0190\u0191\u00032\u0019\u0000\u0191/\u0001\u0000\u0000"+
		"\u0000\u0192\u0195\u0005D\u0000\u0000\u0193\u0195\u0005B\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195"+
		"1\u0001\u0000\u0000\u0000\u0196\u0197\u00034\u001a\u0000\u0197\u0198\u0005"+
		"<\u0000\u0000\u0198\u0199\u00034\u001a\u0000\u01993\u0001\u0000\u0000"+
		"\u0000\u019a\u019c\u0005D\u0000\u0000\u019b\u019d\u00036\u001b\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d"+
		"5\u0001\u0000\u0000\u0000\u019e\u019f\u0005 \u0000\u0000\u019f\u01a0\u0005"+
		"D\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0012\u0000"+
		"\u0000\u01a2\u01a4\u00054\u0000\u0000\u01a3\u01a5\u0003:\u001d\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u00055\u0000\u0000\u01a79\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ad\u0003\n\u0005\u0000\u01a9\u01aa\u0005<"+
		"\u0000\u0000\u01aa\u01ac\u0003\n\u0005\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01bb\u0001\u0000\u0000"+
		"\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b7\u0003\u0018\f\u0000"+
		"\u01b1\u01b3\u0005<\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0003\u0018\f\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01a8\u0001\u0000\u0000\u0000\u01ba\u01b0"+
		"\u0001\u0000\u0000\u0000\u01bb;\u0001\u0000\u0000\u0000\u01bc\u01c0\u0005"+
		"8\u0000\u0000\u01bd\u01bf\u0003\u0002\u0001\u0000\u01be\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u00059\u0000"+
		"\u0000\u01c4=\u0001\u0000\u0000\u0000\u01c5\u01c9\u0003@ \u0000\u01c6"+
		"\u01c8\u0003B!\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001"+
		"\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cc\u01ce\u0003D\"\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce?\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d1\u0005\u000b\u0000\u0000\u01d0\u01d2\u00054\u0000\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003\u001e\u000f\u0000"+
		"\u01d4\u01d6\u00055\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0003<\u001e\u0000\u01d8A\u0001\u0000\u0000\u0000\u01d9\u01db\u0005"+
		"\f\u0000\u0000\u01da\u01dc\u00054\u0000\u0000\u01db\u01da\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01df\u0003\u001e\u000f\u0000\u01de\u01e0\u00055\u0000"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0003<\u001e\u0000"+
		"\u01e2C\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\r\u0000\u0000\u01e4"+
		"\u01e5\u0003<\u001e\u0000\u01e5E\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		"\u000e\u0000\u0000\u01e7\u01e8\u0005D\u0000\u0000\u01e8\u01e9\u0005\u001e"+
		"\u0000\u0000\u01e9\u01ea\u0003\n\u0005\u0000\u01ea\u01eb\u0003<\u001e"+
		"\u0000\u01ebG\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u000f\u0000\u0000"+
		"\u01ed\u01ee\u00054\u0000\u0000\u01ee\u01ef\u0003\u0018\f\u0000\u01ef"+
		"\u01f0\u00055\u0000\u0000\u01f0\u01f1\u0003<\u001e\u0000\u01f1I\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f4\u0003X,\u0000\u01f3\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u0010\u0000"+
		"\u0000\u01f9\u01fa\u0005D\u0000\u0000\u01fa\u01fc\u00054\u0000\u0000\u01fb"+
		"\u01fd\u0003L&\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005"+
		"5\u0000\u0000\u01ff\u0200\u0003<\u001e\u0000\u0200K\u0001\u0000\u0000"+
		"\u0000\u0201\u0206\u0003N\'\u0000\u0202\u0203\u0005<\u0000\u0000\u0203"+
		"\u0205\u0003N\'\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0208"+
		"\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207M\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0209\u020c\u0005D\u0000\u0000\u020a\u020b\u00051\u0000"+
		"\u0000\u020b\u020d\u0003\n\u0005\u0000\u020c\u020a\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0001\u0000\u0000\u0000\u020dO\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0005\u0011\u0000\u0000\u020f\u0214\u0003\n\u0005\u0000\u0210\u0211"+
		"\u0005<\u0000\u0000\u0211\u0213\u0003\n\u0005\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215Q\u0001\u0000"+
		"\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217\u0218\u0005C\u0000"+
		"\u0000\u0218S\u0001\u0000\u0000\u0000\u0219\u021a\u0005D\u0000\u0000\u021a"+
		"\u021e\u00054\u0000\u0000\u021b\u021d\u0003V+\u0000\u021c\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001"+
		"\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0005"+
		"5\u0000\u0000\u0222U\u0001\u0000\u0000\u0000\u0223\u0224\u0005D\u0000"+
		"\u0000\u0224\u0226\u00051\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0229\u0003\n\u0005\u0000\u0228\u022a\u0005<\u0000\u0000\u0229"+
		"\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"W\u0001\u0000\u0000\u0000\u022b\u022c\u0005?\u0000\u0000\u022c\u022d\u0003"+
		"\"\u0011\u0000\u022dY\u0001\u0000\u0000\u0000\u022e\u0230\u0003X,\u0000"+
		"\u022f\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0005\u0013\u0000\u0000\u0235\u0237\u0005D\u0000\u0000\u0236"+
		"\u0238\u0003\\.\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0003<\u001e\u0000\u023a[\u0001\u0000\u0000\u0000\u023b\u023c\u00054"+
		"\u0000\u0000\u023c\u023d\u0005D\u0000\u0000\u023d\u023e\u00055\u0000\u0000"+
		"\u023e]\u0001\u0000\u0000\u0000\u023f\u0243\u0003`0\u0000\u0240\u0243"+
		"\u0003f3\u0000\u0241\u0243\u0003d2\u0000\u0242\u023f\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0241\u0001\u0000\u0000"+
		"\u0000\u0243_\u0001\u0000\u0000\u0000\u0244\u0248\u0005\u0003\u0000\u0000"+
		"\u0245\u0249\u0003\"\u0011\u0000\u0246\u0249\u0003\u0018\f\u0000\u0247"+
		"\u0249\u0003\n\u0005\u0000\u0248\u0245\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024d"+
		"\u0001\u0000\u0000\u0000\u024a\u024c\u0003b1\u0000\u024b\u024a\u0001\u0000"+
		"\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0005G\u0000"+
		"\u0000\u0251a\u0001\u0000\u0000\u0000\u0252\u0255\u0005\"\u0000\u0000"+
		"\u0253\u0256\u0005D\u0000\u0000\u0254\u0256\u0003T*\u0000\u0255\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256c\u0001"+
		"\u0000\u0000\u0000\u0257\u025b\u0005\u0005\u0000\u0000\u0258\u025a\t\u0000"+
		"\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000"+
		"\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0005I\u0000\u0000\u025fe\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0005\u0004\u0000\u0000\u0261\u0262\u0003h4\u0000\u0262g"+
		"\u0001\u0000\u0000\u0000\u0263\u0273\u0003j5\u0000\u0264\u0273\u0003r"+
		"9\u0000\u0265\u0273\u0003t:\u0000\u0266\u0273\u0003v;\u0000\u0267\u0273"+
		"\u0003x<\u0000\u0268\u0273\u0003z=\u0000\u0269\u0273\u0003|>\u0000\u026a"+
		"\u026b\u0003,\u0016\u0000\u026b\u026c\u0005H\u0000\u0000\u026c\u0273\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0003.\u0017\u0000\u026e\u026f\u0005H\u0000"+
		"\u0000\u026f\u0273\u0001\u0000\u0000\u0000\u0270\u0271\u0005\u0012\u0000"+
		"\u0000\u0271\u0273\u0003\u0018\f\u0000\u0272\u0263\u0001\u0000\u0000\u0000"+
		"\u0272\u0264\u0001\u0000\u0000\u0000\u0272\u0265\u0001\u0000\u0000\u0000"+
		"\u0272\u0266\u0001\u0000\u0000\u0000\u0272\u0267\u0001\u0000\u0000\u0000"+
		"\u0272\u0268\u0001\u0000\u0000\u0000\u0272\u0269\u0001\u0000\u0000\u0000"+
		"\u0272\u026a\u0001\u0000\u0000\u0000\u0272\u026d\u0001\u0000\u0000\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0273i\u0001\u0000\u0000\u0000\u0274"+
		"\u0278\u0003l6\u0000\u0275\u0277\u0003n7\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027d\u0003p8\u0000"+
		"\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u0004\u0000\u0000"+
		"\u027f\u0280\u0005S\u0000\u0000\u0280\u0281\u0005H\u0000\u0000\u0281k"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0005P\u0000\u0000\u0283\u0284\u0003"+
		"\u0018\f\u0000\u0284\u0285\u0005H\u0000\u0000\u0285\u0286\u0003~?\u0000"+
		"\u0286m\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u0004\u0000\u0000\u0288"+
		"\u0289\u0005Q\u0000\u0000\u0289\u028a\u0003\u0018\f\u0000\u028a\u028b"+
		"\u0005H\u0000\u0000\u028b\u028c\u0003~?\u0000\u028co\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0005\u0004\u0000\u0000\u028e\u028f\u0005R\u0000\u0000"+
		"\u028f\u0290\u0005H\u0000\u0000\u0290\u0291\u0003~?\u0000\u0291q\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0005T\u0000\u0000\u0293\u0294\u0005D\u0000"+
		"\u0000\u0294\u0295\u0005\u001e\u0000\u0000\u0295\u0296\u0003\n\u0005\u0000"+
		"\u0296\u0297\u0005H\u0000\u0000\u0297\u0298\u0003~?\u0000\u0298\u0299"+
		"\u0005\u0004\u0000\u0000\u0299\u029a\u0005U\u0000\u0000\u029a\u029b\u0005"+
		"H\u0000\u0000\u029bs\u0001\u0000\u0000\u0000\u029c\u029d\u0005V\u0000"+
		"\u0000\u029d\u029e\u0005D\u0000\u0000\u029e\u029f\u00051\u0000\u0000\u029f"+
		"\u02a0\u0003\u0018\f\u0000\u02a0\u02a1\u0005H\u0000\u0000\u02a1u\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0005Y\u0000\u0000\u02a3\u02a4\u0003\""+
		"\u0011\u0000\u02a4\u02a5\u0005H\u0000\u0000\u02a5w\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0005Z\u0000\u0000\u02a7\u02aa\u0003\"\u0011\u0000\u02a8"+
		"\u02a9\u0005[\u0000\u0000\u02a9\u02ab\u0005\\\u0000\u0000\u02aa\u02a8"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0007\u0002\u0000\u0000\u02ad\u02af"+
		"\u0005`\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001"+
		"\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005"+
		"H\u0000\u0000\u02b1y\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005W\u0000"+
		"\u0000\u02b3\u02b4\u0005D\u0000\u0000\u02b4\u02b5\u0005H\u0000\u0000\u02b5"+
		"\u02b6\u0003~?\u0000\u02b6\u02b7\u0005\u0004\u0000\u0000\u02b7\u02b9\u0005"+
		"X\u0000\u0000\u02b8\u02ba\u0005D\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0005H\u0000\u0000\u02bc{\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0005]\u0000\u0000\u02be\u02bf\u0005D\u0000\u0000\u02bf\u02c0\u0005"+
		"1\u0000\u0000\u02c0\u02c1\u0003\u0018\f\u0000\u02c1\u02c2\u0005H\u0000"+
		"\u0000\u02c2\u02c3\u0003~?\u0000\u02c3\u02c4\u0005\u0004\u0000\u0000\u02c4"+
		"\u02c5\u0005^\u0000\u0000\u02c5\u02c6\u0005H\u0000\u0000\u02c6}\u0001"+
		"\u0000\u0000\u0000\u02c7\u02cb\u0003\u0082A\u0000\u02c8\u02cb\u0003^/"+
		"\u0000\u02c9\u02cb\u0003\u0002\u0001\u0000\u02ca\u02c7\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u007f\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d3\u0005@\u0000\u0000"+
		"\u02d0\u02d2\u0003\u0082A\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005p\u0000\u0000\u02d7\u0081"+
		"\u0001\u0000\u0000\u0000\u02d8\u02dd\u0003\u0084B\u0000\u02d9\u02dd\u0003"+
		"\u008aE\u0000\u02da\u02dd\u0003^/\u0000\u02db\u02dd\u0003\u0090H\u0000"+
		"\u02dc\u02d8\u0001\u0000\u0000\u0000\u02dc\u02d9\u0001\u0000\u0000\u0000"+
		"\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000"+
		"\u02dd\u0083\u0001\u0000\u0000\u0000\u02de\u02e1\u0003\u0086C\u0000\u02df"+
		"\u02e1\u0003\u0088D\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02df"+
		"\u0001\u0000\u0000\u0000\u02e1\u0085\u0001\u0000\u0000\u0000\u02e2\u02e6"+
		"\u0005o\u0000\u0000\u02e3\u02e5\u0003\u0094J\u0000\u02e4\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005k\u0000"+
		"\u0000\u02ea\u0087\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005q\u0000\u0000"+
		"\u02ec\u02f0\u0005u\u0000\u0000\u02ed\u02ef\u0003\u008cF\u0000\u02ee\u02ed"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f7"+
		"\u0005r\u0000\u0000\u02f4\u02f6\u0003\u0082A\u0000\u02f5\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005q\u0000"+
		"\u0000\u02fb\u02fc\u0005s\u0000\u0000\u02fc\u02fd\u0005u\u0000\u0000\u02fd"+
		"\u02fe\u0005r\u0000\u0000\u02fe\u0089\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u0005q\u0000\u0000\u0300\u0304\u0005u\u0000\u0000\u0301\u0303\u0003\u008c"+
		"F\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0005s\u0000\u0000\u0308\u0309\u0005r\u0000\u0000\u0309"+
		"\u008b\u0001\u0000\u0000\u0000\u030a\u030b\u0007\u0003\u0000\u0000\u030b"+
		"\u030c\u0005t\u0000\u0000\u030c\u030d\u0003\u008eG\u0000\u030d\u008d\u0001"+
		"\u0000\u0000\u0000\u030e\u0313\u0005B\u0000\u0000\u030f\u0313\u0005A\u0000"+
		"\u0000\u0310\u0313\u0005D\u0000\u0000\u0311\u0313\u0003`0\u0000\u0312"+
		"\u030e\u0001\u0000\u0000\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0312"+
		"\u0310\u0001\u0000\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313"+
		"\u008f\u0001\u0000\u0000\u0000\u0314\u0316\u0003\u0092I\u0000\u0315\u0314"+
		"\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0315"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0091"+
		"\u0001\u0000\u0000\u0000\u0319\u0322\u0005w\u0000\u0000\u031a\u0322\u0005"+
		"B\u0000\u0000\u031b\u0322\u0005u\u0000\u0000\u031c\u0322\u0005v\u0000"+
		"\u0000\u031d\u0322\u0005D\u0000\u0000\u031e\u0322\u0005\u0013\u0000\u0000"+
		"\u031f\u0322\u0005A\u0000\u0000\u0320\u0322\u0003`0\u0000\u0321\u0319"+
		"\u0001\u0000\u0000\u0000\u0321\u031a\u0001\u0000\u0000\u0000\u0321\u031b"+
		"\u0001\u0000\u0000\u0000\u0321\u031c\u0001\u0000\u0000\u0000\u0321\u031d"+
		"\u0001\u0000\u0000\u0000\u0321\u031e\u0001\u0000\u0000\u0000\u0321\u031f"+
		"\u0001\u0000\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322\u0093"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0003\u0096K\u0000\u0324\u0328\u0005"+
		"c\u0000\u0000\u0325\u0327\u0003\u009aM\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032c\u0005d\u0000\u0000"+
		"\u032c\u0095\u0001\u0000\u0000\u0000\u032d\u032e\u0006K\uffff\uffff\u0000"+
		"\u032e\u032f\u0005=\u0000\u0000\u032f\u0334\u0003\u0098L\u0000\u0330\u0331"+
		"\u0005>\u0000\u0000\u0331\u0334\u0003\u0098L\u0000\u0332\u0334\u0003\u0098"+
		"L\u0000\u0333\u032d\u0001\u0000\u0000\u0000\u0333\u0330\u0001\u0000\u0000"+
		"\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0334\u033a\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\n\u0001\u0000\u0000\u0336\u0337\u0005b\u0000\u0000"+
		"\u0337\u0339\u0003\u0096K\u0002\u0338\u0335\u0001\u0000\u0000\u0000\u0339"+
		"\u033c\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0001\u0000\u0000\u0000\u033b\u0097\u0001\u0000\u0000\u0000\u033c"+
		"\u033a\u0001\u0000\u0000\u0000\u033d\u0342\u0005l\u0000\u0000\u033e\u033f"+
		"\u0005%\u0000\u0000\u033f\u0341\u0005l\u0000\u0000\u0340\u033e\u0001\u0000"+
		"\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0099\u0001\u0000"+
		"\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0346\u0005l\u0000"+
		"\u0000\u0346\u0347\u0005e\u0000\u0000\u0347\u0349\u0003\u009cN\u0000\u0348"+
		"\u034a\u0005f\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u009b\u0001\u0000\u0000\u0000\u034b\u0354"+
		"\u0005m\u0000\u0000\u034c\u034e\u0005g\u0000\u0000\u034d\u034f\u0005h"+
		"\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000"+
		"\u0000\u0000\u034f\u0354\u0001\u0000\u0000\u0000\u0350\u0354\u0005l\u0000"+
		"\u0000\u0351\u0354\u0005B\u0000\u0000\u0352\u0354\u0003`0\u0000\u0353"+
		"\u034b\u0001\u0000\u0000\u0000\u0353\u034c\u0001\u0000\u0000\u0000\u0353"+
		"\u0350\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353"+
		"\u0352\u0001\u0000\u0000\u0000\u0354\u009d\u0001\u0000\u0000\u0000Q\u00a1"+
		"\u00ae\u00b2\u00ba\u00c2\u00d0\u00de\u00e7\u00ed\u00f6\u00f9\u0104\u0129"+
		"\u0131\u0145\u0147\u014f\u0157\u0159\u015e\u0164\u016c\u0171\u0176\u017a"+
		"\u0182\u0187\u0194\u019c\u01a4\u01ad\u01b2\u01b7\u01ba\u01c0\u01c9\u01cd"+
		"\u01d1\u01d5\u01db\u01df\u01f5\u01fc\u0206\u020c\u0214\u021e\u0225\u0229"+
		"\u0231\u0237\u0242\u0248\u024d\u0255\u025b\u0272\u0278\u027c\u02aa\u02ae"+
		"\u02b9\u02ca\u02cc\u02d3\u02dc\u02e0\u02e6\u02f0\u02f7\u0304\u0312\u0317"+
		"\u0321\u0328\u0333\u033a\u0342\u0349\u034e\u0353";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}