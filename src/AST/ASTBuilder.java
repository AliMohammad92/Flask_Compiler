package AST;

import AST.CSS.CssBlockNode;
import AST.CSS.CssNode;
import AST.CSS.CssPropertyNode;
import AST.HTML.HtmlAttributeNode;
import AST.HTML.HtmlElementNode;
import AST.HTML.HtmlTextNode;
import AST.HTML.TextNode;
import AST.JINJA2.*;
import SymbolTable.SymbolTable;
import SymbolTable.Symbol;
import gen.ANTLR.PythonLexer;
import gen.ANTLR.PythonParser;
import gen.ANTLR.PythonParserBaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ASTBuilder extends PythonParserBaseVisitor<ASTNode> {

    public SymbolTable table = new SymbolTable();

    private <T extends ASTNode> T setLine(T node, ParserRuleContext ctx) {
        if (node != null && ctx != null) {
            node.setLineNumber(ctx.start.getLine());
        }
        return node;
    }

    // =========================
    // Program & Statement Nodes
    // =========================
    @Override
    public ASTNode visitProgram(PythonParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();

        table.enterScope("global");

        for (var stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node != null)
                program.addStatement(node);
        }

        table.exitScope();
        return program;
    }

    @Override
    public ASTNode visitAssignment(PythonParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        ASTNode value = visit(ctx.value());
        if (value != null)
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, value, value.getClass().getSimpleName(), ctx.start.getLine()));

        return setLine(new AssignmentNode(varName, value), ctx);
    }

    @Override
    public ASTNode visitLambda(PythonParser.LambdaContext ctx) {
        ParametersNode params = (ParametersNode) visit(ctx.parameters());
        ASTNode expression = visit(ctx.expressions());
        return setLine(new LambdaNode(params, expression), ctx);
    }

    // =========================
    // Literal Nodes
    // =========================
    @Override
    public ASTNode visitNumber(PythonParser.NumberContext ctx) {
        String content = ctx.NUMBER().getText();

        return setLine(new NumberNode(content), ctx);
    }

    private ASTNode handleHTMLInTripleString(String content) {
        content = content.substring(3, content.length() - 3);
        CharStream input = CharStreams.fromString(content);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree tree = parser.html();
        HtmlElementNode htmlRoot = (HtmlElementNode) visit(tree);

        return new HtmlInTripleString(List.of(htmlRoot));
    }

    @Override
    public ASTNode visitId(PythonParser.IdContext ctx) {
        return setLine(new IdentifierNode(ctx.IDENTIFIER().getText()), ctx);
    }

    @Override
    public ASTNode visitTrue(PythonParser.TrueContext ctx) {
        return setLine(new BooleanNode(true), ctx);
    }

    @Override
    public ASTNode visitFalse(PythonParser.FalseContext ctx) {
        return setLine(new BooleanNode(false), ctx);
    }

    @Override
    public ASTNode visitNone(PythonParser.NoneContext ctx) {
        return setLine(new NoneNode(), ctx);
    }

    @Override
    public ASTNode visitString(PythonParser.StringContext ctx) {
        String clean = cleanString(ctx.STRING().getText());
        return setLine(new StringNode(clean), ctx);
    }

    @Override
    public ASTNode visitTriple_String(PythonParser.Triple_StringContext ctx) {
        String content = ctx.TRIPLE_STRING().getText();
        if (content.contains("<html>") || content.contains("</html>"))
            return setLine(handleHTMLInTripleString(content), ctx);
        return setLine(new StringNode(content), ctx);
    }

    @Override
    public ASTNode visitAtomWithAccess(PythonParser.AtomWithAccessContext ctx) {
        ASTNode node = visit(ctx.primaryAtom());

        for (PythonParser.PostfixContext p : ctx.postfix()) {
            if (p instanceof PythonParser.DotAccessContext dot) {
                if (dot.IDENTIFIER() != null) {
                    ASTNode attr = new IdentifierNode(dot.IDENTIFIER().getText());
                    node = new AttributeAccessNode(node, attr);
                } else if (dot.functionCall() != null) {
                    ASTNode call = visit(dot.functionCall());
                    node = new AttributeAccessNode(node, call);
                }
            } else if (p instanceof PythonParser.IndexAccessContext idx) {
                ASTNode index = idx.expressions() != null ? visit(idx.expressions()) : visit(idx.atom());
                node = new IndexAccessNode(node, index);
            }
        }

        return setLine(node, ctx);
    }

    @Override
    public ASTNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        List<IdentifierNode> vars = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            vars.add(new IdentifierNode(id.getText()));
        }
        return setLine(new GlobalNode(vars), ctx);
    }

    // =========================
    // Helper Functions
    // =========================
    private ASTNode buildBinary(ASTNode left, ASTNode right, String operator) {
        return new BinaryOpNode(operator, left, right);
    }

    private ASTNode buildUnary(ASTNode expression) {
        return new UnaryNode("not", expression);
    }

    private Map.Entry<String, ASTNode> getJsonData(PythonParser.JsonDataContext ctx) {
        String key = cleanString(ctx.STRING().getText());
        ASTNode value = visit(ctx.value());
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    private static Object getActualValue(ASTNode node) {
        switch (node) {
            case null -> {
                return null;
            }
            case NumberNode numberNode -> {
                String text = numberNode.getValue();
                if (text.contains("."))
                    return Double.parseDouble(text);
                else
                    return Integer.parseInt(text);
            }
            case StringNode stringNode -> {
                return stringNode.getValue();
            }
            case BooleanNode booleanNode -> {
                return booleanNode.getValue();
            }
            case ListNode listNode -> {
                List<Object> values = new ArrayList<>();
                for (ASTNode elem : listNode.getElements()) {
                    values.add(getActualValue(elem));
                }
                return values;
            }
            default -> {
            }
        }

        return null;
    }

    private String cleanString(String clean) {
        if ((clean.startsWith("\"") && clean.endsWith("\"")) ||
                clean.startsWith("'") && clean.endsWith("'")
        ) {
            clean = clean.substring(1, clean.length() - 1);
        }
        return clean;
    }

    // =========================
    // END Helper Functions
    // =========================


    @Override
    public ASTNode visitImportSyntax(PythonParser.ImportSyntaxContext ctx) {
        ASTNode source = visit(ctx.importSource());
        ImportedNameNode imported = (ImportedNameNode) visit(ctx.importName());
        return setLine(new ImportNode(source, imported), ctx);
    }

    @Override
    public ASTNode visitImportID(PythonParser.ImportIDContext ctx) {
        return setLine(new IdentifierNode(ctx.IDENTIFIER().toString()), ctx);
    }

    @Override
    public ASTNode visitImportSTR(PythonParser.ImportSTRContext ctx) {
        return setLine(new StringNode(ctx.STRING().getText()), ctx);
    }

    @Override
    public ASTNode visitImportName(PythonParser.ImportNameContext ctx) {
        IdentifierNode name = new IdentifierNode(ctx.IDENTIFIER().getText());
        IdentifierNode alias = null;
        if (ctx.aliasName() != null)
            alias = (IdentifierNode) visit(ctx.aliasName());
        return setLine(new ImportedNameNode(name, alias), ctx);
    }

    @Override
    public ASTNode visitAliasName(PythonParser.AliasNameContext ctx) {
        return setLine(new IdentifierNode(ctx.IDENTIFIER().toString()), ctx);
    }

    @Override
    public ASTNode visitFromImport(PythonParser.FromImportContext ctx) {
        ASTNode sourceNode = visit(ctx.importSource());
        ImportedListNode importedListNode = (ImportedListNode) visit(ctx.importList());
        return setLine(new FromImportNode(sourceNode, importedListNode), ctx);
    }

    @Override
    public ASTNode visitImportList(PythonParser.ImportListContext ctx) {
        List<ImportedNameNode> imports = new ArrayList<>();
        for (PythonParser.ImportNameContext id : ctx.importName()) {
            ImportedNameNode node = (ImportedNameNode) visit(id);

            Symbol symbol = new Symbol(
                    node.getName().toString(),
                    Symbol.SymbolType.IDENTIFIER,
                    node.getClass().getSimpleName(),
                    "Imported",
                    ctx.start.getLine()
            );
            table.define(symbol);

            imports.add(node);
        }
        return setLine(new ImportedListNode(imports), ctx);
    }

    // =========================
    // Mathematical Operations
    // =========================
    @Override
    public ASTNode visitAddExp(PythonParser.AddExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "+"), ctx);
    }

    @Override
    public ASTNode visitSubExp(PythonParser.SubExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "-"), ctx);
    }

    @Override
    public ASTNode visitMulExp(PythonParser.MulExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "*"), ctx);
    }

    @Override
    public ASTNode visitDivExp(PythonParser.DivExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "/"), ctx);
    }

    @Override
    public ASTNode visitModExp(PythonParser.ModExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "%"), ctx);
    }

    // =========================
    // Comparison Operations
    // =========================
    @Override
    public ASTNode visitLtExp(PythonParser.LtExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "<"), ctx);
    }

    @Override
    public ASTNode visitGtExp(PythonParser.GtExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), ">"), ctx);
    }

    @Override
    public ASTNode visitLteExp(PythonParser.LteExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "<="), ctx);
    }

    @Override
    public ASTNode visitGteExp(PythonParser.GteExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), ">="), ctx);
    }

    @Override
    public ASTNode visitEqExp(PythonParser.EqExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "=="), ctx);
    }

    @Override
    public ASTNode visitNeExp(PythonParser.NeExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "!="), ctx);
    }

    @Override
    public ASTNode visitStrictEqExp(PythonParser.StrictEqExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "==="), ctx);
    }

    @Override
    public ASTNode visitStrictNeqExp(PythonParser.StrictNeqExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "!=="), ctx);
    }

    @Override
    public ASTNode visitIdComparison(PythonParser.IdComparisonContext ctx) {
        String operator = ctx.NOT() != null ? "is" : "is not";
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), operator), ctx);
    }

    @Override
    public ASTNode visitMembershipTest(PythonParser.MembershipTestContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "in"), ctx);
    }

    // =========================
    // Logical Operations
    // =========================
    @Override
    public ASTNode visitAndExp(PythonParser.AndExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "and"), ctx);
    }

    @Override
    public ASTNode visitOrExp(PythonParser.OrExpContext ctx) {
        return setLine(buildBinary(visit(ctx.left), visit(ctx.right), "or"), ctx);
    }

    @Override
    public ASTNode visitNotExp(PythonParser.NotExpContext ctx) {
        return setLine(buildUnary(visit(ctx.item)), ctx);
    }

    // =========================
    // List Nodes
    // =========================
    @Override
    public ASTNode visitElements(PythonParser.ElementsContext ctx) {
        ListNode list = new ListNode();
        for (PythonParser.ValueContext valCtx : ctx.value()) {
            list.addElement(visit(valCtx));
        }
        return setLine(list, ctx);
    }

    @Override
    public ASTNode visitList(PythonParser.ListContext ctx) {
        ListNode list = new ListNode();
        if (ctx.elements() != null) {
            ASTNode visitedElements = visit(ctx.elements());
            if (visitedElements instanceof ListNode elementsList) {
                for (ASTNode elem : elementsList.getElements()) {
                    list.addElement(elem);
                }
            }
        }
        return setLine(list, ctx);
    }

    @Override
    public ASTNode visitListComprehension(PythonParser.ListComprehensionContext ctx) {
        ASTNode elementExpression = visit(ctx.atom());
        ASTNode variable = new IdentifierNode(ctx.IDENTIFIER().getText());
        ASTNode iterable = visit(ctx.value());
        ASTNode condition = null;
        if (ctx.expressions() != null) {
            condition = visit(ctx.expressions());
        }
        return setLine(new ListComprehensionNode(elementExpression, variable, iterable, condition), ctx);
    }

    @Override
    public ASTNode visitTuple(PythonParser.TupleContext ctx) {
        TupleNode tuple = new TupleNode();
        if (ctx.elements() != null) {
            ASTNode visitedElements = visit(ctx.elements());
            if (visitedElements instanceof ListNode elementsList) {
                for (ASTNode elem : elementsList.getElements()) {
                    tuple.addElement(elem);
                }
            }
        }
        return setLine(tuple, ctx);
    }

    // =========================
    // Condition Nodes (if/elif/else)
    // =========================
    @Override
    public ASTNode visitBlock(PythonParser.BlockContext ctx) {
        ProgramNode block = new ProgramNode();
        for (PythonParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode != null) {
                block.addStatement(stmtNode);
            }
        }
        return setLine(block, ctx);
    }

    @Override
    public ASTNode visitIfStatement(PythonParser.IfStatementContext ctx) {
        IfNode ifNode = (IfNode) visit(ctx.ifBlock());

        if (ctx.elifBlock() != null) {
            for (PythonParser.ElifBlockContext elifCtx : ctx.elifBlock()) {
                ElifNode elifNode = (ElifNode) visit(elifCtx);
                ifNode.addElif(elifNode);
            }
        }

        if (ctx.elseBlock() != null) {
            ElseNode elseNode = (ElseNode) visit(ctx.elseBlock());
            ifNode.setElse(elseNode);
        }

        return setLine(ifNode, ctx);
    }

    @Override
    public ASTNode visitIfBlock(PythonParser.IfBlockContext ctx) {
        ASTNode condition = visit(ctx.condition);

        IfNode ifNode = new IfNode(condition);

        table.enterScope("if_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        ifNode.setBody(body);
        table.exitScope();

        return setLine(ifNode, ctx);
    }

    @Override
    public ASTNode visitElifBlock(PythonParser.ElifBlockContext ctx) {
        ASTNode condition = visit(ctx.condition);
        table.enterScope("elif_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();

        return setLine(new ElifNode(condition, body), ctx);
    }

    @Override
    public ASTNode visitElseBlock(PythonParser.ElseBlockContext ctx) {
        table.enterScope("else_" + ctx.start.getLine());
        List<ASTNode> elseBody = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();

        return setLine(new ElseNode(elseBody), ctx);
    }


    // =========================
    // Function Nodes
    // =========================
    @Override
    public ASTNode visitFunction(PythonParser.FunctionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ParametersNode params = null;
        List<DecoratorNode> decorators = new ArrayList<>();

        if (ctx.parameters() != null) {
            params = (ParametersNode) visit(ctx.parameters());
        }
        table.enterScope(name);

        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();

        table.exitScope();

        FunctionNode funcNode = new FunctionNode(name, params, body);

        if (ctx.decorator_rule() != null) {
            for (PythonParser.Decorator_ruleContext dec : ctx.decorator_rule()) {
                DecoratorNode decoName = (DecoratorNode) visit(dec);
                decoName.setTarget(funcNode);
                decorators.add(decoName);
                table.define(new Symbol(decoName.toString(), Symbol.SymbolType.DECORATOR, null, "Decorator", ctx.start.getLine()));
            }
        }

        funcNode.setDecorators(decorators);
        table.define(new Symbol(name, Symbol.SymbolType.FUNCTION, null, "Function", ctx.start.getLine() + ctx.decorator_rule().size()));
        return setLine(funcNode, ctx);
    }

    @Override
    public ASTNode visitParameters(PythonParser.ParametersContext ctx) {
        List<ParameterNode> allParams = new ArrayList<>();
        if (ctx.mandatoryParams() != null) {
            ParametersNode mandatory = (ParametersNode) visit(ctx.mandatoryParams());
            allParams.addAll(mandatory.getParameterList());
        }
        if (ctx.defaultParams() != null) {
            ParametersNode defaultParams = (ParametersNode) visit(ctx.defaultParams());
            allParams.addAll(defaultParams.getParameterList());
        }
        return new ParametersNode(allParams);
    }

    @Override
    public ASTNode visitMandatoryParams(PythonParser.MandatoryParamsContext ctx) {
        List<ParameterNode> params = new ArrayList<>();
        for (var param : ctx.IDENTIFIER()) {
            params.add(new ParameterNode(new IdentifierNode(param.getText()), null));
        }
        return new ParametersNode(params);
    }

    @Override
    public ASTNode visitDefaultParams(PythonParser.DefaultParamsContext ctx) {
        List<ParameterNode> params = new ArrayList<>();
        for (PythonParser.ParameterWithValueContext param : ctx.parameterWithValue()) {
            params.add((ParameterNode) visit(param));
        }
        return new ParametersNode(params);
    }

    @Override
    public ASTNode visitParameterWithValue(PythonParser.ParameterWithValueContext ctx) {
        ASTNode paramName = new IdentifierNode(ctx.IDENTIFIER().getText());
        ASTNode defaultValue = visit(ctx.value());
        return new ParameterNode(paramName, defaultValue);
    }

    @Override
    public ASTNode visitReturnValue(PythonParser.ReturnValueContext ctx) {
        List<ASTNode> values = new ArrayList<>();
        if (ctx.value() != null) {
            for (PythonParser.ValueContext val : ctx.value())
            {
                values.add(visit(val));
            }
        }
        return setLine(new ReturnNode(values), ctx);
    }

    @Override
    public ASTNode visitReturnTripleString(PythonParser.ReturnTripleStringContext ctx) {
        ASTNode returnValue = visit(ctx.tripleString());
        return setLine(new ReturnNode(Collections.singletonList(returnValue)), ctx);
    }

    @Override
    public ASTNode visitTripleString(PythonParser.TripleStringContext ctx) {
        String content = ctx.TRIPLE_STRING().getText();
        boolean isHtml = content.contains("<") && content.contains(">");
        if (isHtml) {
            return handleHTMLInTripleString(content);
        }
        return setLine(new StringNode(content), ctx);
    }


    @Override
    public ASTNode visitJsonRule(PythonParser.JsonRuleContext ctx) {
        List<JSONData> data = new ArrayList<>();
        for (PythonParser.JsonDataContext jsonData : ctx.jsonData()) {
            data.add((JSONData) visit(jsonData));
        }
        return setLine(new JSONNode(data), ctx);
    }

    @Override
    public ASTNode visitJsonData(PythonParser.JsonDataContext ctx) {
        ASTNode key = new StringNode(cleanString(ctx.STRING().getText()));
        ASTNode value = ctx.value() != null ? visit(ctx.value()) : new StringNode(ctx.getText());
        return new JSONData(key, value);
    }

    @Override
    public ASTNode visitFunctionCall(PythonParser.FunctionCallContext ctx) {
        ASTNode funName = visit(ctx.anyId());
        List<ASTNode> arguments = new ArrayList<>();
        for (PythonParser.ArgumentContext arg : ctx.argument()) {
            arguments.add(visit(arg));
        }
        return setLine(new FunctionCallNode(funName, arguments), ctx);
    }

    @Override
    public ASTNode visitFunCallID(PythonParser.FunCallIDContext ctx) {
        return setLine(new IdentifierNode(ctx.IDENTIFIER().getText()), ctx);
    }

    @Override
    public ASTNode visitFunCallCSSID(PythonParser.FunCallCSSIDContext ctx) {
        return setLine(new IdentifierNode(ctx.CSS_ID().getText()), ctx);
    }

    @Override
    public ASTNode visitFunCallHTMLID(PythonParser.FunCallHTMLIDContext ctx) {
        return setLine(new IdentifierNode(ctx.HTML_ATTR_NAME().getText()), ctx);
    }

    @Override
    public ASTNode visitArgument(PythonParser.ArgumentContext ctx) {
        String varName = "";
        if (ctx.IDENTIFIER() != null) {
            varName = ctx.IDENTIFIER().getText();
        }
        ASTNode value = visit(ctx.value());

        return setLine(new ArgumentNode(varName, value), ctx);
    }

    // =========================
    // Loop Nodes (for/while)
    // =========================
    @Override
    public ASTNode visitForLoop(PythonParser.ForLoopContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        ASTNode value = visit(ctx.value());
        table.enterScope("for_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();

        return setLine(new ForNode(variable, value, body), ctx);
    }

    @Override
    public ASTNode visitWhileLoop(PythonParser.WhileLoopContext ctx) {
        ASTNode expression = visit(ctx.expressions());
        table.enterScope("while_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();
        return setLine(new WhileNode(expression, body), ctx);
    }

    @Override
    public ASTNode visitDecorator(PythonParser.DecoratorContext ctx) {
        ASTNode deco = visit(ctx.atom());
        return setLine(new DecoratorNode(deco, null), ctx);
    }

    // =========================
    // Class Nodes
    // =========================

    @Override
    public ASTNode visitClassDef(PythonParser.ClassDefContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String baseClass = "";
        if (ctx.baseClass() != null) {
            baseClass = ctx.baseClass().IDENTIFIER().getText();
        }

        List<DecoratorNode> decorators = new ArrayList<>();
        ClassNode classNode = new ClassNode(name, baseClass);
        if (ctx.decorator_rule() != null) {
            for (PythonParser.Decorator_ruleContext dec : ctx.decorator_rule()) {
                DecoratorNode decoName = (DecoratorNode) visit(dec);
                decoName.setTarget(classNode);
                decorators.add(decoName);
                table.define(new Symbol(decoName.toString(), Symbol.SymbolType.DECORATOR, null, "Decorator", ctx.start.getLine()));
            }
        }

        for (DecoratorNode deco : decorators) {
            deco.setTarget(classNode);
        }
        classNode.setDecorators(decorators);
        table.define(new Symbol(name, Symbol.SymbolType.CLASS, null, "Class", ctx.start.getLine()));

        table.enterScope(name);

        for (PythonParser.StatementContext stmtCtx : ctx.block().statement()) {
            ASTNode node = visit(stmtCtx);

            switch (node) {
                case AssignmentNode assignmentNode -> classNode.addVariable(assignmentNode);
                case FunctionNode functionNode -> classNode.addMethod(functionNode);
                case ClassNode classNode1 -> classNode.addNestedClass(classNode1);
                case null, default -> System.err.println("Unhandled node type in class body: " + node);
            }
        }

        table.exitScope();
        return setLine(classNode, ctx);
    }

    // =========================
    // Print
    // =========================
    @Override
    public ASTNode visitPrintStatement(PythonParser.PrintStatementContext ctx) {
        List<ASTNode> nodes = new ArrayList<>();
        if (ctx.printArgs() != null) {
            for (ParseTree arg : ctx.printArgs().children) {
                if (arg.getText().equals(",")) continue;
                nodes.add(visit(arg));
            }
        }
        return setLine(new PrintNode(nodes), ctx);
    }

    // =========================
    // JINJA2
    // =========================


    @Override
    public ASTNode visitTemplateBody(PythonParser.TemplateBodyContext ctx) {
        ProgramNode body = new ProgramNode();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ASTNode node = visit(ctx.getChild(i));
            if (node != null) {
                body.addStatement(node);
            }
        }
        return setLine(body, ctx);
    }

    @Override
    public ASTNode visitJinjaSet(PythonParser.JinjaSetContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        ASTNode value = visit(ctx.expressions());

        if (value != null)
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, value, value.getClass().getSimpleName(), ctx.start.getLine()));

        return setLine(new AssignmentNode(varName, value), ctx);
    }

    @Override
    public ASTNode visitJinjaExpression(PythonParser.JinjaExpressionContext ctx) {
        ASTNode innerExpression = null;

        if (ctx.expressions() != null) {
            innerExpression = visit(ctx.expressions());
        } else if (ctx.atom() != null) {
            innerExpression = visit(ctx.atom());
        } else if (ctx.value() != null) {
            innerExpression = visit(ctx.value());
        }

        return setLine(new JinjaExpressionNode(innerExpression), ctx);
    }

    @Override
    public ASTNode visitJinjaIfStatements(PythonParser.JinjaIfStatementsContext ctx) {
        IfNode ifNode = (IfNode) visit(ctx.jinjaIf());

        if (ctx.jinjaElif() != null) {
            for (PythonParser.JinjaElifContext elifCtx : ctx.jinjaElif()) {
                ElifNode elifNode = (ElifNode) visit(elifCtx);
                ifNode.addElif(elifNode);
            }
        }

        if (ctx.jinjaElse() != null) {
            ElseNode elseNode = (ElseNode) visit(ctx.jinjaElse());
            ifNode.setElse(elseNode);
        }

        return setLine(ifNode, ctx);
    }

    @Override
    public ASTNode visitJinjaIf(PythonParser.JinjaIfContext ctx) {
        ASTNode condition = visit(ctx.condition);
        IfNode ifNode = new IfNode(condition);

        table.enterScope("jinjaIf_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        ifNode.setBody(body);
        table.exitScope();

        return setLine(ifNode, ctx);
    }

    @Override
    public ASTNode visitJinjaElif(PythonParser.JinjaElifContext ctx) {
        ASTNode condition = visit(ctx.condition);
        table.enterScope("jinjaElif_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return setLine(new ElifNode(condition, body), ctx);
    }

    @Override
    public ASTNode visitJinjaElse(PythonParser.JinjaElseContext ctx) {
        table.enterScope("jinjaElse_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return setLine(new ElseNode(body), ctx);
    }

    @Override
    public ASTNode visitJinjaFor(PythonParser.JinjaForContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        ASTNode iterable = visit(ctx.value());
        table.enterScope("jinjaFor_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return setLine(new ForNode(variable, iterable, body), ctx);
    }

    @Override
    public ASTNode visitJiniaExtends(PythonParser.JiniaExtendsContext ctx) {
        ASTNode template = visit(ctx.atom());
        return setLine(new ExtendNode(template), ctx);
    }

    @Override
    public ASTNode visitJinjaInclude(PythonParser.JinjaIncludeContext ctx) {
        ASTNode template = visit(ctx.atom());
        boolean ignoreMissing = ctx.JINJA_IGNORE() != null;
        boolean withContext = ctx.JINJA_WITH() != null;
        return setLine(new IncludeNode(template, ignoreMissing, withContext), ctx);
    }


    // =========================
    // HTML
    // =========================

    @Override
    public ASTNode visitHtml(PythonParser.HtmlContext ctx) {
        HtmlElementNode element = new HtmlElementNode(new IdentifierNode("html"));
        List<ASTNode> children = new ArrayList<>();
        for (var childCtx : ctx.htmlElement()) {
            ASTNode childNode = visit(childCtx);
            if (childNode != null) {
                children.add(childNode);
            }
        }
        element.setChildren(children);
        return setLine(element, ctx);
    }

    @Override
    public ASTNode visitStyleTag(PythonParser.StyleTagContext ctx) {
        HtmlElementNode styleNode = new HtmlElementNode(new IdentifierNode("style"));
        List<ASTNode> cssBlocks = new ArrayList<>();
        for (var cssCtx : ctx.css()) {
            ASTNode css = visit(cssCtx);
            if (css != null)
                cssBlocks.add(css);
        }
        styleNode.setChildren(cssBlocks);
        return setLine(styleNode, ctx);
    }

    private ASTNode createHTMLElement(TerminalNode openToken, List<PythonParser.HtmlAttributesContext> attrContexts, List<PythonParser.HtmlElementContext> childContexts, ParserRuleContext ctx) {
        String tagName = openToken.getText().substring(1);
        HtmlElementNode element = new HtmlElementNode(new IdentifierNode(tagName));
        List<HtmlAttributeNode> attributes = new ArrayList<>();
        for (var attrCtx : attrContexts) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            if (attr != null)
                attributes.add(attr);
        }
        element.setAttributes(attributes);

        if (childContexts != null) {
            List<ASTNode> children = new ArrayList<>();
            for (var childCtx : childContexts) {
                ASTNode childNode = visit(childCtx);
                if (childNode != null) {
                    children.add(childNode);
                }
            }
            element.setChildren(children);
        }

        return (HtmlElementNode) setLine(element, ctx);
    }

    @Override
    public ASTNode visitNormalTagRule(PythonParser.NormalTagRuleContext ctx) {
        return createHTMLElement(ctx.TAG_OPEN(), ctx.htmlAttributes(), ctx.htmlElement(), ctx);
    }

    @Override
    public ASTNode visitSelfClosingRule(PythonParser.SelfClosingRuleContext ctx) {
        return createHTMLElement(ctx.TAG_OPEN(), ctx.htmlAttributes(), null, ctx);
    }

    @Override
    public ASTNode visitNestedSelfClosingRule(PythonParser.NestedSelfClosingRuleContext ctx) {
        return createHTMLElement(ctx.NESTED_TAG_OPEN(), ctx.htmlAttributes(), null, ctx);
    }

    @Override
    public ASTNode visitNestedTagRule(PythonParser.NestedTagRuleContext ctx) {
        return createHTMLElement(ctx.NESTED_TAG_OPEN(), ctx.htmlAttributes(), ctx.htmlElement(), ctx);
    }

    @Override
    public ASTNode visitAttributeWithValue(PythonParser.AttributeWithValueContext ctx) {
        ASTNode key = new IdentifierNode(ctx.getChild(0).getText());
        ASTNode value = visit(ctx.attributeValue());

        return setLine(new HtmlAttributeNode(key, value), ctx);
    }

    @Override
    public ASTNode visitRequiredAttribute(PythonParser.RequiredAttributeContext ctx) {
        return setLine(new HtmlAttributeNode(new IdentifierNode(ctx.REQUIRED().getText()), null), ctx);
    }

    @Override
    public ASTNode visitStrAttrValue(PythonParser.StrAttrValueContext ctx) {
        return setLine(new StringNode(ctx.STRING().getText()), ctx);
    }

    @Override
    public ASTNode visitNumAttrValue(PythonParser.NumAttrValueContext ctx) {
        return setLine(new NumberNode(ctx.NUMBER().getText()), ctx);
    }

    @Override
    public ASTNode visitIdAttrValue(PythonParser.IdAttrValueContext ctx) {
        return setLine(new IdentifierNode(ctx.IDENTIFIER().getText()), ctx);
    }

    @Override
    public ASTNode visitJnjiaAttrValue(PythonParser.JnjiaAttrValueContext ctx) {
        return visit(ctx.jinjaExpression());
    }

    @Override
    public ASTNode visitHtmlText(PythonParser.HtmlTextContext ctx) {
        List<ASTNode> segments = new ArrayList<>();
        for (PythonParser.HtmlTextPartContext part : ctx.parts) {
            ASTNode current = visit(part);
            if (part == null) continue;

            if (!segments.isEmpty() &&
                    segments.getLast() instanceof TextNode last &&
                    current instanceof TextNode) {

                last.appendText(((TextNode) current).getText());
            } else {
                segments.add(current);
            }
        }
        return setLine(new HtmlTextNode(segments), ctx);
    }

    @Override
    public ASTNode visitNormalText(PythonParser.NormalTextContext ctx) {
        return setLine(new TextNode(ctx.HTML_TEXT().getText()), ctx);
    }

    @Override
    public ASTNode visitJinjaAsText(PythonParser.JinjaAsTextContext ctx) {
        return visit(ctx.jinjaExpression());
    }

    // =========================
    // CSS
    // =========================

    @Override
    public ASTNode visitCss(PythonParser.CssContext ctx) {
        ASTNode selector = visit(ctx.cssSelector());
        List<CssPropertyNode> properties = new ArrayList<>();
        for (PythonParser.CssKeyValueContext property : ctx.cssKeyValue()) {
            properties.add((CssPropertyNode) visit(property));
        }
        if (selector instanceof CssBlockNode block) {
            for (CssNode node : block.getElements()) {
                node.setProperties(properties);
            }
            return setLine(block, ctx);
        } else {
            CssNode css;
            if (selector instanceof CssNode) {
                css = (CssNode) selector;
            } else {
                css = new CssNode(null, selector);
            }
            css.setProperties(properties);
            return setLine(css, ctx);
        }
    }

    @Override
    public ASTNode visitDescendantSelector(PythonParser.DescendantSelectorContext ctx) {
        ASTNode ancestor = visit(ctx.left);
        ASTNode descendant = visit(ctx.right);
        return setLine(new CssNode(ancestor, descendant), ctx);
    }

    @Override
    public ASTNode visitGroupSelector(PythonParser.GroupSelectorContext ctx) {
        List<CssNode> elements = new ArrayList<>();
        for (PythonParser.CssSelectorContext selectorCtx : ctx.cssSelector()) {
            ASTNode visited = visit(selectorCtx);

            if (visited instanceof CssBlockNode block) {
                elements.addAll(block.getElements());
            }
            else if (visited instanceof CssNode node) {
                elements.add(node);
            }
            else {
                elements.add(new CssNode(null, visited));
            }
        }
        return new CssBlockNode(elements);
    }

    @Override
    public ASTNode visitIdSelector(PythonParser.IdSelectorContext ctx) {
        IdentifierNode selector = (IdentifierNode) visit(ctx.selectorName());
        selector.setName('#' + selector.getName());
        return setLine(selector, ctx);
    }

    @Override
    public ASTNode visitClassSelector(PythonParser.ClassSelectorContext ctx) {
        IdentifierNode selector = (IdentifierNode) visit(ctx.selectorName());
        selector.setName('.' + selector.getName());
        return setLine(selector, ctx);
    }

    @Override
    public ASTNode visitSelectorName(PythonParser.SelectorNameContext ctx) {
        StringBuilder sb = new StringBuilder(ctx.CSS_ID().getText());
        if (ctx.pseudo() != null) {
            for (PythonParser.PseudoContext pseudoContext : ctx.pseudo()) {
                sb.append(getPseudoText(pseudoContext));
            }
        }
        return setLine(new IdentifierNode(sb.toString()), ctx);
    }

    public String getPseudoText(PythonParser.PseudoContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(":".repeat(ctx.COLON().size()));

        sb.append(ctx.CSS_ID().getText());

        if (ctx.LPAREN() != null) {
            sb.append("(");
            if (ctx.argument() != null) {
                sb.append(ctx.argument().IDENTIFIER().getText());
            }
            sb.append(")");
        }

        return sb.toString();
    }

    @Override
    public ASTNode visitCssKeyValue(PythonParser.CssKeyValueContext ctx) {
        ASTNode key = new IdentifierNode(ctx.CSS_ID().getText());
        List<ASTNode> values = new ArrayList<>();
        for (PythonParser.CssValueContext value : ctx.cssValue()) {
            values.add(visit(value));
        }
        return setLine(new CssPropertyNode(key, values), ctx);
    }

    @Override
    public ASTNode visitCssHexValue(PythonParser.CssHexValueContext ctx) {
        return setLine(new StringNode(ctx.CSS_HEX().getText()), ctx);
    }

    @Override
    public ASTNode visitCssNumValue(PythonParser.CssNumValueContext ctx) {
        String num = ctx.NUMBER().getText();
        String type = null;
        if (ctx.CSS_TYPE() != null)
            type = ctx.CSS_TYPE().getText();
        return setLine(new StringNode(num + type), ctx);
    }

    @Override
    public ASTNode visitCssIdValue(PythonParser.CssIdValueContext ctx) {
        return setLine(new IdentifierNode(ctx.CSS_ID().getText()), ctx);
    }

    @Override
    public ASTNode visitCssStrValue(PythonParser.CssStrValueContext ctx) {
        return setLine(new StringNode(ctx.STRING().getText()), ctx);
    }
}