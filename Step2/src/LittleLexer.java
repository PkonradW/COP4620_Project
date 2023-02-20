// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, KEYWORDS=29, OPERATOR=30, IDENTIFIER=31, 
		INTLITERAL=32, FLOATLITERAL=33, STRINGLITERAL=34, COMMENT=35, WHITESPACE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "KEYWORDS", "OPERATOR", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "'FLOAT'", 
			"'INT'", "'VOID'", "','", "'FUNCTION'", "'READ'", "'WRITE'", "'RETURN'", 
			"'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", "'<'", "'>'", 
			"'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "KEYWORDS", "OPERATOR", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WHITESPACE"
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

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
		"\u0004\u0000$\u0167\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0123\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u012f\b\u001d\u0001\u001e\u0004\u001e\u0132\b"+
		"\u001e\u000b\u001e\f\u001e\u0133\u0001\u001e\u0005\u001e\u0137\b\u001e"+
		"\n\u001e\f\u001e\u013a\t\u001e\u0001\u001f\u0004\u001f\u013d\b\u001f\u000b"+
		"\u001f\f\u001f\u013e\u0001 \u0005 \u0142\b \n \f \u0145\t \u0001 \u0001"+
		" \u0004 \u0149\b \u000b \f \u014a\u0001!\u0001!\u0005!\u014f\b!\n!\f!"+
		"\u0152\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u015a"+
		"\b\"\n\"\f\"\u015d\t\"\u0001\"\u0001\"\u0001#\u0004#\u0162\b#\u000b#\f"+
		"#\u0163\u0001#\u0001#\u0000\u0000$\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$\u0001\u0000\b\u0004\u0000*+--//==\u0004"+
		"\u0000(),,;<>>\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0001\u0000"+
		"\"\"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0184\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000"+
		"\u0005W\u0001\u0000\u0000\u0000\u0007[\u0001\u0000\u0000\u0000\tb\u0001"+
		"\u0000\u0000\u0000\u000be\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000"+
		"\u0000\u000fo\u0001\u0000\u0000\u0000\u0011t\u0001\u0000\u0000\u0000\u0013"+
		"v\u0001\u0000\u0000\u0000\u0015\u007f\u0001\u0000\u0000\u0000\u0017\u0084"+
		"\u0001\u0000\u0000\u0000\u0019\u008a\u0001\u0000\u0000\u0000\u001b\u0091"+
		"\u0001\u0000\u0000\u0000\u001d\u0093\u0001\u0000\u0000\u0000\u001f\u0095"+
		"\u0001\u0000\u0000\u0000!\u0097\u0001\u0000\u0000\u0000#\u0099\u0001\u0000"+
		"\u0000\u0000%\u009c\u0001\u0000\u0000\u0000\'\u00a2\u0001\u0000\u0000"+
		"\u0000)\u00a7\u0001\u0000\u0000\u0000+\u00a9\u0001\u0000\u0000\u0000-"+
		"\u00ab\u0001\u0000\u0000\u0000/\u00ad\u0001\u0000\u0000\u00001\u00b0\u0001"+
		"\u0000\u0000\u00003\u00b3\u0001\u0000\u0000\u00005\u00b6\u0001\u0000\u0000"+
		"\u00007\u00bc\u0001\u0000\u0000\u00009\u0122\u0001\u0000\u0000\u0000;"+
		"\u012e\u0001\u0000\u0000\u0000=\u0131\u0001\u0000\u0000\u0000?\u013c\u0001"+
		"\u0000\u0000\u0000A\u0143\u0001\u0000\u0000\u0000C\u014c\u0001\u0000\u0000"+
		"\u0000E\u0155\u0001\u0000\u0000\u0000G\u0161\u0001\u0000\u0000\u0000I"+
		"J\u0005P\u0000\u0000JK\u0005R\u0000\u0000KL\u0005O\u0000\u0000LM\u0005"+
		"G\u0000\u0000MN\u0005R\u0000\u0000NO\u0005A\u0000\u0000OP\u0005M\u0000"+
		"\u0000P\u0002\u0001\u0000\u0000\u0000QR\u0005B\u0000\u0000RS\u0005E\u0000"+
		"\u0000ST\u0005G\u0000\u0000TU\u0005I\u0000\u0000UV\u0005N\u0000\u0000"+
		"V\u0004\u0001\u0000\u0000\u0000WX\u0005E\u0000\u0000XY\u0005N\u0000\u0000"+
		"YZ\u0005D\u0000\u0000Z\u0006\u0001\u0000\u0000\u0000[\\\u0005S\u0000\u0000"+
		"\\]\u0005T\u0000\u0000]^\u0005R\u0000\u0000^_\u0005I\u0000\u0000_`\u0005"+
		"N\u0000\u0000`a\u0005G\u0000\u0000a\b\u0001\u0000\u0000\u0000bc\u0005"+
		":\u0000\u0000cd\u0005=\u0000\u0000d\n\u0001\u0000\u0000\u0000ef\u0005"+
		"F\u0000\u0000fg\u0005L\u0000\u0000gh\u0005O\u0000\u0000hi\u0005A\u0000"+
		"\u0000ij\u0005T\u0000\u0000j\f\u0001\u0000\u0000\u0000kl\u0005I\u0000"+
		"\u0000lm\u0005N\u0000\u0000mn\u0005T\u0000\u0000n\u000e\u0001\u0000\u0000"+
		"\u0000op\u0005V\u0000\u0000pq\u0005O\u0000\u0000qr\u0005I\u0000\u0000"+
		"rs\u0005D\u0000\u0000s\u0010\u0001\u0000\u0000\u0000tu\u0005,\u0000\u0000"+
		"u\u0012\u0001\u0000\u0000\u0000vw\u0005F\u0000\u0000wx\u0005U\u0000\u0000"+
		"xy\u0005N\u0000\u0000yz\u0005C\u0000\u0000z{\u0005T\u0000\u0000{|\u0005"+
		"I\u0000\u0000|}\u0005O\u0000\u0000}~\u0005N\u0000\u0000~\u0014\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005R\u0000\u0000\u0080\u0081\u0005E\u0000\u0000"+
		"\u0081\u0082\u0005A\u0000\u0000\u0082\u0083\u0005D\u0000\u0000\u0083\u0016"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005W\u0000\u0000\u0085\u0086\u0005"+
		"R\u0000\u0000\u0086\u0087\u0005I\u0000\u0000\u0087\u0088\u0005T\u0000"+
		"\u0000\u0088\u0089\u0005E\u0000\u0000\u0089\u0018\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005R\u0000\u0000\u008b\u008c\u0005E\u0000\u0000\u008c\u008d"+
		"\u0005T\u0000\u0000\u008d\u008e\u0005U\u0000\u0000\u008e\u008f\u0005R"+
		"\u0000\u0000\u008f\u0090\u0005N\u0000\u0000\u0090\u001a\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005+\u0000\u0000\u0092\u001c\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005-\u0000\u0000\u0094\u001e\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005*\u0000\u0000\u0096 \u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"/\u0000\u0000\u0098\"\u0001\u0000\u0000\u0000\u0099\u009a\u0005I\u0000"+
		"\u0000\u009a\u009b\u0005F\u0000\u0000\u009b$\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005E\u0000\u0000\u009d\u009e\u0005N\u0000\u0000\u009e\u009f\u0005"+
		"D\u0000\u0000\u009f\u00a0\u0005I\u0000\u0000\u00a0\u00a1\u0005F\u0000"+
		"\u0000\u00a1&\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005E\u0000\u0000\u00a3"+
		"\u00a4\u0005L\u0000\u0000\u00a4\u00a5\u0005S\u0000\u0000\u00a5\u00a6\u0005"+
		"E\u0000\u0000\u00a6(\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005<\u0000"+
		"\u0000\u00a8*\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa"+
		",\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac.\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005!\u0000\u0000\u00ae\u00af\u0005=\u0000"+
		"\u0000\u00af0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005<\u0000\u0000\u00b1"+
		"\u00b2\u0005=\u0000\u0000\u00b22\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		">\u0000\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b54\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005W\u0000\u0000\u00b7\u00b8\u0005H\u0000\u0000\u00b8"+
		"\u00b9\u0005I\u0000\u0000\u00b9\u00ba\u0005L\u0000\u0000\u00ba\u00bb\u0005"+
		"E\u0000\u0000\u00bb6\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005E\u0000"+
		"\u0000\u00bd\u00be\u0005N\u0000\u0000\u00be\u00bf\u0005D\u0000\u0000\u00bf"+
		"\u00c0\u0005W\u0000\u0000\u00c0\u00c1\u0005H\u0000\u0000\u00c1\u00c2\u0005"+
		"I\u0000\u0000\u00c2\u00c3\u0005L\u0000\u0000\u00c3\u00c4\u0005E\u0000"+
		"\u0000\u00c48\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005P\u0000\u0000\u00c6"+
		"\u00c7\u0005R\u0000\u0000\u00c7\u00c8\u0005O\u0000\u0000\u00c8\u00c9\u0005"+
		"G\u0000\u0000\u00c9\u00ca\u0005R\u0000\u0000\u00ca\u00cb\u0005A\u0000"+
		"\u0000\u00cb\u0123\u0005M\u0000\u0000\u00cc\u00cd\u0005B\u0000\u0000\u00cd"+
		"\u00ce\u0005E\u0000\u0000\u00ce\u00cf\u0005G\u0000\u0000\u00cf\u00d0\u0005"+
		"I\u0000\u0000\u00d0\u0123\u0005N\u0000\u0000\u00d1\u00d2\u0005E\u0000"+
		"\u0000\u00d2\u00d3\u0005N\u0000\u0000\u00d3\u0123\u0005D\u0000\u0000\u00d4"+
		"\u00d5\u0005F\u0000\u0000\u00d5\u00d6\u0005U\u0000\u0000\u00d6\u00d7\u0005"+
		"N\u0000\u0000\u00d7\u00d8\u0005C\u0000\u0000\u00d8\u00d9\u0005T\u0000"+
		"\u0000\u00d9\u00da\u0005I\u0000\u0000\u00da\u00db\u0005O\u0000\u0000\u00db"+
		"\u0123\u0005N\u0000\u0000\u00dc\u00dd\u0005R\u0000\u0000\u00dd\u00de\u0005"+
		"E\u0000\u0000\u00de\u00df\u0005A\u0000\u0000\u00df\u0123\u0005D\u0000"+
		"\u0000\u00e0\u00e1\u0005W\u0000\u0000\u00e1\u00e2\u0005R\u0000\u0000\u00e2"+
		"\u00e3\u0005I\u0000\u0000\u00e3\u00e4\u0005T\u0000\u0000\u00e4\u0123\u0005"+
		"E\u0000\u0000\u00e5\u00e6\u0005I\u0000\u0000\u00e6\u0123\u0005F\u0000"+
		"\u0000\u00e7\u00e8\u0005E\u0000\u0000\u00e8\u00e9\u0005L\u0000\u0000\u00e9"+
		"\u00ea\u0005S\u0000\u0000\u00ea\u0123\u0005E\u0000\u0000\u00eb\u00ec\u0005"+
		"E\u0000\u0000\u00ec\u00ed\u0005N\u0000\u0000\u00ed\u00ee\u0005D\u0000"+
		"\u0000\u00ee\u00ef\u0005I\u0000\u0000\u00ef\u0123\u0005F\u0000\u0000\u00f0"+
		"\u00f1\u0005W\u0000\u0000\u00f1\u00f2\u0005H\u0000\u0000\u00f2\u00f3\u0005"+
		"I\u0000\u0000\u00f3\u00f4\u0005L\u0000\u0000\u00f4\u0123\u0005E\u0000"+
		"\u0000\u00f5\u00f6\u0005E\u0000\u0000\u00f6\u00f7\u0005N\u0000\u0000\u00f7"+
		"\u00f8\u0005D\u0000\u0000\u00f8\u00f9\u0005W\u0000\u0000\u00f9\u00fa\u0005"+
		"H\u0000\u0000\u00fa\u00fb\u0005I\u0000\u0000\u00fb\u00fc\u0005L\u0000"+
		"\u0000\u00fc\u0123\u0005E\u0000\u0000\u00fd\u00fe\u0005C\u0000\u0000\u00fe"+
		"\u00ff\u0005O\u0000\u0000\u00ff\u0100\u0005N\u0000\u0000\u0100\u0101\u0005"+
		"T\u0000\u0000\u0101\u0102\u0005I\u0000\u0000\u0102\u0103\u0005N\u0000"+
		"\u0000\u0103\u0104\u0005U\u0000\u0000\u0104\u0123\u0005E\u0000\u0000\u0105"+
		"\u0106\u0005B\u0000\u0000\u0106\u0107\u0005R\u0000\u0000\u0107\u0108\u0005"+
		"E\u0000\u0000\u0108\u0109\u0005A\u0000\u0000\u0109\u0123\u0005K\u0000"+
		"\u0000\u010a\u010b\u0005R\u0000\u0000\u010b\u010c\u0005E\u0000\u0000\u010c"+
		"\u010d\u0005T\u0000\u0000\u010d\u010e\u0005U\u0000\u0000\u010e\u010f\u0005"+
		"R\u0000\u0000\u010f\u0123\u0005N\u0000\u0000\u0110\u0111\u0005I\u0000"+
		"\u0000\u0111\u0112\u0005N\u0000\u0000\u0112\u0123\u0005T\u0000\u0000\u0113"+
		"\u0114\u0005V\u0000\u0000\u0114\u0115\u0005O\u0000\u0000\u0115\u0116\u0005"+
		"I\u0000\u0000\u0116\u0123\u0005D\u0000\u0000\u0117\u0118\u0005S\u0000"+
		"\u0000\u0118\u0119\u0005T\u0000\u0000\u0119\u011a\u0005R\u0000\u0000\u011a"+
		"\u011b\u0005I\u0000\u0000\u011b\u011c\u0005N\u0000\u0000\u011c\u0123\u0005"+
		"G\u0000\u0000\u011d\u011e\u0005F\u0000\u0000\u011e\u011f\u0005L\u0000"+
		"\u0000\u011f\u0120\u0005O\u0000\u0000\u0120\u0121\u0005A\u0000\u0000\u0121"+
		"\u0123\u0005T\u0000\u0000\u0122\u00c5\u0001\u0000\u0000\u0000\u0122\u00cc"+
		"\u0001\u0000\u0000\u0000\u0122\u00d1\u0001\u0000\u0000\u0000\u0122\u00d4"+
		"\u0001\u0000\u0000\u0000\u0122\u00dc\u0001\u0000\u0000\u0000\u0122\u00e0"+
		"\u0001\u0000\u0000\u0000\u0122\u00e5\u0001\u0000\u0000\u0000\u0122\u00e7"+
		"\u0001\u0000\u0000\u0000\u0122\u00eb\u0001\u0000\u0000\u0000\u0122\u00f0"+
		"\u0001\u0000\u0000\u0000\u0122\u00f5\u0001\u0000\u0000\u0000\u0122\u00fd"+
		"\u0001\u0000\u0000\u0000\u0122\u0105\u0001\u0000\u0000\u0000\u0122\u010a"+
		"\u0001\u0000\u0000\u0000\u0122\u0110\u0001\u0000\u0000\u0000\u0122\u0113"+
		"\u0001\u0000\u0000\u0000\u0122\u0117\u0001\u0000\u0000\u0000\u0122\u011d"+
		"\u0001\u0000\u0000\u0000\u0123:\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		":\u0000\u0000\u0125\u012f\u0005=\u0000\u0000\u0126\u012f\u0007\u0000\u0000"+
		"\u0000\u0127\u0128\u0005!\u0000\u0000\u0128\u012f\u0005=\u0000\u0000\u0129"+
		"\u012f\u0007\u0001\u0000\u0000\u012a\u012b\u0005<\u0000\u0000\u012b\u012f"+
		"\u0005=\u0000\u0000\u012c\u012d\u0005>\u0000\u0000\u012d\u012f\u0005="+
		"\u0000\u0000\u012e\u0124\u0001\u0000\u0000\u0000\u012e\u0126\u0001\u0000"+
		"\u0000\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u0129\u0001\u0000"+
		"\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f<\u0001\u0000\u0000\u0000\u0130\u0132\u0007\u0002\u0000"+
		"\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0138\u0001\u0000\u0000\u0000\u0135\u0137\u0007\u0003\u0000"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139>\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013b\u013d\u0007\u0004\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f@\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0007\u0004\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0005.\u0000\u0000\u0147\u0149"+
		"\u0007\u0004\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014bB\u0001\u0000\u0000\u0000\u014c\u0150\u0005"+
		"\"\u0000\u0000\u014d\u014f\b\u0005\u0000\u0000\u014e\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0005\"\u0000"+
		"\u0000\u0154D\u0001\u0000\u0000\u0000\u0155\u0156\u0005-\u0000\u0000\u0156"+
		"\u0157\u0005-\u0000\u0000\u0157\u015b\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\b\u0006\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0006\"\u0000\u0000\u015fF\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0007\u0007\u0000\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0006#\u0000\u0000\u0166H\u0001\u0000\u0000\u0000"+
		"\u000b\u0000\u0122\u012e\u0133\u0138\u013e\u0143\u014a\u0150\u015b\u0163"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}