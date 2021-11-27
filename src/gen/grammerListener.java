// Generated from E:/Documents/code/compile/compile-Lab5/src\grammer.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammerParser}.
 */
public interface grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammerParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(grammerParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(grammerParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(grammerParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(grammerParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(grammerParser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(grammerParser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(grammerParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(grammerParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(grammerParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(grammerParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(grammerParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(grammerParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(grammerParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(grammerParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grammerParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grammerParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterSingle(grammerParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitSingle(grammerParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initial}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterInitial(grammerParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initial}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitInitial(grammerParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(grammerParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(grammerParser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(grammerParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(grammerParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(grammerParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(grammerParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(grammerParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(grammerParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#ifState}.
	 * @param ctx the parse tree
	 */
	void enterIfState(grammerParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#ifState}.
	 * @param ctx the parse tree
	 */
	void exitIfState(grammerParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(grammerParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(grammerParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(grammerParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(grammerParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(grammerParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(grammerParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(grammerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(grammerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(grammerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(grammerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleBlock}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingleBlock(grammerParser.SingleBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleBlock}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingleBlock(grammerParser.SingleBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(grammerParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(grammerParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#lval}.
	 * @param ctx the parse tree
	 */
	void enterLval(grammerParser.LvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#lval}.
	 * @param ctx the parse tree
	 */
	void exitLval(grammerParser.LvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(grammerParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(grammerParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterOctal(grammerParser.OctalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitOctal(grammerParser.OctalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterHex(grammerParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitHex(grammerParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(grammerParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(grammerParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(grammerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(grammerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 */
	void enterSingleAddExp(grammerParser.SingleAddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 */
	void exitSingleAddExp(grammerParser.SingleAddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAddExp(grammerParser.MultipleAddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAddExp(grammerParser.MultipleAddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleMulExp(grammerParser.MultipleMulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleMulExp(grammerParser.MultipleMulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void enterSingleMulExp(grammerParser.SingleMulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 */
	void exitSingleMulExp(grammerParser.SingleMulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleRelExp(grammerParser.MultipleRelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleRelExp(grammerParser.MultipleRelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterSingleRelExp(grammerParser.SingleRelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitSingleRelExp(grammerParser.SingleRelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleEqExp(grammerParser.MultipleEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleEqExp(grammerParser.MultipleEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterSingleEqExp(grammerParser.SingleEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitSingleEqExp(grammerParser.SingleEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterSingleLAndExp(grammerParser.SingleLAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitSingleLAndExp(grammerParser.SingleLAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterSingleLOrExp(grammerParser.SingleLOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitSingleLOrExp(grammerParser.SingleLOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(grammerParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(grammerParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pri}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPri(grammerParser.PriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pri}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPri(grammerParser.PriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterFunc(grammerParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitFunc(grammerParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnary(grammerParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnary(grammerParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(grammerParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(grammerParser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(grammerParser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(grammerParser.PrimaryExpContext ctx);
}