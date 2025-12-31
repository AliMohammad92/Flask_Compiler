// Generated from /home/ali/IdeaProjects/Flask_Compiler/src/ANTLR/PythonParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link PythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(PythonParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(PythonParser.ListComprehensionContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(PythonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(PythonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#jsonData}.
	 * @param ctx the parse tree
	 */
	void enterJsonData(PythonParser.JsonDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#jsonData}.
	 * @param ctx the parse tree
	 */
	void exitJsonData(PythonParser.JsonDataContext ctx);
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
	 * Enter a parse tree produced by the {@code ValueExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterValueExp(PythonParser.ValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitValueExp(PythonParser.ValueExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ValuesAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void enterValuesAsLogical(PythonParser.ValuesAsLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValuesAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 */
	void exitValuesAsLogical(PythonParser.ValuesAsLogicalContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#valuesExp}.
	 * @param ctx the parse tree
	 */
	void enterValuesExp(PythonParser.ValuesExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#valuesExp}.
	 * @param ctx the parse tree
	 */
	void exitValuesExp(PythonParser.ValuesExpContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(PythonParser.GlobalStatementContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void enterFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void exitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 */
	void enterIdFromImport(PythonParser.IdFromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 */
	void exitIdFromImport(PythonParser.IdFromImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 */
	void enterStrFromImport(PythonParser.StrFromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 */
	void exitStrFromImport(PythonParser.StrFromImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(PythonParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(PythonParser.ImportListContext ctx);
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
	 * Enter a parse tree produced by the {@code returnTripleString}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnTripleString(PythonParser.ReturnTripleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnTripleString}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnTripleString(PythonParser.ReturnTripleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(PythonParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(PythonParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tripleString}.
	 * @param ctx the parse tree
	 */
	void enterTripleString(PythonParser.TripleStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tripleString}.
	 * @param ctx the parse tree
	 */
	void exitTripleString(PythonParser.TripleStringContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(PythonParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(PythonParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void enterStyleTag(PythonParser.StyleTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void exitStyleTag(PythonParser.StyleTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#genericHtml}.
	 * @param ctx the parse tree
	 */
	void enterGenericHtml(PythonParser.GenericHtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#genericHtml}.
	 * @param ctx the parse tree
	 */
	void exitGenericHtml(PythonParser.GenericHtmlContext ctx);
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
	 * Enter a parse tree produced by the {@code normalText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterNormalText(PythonParser.NormalTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitNormalText(PythonParser.NormalTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterQuotedText(PythonParser.QuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitQuotedText(PythonParser.QuotedTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterTagAsText(PythonParser.TagAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitTagAsText(PythonParser.TagAsTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterAttrAsText(PythonParser.AttrAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitAttrAsText(PythonParser.AttrAsTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterIdAsText(PythonParser.IdAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitIdAsText(PythonParser.IdAsTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterClassAsText(PythonParser.ClassAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitClassAsText(PythonParser.ClassAsTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAsText(PythonParser.JinjaAsTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAsText(PythonParser.JinjaAsTextContext ctx);
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
	 * Enter a parse tree produced by the {@code descendantSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterDescendantSelector(PythonParser.DescendantSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendantSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitDescendantSelector(PythonParser.DescendantSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(PythonParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(PythonParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(PythonParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(PythonParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(PythonParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(PythonParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(PythonParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(PythonParser.SelectorNameContext ctx);
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
	 * Enter a parse tree produced by the {@code cssHexValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssHexValue(PythonParser.CssHexValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssHexValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssHexValue(PythonParser.CssHexValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssNumValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssNumValue(PythonParser.CssNumValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssNumValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssNumValue(PythonParser.CssNumValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssIdValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssIdValue(PythonParser.CssIdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssIdValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssIdValue(PythonParser.CssIdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssStrValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssStrValue(PythonParser.CssStrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssStrValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssStrValue(PythonParser.CssStrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssJinjaValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssJinjaValue(PythonParser.CssJinjaValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssJinjaValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssJinjaValue(PythonParser.CssJinjaValueContext ctx);
}