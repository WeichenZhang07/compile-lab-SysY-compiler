// Generated from E:/Documents/code/compile/compile-Lab5/src\grammer.g4 by ANTLR 4.9.1
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
	public static final int
		RULE_compUnit = 0, RULE_decl = 1, RULE_globalDecl = 2, RULE_constDecl = 3, 
		RULE_constDef = 4, RULE_constInitVal = 5, RULE_constExp = 6, RULE_varDecl = 7, 
		RULE_varDef = 8, RULE_initVal = 9, RULE_funcDef = 10, RULE_funcType = 11, 
		RULE_block = 12, RULE_blockItem = 13, RULE_ifState = 14, RULE_ifBlock = 15, 
		RULE_elseBlock = 16, RULE_stmt = 17, RULE_lval = 18, RULE_number = 19, 
		RULE_cond = 20, RULE_exp = 21, RULE_addexp = 22, RULE_mulexp = 23, RULE_relExp = 24, 
		RULE_eqExp = 25, RULE_lAndExp = 26, RULE_lOrExp = 27, RULE_unaryOp = 28, 
		RULE_unaryExp = 29, RULE_funcRParams = 30, RULE_primaryExp = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "decl", "globalDecl", "constDecl", "constDef", "constInitVal", 
			"constExp", "varDecl", "varDef", "initVal", "funcDef", "funcType", "block", 
			"blockItem", "ifState", "ifBlock", "elseBlock", "stmt", "lval", "number", 
			"cond", "exp", "addexp", "mulexp", "relExp", "eqExp", "lAndExp", "lOrExp", 
			"unaryOp", "unaryExp", "funcRParams", "primaryExp"
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
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public List<GlobalDeclContext> globalDecl() {
			return getRuleContexts(GlobalDeclContext.class);
		}
		public GlobalDeclContext globalDecl(int i) {
			return getRuleContext(GlobalDeclContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					globalDecl();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(70);
			funcDef();
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				constDecl();
				}
				break;
			case Btype:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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

	public static class GlobalDeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitGlobalDecl(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalDecl);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				constDecl();
				}
				break;
			case Btype:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
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
		enterRule(_localctx, 6, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			match(Btype);
			setState(82);
			constDef();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				constDef();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		enterRule(_localctx, 8, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Ident);
			setState(93);
			match(T__3);
			setState(94);
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
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterConstInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitConstInitVal(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constInitVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			constExp();
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
		enterRule(_localctx, 12, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Btype);
			setState(101);
			varDef();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(102);
				match(T__1);
				setState(103);
				varDef();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		enterRule(_localctx, 16, RULE_varDef);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(Ident);
				}
				break;
			case 2:
				_localctx = new InitialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(Ident);
				setState(113);
				match(T__3);
				setState(114);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).enterInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammerListener ) ((grammerListener)listener).exitInitVal(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			exp();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 20, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			funcType();
			setState(120);
			match(Ident);
			setState(121);
			match(T__4);
			setState(122);
			match(T__5);
			setState(123);
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
		enterRule(_localctx, 22, RULE_funcType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Btype);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__24) | (1L << Btype) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
				{
				{
				setState(128);
				blockItem();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		enterRule(_localctx, 26, RULE_blockItem);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Btype:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				decl();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__24:
			case Ident:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		enterRule(_localctx, 28, RULE_ifState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__8);
			setState(141);
			match(T__4);
			setState(142);
			cond();
			setState(143);
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
		enterRule(_localctx, 30, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 32, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__9);
			setState(148);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_stmt);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__10);
				setState(151);
				exp();
				setState(152);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				lval();
				setState(155);
				match(T__3);
				setState(156);
				exp();
				setState(157);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				ifState();
				setState(160);
				ifBlock();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(161);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SingleBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				block();
				}
				break;
			case 5:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				exp();
				setState(166);
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
		enterRule(_localctx, 36, RULE_lval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Ident);
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
		enterRule(_localctx, 38, RULE_number);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_const:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Decimal_const);
				}
				break;
			case Octal_const:
				_localctx = new OctalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Octal_const);
				}
				break;
			case Hexadecimal_const:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
		enterRule(_localctx, 40, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 42, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_addexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleAddExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(182);
			mulexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleAddExpContext(new AddexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(184);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(185);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(186);
					mulexp(0);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_mulexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleMulExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(193);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleMulExpContext(new MulexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulexp);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(197);
					unaryExp();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_relExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleRelExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(204);
			addexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleRelExpContext(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					addexp(0);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_eqExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleEqExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(215);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleEqExpContext(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(217);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(218);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(219);
					relExp(0);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleLAndExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(226);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLAndExpContext(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					match(T__22);
					setState(230);
					eqExp(0);
					}
					} 
				}
				setState(235);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleLOrExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(237);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLOrExpContext(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(239);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(240);
					match(T__23);
					setState(241);
					lAndExp(0);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 56, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_unaryExp);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PriContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(Ident);
				setState(251);
				match(T__4);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__24) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(252);
					funcRParams();
					}
				}

				setState(255);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				unaryOp();
				setState(257);
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
		enterRule(_localctx, 60, RULE_funcRParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			exp();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(262);
				match(T__1);
				setState(263);
				exp();
				}
				}
				setState(268);
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
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
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
		enterRule(_localctx, 62, RULE_primaryExp);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__4);
				setState(270);
				exp();
				setState(271);
				match(T__5);
				}
				break;
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				number();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				lval();
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
		case 22:
			return addexp_sempred((AddexpContext)_localctx, predIndex);
		case 23:
			return mulexp_sempred((MulexpContext)_localctx, predIndex);
		case 24:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 25:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 26:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0118\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\5\3M\n\3\3\4\3\4\5\4Q"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\7\16\u0084\n\16\f\16\16\16\u0087\13\16\3\16\3\16\3\17\3\17\5\17\u008d"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a5\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ab\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u00b2\n\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00be\n\30\f\30"+
		"\16\30\u00c1\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00c9\n\31\f\31"+
		"\16\31\u00cc\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00d4\n\32\f\32"+
		"\16\32\u00d7\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00df\n\33\f\33"+
		"\16\33\u00e2\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00ea\n\34\f\34"+
		"\16\34\u00ed\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00f5\n\35\f\35"+
		"\16\35\u00f8\13\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0100\n\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0106\n\37\3 \3 \3 \7 \u010b\n \f \16 \u010e\13 "+
		"\3!\3!\3!\3!\3!\3!\5!\u0116\n!\3!\2\b.\60\62\64\668\"\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3\2\16\17\3\2\20\22"+
		"\3\2\23\26\3\2\27\30\4\2\16\17\33\33\2\u0112\2E\3\2\2\2\4L\3\2\2\2\6P"+
		"\3\2\2\2\bR\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22u"+
		"\3\2\2\2\24w\3\2\2\2\26y\3\2\2\2\30\177\3\2\2\2\32\u0081\3\2\2\2\34\u008c"+
		"\3\2\2\2\36\u008e\3\2\2\2 \u0093\3\2\2\2\"\u0095\3\2\2\2$\u00aa\3\2\2"+
		"\2&\u00ac\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00b5\3\2\2\2.\u00b7"+
		"\3\2\2\2\60\u00c2\3\2\2\2\62\u00cd\3\2\2\2\64\u00d8\3\2\2\2\66\u00e3\3"+
		"\2\2\28\u00ee\3\2\2\2:\u00f9\3\2\2\2<\u0105\3\2\2\2>\u0107\3\2\2\2@\u0115"+
		"\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G"+
		"E\3\2\2\2HI\5\26\f\2I\3\3\2\2\2JM\5\b\5\2KM\5\20\t\2LJ\3\2\2\2LK\3\2\2"+
		"\2M\5\3\2\2\2NQ\5\b\5\2OQ\5\20\t\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RS\7"+
		"\3\2\2ST\7\37\2\2TY\5\n\6\2UV\7\4\2\2VX\5\n\6\2WU\3\2\2\2X[\3\2\2\2YW"+
		"\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\5\2\2]\t\3\2\2\2^_\7 \2\2"+
		"_`\7\6\2\2`a\5\f\7\2a\13\3\2\2\2bc\5\16\b\2c\r\3\2\2\2de\5.\30\2e\17\3"+
		"\2\2\2fg\7\37\2\2gl\5\22\n\2hi\7\4\2\2ik\5\22\n\2jh\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\5\2\2p\21\3\2\2\2qv\7 \2"+
		"\2rs\7 \2\2st\7\6\2\2tv\5\24\13\2uq\3\2\2\2ur\3\2\2\2v\23\3\2\2\2wx\5"+
		",\27\2x\25\3\2\2\2yz\5\30\r\2z{\7 \2\2{|\7\7\2\2|}\7\b\2\2}~\5\32\16\2"+
		"~\27\3\2\2\2\177\u0080\7\37\2\2\u0080\31\3\2\2\2\u0081\u0085\7\t\2\2\u0082"+
		"\u0084\5\34\17\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\n\2\2\u0089\33\3\2\2\2\u008a\u008d\5\4\3\2\u008b\u008d\5$\23"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\35\3\2\2\2\u008e\u008f"+
		"\7\13\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5*\26\2\u0091\u0092\7\b\2\2"+
		"\u0092\37\3\2\2\2\u0093\u0094\5$\23\2\u0094!\3\2\2\2\u0095\u0096\7\f\2"+
		"\2\u0096\u0097\5$\23\2\u0097#\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a"+
		"\5,\27\2\u009a\u009b\7\5\2\2\u009b\u00ab\3\2\2\2\u009c\u009d\5&\24\2\u009d"+
		"\u009e\7\6\2\2\u009e\u009f\5,\27\2\u009f\u00a0\7\5\2\2\u00a0\u00ab\3\2"+
		"\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a4\5 \21\2\u00a3\u00a5\5\"\22\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00ab\5\32"+
		"\16\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u0098\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a6\3\2"+
		"\2\2\u00aa\u00a7\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7 \2\2\u00ad\'\3\2"+
		"\2\2\u00ae\u00b2\7!\2\2\u00af\u00b2\7\"\2\2\u00b0\u00b2\7#\2\2\u00b1\u00ae"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2)\3\2\2\2\u00b3"+
		"\u00b4\58\35\2\u00b4+\3\2\2\2\u00b5\u00b6\5.\30\2\u00b6-\3\2\2\2\u00b7"+
		"\u00b8\b\30\1\2\u00b8\u00b9\5\60\31\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb"+
		"\f\3\2\2\u00bb\u00bc\t\2\2\2\u00bc\u00be\5\60\31\2\u00bd\u00ba\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0/\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\31\1\2\u00c3\u00c4\5<\37\2\u00c4"+
		"\u00ca\3\2\2\2\u00c5\u00c6\f\3\2\2\u00c6\u00c7\t\3\2\2\u00c7\u00c9\5<"+
		"\37\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\61\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\32\1"+
		"\2\u00ce\u00cf\5.\30\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\f\3\2\2\u00d1\u00d2"+
		"\t\4\2\2\u00d2\u00d4\5.\30\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\63\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00d9\b\33\1\2\u00d9\u00da\5\62\32\2\u00da\u00e0\3\2\2\2\u00db"+
		"\u00dc\f\3\2\2\u00dc\u00dd\t\5\2\2\u00dd\u00df\5\62\32\2\u00de\u00db\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\65\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\34\1\2\u00e4\u00e5\5\64"+
		"\33\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\f\3\2\2\u00e7\u00e8\7\31\2\2\u00e8"+
		"\u00ea\5\64\33\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\67\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\b\35\1\2\u00ef\u00f0\5\66\34\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2"+
		"\f\3\2\2\u00f2\u00f3\7\32\2\2\u00f3\u00f5\5\66\34\2\u00f4\u00f1\3\2\2"+
		"\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f79"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\t\6\2\2\u00fa;\3\2\2\2\u00fb"+
		"\u0106\5@!\2\u00fc\u00fd\7 \2\2\u00fd\u00ff\7\7\2\2\u00fe\u0100\5> \2"+
		"\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106"+
		"\7\b\2\2\u0102\u0103\5:\36\2\u0103\u0104\5<\37\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0102\3\2\2\2\u0106=\3\2\2\2"+
		"\u0107\u010c\5,\27\2\u0108\u0109\7\4\2\2\u0109\u010b\5,\27\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"?\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\7\2\2\u0110\u0111\5,\27\2"+
		"\u0111\u0112\7\b\2\2\u0112\u0116\3\2\2\2\u0113\u0116\5(\25\2\u0114\u0116"+
		"\5&\24\2\u0115\u010f\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"A\3\2\2\2\27ELPYlu\u0085\u008c\u00a4\u00aa\u00b1\u00bf\u00ca\u00d5\u00e0"+
		"\u00eb\u00f6\u00ff\u0105\u010c\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}