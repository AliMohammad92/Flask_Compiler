// Generated from C:/Users/Ali/IdeaProjects/Flask_Compiler/src/ANTLR/PythonParser.g4 by ANTLR 4.13.2
package gen.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(PythonParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOp(PythonParser.LtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOp(PythonParser.GtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(PythonParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictEqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqOp(PythonParser.StrictEqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqOp(PythonParser.NeqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictNeqOp}
	 * labeled alternative in {@link PythonParser#logicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNeqOp(PythonParser.StrictNeqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(PythonParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubOp(PythonParser.SubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(PythonParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOp(PythonParser.DivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link PythonParser#mathematicalOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(PythonParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PythonParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PythonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PythonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(PythonParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(PythonParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(PythonParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PythonParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(PythonParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonParser.ValueContext ctx);
}