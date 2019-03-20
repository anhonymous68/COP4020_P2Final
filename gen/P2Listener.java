// Generated from /home/lamborghini-linux/Desktop/Final/P2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P2Parser}.
 */
public interface P2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link P2Parser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(P2Parser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(P2Parser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(P2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(P2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(P2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(P2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(P2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(P2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(P2Parser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(P2Parser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(P2Parser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(P2Parser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(P2Parser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(P2Parser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(P2Parser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(P2Parser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link P2Parser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(P2Parser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link P2Parser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(P2Parser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(P2Parser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(P2Parser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(P2Parser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(P2Parser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(P2Parser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(P2Parser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(P2Parser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(P2Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(P2Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(P2Parser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(P2Parser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(P2Parser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(P2Parser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(P2Parser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(P2Parser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(P2Parser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(P2Parser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(P2Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link P2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(P2Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(P2Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(P2Parser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(P2Parser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(P2Parser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(P2Parser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(P2Parser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(P2Parser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(P2Parser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(P2Parser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(P2Parser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(P2Parser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link P2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(P2Parser.NilAtomContext ctx);
}