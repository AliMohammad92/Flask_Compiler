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
		HTML_QUOTED_STRING=117, HTML_TAG_NAME=118, HTML_ATTR_NAME=119, HTML_TEXT=120, 
		HTML_WS=121;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleStatement = 2, RULE_compoundStatement = 3, 
		RULE_assignment = 4, RULE_value = 5, RULE_list = 6, RULE_listComprehension = 7, 
		RULE_tuple = 8, RULE_elements = 9, RULE_json = 10, RULE_jsonData = 11, 
		RULE_expressions = 12, RULE_comparisonExpressions = 13, RULE_mathematicalExpressions = 14, 
		RULE_logicalExpressions = 15, RULE_valuesExp = 16, RULE_atom = 17, RULE_primaryAtom = 18, 
		RULE_postfix = 19, RULE_globalStatement = 20, RULE_pythonImport = 21, 
		RULE_importSyntax = 22, RULE_fromImport = 23, RULE_importSource = 24, 
		RULE_importList = 25, RULE_printStatement = 26, RULE_printArgs = 27, RULE_block = 28, 
		RULE_ifStatement = 29, RULE_ifBlock = 30, RULE_elifBlock = 31, RULE_elseBlock = 32, 
		RULE_forLoop = 33, RULE_whileLoop = 34, RULE_function = 35, RULE_parameters = 36, 
		RULE_parameter = 37, RULE_returnStatement = 38, RULE_tripleString = 39, 
		RULE_functionCall = 40, RULE_argument = 41, RULE_decorator_rule = 42, 
		RULE_classDef = 43, RULE_baseClass = 44, RULE_jinjaBody = 45, RULE_jinjaExpression = 46, 
		RULE_jinjaFilter = 47, RULE_jinjaComment = 48, RULE_jinjaStatement = 49, 
		RULE_jinjaStatementContent = 50, RULE_jinjaIfStatements = 51, RULE_jinjaIf = 52, 
		RULE_jinjaElif = 53, RULE_jinjaElse = 54, RULE_jinjaFor = 55, RULE_jinjaSet = 56, 
		RULE_jiniaExtends = 57, RULE_jinjaInclude = 58, RULE_jinjaBlock = 59, 
		RULE_jinjaLocalVariable = 60, RULE_templateBody = 61, RULE_html = 62, 
		RULE_htmlElement = 63, RULE_htmlTag = 64, RULE_styleTag = 65, RULE_genericHtml = 66, 
		RULE_selfClosingTag = 67, RULE_htmlAttributes = 68, RULE_attributeValue = 69, 
		RULE_htmlText = 70, RULE_css = 71, RULE_cssSelector = 72, RULE_selectorName = 73, 
		RULE_cssKeyValue = 74, RULE_cssValue = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleStatement", "compoundStatement", "assignment", 
			"value", "list", "listComprehension", "tuple", "elements", "json", "jsonData", 
			"expressions", "comparisonExpressions", "mathematicalExpressions", "logicalExpressions", 
			"valuesExp", "atom", "primaryAtom", "postfix", "globalStatement", "pythonImport", 
			"importSyntax", "fromImport", "importSource", "importList", "printStatement", 
			"printArgs", "block", "ifStatement", "ifBlock", "elifBlock", "elseBlock", 
			"forLoop", "whileLoop", "function", "parameters", "parameter", "returnStatement", 
			"tripleString", "functionCall", "argument", "decorator_rule", "classDef", 
			"baseClass", "jinjaBody", "jinjaExpression", "jinjaFilter", "jinjaComment", 
			"jinjaStatement", "jinjaStatementContent", "jinjaIfStatements", "jinjaIf", 
			"jinjaElif", "jinjaElse", "jinjaFor", "jinjaSet", "jiniaExtends", "jinjaInclude", 
			"jinjaBlock", "jinjaLocalVariable", "templateBody", "html", "htmlElement", 
			"htmlTag", "styleTag", "genericHtml", "selfClosingTag", "htmlAttributes", 
			"attributeValue", "htmlText", "css", "cssSelector", "selectorName", "cssKeyValue", 
			"cssValue"
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
			"TAG_CLOSE", "TAG_SLASH", "HTML_ASSIGN", "HTML_QUOTED_STRING", "HTML_TAG_NAME", 
			"HTML_ATTR_NAME", "HTML_TEXT", "HTML_WS"
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842974316049416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044439L) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				jinjaBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				css();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				simpleStatement();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(164);
					match(SEMI);
					setState(165);
					simpleStatement();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				pythonImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				forLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				classDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
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
			setState(190);
			match(IDENTIFIER);
			setState(191);
			match(ASSIGN);
			setState(192);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				tuple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				json();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
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
			setState(203);
			match(LBRACK);
			setState(204);
			elements();
			setState(205);
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
			setState(207);
			match(LBRACK);
			setState(208);
			atom();
			setState(209);
			match(FOR);
			setState(210);
			match(IDENTIFIER);
			setState(211);
			match(IN);
			setState(212);
			value();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(213);
				match(IF);
				setState(214);
				expressions();
				}
			}

			setState(217);
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
			setState(219);
			match(LPAREN);
			setState(220);
			elements();
			setState(221);
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1585636504743444483L) != 0)) {
				{
				setState(223);
				value();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				value();
				}
				}
				setState(232);
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
			setState(233);
			match(LCBRACK);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(234);
				jsonData();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					jsonData();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(244);
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
			setState(246);
			match(STRING);
			setState(247);
			match(COLON);
			setState(248);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				logicalExpressions(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				comparisonExpressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LtExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((LtExpContext)_localctx).left = mathematicalExpressions(0);
				setState(256);
				match(LT);
				setState(257);
				((LtExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 2:
				_localctx = new GtExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((GtExpContext)_localctx).left = mathematicalExpressions(0);
				setState(260);
				match(GT);
				setState(261);
				((GtExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 3:
				_localctx = new LteExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((LteExpContext)_localctx).left = mathematicalExpressions(0);
				setState(264);
				match(LTE);
				setState(265);
				((LteExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 4:
				_localctx = new GteExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				((GteExpContext)_localctx).left = mathematicalExpressions(0);
				setState(268);
				match(GTE);
				setState(269);
				((GteExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 5:
				_localctx = new EqExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				((EqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(272);
				match(EQUAL);
				setState(273);
				((EqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 6:
				_localctx = new StrictEqExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				((StrictEqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(276);
				match(STRICT_EQ);
				setState(277);
				((StrictEqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 7:
				_localctx = new NeExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				((NeExpContext)_localctx).left = mathematicalExpressions(0);
				setState(280);
				match(NEQ);
				setState(281);
				((NeExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 8:
				_localctx = new StrictNeqExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				((StrictNeqExpContext)_localctx).left = mathematicalExpressions(0);
				setState(284);
				match(STRICT_NEQ);
				setState(285);
				((StrictNeqExpContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 9:
				_localctx = new IdComparisonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(287);
				((IdComparisonContext)_localctx).left = mathematicalExpressions(0);
				setState(288);
				match(IS);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(289);
					match(NOT);
					}
				}

				setState(292);
				((IdComparisonContext)_localctx).right = mathematicalExpressions(0);
				}
				break;
			case 10:
				_localctx = new MembershipTestContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(294);
				((MembershipTestContext)_localctx).left = mathematicalExpressions(0);
				setState(295);
				match(IN);
				setState(296);
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

			setState(301);
			valuesExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((AddExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(303);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(304);
						match(PLUS);
						setState(305);
						((AddExpContext)_localctx).right = mathematicalExpressions(7);
						}
						break;
					case 2:
						{
						_localctx = new SubExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((SubExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(306);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(307);
						match(MINUS);
						setState(308);
						((SubExpContext)_localctx).right = mathematicalExpressions(6);
						}
						break;
					case 3:
						{
						_localctx = new MulExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((MulExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(309);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(310);
						match(MULTIPLY);
						setState(311);
						((MulExpContext)_localctx).right = mathematicalExpressions(5);
						}
						break;
					case 4:
						{
						_localctx = new DivExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((DivExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(313);
						match(SLASH);
						setState(314);
						((DivExpContext)_localctx).right = mathematicalExpressions(4);
						}
						break;
					case 5:
						{
						_localctx = new ModExpContext(new MathematicalExpressionsContext(_parentctx, _parentState));
						((ModExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpressions);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						match(MOD);
						setState(317);
						((ModExpContext)_localctx).right = mathematicalExpressions(3);
						}
						break;
					}
					} 
				}
				setState(322);
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(324);
				match(NOT);
				setState(325);
				((NotExpContext)_localctx).item = logicalExpressions(3);
				}
				break;
			case 2:
				{
				_localctx = new CompAsLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				comparisonExpressions();
				}
				break;
			case 3:
				{
				_localctx = new ValuesAsLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				valuesExp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new LogicalExpressionsContext(_parentctx, _parentState));
						((AndExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpressions);
						setState(330);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(331);
						_la = _input.LA(1);
						if ( !(_la==S_AND || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						((AndExpContext)_localctx).right = logicalExpressions(6);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new LogicalExpressionsContext(_parentctx, _parentState));
						((OrExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpressions);
						setState(333);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==S_OR || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						((OrExpContext)_localctx).right = logicalExpressions(5);
						}
						break;
					}
					} 
				}
				setState(340);
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
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
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
			setState(345);
			primaryAtom();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					postfix();
					}
					} 
				}
				setState(351);
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
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
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
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new DotAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(DOT);
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(360);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(361);
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
				setState(364);
				match(LBRACK);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(365);
					expressions();
					}
					break;
				case 2:
					{
					setState(366);
					atom();
					}
					break;
				}
				setState(369);
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
			setState(373);
			match(GLOBAL);
			setState(374);
			match(IDENTIFIER);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375);
				match(COMMA);
				setState(376);
				match(IDENTIFIER);
				}
				}
				setState(381);
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
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				importSyntax();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
		public ImportSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSyntax; }
	 
		public ImportSyntaxContext() { }
		public void copyFrom(ImportSyntaxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdImportContext extends ImportSyntaxContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public IdImportContext(ImportSyntaxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrImportContext extends ImportSyntaxContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public StrImportContext(ImportSyntaxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSyntaxContext importSyntax() throws RecognitionException {
		ImportSyntaxContext _localctx = new ImportSyntaxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_importSyntax);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IdImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(IMPORT);
				setState(387);
				match(IDENTIFIER);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(388);
					match(AS);
					setState(389);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				_localctx = new StrImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(IMPORT);
				setState(393);
				match(STRING);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(394);
					match(AS);
					setState(395);
					match(IDENTIFIER);
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
			setState(400);
			match(FROM);
			setState(401);
			importSource();
			setState(402);
			match(IMPORT);
			setState(403);
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
	public static class StrFromImportContext extends ImportSourceContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StrFromImportContext(ImportSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStrFromImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStrFromImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStrFromImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdFromImportContext extends ImportSourceContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdFromImportContext(ImportSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIdFromImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIdFromImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIdFromImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSourceContext importSource() throws RecognitionException {
		ImportSourceContext _localctx = new ImportSourceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importSource);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdFromImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new StrFromImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PythonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PythonParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(410);
				match(AS);
				setState(411);
				match(IDENTIFIER);
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
		enterRule(_localctx, 52, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(PRINT);
			setState(415);
			match(LPAREN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1585636504743444483L) != 0)) {
				{
				setState(416);
				printArgs();
				}
			}

			setState(419);
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
		enterRule(_localctx, 54, RULE_printArgs);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				value();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					value();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				expressions();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1589770668463882243L) != 0)) {
					{
					{
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(430);
						match(COMMA);
						}
					}

					setState(433);
					expressions();
					}
					}
					setState(438);
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
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LCBRACK);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842974316049416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17592186044439L) != 0)) {
				{
				{
				setState(442);
				statement();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
		enterRule(_localctx, 58, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			ifBlock();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(451);
				elifBlock();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(457);
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
		enterRule(_localctx, 60, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(IF);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(461);
				match(LPAREN);
				}
			}

			setState(464);
			((IfBlockContext)_localctx).condition = logicalExpressions(0);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(465);
				match(RPAREN);
				}
			}

			setState(468);
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
		enterRule(_localctx, 62, RULE_elifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ELIF);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(471);
				match(LPAREN);
				}
			}

			setState(474);
			((ElifBlockContext)_localctx).condition = logicalExpressions(0);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(475);
				match(RPAREN);
				}
			}

			setState(478);
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
		enterRule(_localctx, 64, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(ELSE);
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
		enterRule(_localctx, 66, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(FOR);
			setState(484);
			match(IDENTIFIER);
			setState(485);
			match(IN);
			setState(486);
			((ForLoopContext)_localctx).iterable = value();
			setState(487);
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
		enterRule(_localctx, 68, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(WHILE);
			setState(490);
			match(LPAREN);
			setState(491);
			expressions();
			setState(492);
			match(RPAREN);
			setState(493);
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
		enterRule(_localctx, 70, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(495);
				decorator_rule();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(DEF);
			setState(502);
			match(IDENTIFIER);
			setState(503);
			match(LPAREN);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(504);
				parameters();
				}
			}

			setState(507);
			match(RPAREN);
			setState(508);
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
		enterRule(_localctx, 72, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			parameter();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				parameter();
				}
				}
				setState(517);
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
		enterRule(_localctx, 74, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(IDENTIFIER);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(519);
				match(ASSIGN);
				setState(520);
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
	public static class ReturnTripleStringContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public TripleStringContext tripleString() {
			return getRuleContext(TripleStringContext.class,0);
		}
		public ReturnTripleStringContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnTripleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnTripleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnTripleString(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
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
		enterRule(_localctx, 76, RULE_returnStatement);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new ReturnTripleStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(RETURN);
				setState(524);
				tripleString();
				}
				break;
			case 2:
				_localctx = new ReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(RETURN);
				setState(526);
				value();
				{
				setState(527);
				match(COMMA);
				setState(528);
				value();
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
		enterRule(_localctx, 78, RULE_tripleString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 80, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(LPAREN);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 1585636504743444483L) != 0)) {
				{
				{
				setState(536);
				argument();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
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
		enterRule(_localctx, 82, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(544);
				match(IDENTIFIER);
				setState(545);
				match(ASSIGN);
				}
				break;
			}
			setState(548);
			value();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(549);
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
		enterRule(_localctx, 84, RULE_decorator_rule);
		try {
			_localctx = new DecoratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(AT);
			setState(553);
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
		enterRule(_localctx, 86, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(555);
				decorator_rule();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(CLASS);
			setState(562);
			match(IDENTIFIER);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(563);
				baseClass();
				}
			}

			setState(566);
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
		enterRule(_localctx, 88, RULE_baseClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568);
			match(LPAREN);
			setState(569);
			match(IDENTIFIER);
			setState(570);
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
		enterRule(_localctx, 90, RULE_jinjaBody);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				jinjaExpression();
				}
				break;
			case STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				jinjaStatement();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
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
		enterRule(_localctx, 92, RULE_jinjaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(EXPR_START);
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(578);
				atom();
				}
				break;
			case 2:
				{
				setState(579);
				expressions();
				}
				break;
			case 3:
				{
				setState(580);
				value();
				}
				break;
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(583);
				jinjaFilter();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
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
		enterRule(_localctx, 94, RULE_jinjaFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(PIPE);
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(592);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(593);
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
		enterRule(_localctx, 96, RULE_jinjaComment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(COMMENT_START);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(597);
					matchWildcard();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(603);
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
		enterRule(_localctx, 98, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(STMT_START);
			setState(606);
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
		enterRule(_localctx, 100, RULE_jinjaStatementContent);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				jinjaIfStatements();
				}
				break;
			case JINJA_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				jinjaFor();
				}
				break;
			case JINJA_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				jinjaSet();
				}
				break;
			case JINJA_EXTENDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				jiniaExtends();
				}
				break;
			case JINJA_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				jinjaInclude();
				}
				break;
			case JINJA_BLOCK:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				jinjaBlock();
				}
				break;
			case JINJA_WITH:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				jinjaLocalVariable();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				importSyntax();
				setState(616);
				match(STMT_END);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 9);
				{
				setState(618);
				fromImport();
				setState(619);
				match(STMT_END);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(621);
				match(PRINT);
				setState(622);
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
		enterRule(_localctx, 102, RULE_jinjaIfStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			jinjaIf();
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(626);
					jinjaElif();
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(632);
				jinjaElse();
				}
				break;
			}
			setState(635);
			match(STMT_START);
			setState(636);
			match(JINJA_ENDIF);
			setState(637);
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
		enterRule(_localctx, 104, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(JINJA_IF);
			setState(640);
			((JinjaIfContext)_localctx).condition = expressions();
			setState(641);
			match(STMT_END);
			setState(642);
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
		enterRule(_localctx, 106, RULE_jinjaElif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(STMT_START);
			setState(645);
			match(JINJA_ELIF);
			setState(646);
			((JinjaElifContext)_localctx).condition = expressions();
			setState(647);
			match(STMT_END);
			setState(648);
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
		enterRule(_localctx, 108, RULE_jinjaElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(STMT_START);
			setState(651);
			match(JINJA_ELSE);
			setState(652);
			match(STMT_END);
			setState(653);
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
		enterRule(_localctx, 110, RULE_jinjaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(JINJA_FOR);
			setState(656);
			match(IDENTIFIER);
			setState(657);
			match(IN);
			setState(658);
			value();
			setState(659);
			match(STMT_END);
			setState(660);
			templateBody();
			setState(661);
			match(STMT_START);
			setState(662);
			match(JINJA_ENDFOR);
			setState(663);
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
		enterRule(_localctx, 112, RULE_jinjaSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(JINJA_SET);
			setState(666);
			match(IDENTIFIER);
			setState(667);
			match(ASSIGN);
			setState(668);
			expressions();
			setState(669);
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
		enterRule(_localctx, 114, RULE_jiniaExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(JINJA_EXTENDS);
			setState(672);
			atom();
			setState(673);
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
		enterRule(_localctx, 116, RULE_jinjaInclude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(JINJA_INCLUDE);
			setState(676);
			atom();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IGNORE) {
				{
				setState(677);
				match(JINJA_IGNORE);
				setState(678);
				match(JINJA_MISSING);
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_WITH || _la==JINJA_WITHOUT) {
				{
				setState(681);
				_la = _input.LA(1);
				if ( !(_la==JINJA_WITH || _la==JINJA_WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(682);
				match(JINJA_CONTEXT);
				}
			}

			setState(685);
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
		enterRule(_localctx, 118, RULE_jinjaBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(JINJA_BLOCK);
			setState(688);
			match(IDENTIFIER);
			setState(689);
			match(STMT_END);
			setState(690);
			templateBody();
			setState(691);
			match(STMT_START);
			setState(692);
			match(JINJA_ENDBLOCK);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(693);
				match(IDENTIFIER);
				}
			}

			setState(696);
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
		enterRule(_localctx, 120, RULE_jinjaLocalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(JINJA_WITH);
			setState(699);
			match(IDENTIFIER);
			setState(700);
			match(ASSIGN);
			setState(701);
			expressions();
			setState(702);
			match(STMT_END);
			setState(703);
			templateBody();
			setState(704);
			match(STMT_START);
			setState(705);
			match(JINJA_ENDWITH);
			setState(706);
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
		enterRule(_localctx, 122, RULE_templateBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(711);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(708);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(709);
						jinjaBody();
						}
						break;
					case 3:
						{
						setState(710);
						statement();
						}
						break;
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 124, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(HTML_START);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524344L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 8488229766430721L) != 0)) {
				{
				{
				setState(717);
				htmlElement();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
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
		enterRule(_localctx, 126, RULE_htmlElement);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				htmlTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				selfClosingTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				jinjaBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
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
		enterRule(_localctx, 128, RULE_htmlTag);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_STYLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				styleTag();
				}
				break;
			case TAG_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
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
		enterRule(_localctx, 130, RULE_styleTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(HTML_STYLE_START);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 140737488355331L) != 0)) {
				{
				{
				setState(736);
				css();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
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
		public List<TerminalNode> HTML_TEXT() { return getTokens(PythonParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(PythonParser.HTML_TEXT, i);
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
		enterRule(_localctx, 132, RULE_genericHtml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(TAG_OPEN);
			setState(745);
			((GenericHtmlContext)_localctx).name = match(HTML_TAG_NAME);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) {
				{
				{
				setState(746);
				htmlAttributes();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			match(TAG_CLOSE);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(755);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(753);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(754);
						match(HTML_TEXT);
						}
						break;
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(760);
			match(TAG_OPEN);
			setState(761);
			match(TAG_SLASH);
			setState(762);
			match(HTML_TAG_NAME);
			setState(763);
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
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(PythonParser.HTML_TAG_NAME, 0); }
		public TerminalNode TAG_SLASH() { return getToken(PythonParser.TAG_SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
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
		enterRule(_localctx, 134, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(TAG_OPEN);
			setState(766);
			match(HTML_TAG_NAME);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) {
				{
				{
				setState(767);
				htmlAttributes();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(773);
			match(TAG_SLASH);
			setState(774);
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
		enterRule(_localctx, 136, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==IDENTIFIER || _la==HTML_ATTR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(777);
			match(HTML_ASSIGN);
			setState(778);
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
		public TerminalNode HTML_QUOTED_STRING() { return getToken(PythonParser.HTML_QUOTED_STRING, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 4503599627370499L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
	 
		public HtmlTextContext() { }
		public void copyFrom(HtmlTextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAsTextContext extends HtmlTextContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public ClassAsTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class NormalTextContext extends HtmlTextContext {
		public TerminalNode HTML_TEXT() { return getToken(PythonParser.HTML_TEXT, 0); }
		public NormalTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class TagAsTextContext extends HtmlTextContext {
		public TerminalNode HTML_TAG_NAME() { return getToken(PythonParser.HTML_TAG_NAME, 0); }
		public TagAsTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class IdAsTextContext extends HtmlTextContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdAsTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class QuotedTextContext extends HtmlTextContext {
		public TerminalNode HTML_QUOTED_STRING() { return getToken(PythonParser.HTML_QUOTED_STRING, 0); }
		public QuotedTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class AttrAsTextContext extends HtmlTextContext {
		public TerminalNode HTML_ATTR_NAME() { return getToken(PythonParser.HTML_ATTR_NAME, 0); }
		public AttrAsTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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
	public static class JinjaAsTextContext extends HtmlTextContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaAsTextContext(HtmlTextContext ctx) { copyFrom(ctx); }
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

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_htmlText);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new NormalTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(HTML_TEXT);
				}
				break;
			case HTML_QUOTED_STRING:
				_localctx = new QuotedTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(HTML_QUOTED_STRING);
				}
				break;
			case HTML_TAG_NAME:
				_localctx = new TagAsTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				match(HTML_TAG_NAME);
				}
				break;
			case HTML_ATTR_NAME:
				_localctx = new AttrAsTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(785);
				match(HTML_ATTR_NAME);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAsTextContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(786);
				match(IDENTIFIER);
				}
				break;
			case CLASS:
				_localctx = new ClassAsTextContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(787);
				match(CLASS);
				}
				break;
			case EXPR_START:
				_localctx = new JinjaAsTextContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(788);
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
		enterRule(_localctx, 142, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			cssSelector(0);
			setState(792);
			match(CSS_PROPERTY_START);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(793);
				cssKeyValue();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_cssSelector, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				_localctx = new ClassSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(802);
				match(DOT);
				setState(803);
				selectorName();
				}
				break;
			case HASHTAG:
				{
				_localctx = new IdSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(804);
				match(HASHTAG);
				setState(805);
				selectorName();
				}
				break;
			case CSS_ID:
				{
				_localctx = new SimpleSelectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(806);
				selectorName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DescendantSelectorContext(new CssSelectorContext(_parentctx, _parentState));
					((DescendantSelectorContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cssSelector);
					setState(809);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(810);
					match(CSS_WS);
					setState(811);
					((DescendantSelectorContext)_localctx).right = cssSelector(2);
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 146, RULE_selectorName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CSS_ID);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					match(MINUS);
					setState(819);
					match(CSS_ID);
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 148, RULE_cssKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(CSS_ID);
			setState(826);
			match(CSS_COLON);
			setState(827);
			cssValue();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(828);
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
		enterRule(_localctx, 150, RULE_cssValue);
		int _la;
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_HEX:
				_localctx = new CssHexValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(CSS_HEX);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(CSS_NUMBER);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_TYPE) {
					{
					setState(833);
					match(CSS_TYPE);
					}
				}

				}
				break;
			case CSS_ID:
				_localctx = new CssIdValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(CSS_ID);
				}
				break;
			case STRING:
				_localctx = new CssStrValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				match(STRING);
				}
				break;
			case EXPR_START:
				_localctx = new CssJinjaValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(838);
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
		case 72:
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
		"\u0004\u0001y\u034a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0001\u0000\u0005\u0000\u009a\b\u0000\n\u0000\f\u0000\u009d\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00a7\b\u0001\n\u0001\f\u0001"+
		"\u00aa\t\u0001\u0001\u0001\u0003\u0001\u00ad\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b5"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00bd\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00ca\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d8\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t\u00e1"+
		"\b\t\u0001\t\u0001\t\u0005\t\u00e5\b\t\n\t\f\t\u00e8\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00ee\b\n\n\n\f\n\u00f1\t\n\u0003\n\u00f3\b"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00fe\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0123\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u012b\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u013f\b\u000e\n\u000e"+
		"\f\u000e\u0142\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0149\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0151\b\u000f\n\u000f"+
		"\f\u000f\u0154\t\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0158\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u015c\b\u0011\n\u0011\f\u0011\u015f"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0166\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016b"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0170\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0174\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u017a\b\u0014\n\u0014\f\u0014\u017d"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0181\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0187\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018d\b\u0016\u0003\u0016"+
		"\u018f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0198\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u019d\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01a2\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01a9\b\u001b\n\u001b\f\u001b\u01ac\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01b0\b\u001b\u0001\u001b\u0005\u001b\u01b3"+
		"\b\u001b\n\u001b\f\u001b\u01b6\t\u001b\u0003\u001b\u01b8\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01bc\b\u001c\n\u001c\f\u001c\u01bf\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u01c5\b\u001d"+
		"\n\u001d\f\u001d\u01c8\t\u001d\u0001\u001d\u0003\u001d\u01cb\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01cf\b\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01d3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01d9\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01dd\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0005#\u01f1\b#\n#\f#\u01f4\t#\u0001#\u0001#\u0001#\u0001#\u0003#\u01fa"+
		"\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0202\b$\n$\f$\u0205"+
		"\t$\u0001%\u0001%\u0001%\u0003%\u020a\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0213\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005"+
		"(\u021a\b(\n(\f(\u021d\t(\u0001(\u0001(\u0001)\u0001)\u0003)\u0223\b)"+
		"\u0001)\u0001)\u0003)\u0227\b)\u0001*\u0001*\u0001*\u0001+\u0005+\u022d"+
		"\b+\n+\f+\u0230\t+\u0001+\u0001+\u0001+\u0003+\u0235\b+\u0001+\u0001+"+
		"\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u0240\b-\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u0246\b.\u0001.\u0005.\u0249\b.\n.\f.\u024c"+
		"\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u0253\b/\u00010\u00010\u0005"+
		"0\u0257\b0\n0\f0\u025a\t0\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u0270\b2\u00013\u00013\u00053\u0274\b3\n"+
		"3\f3\u0277\t3\u00013\u00033\u027a\b3\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u02a8\b:\u0001:\u0001:\u0003:\u02ac\b:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u02b7\b;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0005=\u02c8\b=\n=\f=\u02cb\t=\u0001>\u0001>\u0005>\u02cf\b>"+
		"\n>\f>\u02d2\t>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0003?\u02da"+
		"\b?\u0001@\u0001@\u0003@\u02de\b@\u0001A\u0001A\u0005A\u02e2\bA\nA\fA"+
		"\u02e5\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0005B\u02ec\bB\nB\fB\u02ef"+
		"\tB\u0001B\u0001B\u0001B\u0005B\u02f4\bB\nB\fB\u02f7\tB\u0001B\u0001B"+
		"\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0005C\u0301\bC\nC\fC\u0304"+
		"\tC\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0316\bF\u0001G\u0001"+
		"G\u0001G\u0005G\u031b\bG\nG\fG\u031e\tG\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u0328\bH\u0001H\u0001H\u0001H\u0005H\u032d"+
		"\bH\nH\fH\u0330\tH\u0001I\u0001I\u0001I\u0005I\u0335\bI\nI\fI\u0338\t"+
		"I\u0001J\u0001J\u0001J\u0001J\u0003J\u033e\bJ\u0001K\u0001K\u0001K\u0003"+
		"K\u0343\bK\u0001K\u0001K\u0001K\u0003K\u0348\bK\u0001K\u0001\u0258\u0003"+
		"\u001c\u001e\u0090L\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0000\u0005\u0002\u0000\u001b\u001b22\u0002\u0000\u001c\u001c"+
		"33\u0002\u0000]]__\u0003\u0000\u0013\u0013DDww\u0002\u0000ABuu\u0386\u0000"+
		"\u009b\u0001\u0000\u0000\u0000\u0002\u00ac\u0001\u0000\u0000\u0000\u0004"+
		"\u00b4\u0001\u0000\u0000\u0000\u0006\u00bc\u0001\u0000\u0000\u0000\b\u00be"+
		"\u0001\u0000\u0000\u0000\n\u00c9\u0001\u0000\u0000\u0000\f\u00cb\u0001"+
		"\u0000\u0000\u0000\u000e\u00cf\u0001\u0000\u0000\u0000\u0010\u00db\u0001"+
		"\u0000\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00e9\u0001"+
		"\u0000\u0000\u0000\u0016\u00f6\u0001\u0000\u0000\u0000\u0018\u00fd\u0001"+
		"\u0000\u0000\u0000\u001a\u012a\u0001\u0000\u0000\u0000\u001c\u012c\u0001"+
		"\u0000\u0000\u0000\u001e\u0148\u0001\u0000\u0000\u0000 \u0157\u0001\u0000"+
		"\u0000\u0000\"\u0159\u0001\u0000\u0000\u0000$\u0165\u0001\u0000\u0000"+
		"\u0000&\u0173\u0001\u0000\u0000\u0000(\u0175\u0001\u0000\u0000\u0000*"+
		"\u0180\u0001\u0000\u0000\u0000,\u018e\u0001\u0000\u0000\u0000.\u0190\u0001"+
		"\u0000\u0000\u00000\u0197\u0001\u0000\u0000\u00002\u0199\u0001\u0000\u0000"+
		"\u00004\u019e\u0001\u0000\u0000\u00006\u01b7\u0001\u0000\u0000\u00008"+
		"\u01b9\u0001\u0000\u0000\u0000:\u01c2\u0001\u0000\u0000\u0000<\u01cc\u0001"+
		"\u0000\u0000\u0000>\u01d6\u0001\u0000\u0000\u0000@\u01e0\u0001\u0000\u0000"+
		"\u0000B\u01e3\u0001\u0000\u0000\u0000D\u01e9\u0001\u0000\u0000\u0000F"+
		"\u01f2\u0001\u0000\u0000\u0000H\u01fe\u0001\u0000\u0000\u0000J\u0206\u0001"+
		"\u0000\u0000\u0000L\u0212\u0001\u0000\u0000\u0000N\u0214\u0001\u0000\u0000"+
		"\u0000P\u0216\u0001\u0000\u0000\u0000R\u0222\u0001\u0000\u0000\u0000T"+
		"\u0228\u0001\u0000\u0000\u0000V\u022e\u0001\u0000\u0000\u0000X\u0238\u0001"+
		"\u0000\u0000\u0000Z\u023f\u0001\u0000\u0000\u0000\\\u0241\u0001\u0000"+
		"\u0000\u0000^\u024f\u0001\u0000\u0000\u0000`\u0254\u0001\u0000\u0000\u0000"+
		"b\u025d\u0001\u0000\u0000\u0000d\u026f\u0001\u0000\u0000\u0000f\u0271"+
		"\u0001\u0000\u0000\u0000h\u027f\u0001\u0000\u0000\u0000j\u0284\u0001\u0000"+
		"\u0000\u0000l\u028a\u0001\u0000\u0000\u0000n\u028f\u0001\u0000\u0000\u0000"+
		"p\u0299\u0001\u0000\u0000\u0000r\u029f\u0001\u0000\u0000\u0000t\u02a3"+
		"\u0001\u0000\u0000\u0000v\u02af\u0001\u0000\u0000\u0000x\u02ba\u0001\u0000"+
		"\u0000\u0000z\u02c9\u0001\u0000\u0000\u0000|\u02cc\u0001\u0000\u0000\u0000"+
		"~\u02d9\u0001\u0000\u0000\u0000\u0080\u02dd\u0001\u0000\u0000\u0000\u0082"+
		"\u02df\u0001\u0000\u0000\u0000\u0084\u02e8\u0001\u0000\u0000\u0000\u0086"+
		"\u02fd\u0001\u0000\u0000\u0000\u0088\u0308\u0001\u0000\u0000\u0000\u008a"+
		"\u030c\u0001\u0000\u0000\u0000\u008c\u0315\u0001\u0000\u0000\u0000\u008e"+
		"\u0317\u0001\u0000\u0000\u0000\u0090\u0327\u0001\u0000\u0000\u0000\u0092"+
		"\u0331\u0001\u0000\u0000\u0000\u0094\u0339\u0001\u0000\u0000\u0000\u0096"+
		"\u0347\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0000\u0000\u0001\u009f\u0001\u0001\u0000\u0000\u0000\u00a0"+
		"\u00ad\u0003Z-\u0000\u00a1\u00ad\u0003\u0006\u0003\u0000\u00a2\u00ad\u0003"+
		"\u008eG\u0000\u00a3\u00a8\u0003\u0004\u0002\u0000\u00a4\u00a5\u0005;\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ad\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003|>\u0000\u00ac"+
		"\u00a0\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a2\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u0003\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b5\u0003*\u0015\u0000\u00af\u00b5\u0003\b\u0004\u0000\u00b0\u00b5"+
		"\u00034\u001a\u0000\u00b1\u00b5\u0003L&\u0000\u00b2\u00b5\u0003P(\u0000"+
		"\u00b3\u00b5\u0003(\u0014\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4"+
		"\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u0005\u0001\u0000\u0000\u0000\u00b6"+
		"\u00bd\u0003:\u001d\u0000\u00b7\u00bd\u0003B!\u0000\u00b8\u00bd\u0003"+
		"D\"\u0000\u00b9\u00bd\u0003F#\u0000\u00ba\u00bd\u0003V+\u0000\u00bb\u00bd"+
		"\u0003\u0018\f\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"D\u0000\u0000\u00bf\u00c0\u00051\u0000\u0000\u00c0\u00c1\u0003\n\u0005"+
		"\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00ca\u0003\"\u0011\u0000"+
		"\u00c3\u00ca\u0003\u0018\f\u0000\u00c4\u00ca\u0003\f\u0006\u0000\u00c5"+
		"\u00ca\u0003\u0010\b\u0000\u00c6\u00ca\u0003\u0014\n\u0000\u00c7\u00ca"+
		"\u0003P(\u0000\u00c8\u00ca\u0003\u000e\u0007\u0000\u00c9\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u000b\u0001\u0000\u0000\u0000\u00cb\u00cc\u00056\u0000"+
		"\u0000\u00cc\u00cd\u0003\u0012\t\u0000\u00cd\u00ce\u00057\u0000\u0000"+
		"\u00ce\r\u0001\u0000\u0000\u0000\u00cf\u00d0\u00056\u0000\u0000\u00d0"+
		"\u00d1\u0003\"\u0011\u0000\u00d1\u00d2\u0005\u000e\u0000\u0000\u00d2\u00d3"+
		"\u0005D\u0000\u0000\u00d3\u00d4\u0005\u001e\u0000\u0000\u00d4\u00d7\u0003"+
		"\n\u0005\u0000\u00d5\u00d6\u0005\u000b\u0000\u0000\u00d6\u00d8\u0003\u0018"+
		"\f\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u00057\u0000\u0000"+
		"\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00dc\u00054\u0000\u0000\u00dc"+
		"\u00dd\u0003\u0012\t\u0000\u00dd\u00de\u00055\u0000\u0000\u00de\u0011"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0003\n\u0005\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005<\u0000\u0000\u00e3\u00e5\u0003\n"+
		"\u0005\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u0013\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00f2\u00058\u0000\u0000\u00ea\u00ef\u0003\u0016\u000b"+
		"\u0000\u00eb\u00ec\u0005<\u0000\u0000\u00ec\u00ee\u0003\u0016\u000b\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00ea\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u00059\u0000\u0000\u00f5"+
		"\u0015\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005B\u0000\u0000\u00f7\u00f8"+
		"\u0005:\u0000\u0000\u00f8\u00f9\u0003\n\u0005\u0000\u00f9\u0017\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fe\u0003\u001e\u000f\u0000\u00fb\u00fe\u0003"+
		"\u001a\r\u0000\u00fc\u00fe\u0003\u001c\u000e\u0000\u00fd\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u0019\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u001c"+
		"\u000e\u0000\u0100\u0101\u0005)\u0000\u0000\u0101\u0102\u0003\u001c\u000e"+
		"\u0000\u0102\u012b\u0001\u0000\u0000\u0000\u0103\u0104\u0003\u001c\u000e"+
		"\u0000\u0104\u0105\u0005*\u0000\u0000\u0105\u0106\u0003\u001c\u000e\u0000"+
		"\u0106\u012b\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u001c\u000e\u0000"+
		"\u0108\u0109\u0005+\u0000\u0000\u0109\u010a\u0003\u001c\u000e\u0000\u010a"+
		"\u012b\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u001c\u000e\u0000\u010c"+
		"\u010d\u0005,\u0000\u0000\u010d\u010e\u0003\u001c\u000e\u0000\u010e\u012b"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0003\u001c\u000e\u0000\u0110\u0111"+
		"\u0005-\u0000\u0000\u0111\u0112\u0003\u001c\u000e\u0000\u0112\u012b\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0003\u001c\u000e\u0000\u0114\u0115\u0005"+
		"/\u0000\u0000\u0115\u0116\u0003\u001c\u000e\u0000\u0116\u012b\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0003\u001c\u000e\u0000\u0118\u0119\u0005.\u0000"+
		"\u0000\u0119\u011a\u0003\u001c\u000e\u0000\u011a\u012b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0003\u001c\u000e\u0000\u011c\u011d\u00050\u0000\u0000"+
		"\u011d\u011e\u0003\u001c\u000e\u0000\u011e\u012b\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0003\u001c\u000e\u0000\u0120\u0122\u0005\u001f\u0000\u0000"+
		"\u0121\u0123\u0005\u001d\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0003\u001c\u000e\u0000\u0125\u012b\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0003\u001c\u000e\u0000\u0127\u0128\u0005\u001e\u0000\u0000"+
		"\u0128\u0129\u0003\u001c\u000e\u0000\u0129\u012b\u0001\u0000\u0000\u0000"+
		"\u012a\u00ff\u0001\u0000\u0000\u0000\u012a\u0103\u0001\u0000\u0000\u0000"+
		"\u012a\u0107\u0001\u0000\u0000\u0000\u012a\u010b\u0001\u0000\u0000\u0000"+
		"\u012a\u010f\u0001\u0000\u0000\u0000\u012a\u0113\u0001\u0000\u0000\u0000"+
		"\u012a\u0117\u0001\u0000\u0000\u0000\u012a\u011b\u0001\u0000\u0000\u0000"+
		"\u012a\u011f\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000"+
		"\u012b\u001b\u0001\u0000\u0000\u0000\u012c\u012d\u0006\u000e\uffff\uffff"+
		"\u0000\u012d\u012e\u0003 \u0010\u0000\u012e\u0140\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\n\u0006\u0000\u0000\u0130\u0131\u0005$\u0000\u0000\u0131"+
		"\u013f\u0003\u001c\u000e\u0007\u0132\u0133\n\u0005\u0000\u0000\u0133\u0134"+
		"\u0005%\u0000\u0000\u0134\u013f\u0003\u001c\u000e\u0006\u0135\u0136\n"+
		"\u0004\u0000\u0000\u0136\u0137\u0005&\u0000\u0000\u0137\u013f\u0003\u001c"+
		"\u000e\u0005\u0138\u0139\n\u0003\u0000\u0000\u0139\u013a\u0005\'\u0000"+
		"\u0000\u013a\u013f\u0003\u001c\u000e\u0004\u013b\u013c\n\u0002\u0000\u0000"+
		"\u013c\u013d\u0005(\u0000\u0000\u013d\u013f\u0003\u001c\u000e\u0003\u013e"+
		"\u012f\u0001\u0000\u0000\u0000\u013e\u0132\u0001\u0000\u0000\u0000\u013e"+
		"\u0135\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000\u0000\u0000\u013e"+
		"\u013b\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u001d\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0006\u000f\uffff\uffff\u0000\u0144\u0145\u0005\u001d\u0000\u0000"+
		"\u0145\u0149\u0003\u001e\u000f\u0003\u0146\u0149\u0003\u001a\r\u0000\u0147"+
		"\u0149\u0003 \u0010\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u0152"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\n\u0005\u0000\u0000\u014b\u014c\u0007"+
		"\u0000\u0000\u0000\u014c\u0151\u0003\u001e\u000f\u0006\u014d\u014e\n\u0004"+
		"\u0000\u0000\u014e\u014f\u0007\u0001\u0000\u0000\u014f\u0151\u0003\u001e"+
		"\u000f\u0005\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u001f\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0003\"\u0011"+
		"\u0000\u0156\u0158\u0003P(\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0158!\u0001\u0000\u0000\u0000\u0159\u015d"+
		"\u0003$\u0012\u0000\u015a\u015c\u0003&\u0013\u0000\u015b\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e#\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0166\u0005D\u0000\u0000"+
		"\u0161\u0166\u0005A\u0000\u0000\u0162\u0166\u0005B\u0000\u0000\u0163\u0166"+
		"\u0005\b\u0000\u0000\u0164\u0166\u0005\t\u0000\u0000\u0165\u0160\u0001"+
		"\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0162\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166%\u0001\u0000\u0000\u0000\u0167\u016a\u0005=\u0000"+
		"\u0000\u0168\u016b\u0005D\u0000\u0000\u0169\u016b\u0003P(\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u0174\u0001\u0000\u0000\u0000\u016c\u016f\u00056\u0000\u0000\u016d\u0170"+
		"\u0003\u0018\f\u0000\u016e\u0170\u0003\"\u0011\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u00057\u0000\u0000\u0172\u0174\u0001\u0000"+
		"\u0000\u0000\u0173\u0167\u0001\u0000\u0000\u0000\u0173\u016c\u0001\u0000"+
		"\u0000\u0000\u0174\'\u0001\u0000\u0000\u0000\u0175\u0176\u0005#\u0000"+
		"\u0000\u0176\u017b\u0005D\u0000\u0000\u0177\u0178\u0005<\u0000\u0000\u0178"+
		"\u017a\u0005D\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c)\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0003,\u0016\u0000\u017f\u0181\u0003.\u0017"+
		"\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0181+\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0006\u0000\u0000"+
		"\u0183\u0186\u0005D\u0000\u0000\u0184\u0185\u0005 \u0000\u0000\u0185\u0187"+
		"\u0005D\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u018f\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"\u0006\u0000\u0000\u0189\u018c\u0005B\u0000\u0000\u018a\u018b\u0005 \u0000"+
		"\u0000\u018b\u018d\u0005D\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000"+
		"\u018e\u0182\u0001\u0000\u0000\u0000\u018e\u0188\u0001\u0000\u0000\u0000"+
		"\u018f-\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0007\u0000\u0000\u0191"+
		"\u0192\u00030\u0018\u0000\u0192\u0193\u0005\u0006\u0000\u0000\u0193\u0194"+
		"\u00032\u0019\u0000\u0194/\u0001\u0000\u0000\u0000\u0195\u0198\u0005D"+
		"\u0000\u0000\u0196\u0198\u0005B\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u01981\u0001\u0000\u0000\u0000"+
		"\u0199\u019c\u0005D\u0000\u0000\u019a\u019b\u0005 \u0000\u0000\u019b\u019d"+
		"\u0005D\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d3\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0012"+
		"\u0000\u0000\u019f\u01a1\u00054\u0000\u0000\u01a0\u01a2\u00036\u001b\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u00055\u0000\u0000\u01a4"+
		"5\u0001\u0000\u0000\u0000\u01a5\u01aa\u0003\n\u0005\u0000\u01a6\u01a7"+
		"\u0005<\u0000\u0000\u01a7\u01a9\u0003\n\u0005\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b4\u0003"+
		"\u0018\f\u0000\u01ae\u01b0\u0005<\u0000\u0000\u01af\u01ae\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b3\u0003\u0018\f\u0000\u01b2\u01af\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01ad\u0001\u0000\u0000\u0000\u01b87\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bd\u00058\u0000\u0000\u01ba\u01bc\u0003\u0002\u0001\u0000\u01bb"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be"+
		"\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u00059\u0000\u0000\u01c19\u0001\u0000\u0000\u0000\u01c2\u01c6\u0003"+
		"<\u001e\u0000\u01c3\u01c5\u0003>\u001f\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003@ \u0000\u01ca"+
		"\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		";\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005\u000b\u0000\u0000\u01cd\u01cf"+
		"\u00054\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003"+
		"\u001e\u000f\u0000\u01d1\u01d3\u00055\u0000\u0000\u01d2\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u00038\u001c\u0000\u01d5=\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0005\f\u0000\u0000\u01d7\u01d9\u00054\u0000\u0000\u01d8"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0003\u001e\u000f\u0000\u01db"+
		"\u01dd\u00055\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u00038\u001c\u0000\u01df?\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\r"+
		"\u0000\u0000\u01e1\u01e2\u00038\u001c\u0000\u01e2A\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0005\u000e\u0000\u0000\u01e4\u01e5\u0005D\u0000\u0000\u01e5"+
		"\u01e6\u0005\u001e\u0000\u0000\u01e6\u01e7\u0003\n\u0005\u0000\u01e7\u01e8"+
		"\u00038\u001c\u0000\u01e8C\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u000f"+
		"\u0000\u0000\u01ea\u01eb\u00054\u0000\u0000\u01eb\u01ec\u0003\u0018\f"+
		"\u0000\u01ec\u01ed\u00055\u0000\u0000\u01ed\u01ee\u00038\u001c\u0000\u01ee"+
		"E\u0001\u0000\u0000\u0000\u01ef\u01f1\u0003T*\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005"+
		"\u0010\u0000\u0000\u01f6\u01f7\u0005D\u0000\u0000\u01f7\u01f9\u00054\u0000"+
		"\u0000\u01f8\u01fa\u0003H$\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u00055\u0000\u0000\u01fc\u01fd\u00038\u001c\u0000\u01fdG\u0001"+
		"\u0000\u0000\u0000\u01fe\u0203\u0003J%\u0000\u01ff\u0200\u0005<\u0000"+
		"\u0000\u0200\u0202\u0003J%\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204I\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0206\u0209\u0005D\u0000\u0000\u0207\u0208\u0005"+
		"1\u0000\u0000\u0208\u020a\u0003\n\u0005\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020aK\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0005\u0011\u0000\u0000\u020c\u0213\u0003N\'\u0000"+
		"\u020d\u020e\u0005\u0011\u0000\u0000\u020e\u020f\u0003\n\u0005\u0000\u020f"+
		"\u0210\u0005<\u0000\u0000\u0210\u0211\u0003\n\u0005\u0000\u0211\u0213"+
		"\u0001\u0000\u0000\u0000\u0212\u020b\u0001\u0000\u0000\u0000\u0212\u020d"+
		"\u0001\u0000\u0000\u0000\u0213M\u0001\u0000\u0000\u0000\u0214\u0215\u0005"+
		"C\u0000\u0000\u0215O\u0001\u0000\u0000\u0000\u0216\u0217\u0005D\u0000"+
		"\u0000\u0217\u021b\u00054\u0000\u0000\u0218\u021a\u0003R)\u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u00055\u0000\u0000\u021fQ\u0001\u0000\u0000\u0000\u0220\u0221\u0005"+
		"D\u0000\u0000\u0221\u0223\u00051\u0000\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0226\u0003\n\u0005\u0000\u0225\u0227\u0005<\u0000\u0000"+
		"\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227S\u0001\u0000\u0000\u0000\u0228\u0229\u0005?\u0000\u0000\u0229\u022a"+
		"\u0003\"\u0011\u0000\u022aU\u0001\u0000\u0000\u0000\u022b\u022d\u0003"+
		"T*\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000"+
		"\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0005\u0013\u0000\u0000\u0232\u0234\u0005D\u0000\u0000"+
		"\u0233\u0235\u0003X,\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u00038\u001c\u0000\u0237W\u0001\u0000\u0000\u0000\u0238\u0239\u00054"+
		"\u0000\u0000\u0239\u023a\u0005D\u0000\u0000\u023a\u023b\u00055\u0000\u0000"+
		"\u023bY\u0001\u0000\u0000\u0000\u023c\u0240\u0003\\.\u0000\u023d\u0240"+
		"\u0003b1\u0000\u023e\u0240\u0003`0\u0000\u023f\u023c\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u0240[\u0001\u0000\u0000\u0000\u0241\u0245\u0005\u0003\u0000\u0000"+
		"\u0242\u0246\u0003\"\u0011\u0000\u0243\u0246\u0003\u0018\f\u0000\u0244"+
		"\u0246\u0003\n\u0005\u0000\u0245\u0242\u0001\u0000\u0000\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u024a"+
		"\u0001\u0000\u0000\u0000\u0247\u0249\u0003^/\u0000\u0248\u0247\u0001\u0000"+
		"\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0005G\u0000"+
		"\u0000\u024e]\u0001\u0000\u0000\u0000\u024f\u0252\u0005\"\u0000\u0000"+
		"\u0250\u0253\u0005D\u0000\u0000\u0251\u0253\u0003P(\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253_\u0001"+
		"\u0000\u0000\u0000\u0254\u0258\u0005\u0005\u0000\u0000\u0255\u0257\t\u0000"+
		"\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0005I\u0000\u0000\u025ca\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0005\u0004\u0000\u0000\u025e\u025f\u0003d2\u0000\u025fc"+
		"\u0001\u0000\u0000\u0000\u0260\u0270\u0003f3\u0000\u0261\u0270\u0003n"+
		"7\u0000\u0262\u0270\u0003p8\u0000\u0263\u0270\u0003r9\u0000\u0264\u0270"+
		"\u0003t:\u0000\u0265\u0270\u0003v;\u0000\u0266\u0270\u0003x<\u0000\u0267"+
		"\u0268\u0003,\u0016\u0000\u0268\u0269\u0005H\u0000\u0000\u0269\u0270\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0003.\u0017\u0000\u026b\u026c\u0005H\u0000"+
		"\u0000\u026c\u0270\u0001\u0000\u0000\u0000\u026d\u026e\u0005\u0012\u0000"+
		"\u0000\u026e\u0270\u0003\u0018\f\u0000\u026f\u0260\u0001\u0000\u0000\u0000"+
		"\u026f\u0261\u0001\u0000\u0000\u0000\u026f\u0262\u0001\u0000\u0000\u0000"+
		"\u026f\u0263\u0001\u0000\u0000\u0000\u026f\u0264\u0001\u0000\u0000\u0000"+
		"\u026f\u0265\u0001\u0000\u0000\u0000\u026f\u0266\u0001\u0000\u0000\u0000"+
		"\u026f\u0267\u0001\u0000\u0000\u0000\u026f\u026a\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u0270e\u0001\u0000\u0000\u0000\u0271"+
		"\u0275\u0003h4\u0000\u0272\u0274\u0003j5\u0000\u0273\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000"+
		"\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u027a\u0003l6\u0000"+
		"\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u0004\u0000\u0000"+
		"\u027c\u027d\u0005S\u0000\u0000\u027d\u027e\u0005H\u0000\u0000\u027eg"+
		"\u0001\u0000\u0000\u0000\u027f\u0280\u0005P\u0000\u0000\u0280\u0281\u0003"+
		"\u0018\f\u0000\u0281\u0282\u0005H\u0000\u0000\u0282\u0283\u0003z=\u0000"+
		"\u0283i\u0001\u0000\u0000\u0000\u0284\u0285\u0005\u0004\u0000\u0000\u0285"+
		"\u0286\u0005Q\u0000\u0000\u0286\u0287\u0003\u0018\f\u0000\u0287\u0288"+
		"\u0005H\u0000\u0000\u0288\u0289\u0003z=\u0000\u0289k\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0005\u0004\u0000\u0000\u028b\u028c\u0005R\u0000\u0000"+
		"\u028c\u028d\u0005H\u0000\u0000\u028d\u028e\u0003z=\u0000\u028em\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0005T\u0000\u0000\u0290\u0291\u0005D\u0000"+
		"\u0000\u0291\u0292\u0005\u001e\u0000\u0000\u0292\u0293\u0003\n\u0005\u0000"+
		"\u0293\u0294\u0005H\u0000\u0000\u0294\u0295\u0003z=\u0000\u0295\u0296"+
		"\u0005\u0004\u0000\u0000\u0296\u0297\u0005U\u0000\u0000\u0297\u0298\u0005"+
		"H\u0000\u0000\u0298o\u0001\u0000\u0000\u0000\u0299\u029a\u0005V\u0000"+
		"\u0000\u029a\u029b\u0005D\u0000\u0000\u029b\u029c\u00051\u0000\u0000\u029c"+
		"\u029d\u0003\u0018\f\u0000\u029d\u029e\u0005H\u0000\u0000\u029eq\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0005Y\u0000\u0000\u02a0\u02a1\u0003\""+
		"\u0011\u0000\u02a1\u02a2\u0005H\u0000\u0000\u02a2s\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0005Z\u0000\u0000\u02a4\u02a7\u0003\"\u0011\u0000\u02a5"+
		"\u02a6\u0005[\u0000\u0000\u02a6\u02a8\u0005\\\u0000\u0000\u02a7\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02ab"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0007\u0002\u0000\u0000\u02aa\u02ac"+
		"\u0005`\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005"+
		"H\u0000\u0000\u02aeu\u0001\u0000\u0000\u0000\u02af\u02b0\u0005W\u0000"+
		"\u0000\u02b0\u02b1\u0005D\u0000\u0000\u02b1\u02b2\u0005H\u0000\u0000\u02b2"+
		"\u02b3\u0003z=\u0000\u02b3\u02b4\u0005\u0004\u0000\u0000\u02b4\u02b6\u0005"+
		"X\u0000\u0000\u02b5\u02b7\u0005D\u0000\u0000\u02b6\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0005H\u0000\u0000\u02b9w\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0005]\u0000\u0000\u02bb\u02bc\u0005D\u0000\u0000\u02bc\u02bd\u0005"+
		"1\u0000\u0000\u02bd\u02be\u0003\u0018\f\u0000\u02be\u02bf\u0005H\u0000"+
		"\u0000\u02bf\u02c0\u0003z=\u0000\u02c0\u02c1\u0005\u0004\u0000\u0000\u02c1"+
		"\u02c2\u0005^\u0000\u0000\u02c2\u02c3\u0005H\u0000\u0000\u02c3y\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c8\u0003~?\u0000\u02c5\u02c8\u0003Z-\u0000"+
		"\u02c6\u02c8\u0003\u0002\u0001\u0000\u02c7\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c8\u02cb\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca{\u0001\u0000\u0000\u0000\u02cb"+
		"\u02c9\u0001\u0000\u0000\u0000\u02cc\u02d0\u0005@\u0000\u0000\u02cd\u02cf"+
		"\u0003~?\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0005p\u0000\u0000\u02d4}\u0001\u0000\u0000\u0000"+
		"\u02d5\u02da\u0003\u0080@\u0000\u02d6\u02da\u0003\u0086C\u0000\u02d7\u02da"+
		"\u0003Z-\u0000\u02d8\u02da\u0003\u008cF\u0000\u02d9\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u007f\u0001\u0000"+
		"\u0000\u0000\u02db\u02de\u0003\u0082A\u0000\u02dc\u02de\u0003\u0084B\u0000"+
		"\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000"+
		"\u02de\u0081\u0001\u0000\u0000\u0000\u02df\u02e3\u0005o\u0000\u0000\u02e0"+
		"\u02e2\u0003\u008eG\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005k\u0000\u0000\u02e7\u0083\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0005q\u0000\u0000\u02e9\u02ed\u0005v\u0000"+
		"\u0000\u02ea\u02ec\u0003\u0088D\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f0\u0001\u0000\u0000\u0000"+
		"\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f5\u0005r\u0000\u0000\u02f1"+
		"\u02f4\u0003~?\u0000\u02f2\u02f4\u0005x\u0000\u0000\u02f3\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f9\u0005q\u0000\u0000\u02f9\u02fa\u0005s\u0000"+
		"\u0000\u02fa\u02fb\u0005v\u0000\u0000\u02fb\u02fc\u0005r\u0000\u0000\u02fc"+
		"\u0085\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005q\u0000\u0000\u02fe\u0302"+
		"\u0005v\u0000\u0000\u02ff\u0301\u0003\u0088D\u0000\u0300\u02ff\u0001\u0000"+
		"\u0000\u0000\u0301\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000"+
		"\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0305\u0001\u0000"+
		"\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0306\u0005s\u0000"+
		"\u0000\u0306\u0307\u0005r\u0000\u0000\u0307\u0087\u0001\u0000\u0000\u0000"+
		"\u0308\u0309\u0007\u0003\u0000\u0000\u0309\u030a\u0005t\u0000\u0000\u030a"+
		"\u030b\u0003\u008aE\u0000\u030b\u0089\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0007\u0004\u0000\u0000\u030d\u008b\u0001\u0000\u0000\u0000\u030e\u0316"+
		"\u0005x\u0000\u0000\u030f\u0316\u0005u\u0000\u0000\u0310\u0316\u0005v"+
		"\u0000\u0000\u0311\u0316\u0005w\u0000\u0000\u0312\u0316\u0005D\u0000\u0000"+
		"\u0313\u0316\u0005\u0013\u0000\u0000\u0314\u0316\u0003\\.\u0000\u0315"+
		"\u030e\u0001\u0000\u0000\u0000\u0315\u030f\u0001\u0000\u0000\u0000\u0315"+
		"\u0310\u0001\u0000\u0000\u0000\u0315\u0311\u0001\u0000\u0000\u0000\u0315"+
		"\u0312\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315"+
		"\u0314\u0001\u0000\u0000\u0000\u0316\u008d\u0001\u0000\u0000\u0000\u0317"+
		"\u0318\u0003\u0090H\u0000\u0318\u031c\u0005c\u0000\u0000\u0319\u031b\u0003"+
		"\u0094J\u0000\u031a\u0319\u0001\u0000\u0000\u0000\u031b\u031e\u0001\u0000"+
		"\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000"+
		"\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0005d\u0000\u0000\u0320\u008f\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0006H\uffff\uffff\u0000\u0322\u0323\u0005=\u0000\u0000"+
		"\u0323\u0328\u0003\u0092I\u0000\u0324\u0325\u0005>\u0000\u0000\u0325\u0328"+
		"\u0003\u0092I\u0000\u0326\u0328\u0003\u0092I\u0000\u0327\u0321\u0001\u0000"+
		"\u0000\u0000\u0327\u0324\u0001\u0000\u0000\u0000\u0327\u0326\u0001\u0000"+
		"\u0000\u0000\u0328\u032e\u0001\u0000\u0000\u0000\u0329\u032a\n\u0001\u0000"+
		"\u0000\u032a\u032b\u0005b\u0000\u0000\u032b\u032d\u0003\u0090H\u0002\u032c"+
		"\u0329\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000\u0000\u032e"+
		"\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f"+
		"\u0091\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0331"+
		"\u0336\u0005l\u0000\u0000\u0332\u0333\u0005%\u0000\u0000\u0333\u0335\u0005"+
		"l\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000"+
		"\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000"+
		"\u0000\u0000\u0337\u0093\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0005l\u0000\u0000\u033a\u033b\u0005e\u0000\u0000"+
		"\u033b\u033d\u0003\u0096K\u0000\u033c\u033e\u0005f\u0000\u0000\u033d\u033c"+
		"\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u0095"+
		"\u0001\u0000\u0000\u0000\u033f\u0348\u0005m\u0000\u0000\u0340\u0342\u0005"+
		"g\u0000\u0000\u0341\u0343\u0005h\u0000\u0000\u0342\u0341\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0348\u0001\u0000\u0000"+
		"\u0000\u0344\u0348\u0005l\u0000\u0000\u0345\u0348\u0005B\u0000\u0000\u0346"+
		"\u0348\u0003\\.\u0000\u0347\u033f\u0001\u0000\u0000\u0000\u0347\u0340"+
		"\u0001\u0000\u0000\u0000\u0347\u0344\u0001\u0000\u0000\u0000\u0347\u0345"+
		"\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u0097"+
		"\u0001\u0000\u0000\u0000S\u009b\u00a8\u00ac\u00b4\u00bc\u00c9\u00d7\u00e0"+
		"\u00e6\u00ef\u00f2\u00fd\u0122\u012a\u013e\u0140\u0148\u0150\u0152\u0157"+
		"\u015d\u0165\u016a\u016f\u0173\u017b\u0180\u0186\u018c\u018e\u0197\u019c"+
		"\u01a1\u01aa\u01af\u01b4\u01b7\u01bd\u01c6\u01ca\u01ce\u01d2\u01d8\u01dc"+
		"\u01f2\u01f9\u0203\u0209\u0212\u021b\u0222\u0226\u022e\u0234\u023f\u0245"+
		"\u024a\u0252\u0258\u026f\u0275\u0279\u02a7\u02ab\u02b6\u02c7\u02c9\u02d0"+
		"\u02d9\u02dd\u02e3\u02ed\u02f3\u02f5\u0302\u0315\u031c\u0327\u032e\u0336"+
		"\u033d\u0342\u0347";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}