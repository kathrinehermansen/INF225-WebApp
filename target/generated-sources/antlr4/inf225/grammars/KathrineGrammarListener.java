// Generated from inf225/grammars/KathrineGrammar.g4 by ANTLR 4.8
package inf225.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KathrineGrammarParser}.
 */
public interface KathrineGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KathrineGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KathrineGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KathrineGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KathrineGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(KathrineGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(KathrineGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(KathrineGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(KathrineGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(KathrineGrammarParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KathrineGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(KathrineGrammarParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(KathrineGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(KathrineGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(KathrineGrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(KathrineGrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(KathrineGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(KathrineGrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(KathrineGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(KathrineGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(KathrineGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link KathrineGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(KathrineGrammarParser.IntContext ctx);
}