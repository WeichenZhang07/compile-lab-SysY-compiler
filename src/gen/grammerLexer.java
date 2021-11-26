// Generated from E:/Documents/code/compile/compile-Lab4/src\grammer.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, SPACE=26, COMMENT_LINE=27, COMMENT=28, Btype=29, Ident=30, Decimal_const=31, 
		Octal_const=32, Hexadecimal_const=33, Nonzero_digit=34, Octal_digit=35, 
		Digit=36, Hexadecimal_digit=37, NoneDigit=38;
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
			"SPACE", "COMMENT_LINE", "COMMENT", "Btype", "Ident", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Nonzero_digit", "Octal_digit", "Digit", 
			"Hexadecimal_digit", "NoneDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'='", "'('", "')'", "'{'", "'}'", "'if'", 
			"'else'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", null, null, null, 
			"'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "SPACE", "COMMENT_LINE", "COMMENT", "Btype", "Ident", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Nonzero_digit", "Octal_digit", "Digit", 
			"Hexadecimal_digit", "NoneDigit"
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


	public grammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u009d\n\34\f\34\16"+
		"\34\u00a0\13\34\3\34\5\34\u00a3\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\7\35\u00ad\n\35\f\35\16\35\u00b0\13\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u00be\n\37\f\37\16\37\u00c1\13"+
		"\37\3 \3 \7 \u00c5\n \f \16 \u00c8\13 \3!\3!\7!\u00cc\n!\f!\16!\u00cf"+
		"\13!\3\"\3\"\3\"\3\"\5\"\u00d5\n\"\3\"\7\"\u00d8\n\"\f\"\16\"\u00db\13"+
		"\"\3#\3#\3$\3$\3%\3%\5%\u00e3\n%\3&\3&\3\'\3\'\4\u009e\u00ae\2(\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\6\5\2\13\f\17\17\"\"\3\2\629\5\2\62;CHch\5\2C\\a"+
		"ac|\2\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7W"+
		"\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23"+
		"c\3\2\2\2\25f\3\2\2\2\27k\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2"+
		"\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2"+
		"\2\2+\u0086\3\2\2\2-\u0089\3\2\2\2/\u008c\3\2\2\2\61\u008f\3\2\2\2\63"+
		"\u0092\3\2\2\2\65\u0094\3\2\2\2\67\u0098\3\2\2\29\u00a8\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00ba\3\2\2\2?\u00c2\3\2\2\2A\u00c9\3\2\2\2C\u00d4\3\2\2\2E"+
		"\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e2\3\2\2\2K\u00e4\3\2\2\2M\u00e6\3\2"+
		"\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7u\2\2ST\7v\2\2T\4\3\2\2\2UV\7.\2\2"+
		"V\6\3\2\2\2WX\7=\2\2X\b\3\2\2\2YZ\7?\2\2Z\n\3\2\2\2[\\\7*\2\2\\\f\3\2"+
		"\2\2]^\7+\2\2^\16\3\2\2\2_`\7}\2\2`\20\3\2\2\2ab\7\177\2\2b\22\3\2\2\2"+
		"cd\7k\2\2de\7h\2\2e\24\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\26"+
		"\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\30\3\2"+
		"\2\2rs\7-\2\2s\32\3\2\2\2tu\7/\2\2u\34\3\2\2\2vw\7,\2\2w\36\3\2\2\2xy"+
		"\7\61\2\2y \3\2\2\2z{\7\'\2\2{\"\3\2\2\2|}\7>\2\2}$\3\2\2\2~\177\7@\2"+
		"\2\177&\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082(\3\2\2\2\u0083"+
		"\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085*\3\2\2\2\u0086\u0087\7?\2\2\u0087"+
		"\u0088\7?\2\2\u0088,\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7?\2\2\u008b"+
		".\3\2\2\2\u008c\u008d\7(\2\2\u008d\u008e\7(\2\2\u008e\60\3\2\2\2\u008f"+
		"\u0090\7~\2\2\u0090\u0091\7~\2\2\u0091\62\3\2\2\2\u0092\u0093\7#\2\2\u0093"+
		"\64\3\2\2\2\u0094\u0095\t\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\33\2"+
		"\2\u0097\66\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7\61\2\2\u009a\u009e"+
		"\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a3\7\17\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\34\3\2\u00a78\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7,\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\b\35\3\2\u00b5:\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7v\2\2\u00b9<\3\2\2\2\u00ba\u00bf\5M\'\2\u00bb\u00be"+
		"\5M\'\2\u00bc\u00be\5I%\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0>\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c6\5E#\2\u00c3\u00c5\5I%\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"@\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\7\62\2\2\u00ca\u00cc\t\3\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ceB\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\62\2\2\u00d1"+
		"\u00d5\7z\2\2\u00d2\u00d3\7\62\2\2\u00d3\u00d5\7Z\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\5K&\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"D\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\4\63;\2\u00ddF\3\2\2\2\u00de"+
		"\u00df\4\629\2\u00dfH\3\2\2\2\u00e0\u00e3\7\62\2\2\u00e1\u00e3\5E#\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3J\3\2\2\2\u00e4\u00e5\t\4\2\2"+
		"\u00e5L\3\2\2\2\u00e6\u00e7\t\5\2\2\u00e7N\3\2\2\2\r\2\u009e\u00a2\u00ae"+
		"\u00bd\u00bf\u00c6\u00cd\u00d4\u00d9\u00e2\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}