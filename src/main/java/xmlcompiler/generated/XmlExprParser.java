// Generated from /home/ksan/IdeaProjects/xml-lang/src/main/antlr4/XmlExpr.g4 by ANTLR 4.8
package xmlcompiler.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmlExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, NODE=3, ATTRIBUTE=4, OPAR=5, CPAR=6, OANGLEBR=7, CANGLEBR=8, 
		OBRACKET=9, CBRACKET=10, PLUS=11, PUSH=12, PULL=13, NEGATION=14, CONTAIN=15, 
		EQ=16, NEQ=17, IS=18, IN=19, PRINT=20, IF=21, ELSE=22, WHILE=23, FOREACH=24, 
		MAIN=25, FUNCTION=26, RETURN=27, ID=28, STRING=29, COMMENT=30, SPACES=31;
	public static final int
		RULE_parse = 0, RULE_create = 1, RULE_create_node = 2, RULE_create_attribute = 3, 
		RULE_name_object_node = 4, RULE_name_object_attribute = 5, RULE_connect = 6, 
		RULE_main = 7, RULE_start = 8, RULE_instruction = 9, RULE_push_in_node = 10, 
		RULE_pull_from_node = 11, RULE_push_more = 12, RULE_pull_more = 13, RULE_if_stat = 14, 
		RULE_condition_block = 15, RULE_stat_block = 16, RULE_condition = 17, 
		RULE_while_stat = 18, RULE_foreach_stat = 19, RULE_condition_for_each = 20, 
		RULE_print = 21, RULE_print_expr = 22, RULE_function_call = 23, RULE_param_call = 24, 
		RULE_arg_call = 25, RULE_function = 26, RULE_stat_block_with_return = 27, 
		RULE_return_id = 28, RULE_param = 29, RULE_arg = 30, RULE_type = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "create", "create_node", "create_attribute", "name_object_node", 
			"name_object_attribute", "connect", "main", "start", "instruction", "push_in_node", 
			"pull_from_node", "push_more", "pull_more", "if_stat", "condition_block", 
			"stat_block", "condition", "while_stat", "foreach_stat", "condition_for_each", 
			"print", "print_expr", "function_call", "param_call", "arg_call", "function", 
			"stat_block_with_return", "return_id", "param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'node'", "'attribute'", "'('", "')'", "'<'", "'>'", 
			"'{'", "'}'", "'+'", "'<-'", "'->'", "'!'", "'<?>'", "'=='", "'!='", 
			"'is'", "'in'", "'print'", "'if'", "'else'", "'while'", "'forEach'", 
			"'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "NODE", "ATTRIBUTE", "OPAR", "CPAR", "OANGLEBR", 
			"CANGLEBR", "OBRACKET", "CBRACKET", "PLUS", "PUSH", "PULL", "NEGATION", 
			"CONTAIN", "EQ", "NEQ", "IS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", 
			"MAIN", "FUNCTION", "RETURN", "ID", "STRING", "COMMENT", "SPACES"
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
	public String getGrammarFileName() { return "XmlExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XmlExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XmlExprParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODE) | (1L << ATTRIBUTE) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				create();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			main();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(71);
				function();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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

	public static class CreateContext extends ParserRuleContext {
		public Create_nodeContext create_node() {
			return getRuleContext(Create_nodeContext.class,0);
		}
		public Create_attributeContext create_attribute() {
			return getRuleContext(Create_attributeContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				create_node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				create_attribute();
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

	public static class Create_nodeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(XmlExprParser.ASSIGN, 0); }
		public Name_object_nodeContext name_object_node() {
			return getRuleContext(Name_object_nodeContext.class,0);
		}
		public TerminalNode NODE() { return getToken(XmlExprParser.NODE, 0); }
		public Create_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterCreate_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitCreate_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitCreate_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_nodeContext create_node() throws RecognitionException {
		Create_nodeContext _localctx = new Create_nodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(83);
				match(NODE);
				}
			}

			setState(86);
			match(ID);
			setState(87);
			match(ASSIGN);
			setState(88);
			name_object_node();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_attributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(XmlExprParser.ASSIGN, 0); }
		public Name_object_attributeContext name_object_attribute() {
			return getRuleContext(Name_object_attributeContext.class,0);
		}
		public TerminalNode ATTRIBUTE() { return getToken(XmlExprParser.ATTRIBUTE, 0); }
		public Create_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterCreate_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitCreate_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitCreate_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_attributeContext create_attribute() throws RecognitionException {
		Create_attributeContext _localctx = new Create_attributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(90);
				match(ATTRIBUTE);
				}
			}

			setState(93);
			match(ID);
			setState(94);
			match(ASSIGN);
			setState(95);
			name_object_attribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_object_nodeContext extends ParserRuleContext {
		public Name_object_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_node; }
	 
		public Name_object_nodeContext() { }
		public void copyFrom(Name_object_nodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectNodeContext extends Name_object_nodeContext {
		public TerminalNode STRING() { return getToken(XmlExprParser.STRING, 0); }
		public NameObjectNodeContext(Name_object_nodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterNameObjectNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitNameObjectNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitNameObjectNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdNodeContext extends Name_object_nodeContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public IdNodeContext(Name_object_nodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterIdNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitIdNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitIdNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallNodeContext extends Name_object_nodeContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallNodeContext(Name_object_nodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterFunctionCallNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitFunctionCallNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitFunctionCallNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_nodeContext name_object_node() throws RecognitionException {
		Name_object_nodeContext _localctx = new Name_object_nodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name_object_node);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NameObjectNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new FunctionCallNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				function_call();
				}
				break;
			case 3:
				_localctx = new IdNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(ID);
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

	public static class Name_object_attributeContext extends ParserRuleContext {
		public Name_object_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_attribute; }
	 
		public Name_object_attributeContext() { }
		public void copyFrom(Name_object_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectAttributeContext extends Name_object_attributeContext {
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public NameObjectAttributeContext(Name_object_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterNameObjectAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitNameObjectAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitNameObjectAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallAttributeContext extends Name_object_attributeContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallAttributeContext(Name_object_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterFunctionCallAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitFunctionCallAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitFunctionCallAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAttributeContext extends Name_object_attributeContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public IdAttributeContext(Name_object_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterIdAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitIdAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitIdAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_attributeContext name_object_attribute() throws RecognitionException {
		Name_object_attributeContext _localctx = new Name_object_attributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name_object_attribute);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NameObjectAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				connect();
				}
				break;
			case 2:
				_localctx = new FunctionCallAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				function_call();
				}
				break;
			case 3:
				_localctx = new IdAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(ID);
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

	public static class ConnectContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public TerminalNode OANGLEBR() { return getToken(XmlExprParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(XmlExprParser.CANGLEBR, 0); }
		public List<TerminalNode> STRING() { return getTokens(XmlExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XmlExprParser.STRING, i);
		}
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitConnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitConnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OANGLEBR);
			setState(108);
			((ConnectContext)_localctx).name = match(STRING);
			setState(109);
			match(T__0);
			setState(110);
			((ConnectContext)_localctx).value = match(STRING);
			setState(111);
			match(CANGLEBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(XmlExprParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(XmlExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(XmlExprParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(MAIN);
			setState(114);
			match(OBRACKET);
			setState(115);
			start();
			setState(116);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODE) | (1L << ATTRIBUTE) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				instruction();
				}
				}
				setState(123);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public Push_in_nodeContext push_in_node() {
			return getRuleContext(Push_in_nodeContext.class,0);
		}
		public Pull_from_nodeContext pull_from_node() {
			return getRuleContext(Pull_from_nodeContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Foreach_statContext foreach_stat() {
			return getRuleContext(Foreach_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				push_in_node();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				pull_from_node();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				if_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				foreach_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				function_call();
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

	public static class Push_in_nodeContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PUSH() { return getToken(XmlExprParser.PUSH, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Push_in_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_in_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPush_in_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPush_in_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPush_in_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_in_nodeContext push_in_node() throws RecognitionException {
		Push_in_nodeContext _localctx = new Push_in_nodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_push_in_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((Push_in_nodeContext)_localctx).id = match(ID);
			setState(135);
			match(PUSH);
			setState(136);
			push_more();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pull_from_nodeContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PULL() { return getToken(XmlExprParser.PULL, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Pull_from_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_from_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPull_from_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPull_from_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPull_from_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_from_nodeContext pull_from_node() throws RecognitionException {
		Pull_from_nodeContext _localctx = new Pull_from_nodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pull_from_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((Pull_from_nodeContext)_localctx).id = match(ID);
			setState(139);
			match(PULL);
			setState(140);
			pull_more();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Push_moreContext extends ParserRuleContext {
		public Push_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_more; }
	 
		public Push_moreContext() { }
		public void copyFrom(Push_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PushMoreContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Push_moreContext push_more() {
			return getRuleContext(Push_moreContext.class,0);
		}
		public PushMoreContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPushMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPushMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPushMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PushOneContext extends Push_moreContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public PushOneContext(Push_moreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPushOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPushOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPushOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_moreContext push_more() throws RecognitionException {
		Push_moreContext _localctx = new Push_moreContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_push_more);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PushMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(ID);
				setState(143);
				match(T__0);
				setState(144);
				push_more();
				}
				break;
			case 2:
				_localctx = new PushOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ID);
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

	public static class Pull_moreContext extends ParserRuleContext {
		public Pull_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull_more; }
	 
		public Pull_moreContext() { }
		public void copyFrom(Pull_moreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PullMoreContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Pull_moreContext pull_more() {
			return getRuleContext(Pull_moreContext.class,0);
		}
		public PullMoreContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPullMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPullMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPullMore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PullOneContext extends Pull_moreContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public PullOneContext(Pull_moreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPullOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPullOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPullOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pull_moreContext pull_more() throws RecognitionException {
		Pull_moreContext _localctx = new Pull_moreContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pull_more);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PullMoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__0);
				setState(150);
				pull_more();
				}
				break;
			case 2:
				_localctx = new PullOneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(XmlExprParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(XmlExprParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(XmlExprParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(XmlExprParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IF);
			setState(155);
			condition_block();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(ELSE);
					setState(157);
					match(IF);
					setState(158);
					condition_block();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(164);
				match(ELSE);
				setState(165);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(XmlExprParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(XmlExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(XmlExprParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(OPAR);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(169);
				match(NEGATION);
				}
			}

			setState(172);
			condition();
			setState(173);
			match(CPAR);
			setState(174);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(XmlExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(XmlExprParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(OBRACKET);
			setState(177);
			start();
			setState(178);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public TerminalNode IS() { return getToken(XmlExprParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(XmlExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XmlExprParser.ID, i);
		}
		public TerminalNode CONTAIN() { return getToken(XmlExprParser.CONTAIN, 0); }
		public ContainContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterContain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitContain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitContain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(XmlExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XmlExprParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(XmlExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(XmlExprParser.NEQ, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ContainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(ID);
				setState(184);
				match(CONTAIN);
				setState(185);
				match(ID);
				}
				break;
			case 3:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(ID);
				setState(187);
				match(IS);
				setState(188);
				type();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(XmlExprParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(WHILE);
			setState(192);
			condition_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_statContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(XmlExprParser.FOREACH, 0); }
		public TerminalNode OPAR() { return getToken(XmlExprParser.OPAR, 0); }
		public Condition_for_eachContext condition_for_each() {
			return getRuleContext(Condition_for_eachContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(XmlExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Foreach_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterForeach_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitForeach_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitForeach_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statContext foreach_stat() throws RecognitionException {
		Foreach_statContext _localctx = new Foreach_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreach_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FOREACH);
			setState(195);
			match(OPAR);
			setState(196);
			condition_for_each();
			setState(197);
			match(CPAR);
			setState(198);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_for_eachContext extends ParserRuleContext {
		public Condition_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for_each; }
	 
		public Condition_for_eachContext() { }
		public void copyFrom(Condition_for_eachContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEachVertexContext extends Condition_for_eachContext {
		public TerminalNode ATTRIBUTE() { return getToken(XmlExprParser.ATTRIBUTE, 0); }
		public List<TerminalNode> ID() { return getTokens(XmlExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XmlExprParser.ID, i);
		}
		public TerminalNode IN() { return getToken(XmlExprParser.IN, 0); }
		public ForEachVertexContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterForEachVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitForEachVertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitForEachVertex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEachEdgeContext extends Condition_for_eachContext {
		public TerminalNode NODE() { return getToken(XmlExprParser.NODE, 0); }
		public List<TerminalNode> ID() { return getTokens(XmlExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XmlExprParser.ID, i);
		}
		public TerminalNode IN() { return getToken(XmlExprParser.IN, 0); }
		public ForEachEdgeContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterForEachEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitForEachEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitForEachEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_for_eachContext condition_for_each() throws RecognitionException {
		Condition_for_eachContext _localctx = new Condition_for_eachContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition_for_each);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUTE:
				_localctx = new ForEachVertexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(ATTRIBUTE);
				setState(201);
				match(ID);
				setState(202);
				match(IN);
				setState(203);
				match(ID);
				}
				break;
			case NODE:
				_localctx = new ForEachEdgeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(NODE);
				setState(205);
				match(ID);
				setState(206);
				match(IN);
				setState(207);
				match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(XmlExprParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(PRINT);
			setState(211);
			print_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatStringContext extends Print_exprContext {
		public List<Print_exprContext> print_expr() {
			return getRuleContexts(Print_exprContext.class);
		}
		public Print_exprContext print_expr(int i) {
			return getRuleContext(Print_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(XmlExprParser.PLUS, 0); }
		public ConcatStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterConcatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitConcatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitConcatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends Print_exprContext {
		public TerminalNode STRING() { return getToken(XmlExprParser.STRING, 0); }
		public PrintStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitPrintString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		return print_expr(0);
	}

	private Print_exprContext print_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_exprContext _localctx = new Print_exprContext(_ctx, _parentState);
		Print_exprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_print_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new PrintIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new PrintStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatStringContext(new Print_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_print_expr);
					setState(218);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(219);
					match(PLUS);
					setState(220);
					print_expr(4);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			param_call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(XmlExprParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(XmlExprParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(OPAR);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(230);
				arg_call();
				}
			}

			setState(233);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arg_call);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__0);
				setState(238);
				arg_call();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(XmlExprParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(XmlExprParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(FUNCTION);
				setState(242);
				match(ID);
				setState(243);
				param();
				setState(244);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FUNCTION);
				setState(247);
				type();
				setState(248);
				match(ID);
				setState(249);
				param();
				setState(250);
				stat_block_with_return();
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(XmlExprParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(XmlExprParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(OBRACKET);
			setState(255);
			start();
			setState(256);
			return_id();
			setState(257);
			match(CBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XmlExprParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RETURN);
			setState(260);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(XmlExprParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(XmlExprParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(OPAR);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE || _la==ATTRIBUTE) {
				{
				setState(263);
				arg();
				}
			}

			setState(266);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmlExprParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arg);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				type();
				setState(269);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				type();
				setState(272);
				match(ID);
				setState(273);
				match(T__0);
				setState(274);
				arg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(XmlExprParser.NODE, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(XmlExprParser.ATTRIBUTE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmlExprListener ) ((XmlExprListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XmlExprVisitor ) return ((XmlExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==NODE || _la==ATTRIBUTE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return print_expr_sempred((Print_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean print_expr_sempred(Print_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3"+
		"\2\3\3\3\3\5\3T\n\3\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\5\5\5^\n\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\7\nz\n\n\f\n\16\n}\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\5\17\u009b"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20"+
		"\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\5\21\u00ad\n\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00c0\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u00db\n\30\3\30\3\30\3\30\7\30\u00e0\n\30\f\30\16\30\u00e3"+
		"\13\30\3\31\3\31\3\31\3\32\3\32\5\32\u00ea\n\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00ff\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u010b\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0117\n \3"+
		"!\3!\3!\2\3.\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@\2\4\3\2\22\23\3\2\5\6\2\u011a\2E\3\2\2\2\4S\3\2\2\2\6V\3\2\2"+
		"\2\b]\3\2\2\2\nf\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20s\3\2\2\2\22{\3\2\2"+
		"\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008c\3\2\2\2\32\u0094\3\2\2\2"+
		"\34\u009a\3\2\2\2\36\u009c\3\2\2\2 \u00aa\3\2\2\2\"\u00b2\3\2\2\2$\u00bf"+
		"\3\2\2\2&\u00c1\3\2\2\2(\u00c4\3\2\2\2*\u00d2\3\2\2\2,\u00d4\3\2\2\2."+
		"\u00da\3\2\2\2\60\u00e4\3\2\2\2\62\u00e7\3\2\2\2\64\u00f1\3\2\2\2\66\u00fe"+
		"\3\2\2\28\u0100\3\2\2\2:\u0105\3\2\2\2<\u0108\3\2\2\2>\u0116\3\2\2\2@"+
		"\u0118\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2GE\3\2\2\2HL\5\20\t\2IK\5\66\34\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM"+
		"\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2\2\3P\3\3\2\2\2QT\5\6\4\2RT\5\b\5\2"+
		"SQ\3\2\2\2SR\3\2\2\2T\5\3\2\2\2UW\7\5\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2"+
		"\2XY\7\36\2\2YZ\7\4\2\2Z[\5\n\6\2[\7\3\2\2\2\\^\7\6\2\2]\\\3\2\2\2]^\3"+
		"\2\2\2^_\3\2\2\2_`\7\36\2\2`a\7\4\2\2ab\5\f\7\2b\t\3\2\2\2cg\7\37\2\2"+
		"dg\5\60\31\2eg\7\36\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hl\5"+
		"\16\b\2il\5\60\31\2jl\7\36\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\r\3\2\2"+
		"\2mn\7\t\2\2no\7\37\2\2op\7\3\2\2pq\7\37\2\2qr\7\n\2\2r\17\3\2\2\2st\7"+
		"\33\2\2tu\7\13\2\2uv\5\22\n\2vw\7\f\2\2w\21\3\2\2\2xz\5\24\13\2yx\3\2"+
		"\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\23\3\2\2\2}{\3\2\2\2~\u0087\5\4\3"+
		"\2\177\u0087\5\26\f\2\u0080\u0087\5\30\r\2\u0081\u0087\5,\27\2\u0082\u0087"+
		"\5\36\20\2\u0083\u0087\5&\24\2\u0084\u0087\5(\25\2\u0085\u0087\5\60\31"+
		"\2\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3"+
		"\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\36\2\2\u0089\u008a\7\16"+
		"\2\2\u008a\u008b\5\32\16\2\u008b\27\3\2\2\2\u008c\u008d\7\36\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\5\34\17\2\u008f\31\3\2\2\2\u0090\u0091\7\36"+
		"\2\2\u0091\u0092\7\3\2\2\u0092\u0095\5\32\16\2\u0093\u0095\7\36\2\2\u0094"+
		"\u0090\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\7\36\2"+
		"\2\u0097\u0098\7\3\2\2\u0098\u009b\5\34\17\2\u0099\u009b\7\36\2\2\u009a"+
		"\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\7\27\2"+
		"\2\u009d\u00a3\5 \21\2\u009e\u009f\7\30\2\2\u009f\u00a0\7\27\2\2\u00a0"+
		"\u00a2\5 \21\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\30\2\2\u00a7\u00a9\5\"\22\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ac\7\7\2\2\u00ab\u00ad\7\20\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5$"+
		"\23\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\5\"\22\2\u00b1!\3\2\2\2\u00b2\u00b3"+
		"\7\13\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\f\2\2\u00b5#\3\2\2\2\u00b6"+
		"\u00b7\7\36\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00c0\7\36\2\2\u00b9\u00ba\7"+
		"\36\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00c0\7\36\2\2\u00bc\u00bd\7\36\2\2"+
		"\u00bd\u00be\7\24\2\2\u00be\u00c0\5@!\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2"+
		"\u00c3\5 \21\2\u00c3\'\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6\7\7\2"+
		"\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\5\"\22\2\u00c9"+
		")\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\25\2"+
		"\2\u00cd\u00d3\7\36\2\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\7\36\2\2\u00d0"+
		"\u00d1\7\25\2\2\u00d1\u00d3\7\36\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce\3"+
		"\2\2\2\u00d3+\3\2\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\5.\30\2\u00d6-"+
		"\3\2\2\2\u00d7\u00d8\b\30\1\2\u00d8\u00db\7\36\2\2\u00d9\u00db\7\37\2"+
		"\2\u00da\u00d7\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd"+
		"\f\5\2\2\u00dd\u00de\7\r\2\2\u00de\u00e0\5.\30\6\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2/\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\36\2\2\u00e5\u00e6\5\62\32\2\u00e6"+
		"\61\3\2\2\2\u00e7\u00e9\7\7\2\2\u00e8\u00ea\5\64\33\2\u00e9\u00e8\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\b\2\2\u00ec"+
		"\63\3\2\2\2\u00ed\u00f2\7\36\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\7\3"+
		"\2\2\u00f0\u00f2\5\64\33\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2"+
		"\65\3\2\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\5<\37"+
		"\2\u00f6\u00f7\5\"\22\2\u00f7\u00ff\3\2\2\2\u00f8\u00f9\7\34\2\2\u00f9"+
		"\u00fa\5@!\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\5<\37\2\u00fc\u00fd\58\35"+
		"\2\u00fd\u00ff\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00f8\3\2\2\2\u00ff\67"+
		"\3\2\2\2\u0100\u0101\7\13\2\2\u0101\u0102\5\22\n\2\u0102\u0103\5:\36\2"+
		"\u0103\u0104\7\f\2\2\u01049\3\2\2\2\u0105\u0106\7\35\2\2\u0106\u0107\7"+
		"\36\2\2\u0107;\3\2\2\2\u0108\u010a\7\7\2\2\u0109\u010b\5> \2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\b\2\2\u010d"+
		"=\3\2\2\2\u010e\u010f\5@!\2\u010f\u0110\7\36\2\2\u0110\u0117\3\2\2\2\u0111"+
		"\u0112\5@!\2\u0112\u0113\7\36\2\2\u0113\u0114\7\3\2\2\u0114\u0115\5> "+
		"\2\u0115\u0117\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0111\3\2\2\2\u0117?"+
		"\3\2\2\2\u0118\u0119\t\3\2\2\u0119A\3\2\2\2\31ELSV]fk{\u0086\u0094\u009a"+
		"\u00a3\u00a8\u00ac\u00bf\u00d2\u00da\u00e1\u00e9\u00f1\u00fe\u010a\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}