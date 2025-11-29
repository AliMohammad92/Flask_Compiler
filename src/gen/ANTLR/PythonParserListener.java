// Generated from C:/Users/Ali/IdeaProjects/Flask_Compiler/src/ANTLR/PythonParser.g4 by ANTLR 4.13.2
package gen.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(PythonParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(PythonParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterLtOp(PythonParser.LtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitLtOp(PythonParser.LtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterGtOp(PythonParser.GtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitGtOp(PythonParser.GtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(PythonParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(PythonParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictEqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqOp(PythonParser.StrictEqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictEqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqOp(PythonParser.StrictEqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterNeqOp(PythonParser.NeqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitNeqOp(PythonParser.NeqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictNeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterStrictNeqOp(PythonParser.StrictNeqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictNeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitStrictNeqOp(PythonParser.StrictNeqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(PythonParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(PythonParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterSubOp(PythonParser.SubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitSubOp(PythonParser.SubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(PythonParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(PythonParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterDivOp(PythonParser.DivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitDivOp(PythonParser.DivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void enterModOp(PythonParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 */
	void exitModOp(PythonParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterId(PythonParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitId(PythonParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParen(PythonParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParen(PythonParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrue(PythonParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrue(PythonParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalse(PythonParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalse(PythonParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(PythonParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(PythonParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
}