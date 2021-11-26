// Generated from E:/Documents/code/compile/compile-Lab4/src\grammer.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammerParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(grammerParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(grammerParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(grammerParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(grammerParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(grammerParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(grammerParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grammerParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(grammerParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initial}
	 * labeled alternative in {@link grammerParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial(grammerParser.InitialContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(grammerParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(grammerParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(grammerParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(grammerParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#ifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfState(grammerParser.IfStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(grammerParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(grammerParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(grammerParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(grammerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(grammerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleBlock}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleBlock(grammerParser.SingleBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExp(grammerParser.SingleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#lval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLval(grammerParser.LvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(grammerParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octal}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal(grammerParser.OctalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link grammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(grammerParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(grammerParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(grammerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAddExp(grammerParser.SingleAddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleAddExp}
	 * labeled alternative in {@link grammerParser#addexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAddExp(grammerParser.MultipleAddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleMulExp(grammerParser.MultipleMulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleMulExp}
	 * labeled alternative in {@link grammerParser#mulexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMulExp(grammerParser.SingleMulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleRelExp(grammerParser.MultipleRelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleRelExp}
	 * labeled alternative in {@link grammerParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRelExp(grammerParser.SingleRelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleEqExp(grammerParser.MultipleEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEqExp}
	 * labeled alternative in {@link grammerParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEqExp(grammerParser.SingleEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleLAndExp}
	 * labeled alternative in {@link grammerParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLAndExp(grammerParser.SingleLAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLOrExp(grammerParser.SingleLOrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleLOrExp}
	 * labeled alternative in {@link grammerParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(grammerParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pri}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPri(grammerParser.PriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(grammerParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link grammerParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(grammerParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(grammerParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammerParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(grammerParser.PrimaryExpContext ctx);
}