// Generated from E:/Documents/code/compile/compile-Lab5/src\grammer.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, SPACE=29, COMMENT_LINE=30, COMMENT=31, 
		Btype=32, Ident=33, Decimal_const=34, Octal_const=35, Hexadecimal_const=36, 
		Nonzero_digit=37, Octal_digit=38, Digit=39, Hexadecimal_digit=40, NoneDigit=41;
	public static final int
		RULE_compUnit = 0, RULE_decl = 1, RULE_constDecl = 2, RULE_constDef = 3, 
		RULE_constInitVal = 4, RULE_constExp = 5, RULE_varDecl = 6, RULE_varDef = 7, 
		RULE_initVal = 8, RULE_funcDef = 9, RULE_funcType = 10, RULE_block = 11, 
		RULE_blockItem = 12, RULE_ifState = 13, RULE_whileState = 14, RULE_ifBlock = 15, 
		RULE_elseBlock = 16, RULE_stmt = 17, RULE_lval = 18, RULE_number = 19, 
		RULE_cond = 20, RULE_exp = 21, RULE_addexp = 22, RULE_mulexp = 23, RULE_relExp = 24, 
		RULE_eqExp = 25, RULE_lAndExp = 26, RULE_lOrExp = 27, RULE_unaryOp = 28, 
		RULE_unaryExp = 29, RULE_funcRParams = 30, RULE_primaryExp = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "decl", "constDecl", "constDef", "constInitVal", "constExp", 
			"varDecl", "varDef", "initVal", "funcDef", "funcType", "block", "blockItem", 
			"ifState", "whileState", "ifBlock", "elseBlock", "stmt", "lval", "number", 
			"cond", "exp", "addexp", "mulexp", "relExp", "eqExp", "lAndExp", "lOrExp", 
			"unaryOp", "unaryExp", "funcRParams", "primaryExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'='", "'('", "')'", "'{'", "'}'", "'if'", 
			"'while'", "'else'", "'return'", "'continue'", "'break'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'!'", null, null, null, "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SPACE", "COMMENT_LINE", "COMMENT", "Btype", 
			"Ident", "Decimal_const", "Octal_const", "Hexadecimal_const", "Nonzero_digit", 
			"Octal_digit", "Digit", "Hexadecimal_digit", "NoneDigit"
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
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
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
					decl();
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
			setState(76);
			match(T__0);
			setState(77);
			match(Btype);
			setState(78);
			constDef();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(79);
				match(T__1);
				setState(80);
				constDef();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
		enterRule(_localctx, 6, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Ident);
			setState(89);
			match(T__3);
			setState(90);
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
		enterRule(_localctx, 8, RULE_constInitVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 10, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 12, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(Btype);
			setState(97);
			varDef();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(98);
				match(T__1);
				setState(99);
				varDef();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		enterRule(_localctx, 14, RULE_varDef);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(Ident);
				}
				break;
			case 2:
				_localctx = new InitialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(Ident);
				setState(109);
				match(T__3);
				setState(110);
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
		enterRule(_localctx, 16, RULE_initVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 18, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			funcType();
			setState(116);
			match(Ident);
			setState(117);
			match(T__4);
			setState(118);
			match(T__5);
			setState(119);
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
		enterRule(_localctx, 20, RULE_funcType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__6);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__27) | (1L << Btype) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
				{
				{
				setState(124);
				blockItem();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		enterRule(_localctx, 24, RULE_blockItem);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Btype:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				decl();
				}
				break;
			case T__4:
			case T__6:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__27:
			case Ident:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
		enterRule(_localctx, 26, RULE_ifState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__8);
			setState(137);
			match(T__4);
			setState(138);
			cond();
			setState(139);
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
		enterRule(_localctx, 28, RULE_whileState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__9);
			setState(142);
			match(T__4);
			setState(143);
			cond();
			setState(144);
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
			setState(146);
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
			setState(148);
			match(T__10);
			setState(149);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__11);
				setState(152);
				exp();
				setState(153);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				lval();
				setState(156);
				match(T__3);
				setState(157);
				exp();
				setState(158);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				ifState();
				setState(161);
				ifBlock();
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(162);
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
				setState(165);
				whileState();
				setState(166);
				stmt();
				}
				break;
			case 5:
				_localctx = new SingleBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				block();
				}
				break;
			case 6:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(T__12);
				setState(170);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(T__13);
				setState(172);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				exp();
				setState(174);
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
			setState(178);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_const:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(Decimal_const);
				}
				break;
			case Octal_const:
				_localctx = new OctalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(Octal_const);
				}
				break;
			case Hexadecimal_const:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
			setState(185);
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
			setState(187);
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

			setState(190);
			mulexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleAddExpContext(new AddexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addexp);
					setState(192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(194);
					mulexp(0);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

			setState(201);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleMulExpContext(new MulexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulexp);
					setState(203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(204);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(205);
					unaryExp();
					}
					} 
				}
				setState(210);
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

			setState(212);
			addexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleRelExpContext(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(215);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(216);
					addexp(0);
					}
					} 
				}
				setState(221);
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

			setState(223);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleEqExpContext(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(227);
					relExp(0);
					}
					} 
				}
				setState(232);
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

			setState(234);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLAndExpContext(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(236);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(237);
					match(T__25);
					setState(238);
					eqExp(0);
					}
					} 
				}
				setState(243);
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

			setState(245);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleLOrExpContext(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(248);
					match(T__26);
					setState(249);
					lAndExp(0);
					}
					} 
				}
				setState(254);
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
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__27))) != 0)) ) {
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new PriContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(Ident);
				setState(259);
				match(T__4);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__14) | (1L << T__15) | (1L << T__27) | (1L << Ident) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const))) != 0)) {
					{
					setState(260);
					funcRParams();
					}
				}

				setState(263);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				unaryOp();
				setState(265);
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
			setState(269);
			exp();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(270);
				match(T__1);
				setState(271);
				exp();
				}
				}
				setState(276);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__4);
				setState(278);
				exp();
				setState(279);
				match(T__5);
				}
				break;
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				number();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tr"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u0080\n"+
		"\r\f\r\16\r\u0083\13\r\3\r\3\r\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a6\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b3\n\23\3\24"+
		"\3\24\3\25\3\25\3\25\5\25\u00ba\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u00c6\n\30\f\30\16\30\u00c9\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u00d1\n\31\f\31\16\31\u00d4\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u00dc\n\32\f\32\16\32\u00df\13\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u00e7\n\33\f\33\16\33\u00ea\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u00fd\n\35\f\35\16\35\u0100\13\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u0108\n\37\3\37\3\37\3\37\3\37\5\37\u010e\n\37\3"+
		" \3 \3 \7 \u0113\n \f \16 \u0116\13 \3!\3!\3!\3!\3!\3!\5!\u011e\n!\3!"+
		"\2\b.\60\62\64\668\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\7\3\2\21\22\3\2\23\25\3\2\26\31\3\2\32\33\4\2\21\22\36"+
		"\36\2\u011c\2E\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\bZ\3\2\2\2\n^\3\2\2\2\f`"+
		"\3\2\2\2\16b\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26{\3\2\2\2\30"+
		"}\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008f\3\2\2\2 \u0094\3"+
		"\2\2\2\"\u0096\3\2\2\2$\u00b2\3\2\2\2&\u00b4\3\2\2\2(\u00b9\3\2\2\2*\u00bb"+
		"\3\2\2\2,\u00bd\3\2\2\2.\u00bf\3\2\2\2\60\u00ca\3\2\2\2\62\u00d5\3\2\2"+
		"\2\64\u00e0\3\2\2\2\66\u00eb\3\2\2\28\u00f6\3\2\2\2:\u0101\3\2\2\2<\u010d"+
		"\3\2\2\2>\u010f\3\2\2\2@\u011d\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\24\13\2I\3\3\2\2\2JM\5\6\4"+
		"\2KM\5\16\b\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\7\3\2\2OP\7\"\2\2PU\5\b"+
		"\5\2QR\7\4\2\2RT\5\b\5\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2"+
		"\2\2WU\3\2\2\2XY\7\5\2\2Y\7\3\2\2\2Z[\7#\2\2[\\\7\6\2\2\\]\5\n\6\2]\t"+
		"\3\2\2\2^_\5\f\7\2_\13\3\2\2\2`a\5.\30\2a\r\3\2\2\2bc\7\"\2\2ch\5\20\t"+
		"\2de\7\4\2\2eg\5\20\t\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2"+
		"\2\2jh\3\2\2\2kl\7\5\2\2l\17\3\2\2\2mr\7#\2\2no\7#\2\2op\7\6\2\2pr\5\22"+
		"\n\2qm\3\2\2\2qn\3\2\2\2r\21\3\2\2\2st\5,\27\2t\23\3\2\2\2uv\5\26\f\2"+
		"vw\7#\2\2wx\7\7\2\2xy\7\b\2\2yz\5\30\r\2z\25\3\2\2\2{|\7\"\2\2|\27\3\2"+
		"\2\2}\u0081\7\t\2\2~\u0080\5\32\16\2\177~\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\7\n\2\2\u0085\31\3\2\2\2\u0086\u0089\5\4\3\2\u0087"+
		"\u0089\5$\23\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\33\3\2\2"+
		"\2\u008a\u008b\7\13\2\2\u008b\u008c\7\7\2\2\u008c\u008d\5*\26\2\u008d"+
		"\u008e\7\b\2\2\u008e\35\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\7\7\2"+
		"\2\u0091\u0092\5*\26\2\u0092\u0093\7\b\2\2\u0093\37\3\2\2\2\u0094\u0095"+
		"\5$\23\2\u0095!\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5$\23\2\u0098"+
		"#\3\2\2\2\u0099\u009a\7\16\2\2\u009a\u009b\5,\27\2\u009b\u009c\7\5\2\2"+
		"\u009c\u00b3\3\2\2\2\u009d\u009e\5&\24\2\u009e\u009f\7\6\2\2\u009f\u00a0"+
		"\5,\27\2\u00a0\u00a1\7\5\2\2\u00a1\u00b3\3\2\2\2\u00a2\u00a3\5\34\17\2"+
		"\u00a3\u00a5\5 \21\2\u00a4\u00a6\5\"\22\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00b3\3\2\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\5$\23\2"+
		"\u00a9\u00b3\3\2\2\2\u00aa\u00b3\5\30\r\2\u00ab\u00ac\7\17\2\2\u00ac\u00b3"+
		"\7\5\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00b3\7\5\2\2\u00af\u00b0\5,\27\2"+
		"\u00b0\u00b1\7\5\2\2\u00b1\u00b3\3\2\2\2\u00b2\u0099\3\2\2\2\u00b2\u009d"+
		"\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3%\3\2\2\2"+
		"\u00b4\u00b5\7#\2\2\u00b5\'\3\2\2\2\u00b6\u00ba\7$\2\2\u00b7\u00ba\7%"+
		"\2\2\u00b8\u00ba\7&\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba)\3\2\2\2\u00bb\u00bc\58\35\2\u00bc+\3\2\2\2\u00bd"+
		"\u00be\5.\30\2\u00be-\3\2\2\2\u00bf\u00c0\b\30\1\2\u00c0\u00c1\5\60\31"+
		"\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\f\3\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00c6"+
		"\5\60\31\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8/\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b"+
		"\31\1\2\u00cb\u00cc\5<\37\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\f\3\2\2\u00ce"+
		"\u00cf\t\3\2\2\u00cf\u00d1\5<\37\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\61\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\b\32\1\2\u00d6\u00d7\5.\30\2\u00d7\u00dd\3\2\2\2"+
		"\u00d8\u00d9\f\3\2\2\u00d9\u00da\t\4\2\2\u00da\u00dc\5.\30\2\u00db\u00d8"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\63\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\b\33\1\2\u00e1\u00e2\5\62"+
		"\32\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4\f\3\2\2\u00e4\u00e5\t\5\2\2\u00e5"+
		"\u00e7\5\62\32\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\65\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\b\34\1\2\u00ec\u00ed\5\64\33\2\u00ed\u00f3\3\2\2\2\u00ee\u00ef"+
		"\f\3\2\2\u00ef\u00f0\7\34\2\2\u00f0\u00f2\5\64\33\2\u00f1\u00ee\3\2\2"+
		"\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\67"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\35\1\2\u00f7\u00f8\5\66\34"+
		"\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\f\3\2\2\u00fa\u00fb\7\35\2\2\u00fb"+
		"\u00fd\5\66\34\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff9\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102"+
		"\t\6\2\2\u0102;\3\2\2\2\u0103\u010e\5@!\2\u0104\u0105\7#\2\2\u0105\u0107"+
		"\7\7\2\2\u0106\u0108\5> \2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010e\7\b\2\2\u010a\u010b\5:\36\2\u010b\u010c\5<"+
		"\37\2\u010c\u010e\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010e=\3\2\2\2\u010f\u0114\5,\27\2\u0110\u0111\7\4\2\2"+
		"\u0111\u0113\5,\27\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115?\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7\7\2\2\u0118\u0119\5,\27\2\u0119\u011a\7\b\2\2\u011a\u011e\3\2"+
		"\2\2\u011b\u011e\5(\25\2\u011c\u011e\5&\24\2\u011d\u0117\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011eA\3\2\2\2\26ELUhq\u0081\u0088"+
		"\u00a5\u00b2\u00b9\u00c7\u00d2\u00dd\u00e8\u00f3\u00fe\u0107\u010d\u0114"+
		"\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}