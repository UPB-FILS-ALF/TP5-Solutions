// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, VARIABLE=3, ADD=4, SUB=5, MUL=6, DIV=7, REM=8, INT=9, 
		FLOAT=10, STRING=11, LP=12, RP=13, EQ=14, SEMICOLON=15, INT_NUMBER=16, 
		FLOAT_NUMBER=17, STRING_TEXT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NEWLINE", "VARIABLE", "ADD", "SUB", "MUL", "DIV", "REM", "INT", 
			"FLOAT", "STRING", "LP", "RP", "EQ", "SEMICOLON", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING_TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", 
			"'string'", "'('", "')'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "VARIABLE", "ADD", "SUB", "MUL", "DIV", "REM", 
			"INT", "FLOAT", "STRING", "LP", "RP", "EQ", "SEMICOLON", "INT_NUMBER", 
			"FLOAT_NUMBER", "STRING_TEXT"
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


	public AlfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alf.g4"; }

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
		"\u0004\u0000\u0012y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001+\b"+
		"\u0001\u000b\u0001\f\u0001,\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f[\b\u000f\u000b\u000f"+
		"\f\u000f\\\u0001\u0010\u0004\u0010`\b\u0010\u000b\u0010\f\u0010a\u0001"+
		"\u0010\u0001\u0010\u0004\u0010f\b\u0010\u000b\u0010\f\u0010g\u0001\u0011"+
		"\u0001\u0011\u0004\u0011l\b\u0011\u000b\u0011\f\u0011m\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0004\u0011s\b\u0011\u000b\u0011\f\u0011t\u0001\u0011"+
		"\u0003\u0011x\b\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0005\u0002\u0000\n\n\r\r\u0003\u000009AZaz\u0001"+
		"\u000009\u0001\u0000\"\"\u0001\u0000\'\'\u0080\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003*\u0001"+
		"\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000"+
		"\u0000\t8\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r<\u0001"+
		"\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000"+
		"\u0000\u0013D\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017"+
		"Q\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bU\u0001"+
		"\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000"+
		"\u0000!_\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%&\u0005 \u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0006\u0000\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)+\u0007\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0006\u0001\u0000\u0000/\u0004\u0001"+
		"\u0000\u0000\u000002\u0005_\u0000\u000013\u0007\u0001\u0000\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005+\u0000"+
		"\u00007\b\u0001\u0000\u0000\u000089\u0005-\u0000\u00009\n\u0001\u0000"+
		"\u0000\u0000:;\u0005*\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005/"+
		"\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005%\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005n\u0000\u0000BC\u0005"+
		"t\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005f\u0000\u0000EF\u0005"+
		"l\u0000\u0000FG\u0005o\u0000\u0000GH\u0005a\u0000\u0000HI\u0005t\u0000"+
		"\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005s\u0000\u0000KL\u0005t\u0000"+
		"\u0000LM\u0005r\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005g\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005(\u0000\u0000"+
		"R\u0018\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\u001a\u0001\u0000"+
		"\u0000\u0000UV\u0005=\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0005"+
		";\u0000\u0000X\u001e\u0001\u0000\u0000\u0000Y[\u0007\u0002\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000] \u0001\u0000\u0000\u0000^`\u0007\u0002"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ce\u0005.\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\"\u0001\u0000\u0000\u0000ik\u0005\"\u0000\u0000jl\b\u0003\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000ox\u0005"+
		"\"\u0000\u0000pr\u0005\'\u0000\u0000qs\b\u0004\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005\'\u0000\u0000wi\u0001"+
		"\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000x$\u0001\u0000\u0000\u0000"+
		"\t\u0000,4\\agmtw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}