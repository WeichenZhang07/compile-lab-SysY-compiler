// Generated from D:/Users/1323/Documents/code/compile-lab/src\grammer.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		SPACE=32, COMMENT_LINE=33, COMMENT=34, Btype=35, Ident=36, Decimal_const=37, 
		Octal_const=38, Hexadecimal_const=39, Nonzero_digit=40, Octal_digit=41, 
		Digit=42, Hexadecimal_digit=43, NoneDigit=44;
	public static final int
		RULE_compUnit = 0, RULE_decl = 1, RULE_constDecl = 2, RULE_constDef = 3, 
		RULE_constInitVal = 4, RULE_constExp = 5, RULE_constScripts = 6, RULE_scripts = 7, 
		RULE_varDecl = 8, RULE_varDef = 9, RULE_initVal = 10, RULE_funcDef = 11, 
		RULE_function = 12, RULE_funcType = 13, RULE_funcFParams = 14, RULE_funcFParam = 15, 
		RULE_nakedBlock = 16, RULE_block = 17, RULE_blockItem = 18, RULE_ifState = 19, 
		RULE_whileState = 20, RULE_ifBlock = 21, RULE_elseBlock = 22, RULE_stmt = 23, 
		RULE_lval = 24, RULE_rightLval = 25, RULE_cond = 26, RULE_exp = 27, RULE_addexp = 28, 
		RULE_mulexp = 29, RULE_relExp = 30, RULE_eqExp = 31, RULE_lAndExp = 32, 
		RULE_lOrExp = 33, RULE_unaryOp = 34, RULE_unaryExp = 35, RULE_funcRParams = 36, 
		RULE_primaryExp = 37, RULE_number = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "decl", "constDecl", "constDef", "constInitVal", "constExp", 
			"constScripts", "scripts", "varDecl", "varDef", "initVal", "funcDef", 
			"function", "funcType", "funcFParams", "funcFParam", "nakedBlock", "block", 
			"blockItem", "ifState", "whileState", "ifBlock", "elseBlock", "stmt", 
			"lval", "rightLval", "cond", "exp", "addexp", "mulexp", "relExp", "eqExp", 
			"lAndExp", "lOrExp", "unaryOp", "unaryExp", "funcRParams", "primaryExp", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'='", "'{'", "'}'", "'['", "']'", "'('", 
			"')'", "'void'", "'if'", "'while'", "'else'", "'return'", "'continue'", 
			"'break'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", null, null, null, "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SPACE", "COMMENT_LINE", 
			"COMMENT", "Btype", "Ident", "Decimal_const", "Octal_const", "Hexadecimal_const", 
			"Nonzero_digit", "Octal_digit", "Digit", "Hexadecimal_digit", "NoneDigit"
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
	public String getGrammarFileName() { return "grammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitCompUnit(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(78);
					decl();
					}
					break;
				case 2:
					{
					setState(79);
					function();
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << Btype))) != 0) );
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

	public static class DeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				constDecl();
				}
				break;
			case Btype:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode Btype() { return getToken(grammerParser.Btype, 0); }
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(Btype);
			setState(90);
			constDef();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(91);
				match(T__1);
				setState(92);
				constDef();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__2);
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

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public ConstInitValContext constInitVal() {
			return getRuleContext(ConstInitValContext.class,0);
		}
		public List<ConstScriptsContext> constScripts() {
			return getRuleContexts(ConstScriptsContext.class);
		}
		public ConstScriptsContext constScripts(int i) {
			return getRuleContext(ConstScriptsContext.class,i);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitConstDef(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Ident);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(101);
				constScripts();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__3);
			setState(108);
			constInitVal();
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

	public static class ConstInitValContext extends ParserRuleContext {
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
	 
		public ConstInitValContext() { }
		public void copyFrom(ConstInitValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayConstInitValContext extends ConstInitValContext {
		public List<ConstInitValContext> constInitVal() {
			return getRuleContexts(ConstInitValContext.class);
		}
		public ConstInitValContext constInitVal(int i) {
			return getRuleContext(ConstInitValContext.class,i);
		}
		public ArrayConstInitValContext(ConstInitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterArrayConstInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitArrayConstInitVal(this);
		}
	}
	public static class SingleConstInitValContext extends ConstInitValContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public SingleConstInitValContext(ConstInitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleConstInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleConstInitVal(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constInitVal);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__17:
			case T__18:
			case T__30:
			case Ident:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				_localctx = new SingleConstInitValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				constExp();
				}
				break;
			case T__4:
				_localctx = new ArrayConstInitValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__4);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(112);
					constInitVal();
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(113);
						match(T__1);
						setState(114);
						constInitVal();
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(122);
				match(T__5);
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

	public static class ConstExpContext extends ParserRuleContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitConstExp(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			addexp(0);
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

	public static class ConstScriptsContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstScriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constScripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterConstScripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitConstScripts(this);
		}
	}

	public final ConstScriptsContext constScripts() throws RecognitionException {
		ConstScriptsContext _localctx = new ConstScriptsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constScripts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(128);
			constExp();
			setState(129);
			match(T__7);
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

	public static class ScriptsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ScriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterScripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitScripts(this);
		}
	}

	public final ScriptsContext scripts() throws RecognitionException {
		ScriptsContext _localctx = new ScriptsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scripts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__6);
			setState(132);
			exp();
			setState(133);
			match(T__7);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode Btype() { return getToken(grammerParser.Btype, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(Btype);
			setState(136);
			varDef();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(137);
				match(T__1);
				setState(138);
				varDef();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__2);
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

	public static class VarDefContext extends ParserRuleContext {
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleContext extends VarDefContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public List<ScriptsContext> scripts() {
			return getRuleContexts(ScriptsContext.class);
		}
		public ScriptsContext scripts(int i) {
			return getRuleContext(ScriptsContext.class,i);
		}
		public SingleContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingle(this);
		}
	}
	public static class InitialContext extends VarDefContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public List<ScriptsContext> scripts() {
			return getRuleContexts(ScriptsContext.class);
		}
		public ScriptsContext scripts(int i) {
			return getRuleContext(ScriptsContext.class,i);
		}
		public InitialContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitInitial(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDef);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(Ident);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(147);
					scripts();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new InitialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(Ident);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(154);
					scripts();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__3);
				setState(161);
				initVal();
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

	public static class InitValContext extends ParserRuleContext {
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
	 
		public InitValContext() { }
		public void copyFrom(InitValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInitValContext extends InitValContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleInitValContext(InitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleInitVal(this);
		}
	}
	public static class ArrayInitValContext extends InitValContext {
		public List<InitValContext> initVal() {
			return getRuleContexts(InitValContext.class);
		}
		public InitValContext initVal(int i) {
			return getRuleContext(InitValContext.class,i);
		}
		public ArrayInitValContext(InitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterArrayInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitArrayInitVal(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initVal);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__17:
			case T__18:
			case T__30:
			case Ident:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				_localctx = new SingleInitValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				exp();
				}
				break;
			case T__4:
				_localctx = new ArrayInitValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__4);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(166);
					initVal();
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(167);
						match(T__1);
						setState(168);
						initVal();
						}
						}
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(176);
				match(T__5);
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public List<FuncFParamsContext> funcFParams() {
			return getRuleContexts(FuncFParamsContext.class);
		}
		public FuncFParamsContext funcFParams(int i) {
			return getRuleContext(FuncFParamsContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			funcType();
			setState(180);
			match(Ident);
			setState(181);
			match(T__8);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Btype) {
				{
				{
				setState(182);
				funcFParams();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__9);
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
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			funcDef();
			setState(191);
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

	public static class FuncTypeContext extends ParserRuleContext {
		public TerminalNode Btype() { return getToken(grammerParser.Btype, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFuncType(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==Btype) ) {
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

	public static class FuncFParamsContext extends ParserRuleContext {
		public List<FuncFParamContext> funcFParam() {
			return getRuleContexts(FuncFParamContext.class);
		}
		public FuncFParamContext funcFParam(int i) {
			return getRuleContext(FuncFParamContext.class,i);
		}
		public FuncFParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFuncFParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFuncFParams(this);
		}
	}

	public final FuncFParamsContext funcFParams() throws RecognitionException {
		FuncFParamsContext _localctx = new FuncFParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcFParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			funcFParam();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(196);
				match(T__1);
				setState(197);
				funcFParam();
				}
				}
				setState(202);
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

	public static class FuncFParamContext extends ParserRuleContext {
		public TerminalNode Btype() { return getToken(grammerParser.Btype, 0); }
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public List<ScriptsContext> scripts() {
			return getRuleContexts(ScriptsContext.class);
		}
		public ScriptsContext scripts(int i) {
			return getRuleContext(ScriptsContext.class,i);
		}
		public FuncFParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFuncFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFuncFParam(this);
		}
	}

	public final FuncFParamContext funcFParam() throws RecognitionException {
		FuncFParamContext _localctx = new FuncFParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcFParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Btype);
			setState(204);
			match(Ident);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(205);
				match(T__6);
				setState(206);
				match(T__7);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(207);
					scripts();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NakedBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NakedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nakedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterNakedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitNakedBlock(this);
		}
	}

	public final NakedBlockContext nakedBlock() throws RecognitionException {
		NakedBlockContext _localctx = new NakedBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nakedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__4);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Btype) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
				{
				{
				setState(218);
				blockItem();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__5);
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

	public static class BlockItemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockItem);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Btype:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				decl();
				}
				break;
			case T__2:
			case T__4:
			case T__8:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__30:
			case Ident:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				stmt();
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

	public static class IfStateContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitIfState(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__11);
			setState(231);
			match(T__8);
			setState(232);
			cond();
			setState(233);
			match(T__9);
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

	public static class WhileStateContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhileStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitWhileState(this);
		}
	}

	public final WhileStateContext whileState() throws RecognitionException {
		WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__12);
			setState(236);
			match(T__8);
			setState(237);
			cond();
			setState(238);
			match(T__9);
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

	public static class IfBlockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			stmt();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__13);
			setState(243);
			stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends StmtContext {
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitBreak(this);
		}
	}
	public static class AssignmentContext extends StmtContext {
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitAssignment(this);
		}
	}
	public static class ContinueContext extends StmtContext {
		public ContinueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitContinue(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public WhileStateContext whileState() {
			return getRuleContext(WhileStateContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StmtContext {
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitReturn(this);
		}
	}
	public static class SingleBlockContext extends StmtContext {
		public NakedBlockContext nakedBlock() {
			return getRuleContext(NakedBlockContext.class,0);
		}
		public SingleBlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleBlock(this);
		}
	}
	public static class SingleExpContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleExp(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stmt);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__14);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(246);
					exp();
					}
				}

				setState(249);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				lval();
				setState(251);
				match(T__3);
				setState(252);
				exp();
				setState(253);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				ifState();
				setState(256);
				ifBlock();
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(257);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				whileState();
				setState(261);
				stmt();
				}
				break;
			case 5:
				_localctx = new SingleBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				nakedBlock();
				}
				break;
			case 6:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(T__15);
				setState(265);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				match(T__16);
				setState(267);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(268);
					exp();
					}
				}

				setState(271);
				match(T__2);
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

	public static class LvalContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public List<ScriptsContext> scripts() {
			return getRuleContexts(ScriptsContext.class);
		}
		public ScriptsContext scripts(int i) {
			return getRuleContext(ScriptsContext.class,i);
		}
		public LvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterLval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitLval(this);
		}
	}

	public final LvalContext lval() throws RecognitionException {
		LvalContext _localctx = new LvalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Ident);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(275);
				scripts();
				}
				}
				setState(280);
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

	public static class RightLvalContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public List<ScriptsContext> scripts() {
			return getRuleContexts(ScriptsContext.class);
		}
		public ScriptsContext scripts(int i) {
			return getRuleContext(ScriptsContext.class,i);
		}
		public RightLvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightLval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterRightLval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitRightLval(this);
		}
	}

	public final RightLvalContext rightLval() throws RecognitionException {
		RightLvalContext _localctx = new RightLvalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rightLval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Ident);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					scripts();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class CondContext extends ParserRuleContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			lOrExp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			addexp(0);
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

	public static class AddexpContext extends ParserRuleContext {
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	 
		public AddexpContext() { }
		public void copyFrom(AddexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleAddExpContext extends AddexpContext {
		public MulexpContext mulexp() {
			return getRuleContext(MulexpContext.class,0);
		}
		public SingleAddExpContext(AddexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleAddExp(this);
		}
	}
	public static class MultipleAddExpContext extends AddexpContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public MulexpContext mulexp() {
			return getRuleContext(MulexpContext.class,0);
		}
		public MultipleAddExpContext(AddexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleAddExp(this);
		}
	}

	public final AddexpContext addexp() throws RecognitionException {
		return addexp(0);
	}

	private AddexpContext addexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddexpContext _localctx = new AddexpContext(_ctx, _parentState);
		AddexpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_addexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleAddExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(293);
			mulexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleAddExpContext(new AddexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(296);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(297);
					mulexp(0);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class MulexpContext extends ParserRuleContext {
		public MulexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexp; }
	 
		public MulexpContext() { }
		public void copyFrom(MulexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleMulExpContext extends MulexpContext {
		public MulexpContext mulexp() {
			return getRuleContext(MulexpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MultipleMulExpContext(MulexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleMulExp(this);
		}
	}
	public static class SingleMulExpContext extends MulexpContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public SingleMulExpContext(MulexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleMulExp(this);
		}
	}

	public final MulexpContext mulexp() throws RecognitionException {
		return mulexp(0);
	}

	private MulexpContext mulexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulexpContext _localctx = new MulexpContext(_ctx, _parentState);
		MulexpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_mulexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleMulExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(304);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleMulExpContext(new MulexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulexp);
					setState(306);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(307);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(308);
					unaryExp();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class RelExpContext extends ParserRuleContext {
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
	 
		public RelExpContext() { }
		public void copyFrom(RelExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleRelExpContext extends RelExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public MultipleRelExpContext(RelExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleRelExp(this);
		}
	}
	public static class SingleRelExpContext extends RelExpContext {
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SingleRelExpContext(RelExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleRelExp(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		return relExp(0);
	}

	private RelExpContext relExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpContext _localctx = new RelExpContext(_ctx, _parentState);
		RelExpContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_relExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleRelExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(315);
			addexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleRelExpContext(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(318);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(319);
					addexp(0);
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class EqExpContext extends ParserRuleContext {
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
	 
		public EqExpContext() { }
		public void copyFrom(EqExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleEqExpContext extends EqExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public MultipleEqExpContext(EqExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleEqExp(this);
		}
	}
	public static class SingleEqExpContext extends EqExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public SingleEqExpContext(EqExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleEqExp(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		return eqExp(0);
	}

	private EqExpContext eqExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpContext _localctx = new EqExpContext(_ctx, _parentState);
		EqExpContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_eqExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleEqExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(326);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleEqExpContext(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(328);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(329);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(330);
					relExp(0);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class LAndExpContext extends ParserRuleContext {
		public LAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAndExp; }
	 
		public LAndExpContext() { }
		public void copyFrom(LAndExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleLAndExpContext extends LAndExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public MultipleLAndExpContext(LAndExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleLAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleLAndExp(this);
		}
	}
	public static class SingleLAndExpContext extends LAndExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public SingleLAndExpContext(LAndExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleLAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleLAndExp(this);
		}
	}

	public final LAndExpContext lAndExp() throws RecognitionException {
		return lAndExp(0);
	}

	private LAndExpContext lAndExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LAndExpContext _localctx = new LAndExpContext(_ctx, _parentState);
		LAndExpContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleLAndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(337);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLAndExpContext(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(340);
					match(T__28);
					setState(341);
					eqExp(0);
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class LOrExpContext extends ParserRuleContext {
		public LOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lOrExp; }
	 
		public LOrExpContext() { }
		public void copyFrom(LOrExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleLOrExpContext extends LOrExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public SingleLOrExpContext(LOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterSingleLOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitSingleLOrExp(this);
		}
	}
	public static class MultipleLOrExpContext extends LOrExpContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public MultipleLOrExpContext(LOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterMultipleLOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitMultipleLOrExp(this);
		}
	}

	public final LOrExpContext lOrExp() throws RecognitionException {
		return lOrExp(0);
	}

	private LOrExpContext lOrExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LOrExpContext _localctx = new LOrExpContext(_ctx, _parentState);
		LOrExpContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleLOrExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(348);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLOrExpContext(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					match(T__29);
					setState(352);
					lAndExp(0);
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitUnaryOp(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__30))) != 0)) ) {
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

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
	 
		public UnaryExpContext() { }
		public void copyFrom(UnaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends UnaryExpContext {
		public TerminalNode Ident() { return getToken(grammerParser.Ident, 0); }
		public FuncRParamsContext funcRParams() {
			return getRuleContext(FuncRParamsContext.class,0);
		}
		public FuncContext(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFunc(this);
		}
	}
	public static class PriContext extends UnaryExpContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public PriContext(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitPri(this);
		}
	}
	public static class UnaryContext extends UnaryExpContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public UnaryContext(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitUnary(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExp);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new PriContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(Ident);
				setState(362);
				match(T__8);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(363);
					funcRParams();
					}
				}

				setState(366);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				unaryOp();
				setState(368);
				unaryExp();
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

	public static class FuncRParamsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncRParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterFuncRParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitFuncRParams(this);
		}
	}

	public final FuncRParamsContext funcRParams() throws RecognitionException {
		FuncRParamsContext _localctx = new FuncRParamsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcRParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			exp();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(373);
				match(T__1);
				setState(374);
				exp();
				}
				}
				setState(379);
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

	public static class PrimaryExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public RightLvalContext rightLval() {
			return getRuleContext(RightLvalContext.class,0);
		}
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitPrimaryExp(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primaryExp);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__8);
				setState(381);
				exp();
				setState(382);
				match(T__9);
				}
				break;
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				number();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				rightLval();
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OctalContext extends NumberContext {
		public TerminalNode Octal_const() { return getToken(grammerParser.Octal_const, 0); }
		public OctalContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitOctal(this);
		}
	}
	public static class HexContext extends NumberContext {
		public TerminalNode Hexadecimal_const() { return getToken(grammerParser.Hexadecimal_const, 0); }
		public HexContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitHex(this);
		}
	}
	public static class DecimalContext extends NumberContext {
		public TerminalNode Decimal_const() { return getToken(grammerParser.Decimal_const, 0); }
		public DecimalContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitDecimal(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_number);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_const:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(Decimal_const);
				}
				break;
			case Octal_const:
				_localctx = new OctalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(Octal_const);
				}
				break;
			case Hexadecimal_const:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(Hexadecimal_const);
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
		case 28:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 29:
			return mulexp_sempred((MulexpContext)_localctx, predIndex);
		case 30:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 31:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 32:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 33:
			return lOrExp_sempred((LOrExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addexp_sempred(AddexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulexp_sempred(MulexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relExp_sempred(RelExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExp_sempred(EqExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lAndExp_sempred(LAndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lOrExp_sempred(LOrExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\6\2S\n\2\r\2"+
		"\16\2T\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3"+
		"\4\3\4\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\7\6v\n\6\f\6\16\6y\13\6\5\6{\n\6\3\6\5\6~\n\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13\n\3\n"+
		"\3\n\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\13\3\13\7\13\u009e"+
		"\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00ac\n\f\f\f\16\f\u00af\13\f\5\f\u00b1\n\f\3\f\5\f\u00b4\n\f"+
		"\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16\20\u00cc\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\5\21\u00d8"+
		"\n\21\3\22\3\22\3\23\3\23\7\23\u00de\n\23\f\23\16\23\u00e1\13\23\3\23"+
		"\3\23\3\24\3\24\5\24\u00e7\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\5\31\u00fa\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0105\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0110\n\31\3\31\5\31\u0113\n\31\3\32\3"+
		"\32\7\32\u0117\n\32\f\32\16\32\u011a\13\32\3\33\3\33\7\33\u011e\n\33\f"+
		"\33\16\33\u0121\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u012d\n\36\f\36\16\36\u0130\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0138\n\37\f\37\16\37\u013b\13\37\3 \3 \3 \3 \3 \3 \7 \u0143\n "+
		"\f \16 \u0146\13 \3!\3!\3!\3!\3!\3!\7!\u014e\n!\f!\16!\u0151\13!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\7\"\u0159\n\"\f\"\16\"\u015c\13\"\3#\3#\3#\3#\3#\3"+
		"#\7#\u0164\n#\f#\16#\u0167\13#\3$\3$\3%\3%\3%\3%\5%\u016f\n%\3%\3%\3%"+
		"\3%\5%\u0175\n%\3&\3&\3&\7&\u017a\n&\f&\16&\u017d\13&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0185\n\'\3(\3(\3(\5(\u018a\n(\3(\2\b:<>@BD)\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\b\4\2\r"+
		"\r%%\3\2\24\25\3\2\26\30\3\2\31\34\3\2\35\36\4\2\24\25!!\2\u0193\2R\3"+
		"\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\bf\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\u0085\3\2\2\2\22\u0089\3\2\2\2\24\u00a4\3\2\2\2\26\u00b3\3"+
		"\2\2\2\30\u00b5\3\2\2\2\32\u00c0\3\2\2\2\34\u00c3\3\2\2\2\36\u00c5\3\2"+
		"\2\2 \u00cd\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00e6\3\2\2\2(\u00e8"+
		"\3\2\2\2*\u00ed\3\2\2\2,\u00f2\3\2\2\2.\u00f4\3\2\2\2\60\u0112\3\2\2\2"+
		"\62\u0114\3\2\2\2\64\u011b\3\2\2\2\66\u0122\3\2\2\28\u0124\3\2\2\2:\u0126"+
		"\3\2\2\2<\u0131\3\2\2\2>\u013c\3\2\2\2@\u0147\3\2\2\2B\u0152\3\2\2\2D"+
		"\u015d\3\2\2\2F\u0168\3\2\2\2H\u0174\3\2\2\2J\u0176\3\2\2\2L\u0184\3\2"+
		"\2\2N\u0189\3\2\2\2PS\5\4\3\2QS\5\32\16\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\3\3\2\2\2VY\5\6\4\2WY\5\22\n\2XV\3\2\2\2XW\3\2"+
		"\2\2Y\5\3\2\2\2Z[\7\3\2\2[\\\7%\2\2\\a\5\b\5\2]^\7\4\2\2^`\5\b\5\2_]\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\5\2\2e\7"+
		"\3\2\2\2fj\7&\2\2gi\5\16\b\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k"+
		"m\3\2\2\2lj\3\2\2\2mn\7\6\2\2no\5\n\6\2o\t\3\2\2\2p~\5\f\7\2qz\7\7\2\2"+
		"rw\5\n\6\2st\7\4\2\2tv\5\n\6\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\b\2\2}p\3\2\2\2"+
		"}q\3\2\2\2~\13\3\2\2\2\177\u0080\5:\36\2\u0080\r\3\2\2\2\u0081\u0082\7"+
		"\t\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\n\2\2\u0084\17\3\2\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\58\35\2\u0087\u0088\7\n\2\2\u0088\21\3\2\2"+
		"\2\u0089\u008a\7%\2\2\u008a\u008f\5\24\13\2\u008b\u008c\7\4\2\2\u008c"+
		"\u008e\5\24\13\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7\5\2\2\u0093\23\3\2\2\2\u0094\u0098\7&\2\2\u0095\u0097\5\20\t"+
		"\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\7&\2\2\u009c"+
		"\u009e\5\20\t\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a5\5\26\f\2\u00a4\u0094\3\2\2\2\u00a4\u009b\3"+
		"\2\2\2\u00a5\25\3\2\2\2\u00a6\u00b4\58\35\2\u00a7\u00b0\7\7\2\2\u00a8"+
		"\u00ad\5\26\f\2\u00a9\u00aa\7\4\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a9\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\b\2\2\u00b3\u00a6\3\2\2\2\u00b3"+
		"\u00a7\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7&\2"+
		"\2\u00b7\u00bb\7\13\2\2\u00b8\u00ba\5\36\20\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\31\3\2\2\2\u00c0\u00c1"+
		"\5\30\r\2\u00c1\u00c2\5$\23\2\u00c2\33\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00ca\5 \21\2\u00c6\u00c7\7\4\2\2\u00c7\u00c9\5 \21"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7%\2\2\u00ce"+
		"\u00d7\7&\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d4\7\n\2\2\u00d1\u00d3\5\20"+
		"\t\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da\5$\23\2\u00da#\3\2"+
		"\2\2\u00db\u00df\7\7\2\2\u00dc\u00de\5&\24\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3%\3\2\2\2\u00e4\u00e7"+
		"\5\4\3\2\u00e5\u00e7\5\60\31\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\'\3\2\2\2\u00e8\u00e9\7\16\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb"+
		"\5\66\34\2\u00eb\u00ec\7\f\2\2\u00ec)\3\2\2\2\u00ed\u00ee\7\17\2\2\u00ee"+
		"\u00ef\7\13\2\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\7\f\2\2\u00f1+\3\2\2"+
		"\2\u00f2\u00f3\5\60\31\2\u00f3-\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6"+
		"\5\60\31\2\u00f6/\3\2\2\2\u00f7\u00f9\7\21\2\2\u00f8\u00fa\58\35\2\u00f9"+
		"\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0113\7\5"+
		"\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\58\35\2\u00ff"+
		"\u0100\7\5\2\2\u0100\u0113\3\2\2\2\u0101\u0102\5(\25\2\u0102\u0104\5,"+
		"\27\2\u0103\u0105\5.\30\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0113\3\2\2\2\u0106\u0107\5*\26\2\u0107\u0108\5\60\31\2\u0108\u0113\3"+
		"\2\2\2\u0109\u0113\5\"\22\2\u010a\u010b\7\22\2\2\u010b\u0113\7\5\2\2\u010c"+
		"\u010d\7\23\2\2\u010d\u0113\7\5\2\2\u010e\u0110\58\35\2\u010f\u010e\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\7\5\2\2\u0112"+
		"\u00f7\3\2\2\2\u0112\u00fc\3\2\2\2\u0112\u0101\3\2\2\2\u0112\u0106\3\2"+
		"\2\2\u0112\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010c\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0113\61\3\2\2\2\u0114\u0118\7&\2\2\u0115\u0117\5\20\t"+
		"\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\63\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\7&\2\2\u011c"+
		"\u011e\5\20\t\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\65\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\5D#\2\u0123\67\3\2\2\2\u0124\u0125\5:\36\2\u01259\3\2\2\2\u0126"+
		"\u0127\b\36\1\2\u0127\u0128\5<\37\2\u0128\u012e\3\2\2\2\u0129\u012a\f"+
		"\3\2\2\u012a\u012b\t\3\2\2\u012b\u012d\5<\37\2\u012c\u0129\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f;\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0132\b\37\1\2\u0132\u0133\5H%\2\u0133\u0139"+
		"\3\2\2\2\u0134\u0135\f\3\2\2\u0135\u0136\t\4\2\2\u0136\u0138\5H%\2\u0137"+
		"\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a=\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\b \1\2\u013d\u013e"+
		"\5:\36\2\u013e\u0144\3\2\2\2\u013f\u0140\f\3\2\2\u0140\u0141\t\5\2\2\u0141"+
		"\u0143\5:\36\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145?\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148"+
		"\b!\1\2\u0148\u0149\5> \2\u0149\u014f\3\2\2\2\u014a\u014b\f\3\2\2\u014b"+
		"\u014c\t\6\2\2\u014c\u014e\5> \2\u014d\u014a\3\2\2\2\u014e\u0151\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150A\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\b\"\1\2\u0153\u0154\5@!\2\u0154\u015a\3\2\2\2\u0155"+
		"\u0156\f\3\2\2\u0156\u0157\7\37\2\2\u0157\u0159\5@!\2\u0158\u0155\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"C\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\b#\1\2\u015e\u015f\5B\"\2\u015f"+
		"\u0165\3\2\2\2\u0160\u0161\f\3\2\2\u0161\u0162\7 \2\2\u0162\u0164\5B\""+
		"\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166E\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\t\7\2\2\u0169"+
		"G\3\2\2\2\u016a\u0175\5L\'\2\u016b\u016c\7&\2\2\u016c\u016e\7\13\2\2\u016d"+
		"\u016f\5J&\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2"+
		"\2\u0170\u0175\7\f\2\2\u0171\u0172\5F$\2\u0172\u0173\5H%\2\u0173\u0175"+
		"\3\2\2\2\u0174\u016a\3\2\2\2\u0174\u016b\3\2\2\2\u0174\u0171\3\2\2\2\u0175"+
		"I\3\2\2\2\u0176\u017b\58\35\2\u0177\u0178\7\4\2\2\u0178\u017a\58\35\2"+
		"\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017cK\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\13\2\2\u017f"+
		"\u0180\58\35\2\u0180\u0181\7\f\2\2\u0181\u0185\3\2\2\2\u0182\u0185\5N"+
		"(\2\u0183\u0185\5\64\33\2\u0184\u017e\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185M\3\2\2\2\u0186\u018a\7\'\2\2\u0187\u018a\7(\2\2\u0188"+
		"\u018a\7)\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018aO\3\2\2\2(RTXajwz}\u008f\u0098\u009f\u00a4\u00ad\u00b0\u00b3"+
		"\u00bb\u00ca\u00d4\u00d7\u00df\u00e6\u00f9\u0104\u010f\u0112\u0118\u011f"+
		"\u012e\u0139\u0144\u014f\u015a\u0165\u016e\u0174\u017b\u0184\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}