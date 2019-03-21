// Generated from /Users/anhhoang/Desktop/COP4020_P2Final/P2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link P2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface P2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link P2Parser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(P2Parser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(P2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(P2Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(P2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(P2Parser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(P2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(P2Parser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(P2Parser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link P2Parser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(P2Parser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(P2Parser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(P2Parser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(P2Parser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(P2Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(P2Parser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(P2Parser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(P2Parser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(P2Parser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(P2Parser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(P2Parser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(P2Parser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(P2Parser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(P2Parser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(P2Parser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(P2Parser.NilAtomContext ctx);
}