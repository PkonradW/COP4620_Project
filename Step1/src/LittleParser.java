// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LittleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, OP=2, WS=3, IDENTIFIER=4, INTLITERAL=5, FLOATLITERAL=6, STRINGLITERAL=7, 
		COMMENT=8;
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORDS", "OP", "WS", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LittleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LittleParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LittleParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(LittleParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(LittleParser.INTLITERAL, i);
		}
		public List<TerminalNode> FLOATLITERAL() { return getTokens(LittleParser.FLOATLITERAL); }
		public TerminalNode FLOATLITERAL(int i) {
			return getToken(LittleParser.FLOATLITERAL, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(LittleParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(LittleParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(LittleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(LittleParser.COMMENT, i);
		}
		public List<TerminalNode> KEYWORDS() { return getTokens(LittleParser.KEYWORDS); }
		public TerminalNode KEYWORDS(int i) {
			return getToken(LittleParser.KEYWORDS, i);
		}
		public List<TerminalNode> OP() { return getTokens(LittleParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(LittleParser.OP, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleListener ) ((LittleListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleListener ) ((LittleListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 502L) != 0) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 502L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\u0004\u0001\b\t\u0002\u0000\u0007\u0000\u0001\u0000\u0005\u0000\u0004"+
		"\b\u0000\n\u0000\f\u0000\u0007\t\u0000\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0002\u0000\u0001\u0002\u0004\b\b\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000"+
		"\u0000\u0000\u0004\u0007\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000"+
		"\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000"+
		"\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}