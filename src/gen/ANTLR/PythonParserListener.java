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
	 * Enter a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(PythonParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(PythonParser.TupleContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterLtExp(PythonParser.LtExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitLtExp(PythonParser.LtExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterGtExp(PythonParser.GtExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitGtExp(PythonParser.GtExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterLteExp(PythonParser.LteExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitLteExp(PythonParser.LteExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterGteExp(PythonParser.GteExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitGteExp(PythonParser.GteExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(PythonParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(PythonParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictEqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStrictEqExp(PythonParser.StrictEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictEqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStrictEqExp(PythonParser.StrictEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterNeExp(PythonParser.NeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitNeExp(PythonParser.NeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictNeqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStrictNeqExp(PythonParser.StrictNeqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictNeqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStrictNeqExp(PythonParser.StrictNeqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdComparison}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterIdComparison(PythonParser.IdComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdComparison}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitIdComparison(PythonParser.IdComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MembershipTest}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMembershipTest(PythonParser.MembershipTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MembershipTest}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMembershipTest(PythonParser.MembershipTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(PythonParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(PythonParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomMath}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterAtomMath(PythonParser.AtomMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomMath}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitAtomMath(PythonParser.AtomMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterModExp(PythonParser.ModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitModExp(PythonParser.ModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(PythonParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(PythonParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(PythonParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(PythonParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(PythonParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(PythonParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(PythonParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(PythonParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(PythonParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(PythonParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterCompAsLogical(PythonParser.CompAsLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitCompAsLogical(PythonParser.CompAsLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(PythonParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(PythonParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterAtomAsLogical(PythonParser.AtomAsLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitAtomAsLogical(PythonParser.AtomAsLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomWithAccess}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomWithAccess(PythonParser.AtomWithAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomWithAccess}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomWithAccess(PythonParser.AtomWithAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterId(PythonParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitId(PythonParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrue(PythonParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrue(PythonParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalse(PythonParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalse(PythonParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterDotAccess(PythonParser.DotAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitDotAccess(PythonParser.DotAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(PythonParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(PythonParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#pythonImport}.
	 * @param ctx the parse tree
	 */
	void enterPythonImport(PythonParser.PythonImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#pythonImport}.
	 * @param ctx the parse tree
	 */
	void exitPythonImport(PythonParser.PythonImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void enterIdImport(PythonParser.IdImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void exitIdImport(PythonParser.IdImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void enterStrImport(PythonParser.StrImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 */
	void exitStrImport(PythonParser.StrImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idFromImport}
	 * labeled alternative in {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void enterIdFromImport(PythonParser.IdFromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idFromImport}
	 * labeled alternative in {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void exitIdFromImport(PythonParser.IdFromImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strFromImport}
	 * labeled alternative in {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void enterStrFromImport(PythonParser.StrFromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strFromImport}
	 * labeled alternative in {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void exitStrFromImport(PythonParser.StrFromImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importedNames}.
	 * @param ctx the parse tree
	 */
	void enterImportedNames(PythonParser.ImportedNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importedNames}.
	 * @param ctx the parse tree
	 */
	void exitImportedNames(PythonParser.ImportedNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importsAliases}.
	 * @param ctx the parse tree
	 */
	void enterImportsAliases(PythonParser.ImportsAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importsAliases}.
	 * @param ctx the parse tree
	 */
	void exitImportsAliases(PythonParser.ImportsAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrintArgs(PythonParser.PrintArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrintArgs(PythonParser.PrintArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(PythonParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(PythonParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(PythonParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(PythonParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PythonParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PythonParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PythonParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PythonParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PythonParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PythonParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PythonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PythonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link PythonParser#decorator_rule}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link PythonParser#decorator_rule}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#baseClass}.
	 * @param ctx the parse tree
	 */
	void enterBaseClass(PythonParser.BaseClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#baseClass}.
	 * @param ctx the parse tree
	 */
	void exitBaseClass(PythonParser.BaseClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBody(PythonParser.JinjaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBody(PythonParser.JinjaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(PythonParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(PythonParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilter(PythonParser.JinjaFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilter(PythonParser.JinjaFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(PythonParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(PythonParser.JinjaCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(PythonParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(PythonParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaStatementContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatementContent(PythonParser.JinjaStatementContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaStatementContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatementContent(PythonParser.JinjaStatementContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaIfStatements}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfStatements(PythonParser.JinjaIfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaIfStatements}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfStatements(PythonParser.JinjaIfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(PythonParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(PythonParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElif(PythonParser.JinjaElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElif(PythonParser.JinjaElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElse(PythonParser.JinjaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElse(PythonParser.JinjaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(PythonParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(PythonParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaSet}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSet(PythonParser.JinjaSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaSet}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSet(PythonParser.JinjaSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jiniaExtends}.
	 * @param ctx the parse tree
	 */
	void enterJiniaExtends(PythonParser.JiniaExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jiniaExtends}.
	 * @param ctx the parse tree
	 */
	void exitJiniaExtends(PythonParser.JiniaExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaInclude}.
	 * @param ctx the parse tree
	 */
	void enterJinjaInclude(PythonParser.JinjaIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaInclude}.
	 * @param ctx the parse tree
	 */
	void exitJinjaInclude(PythonParser.JinjaIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(PythonParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(PythonParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jinjaLocalVariable}.
	 * @param ctx the parse tree
	 */
	void enterJinjaLocalVariable(PythonParser.JinjaLocalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jinjaLocalVariable}.
	 * @param ctx the parse tree
	 */
	void exitJinjaLocalVariable(PythonParser.JinjaLocalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(PythonParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(PythonParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(PythonParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(PythonParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(PythonParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(PythonParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlRoot}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRoot(PythonParser.HtmlRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlRoot}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRoot(PythonParser.HtmlRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHeadTag(PythonParser.HeadTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHeadTag(PythonParser.HeadTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterBodyTag(PythonParser.BodyTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitBodyTag(PythonParser.BodyTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterDivTag(PythonParser.DivTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitDivTag(PythonParser.DivTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spanTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterSpanTag(PythonParser.SpanTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spanTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitSpanTag(PythonParser.SpanTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterPTag(PythonParser.PTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitPTag(PythonParser.PTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterATag(PythonParser.ATagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitATag(PythonParser.ATagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h1Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH1Tag(PythonParser.H1TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h1Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH1Tag(PythonParser.H1TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h2Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH2Tag(PythonParser.H2TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h2Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH2Tag(PythonParser.H2TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h3Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH3Tag(PythonParser.H3TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h3Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH3Tag(PythonParser.H3TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h4Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH4Tag(PythonParser.H4TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h4Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH4Tag(PythonParser.H4TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h5Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH5Tag(PythonParser.H5TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h5Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH5Tag(PythonParser.H5TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h6Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterH6Tag(PythonParser.H6TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h6Tag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitH6Tag(PythonParser.H6TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTableTag(PythonParser.TableTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTableTag(PythonParser.TableTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTrTag(PythonParser.TrTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTrTag(PythonParser.TrTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tdTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTdTag(PythonParser.TdTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tdTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTdTag(PythonParser.TdTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterThTag(PythonParser.ThTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitThTag(PythonParser.ThTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ulTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterUlTag(PythonParser.UlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ulTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitUlTag(PythonParser.UlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code olTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterOlTag(PythonParser.OlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code olTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitOlTag(PythonParser.OlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code liTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterLiTag(PythonParser.LiTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code liTag}
	 * labeled alternative in {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitLiTag(PythonParser.LiTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(PythonParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(PythonParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(PythonParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(PythonParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(PythonParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(PythonParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(PythonParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(PythonParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBody(PythonParser.HtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBody(PythonParser.HtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlButton}.
	 * @param ctx the parse tree
	 */
	void enterHtmlButton(PythonParser.HtmlButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlButton}.
	 * @param ctx the parse tree
	 */
	void exitHtmlButton(PythonParser.HtmlButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlForm}.
	 * @param ctx the parse tree
	 */
	void enterHtmlForm(PythonParser.HtmlFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlForm}.
	 * @param ctx the parse tree
	 */
	void exitHtmlForm(PythonParser.HtmlFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(PythonParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(PythonParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(PythonParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(PythonParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(PythonParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(PythonParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void enterCssKey(PythonParser.CssKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void exitCssKey(PythonParser.CssKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#cssKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyValue(PythonParser.CssKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#cssKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyValue(PythonParser.CssKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(PythonParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(PythonParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#cssComment}.
	 * @param ctx the parse tree
	 */
	void enterCssComment(PythonParser.CssCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#cssComment}.
	 * @param ctx the parse tree
	 */
	void exitCssComment(PythonParser.CssCommentContext ctx);
}