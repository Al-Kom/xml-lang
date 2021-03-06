// Generated from /home/ksan/IdeaProjects/xml-lang/src/main/antlr4/XmlExpr.g4 by ANTLR 4.8
package xmlcompiler.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmlExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, NODE=3, ATTRIBUTE=4, OPAR=5, CPAR=6, OANGLEBR=7, CANGLEBR=8, 
		OBRACKET=9, CBRACKET=10, PLUS=11, PUSH=12, PULL=13, NEGATION=14, CONTAIN=15, 
		EQ=16, NEQ=17, IS=18, IN=19, PRINT=20, IF=21, ELSE=22, WHILE=23, FOREACH=24, 
		MAIN=25, FUNCTION=26, RETURN=27, ID=28, STRING=29, COMMENT=30, SPACES=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ASSIGN", "NODE", "ATTRIBUTE", "OPAR", "CPAR", "OANGLEBR", "CANGLEBR", 
			"OBRACKET", "CBRACKET", "PLUS", "PUSH", "PULL", "NEGATION", "CONTAIN", 
			"EQ", "NEQ", "IS", "IN", "PRINT", "IF", "ELSE", "WHILE", "FOREACH", "MAIN", 
			"FUNCTION", "RETURN", "ID", "STRING", "COMMENT", "SPACES"
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


	public XmlExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XmlExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00a9"+
		"\n\35\f\35\16\35\u00ac\13\35\3\36\3\36\3\36\3\36\7\36\u00b2\n\36\f\36"+
		"\16\36\u00b5\13\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00bd\n\37\f\37"+
		"\16\37\u00c0\13\37\3\37\3\37\3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\7\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00ca\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tJ\3\2\2\2"+
		"\13T\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2"+
		"\2\27`\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!n\3\2\2"+
		"\2#q\3\2\2\2%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+\u0080\3\2\2\2-\u0083\3\2"+
		"\2\2/\u0088\3\2\2\2\61\u008e\3\2\2\2\63\u0096\3\2\2\2\65\u009b\3\2\2\2"+
		"\67\u009f\3\2\2\29\u00a6\3\2\2\2;\u00ad\3\2\2\2=\u00b8\3\2\2\2?\u00c3"+
		"\3\2\2\2AB\7.\2\2B\4\3\2\2\2CD\7?\2\2D\6\3\2\2\2EF\7p\2\2FG\7q\2\2GH\7"+
		"f\2\2HI\7g\2\2I\b\3\2\2\2JK\7c\2\2KL\7v\2\2LM\7v\2\2MN\7t\2\2NO\7k\2\2"+
		"OP\7d\2\2PQ\7w\2\2QR\7v\2\2RS\7g\2\2S\n\3\2\2\2TU\7*\2\2U\f\3\2\2\2VW"+
		"\7+\2\2W\16\3\2\2\2XY\7>\2\2Y\20\3\2\2\2Z[\7@\2\2[\22\3\2\2\2\\]\7}\2"+
		"\2]\24\3\2\2\2^_\7\177\2\2_\26\3\2\2\2`a\7-\2\2a\30\3\2\2\2bc\7>\2\2c"+
		"d\7/\2\2d\32\3\2\2\2ef\7/\2\2fg\7@\2\2g\34\3\2\2\2hi\7#\2\2i\36\3\2\2"+
		"\2jk\7>\2\2kl\7A\2\2lm\7@\2\2m \3\2\2\2no\7?\2\2op\7?\2\2p\"\3\2\2\2q"+
		"r\7#\2\2rs\7?\2\2s$\3\2\2\2tu\7k\2\2uv\7u\2\2v&\3\2\2\2wx\7k\2\2xy\7p"+
		"\2\2y(\3\2\2\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177*\3"+
		"\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082,\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087"+
		".\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\60\3\2\2\2\u008e\u008f\7h\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7G\2\2\u0092\u0093\7c\2\2"+
		"\u0093\u0094\7e\2\2\u0094\u0095\7j\2\2\u0095\62\3\2\2\2\u0096\u0097\7"+
		"o\2\2\u0097\u0098\7c\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\64"+
		"\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7w\2\2\u009d\u009e\7p\2\2\u009e"+
		"\66\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\u00a3\7w\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7p\2\2\u00a58\3\2\2\2\u00a6"+
		"\u00aa\t\2\2\2\u00a7\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab:\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00b3\7$\2\2\u00ae\u00b2\n\4\2\2\u00af\u00b0\7$\2\2\u00b0"+
		"\u00b2\7$\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7\61\2\2"+
		"\u00b9\u00ba\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\n\5\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\37\2\2\u00c2>\3\2\2\2"+
		"\u00c3\u00c4\t\6\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b \2\2\u00c6@\3\2"+
		"\2\2\7\2\u00aa\u00b1\u00b3\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}