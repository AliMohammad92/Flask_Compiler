// Generated from /home/ali/IdeaProjects/Flask_Compiler/src/ANTLR/PythonParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PythonParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(PythonParser.ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(PythonParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(PythonParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(PythonParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jsonData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonData(PythonParser.JsonDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExp(PythonParser.LtExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExp(PythonParser.GtExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteExp(PythonParser.LteExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GteExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteExp(PythonParser.GteExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(PythonParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictEqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEqExp(PythonParser.StrictEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeExp(PythonParser.NeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictNeqExp}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNeqExp(PythonParser.StrictNeqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdComparison}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdComparison(PythonParser.IdComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MembershipTest}
	 * labeled alternative in {@link PythonParser#comparisonExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembershipTest(PythonParser.MembershipTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExp(PythonParser.ValueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(PythonParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExp(PythonParser.ModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(PythonParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(PythonParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExp}
	 * labeled alternative in {@link PythonParser#mathematicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(PythonParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(PythonParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(PythonParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompAsLogical(PythonParser.CompAsLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValuesAsLogical}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesAsLogical(PythonParser.ValuesAsLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link PythonParser#logicalExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(PythonParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#valuesExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesExp(PythonParser.ValuesExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomWithAccess}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomWithAccess(PythonParser.AtomWithAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PythonParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PythonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PythonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(PythonParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link PythonParser#primaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(PythonParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccess(PythonParser.DotAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(PythonParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#globalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pythonImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonImport(PythonParser.PythonImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdImport(PythonParser.IdImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strImport}
	 * labeled alternative in {@link PythonParser#importSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrImport(PythonParser.StrImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFromImport(PythonParser.IdFromImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strFromImport}
	 * labeled alternative in {@link PythonParser#importSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrFromImport(PythonParser.StrFromImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(PythonParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(PythonParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#printArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgs(PythonParser.PrintArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(PythonParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(PythonParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(PythonParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(PythonParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PythonParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PythonParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnTripleString}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnTripleString(PythonParser.ReturnTripleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnValue}
	 * labeled alternative in {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(PythonParser.ReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tripleString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTripleString(PythonParser.TripleStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decorator}
	 * labeled alternative in {@link PythonParser#decorator_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#baseClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClass(PythonParser.BaseClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBody(PythonParser.JinjaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(PythonParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilter(PythonParser.JinjaFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(PythonParser.JinjaCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(PythonParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaStatementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatementContent(PythonParser.JinjaStatementContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaIfStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfStatements(PythonParser.JinjaIfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(PythonParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElif(PythonParser.JinjaElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElse(PythonParser.JinjaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(PythonParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSet(PythonParser.JinjaSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jiniaExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJiniaExtends(PythonParser.JiniaExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaInclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaInclude(PythonParser.JinjaIncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(PythonParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#jinjaLocalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaLocalVariable(PythonParser.JinjaLocalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(PythonParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(PythonParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(PythonParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(PythonParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#styleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleTag(PythonParser.StyleTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#genericHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericHtml(PythonParser.GenericHtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(PythonParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(PythonParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(PythonParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalText(PythonParser.NormalTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedText(PythonParser.QuotedTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAsText(PythonParser.TagAsTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAsText(PythonParser.AttrAsTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAsText(PythonParser.IdAsTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAsText(PythonParser.ClassAsTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaAsText}
	 * labeled alternative in {@link PythonParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAsText(PythonParser.JinjaAsTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(PythonParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descendantSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantSelector(PythonParser.DescendantSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(PythonParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(PythonParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelector}
	 * labeled alternative in {@link PythonParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(PythonParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(PythonParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#cssKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyValue(PythonParser.CssKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssHexValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHexValue(PythonParser.CssHexValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssNumValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumValue(PythonParser.CssNumValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssIdValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdValue(PythonParser.CssIdValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssStrValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStrValue(PythonParser.CssStrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssJinjaValue}
	 * labeled alternative in {@link PythonParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssJinjaValue(PythonParser.CssJinjaValueContext ctx);
}