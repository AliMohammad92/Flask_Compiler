package AST;

import AST.CSS.CssBlockNode;
import AST.CSS.CssNode;
import AST.CSS.CssPropertyNode;
import AST.HTML.HtmlElementNode;
import AST.HTML.HtmlTextNode;
import AST.JINJA2.*;
import SymbolTable.SymbolTable;
import SymbolTable.Symbol;
import gen.ANTLR.PythonParser;
import gen.ANTLR.PythonParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class ASTBuilder extends PythonParserBaseVisitor<ASTNode> {

    public SymbolTable table = new SymbolTable();

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
        Object actualValue = getActualValue(value);

        if (actualValue != null) {
            String type = actualValue.getClass().getSimpleName();
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, actualValue, type, ctx.start.getLine()));
        } else {
            String type = value != null ? value.getClass().getSimpleName() : null;
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, type, null, ctx.start.getLine()));
        }

        return new AssignmentNode(varName, value);
    }

    @Override
    public ASTNode visitValue(PythonParser.ValueContext ctx) {
        if (ctx.atom() != null) {
            return visit(ctx.atom());
        } else if (ctx.expressions() != null) {
            return visit(ctx.expressions());
        } else if (ctx.list() != null) {
            return visit(ctx.list());
        } else if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        } else if (ctx.json() != null){
            return visit(ctx.json());
        }
        return null;
    }

    // =========================
    // Literal Nodes
    // =========================
    @Override
    public ASTNode visitNumber(PythonParser.NumberContext ctx) {
        return new NumberNode(ctx.NUMBER().getText());
    }

    @Override
    public ASTNode visitId(PythonParser.IdContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitTrue(PythonParser.TrueContext ctx) {
        return new BooleanNode(true);
    }

    @Override
    public ASTNode visitFalse(PythonParser.FalseContext ctx) {
        return new BooleanNode(false);
    }

    @Override
    public ASTNode visitString(PythonParser.StringContext ctx) {
        return new StringNode(ctx.STRING().getText());
    }

    @Override
    public ASTNode visitAtomWithAccess(PythonParser.AtomWithAccessContext ctx) {
        ASTNode node = visit(ctx.primaryAtom());

        for (PythonParser.PostfixContext p : ctx.postfix()) {
            if (p instanceof PythonParser.DotAccessContext) {
                PythonParser.DotAccessContext dot = (PythonParser.DotAccessContext) p;
                if (dot.IDENTIFIER() != null) {
                    ASTNode attr = new IdentifierNode(dot.IDENTIFIER().getText());
                    node = new AttributeAccessNode(node, attr);
                } else if (dot.functionCall() != null) {
                    ASTNode call = visit(dot.functionCall());
                    node = new AttributeAccessNode(node, call);
                }
            } else if (p instanceof PythonParser.IndexAccessContext) {
                PythonParser.IndexAccessContext idx = (PythonParser.IndexAccessContext) p;
                ASTNode index = idx.expressions() != null ? visit(idx.expressions()) : visit(idx.atom());
                node = new IndexAccessNode(node, index);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        List<IdentifierNode> vars = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            vars.add(new IdentifierNode(id.getText()));
        }
        return new GlobalNode(vars);
    }

    // =========================
    // Helper Functions
    // =========================
    private ASTNode buildBinary(ASTNode left, ASTNode right, String operator) {
        return new BinaryOpNode(operator, left, right);
    }

    private ASTNode buildUnary(ASTNode expression, String operator) {
        return new UnaryNode(operator, expression);
    }

    public static Object getActualValue(ASTNode node) {
        if (node == null) return null;

        if (node instanceof NumberNode) {
            String text = ((NumberNode) node).getValue();
            if (text.contains("."))
                return Double.parseDouble(text);
            else
                return Integer.parseInt(text);
        }
        if (node instanceof StringNode) {
            return ((StringNode) node).getValue();
        }
        if (node instanceof BooleanNode) {
            return ((BooleanNode) node).getValue();
        }
        if (node instanceof ListNode) {
            List<Object> values = new ArrayList<>();
            for (ASTNode elem : ((ListNode) node).getElements()) {
                values.add(getActualValue(elem));
            }
            return values;
        }
        return null;
    }

    private List<ASTNode> collectBodyElements(PythonParser.HtmlBodyContext ctx) {
        List<ASTNode> elements = new ArrayList<>();

        if (ctx == null) return elements;

        if (ctx.htmlElement() != null) {
            for (var childCtx : ctx.htmlElement()) {
                ASTNode node = (ASTNode) visit(childCtx);
                if (node != null) {
                    elements.add(node);
                }
            }
        }

        if (ctx.htmlText() != null) {
            for (var childCtx : ctx.htmlText()) {
                ASTNode node = visit(childCtx);
                if (node != null) {
                    elements.add(node);
                }
            }
        }
        return elements;
    }

    private Map.Entry<String, ASTNode> getJsonData(PythonParser.JsonDataContext ctx) {
        String key = ctx.STRING().getText().replace("\"", "");
        ASTNode value = visit(ctx.value());
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    private String cleanString(String clean) {
        if ((clean.startsWith("\"") && clean.endsWith("\"")) ||
                clean.startsWith("\'") && clean.endsWith("\'")
        ) {
            clean = clean.substring(1, clean.length() - 1);
        }
        return clean;
    }

    // =========================
    // END Helper Functions
    // =========================

    @Override
    public ASTNode visitIdImport(PythonParser.IdImportContext ctx) {
        ASTNode name = new IdentifierNode(ctx.IDENTIFIER(0).toString());
        ASTNode alias = null;
        if (ctx.IDENTIFIER(1) != null) {
            alias = visit(ctx.IDENTIFIER(1));
        }
        return new ImportedNode(name, alias);
    }

    @Override
    public ASTNode visitStrImport(PythonParser.StrImportContext ctx) {
        ASTNode name = new StringNode(ctx.STRING().getText());
        ASTNode alias = null;
        if (ctx.IDENTIFIER() != null) {
            alias = visit(ctx.IDENTIFIER());
        }
        return new ImportedNode(name, alias);
    }

    @Override
    public ASTNode visitIdFromImport(PythonParser.IdFromImportContext ctx) {
        ASTNode name = new IdentifierNode(ctx.IDENTIFIER().toString());
        ASTNode importedList = visit(ctx.importedNames());

        return new FromImportNode(name, importedList);
    }

    @Override
    public ASTNode visitStrFromImport(PythonParser.StrFromImportContext ctx) {
        ASTNode name = new StringNode(ctx.STRING().getText());
        ASTNode importedList = visit(ctx.importedNames());

        return new FromImportNode(name, importedList);
    }

    @Override
    public ASTNode visitImportedNames(PythonParser.ImportedNamesContext ctx) {
        List<ASTNode> imports = new ArrayList<>();
        for (PythonParser.ImportsAliasesContext aliasCtx : ctx.importsAliases()) {
            imports.add(visit(aliasCtx));
        }
        return new ImportedListNode(imports);
    }

    @Override
    public ASTNode visitImportsAliases(PythonParser.ImportsAliasesContext ctx) {
        String originalName = ctx.IDENTIFIER(0).getText();
        ASTNode nameNode = new IdentifierNode(originalName);

        ASTNode aliasNode = null;
        String symbolName = originalName;

        if (ctx.IDENTIFIER().size() > 1) {
            String aliasName = ctx.IDENTIFIER(1).getText();
            aliasNode = new IdentifierNode(aliasName);
            symbolName = aliasName;
        }
        ASTNode importedNameNode = new ImportedNode(nameNode, aliasNode);

        Symbol symbol = new Symbol(
                symbolName,
                Symbol.SymbolType.IDENTIFIER,
                ImportedNode.class.getSimpleName(),
                "ImportedFunction",
                ctx.start.getLine()
        );
        table.define(symbol);
        return importedNameNode;
    }

    // =========================
    // Mathematical Operations
    // =========================
    @Override
    public ASTNode visitAddExp(PythonParser.AddExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "+");
    }

    @Override
    public ASTNode visitSubExp(PythonParser.SubExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "-");
    }

    @Override
    public ASTNode visitMulExp(PythonParser.MulExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "*");
    }

    @Override
    public ASTNode visitDivExp(PythonParser.DivExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "/");
    }

    @Override
    public ASTNode visitModExp(PythonParser.ModExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "%");
    }

    // =========================
    // Comparison Operations
    // =========================
    @Override
    public ASTNode visitLtExp(PythonParser.LtExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "<");
    }

    @Override
    public ASTNode visitGtExp(PythonParser.GtExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), ">");
    }

    @Override
    public ASTNode visitLteExp(PythonParser.LteExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "<=");
    }

    @Override
    public ASTNode visitGteExp(PythonParser.GteExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), ">=");
    }

    @Override
    public ASTNode visitEqExp(PythonParser.EqExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "==");
    }

    @Override
    public ASTNode visitNeExp(PythonParser.NeExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "!=");
    }

    @Override
    public ASTNode visitStrictEqExp(PythonParser.StrictEqExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "===");
    }

    @Override
    public ASTNode visitStrictNeqExp(PythonParser.StrictNeqExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "!==");
    }

    @Override
    public ASTNode visitIdComparison(PythonParser.IdComparisonContext ctx) {
        String operator = ctx.NOT() != null ? "is" : "is not";
        return buildBinary(visit(ctx.left), visit(ctx.right), operator);
    }

    @Override
    public ASTNode visitMembershipTest(PythonParser.MembershipTestContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "in");
    }

    // =========================
    // Logical Operations
    // =========================
    @Override
    public ASTNode visitAndExp(PythonParser.AndExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "and");
    }

    @Override
    public ASTNode visitOrExp(PythonParser.OrExpContext ctx) {
        return buildBinary(visit(ctx.left), visit(ctx.right), "or");
    }

    @Override
    public ASTNode visitNotExp(PythonParser.NotExpContext ctx) {
        return buildUnary(visit(ctx.item), "not");
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
        return list;
    }

    @Override
    public ASTNode visitList(PythonParser.ListContext ctx) {
        ListNode list = new ListNode();
        if (ctx.elements() != null) {
            ListNode elementsList = (ListNode) visit(ctx.elements());
            for (ASTNode elem : elementsList.getElements()) {
                list.addElement(elem);
            }
        }
        return list;
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
        return new ListComprehensionNode(elementExpression, variable, iterable, condition);
    }

    @Override
    public ASTNode visitTuple(PythonParser.TupleContext ctx) {
        TupleNode tuple = new TupleNode();
        if (ctx.elements() != null) {
            TupleNode elementsTuple = (TupleNode) visit(ctx.elements());
            for (ASTNode elem : elementsTuple.getElements()) {
                tuple.addElement(elem);
            }
        }
        return tuple;
    }

    @Override
    public ASTNode visitJson(PythonParser.JsonContext ctx) {
        Map<String, ASTNode> data = new LinkedHashMap<>();
        for (PythonParser.JsonDataContext jData : ctx.jsonData()) {
            Map.Entry<String, ASTNode> entry = getJsonData(jData);
            data.put(entry.getKey(), entry.getValue());
        }
        return new JSONNode(data);
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
        return block;
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

        return ifNode;
    }

    @Override
    public ASTNode visitIfBlock(PythonParser.IfBlockContext ctx) {
        ASTNode condition = visit(ctx.condition);

        IfNode ifNode = new IfNode(condition);

        table.enterScope("if_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        ifNode.setBody(body);
        table.exitScope();

        return ifNode;
    }

    @Override
    public ASTNode visitElifBlock(PythonParser.ElifBlockContext ctx) {
        ASTNode condition = visit(ctx.condition);
        table.enterScope("elif_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();

        return new ElifNode(condition, body);
    }

    @Override
    public ASTNode visitElseBlock(PythonParser.ElseBlockContext ctx) {
        table.enterScope("else_" + ctx.start.getLine());
        List<ASTNode> elseBody = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();

        return new ElseNode(elseBody);
    }

    // =========================
    // Function Nodes
    // =========================
    @Override
    public ASTNode visitFunction(PythonParser.FunctionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<ParameterNode> params = new ArrayList<>();
        List<DecoratorNode> decorators = new ArrayList<>();

        if (ctx.decorator_rule() != null) {
            for (PythonParser.Decorator_ruleContext dec : ctx.decorator_rule()) {
                ASTNode decoName = visit(dec);
                decorators.add(new DecoratorNode(decoName, null));
                table.define(new Symbol(decoName.toString(), Symbol.SymbolType.DECORATOR, null, "Decorator", ctx.start.getLine()));
            }
        }

        if (ctx.parameters() != null) {
            for (PythonParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                String paramName = paramCtx.IDENTIFIER().getText();
                ASTNode defaultValue = null;
                if (paramCtx.value() != null)
                    defaultValue = visit(paramCtx.value());
                params.add(new ParameterNode(paramName, defaultValue));
            }
        }
        table.enterScope(name);

        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();

        table.exitScope();

        FunctionNode funcNode = new FunctionNode(name, params, body);

        for (DecoratorNode deco : decorators) {
            deco.setTarget(funcNode);
        }
        funcNode.setDecorators(decorators);
        table.define(new Symbol(name, Symbol.SymbolType.FUNCTION, null, "Function", ctx.start.getLine() + ctx.decorator_rule().size()));
        return funcNode;
    }

    @Override
    public ASTNode visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
        ReturnNode returnNode = null;
        if (ctx.value() != null) {
            returnNode = new ReturnNode(visit(ctx.value()));
        }
        return returnNode;
    }

    @Override
    public ASTNode visitFunctionCall(PythonParser.FunctionCallContext ctx) {
        String funName = ctx.IDENTIFIER().getText();
        List<ASTNode> arguments = new ArrayList<>();
        for (PythonParser.ArgumentContext arg : ctx.argument()) {
            arguments.add(visit(arg));
        }
        return new FunctionCallNode(funName, arguments);
    }

    @Override
    public ASTNode visitArgument(PythonParser.ArgumentContext ctx) {
        String varName = "";
        if (ctx.IDENTIFIER() != null) {
            varName = ctx.IDENTIFIER().getText();
        }
        ASTNode value = visit(ctx.value());

        return new ArgumentNode(varName, value);
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

        return new ForNode(variable, value, body);
    }

    @Override
    public ASTNode visitWhileLoop(PythonParser.WhileLoopContext ctx) {
        ASTNode expression = visit(ctx.expressions());
        table.enterScope("while_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.block())).getStatements();
        table.exitScope();
        return new WhileNode(expression, body);
    }

    @Override
    public ASTNode visitDecorator(PythonParser.DecoratorContext ctx) {
        return visit(ctx.atom());
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

        if (ctx.decorator_rule() != null) {
            for (PythonParser.Decorator_ruleContext dec : ctx.decorator_rule()) {
                ASTNode decoName = visit(dec);
                decorators.add(new DecoratorNode(decoName, null));
                table.define(new Symbol(decoName.toString(), Symbol.SymbolType.DECORATOR, null, "Decorator", ctx.start.getLine()));
            }
        }

        ClassNode classNode = new ClassNode(name, baseClass);

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
        return classNode;
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
        return new PrintNode(nodes);
    }

    // =========================
    // JINJA2
    // =========================


    @Override
    public ASTNode visitTemplateBody(PythonParser.TemplateBodyContext ctx) {
        ProgramNode block = new ProgramNode();

        // Handle statements
        for (PythonParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode != null)
                block.addStatement(stmtNode);
        }

        // Handle HTML elements
        for (PythonParser.HtmlContext htmlCtx : ctx.html()) {
            ASTNode htmlNode = visit(htmlCtx);
            if (htmlNode != null)
                block.addStatement(htmlNode);
        }

        // Handle Jinja body elements
        for (PythonParser.JinjaBodyContext jinjaCtx : ctx.jinjaBody()) {
            ASTNode jinjaNode = visit(jinjaCtx);
            if (jinjaNode != null)
                block.addStatement(jinjaNode);
        }

        return block;
    }

    @Override
    public ASTNode visitJinjaSet(PythonParser.JinjaSetContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        ASTNode value = visit(ctx.expressions());
        Object actualValue = getActualValue(value);

        if (actualValue != null) {
            String type = actualValue.getClass().getSimpleName();
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, actualValue, type, ctx.start.getLine()));
        } else {
            table.define(new Symbol(varName, Symbol.SymbolType.VARIABLE, value.getClass().getSimpleName(), null, ctx.start.getLine()));
        }

        return new AssignmentNode(varName, value);
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

        return new JinjaExpressionNode(innerExpression);
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

        return ifNode;
    }

    @Override
    public ASTNode visitJinjaIf(PythonParser.JinjaIfContext ctx) {
        ASTNode condition = visit(ctx.condition);
        IfNode ifNode = new IfNode(condition);

        table.enterScope("jinjaIf_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        ifNode.setBody(body);
        table.exitScope();

        return ifNode;
    }

    @Override
    public ASTNode visitJinjaElif(PythonParser.JinjaElifContext ctx) {
        ASTNode condition = visit(ctx.condition);
        table.enterScope("jinjaElif_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return new ElifNode(condition, body);
    }

    @Override
    public ASTNode visitJinjaElse(PythonParser.JinjaElseContext ctx) {
        table.enterScope("jinjaElse_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return new ElseNode(body);
    }

    @Override
    public ASTNode visitJinjaFor(PythonParser.JinjaForContext ctx) {
        String variable = ctx.IDENTIFIER().getText();
        ASTNode iterable = visit(ctx.value());
        table.enterScope("jinjaFor_" + ctx.start.getLine());
        List<ASTNode> body = ((ProgramNode) visit(ctx.templateBody())).getStatements();
        table.exitScope();

        return new ForNode(variable, iterable, body);
    }

    @Override
    public ASTNode visitJiniaExtends(PythonParser.JiniaExtendsContext ctx) {
        ASTNode template = visit(ctx.atom());
        return new ExtendNode(template);
    }

    @Override
    public ASTNode visitJinjaInclude(PythonParser.JinjaIncludeContext ctx) {
        ASTNode template = visit(ctx.atom());
        boolean ignoreMissing = ctx.IGNORE() != null;
        boolean withContext = ctx.WITH() != null;
        return new IncludeNode(template, ignoreMissing, withContext);
    }

    // =========================
    // HTML
    // =========================


    @Override
    public ASTNode visitHtmlTag(PythonParser.HtmlTagContext ctx) {
        return super.visitHtmlTag(ctx);
    }

    @Override
    public ASTNode visitStyleTag(PythonParser.StyleTagContext ctx) {
        HtmlElementNode element = new HtmlElementNode(new IdentifierNode("style"));
        Map<String, String> attributes = new HashMap<>();
        for (PythonParser.HtmlAttributesContext attr : ctx.htmlAttributes()) {
            attributes.put(
                    attr.attributeName().getText(),
                    attr.attributeValue().getText()
            );
        }
        element.setAttributes(attributes);

        List<ASTNode> children = new ArrayList<>();
        for (PythonParser.CssContext css : ctx.css()) {
            children.add(visit(css));
        }
        element.setChildren(children);
//        element.getBehaviorTable().get(element.getTagName()).render(ctx);
        return element;
    }

    @Override
    public ASTNode visitGenericHtml(PythonParser.GenericHtmlContext ctx) {
        HtmlElementNode element = new HtmlElementNode(new IdentifierNode(ctx.IDENTIFIER(0).getText()));
        Map<String, String> attributes = new HashMap<>();
        for (PythonParser.HtmlAttributesContext attr : ctx.htmlAttributes()) {
            attributes.put(
                    attr.attributeName().getText(),
                    attr.attributeValue().getText()
            );
        }
        element.setAttributes(attributes);

        List<ASTNode> children = new ArrayList<>();
        children.addAll(collectBodyElements(ctx.htmlBody()));
        element.setChildren(children);
//        element.getBehaviorTable().get(element.getTagName()).render(ctx);
        return element;
    }

    @Override
    public ASTNode visitHtmlText(PythonParser.HtmlTextContext ctx) {
        StringBuilder text = new StringBuilder();
        if (ctx.IDENTIFIER() != null) {
            for (var id : ctx.IDENTIFIER()) {
                text.append(id.getText());
            }
        }
        if (ctx.STRING() != null) {
            for (var str : ctx.STRING()) {
                String clean = cleanString(str.getText());
                text.append(clean);
            }
        }
        return new HtmlTextNode(text.toString());
    }

    // =========================
    // CSS
    // =========================

    @Override
    public ASTNode visitCss(PythonParser.CssContext ctx) {
        List<CssNode> cssNodes = new ArrayList<>();
        List<CssPropertyNode> properties = new ArrayList<>();
        for (PythonParser.CssSelectorContext selectorContext : ctx.cssSelector()) {
            cssNodes.add((CssNode) visit(selectorContext));
        }

        for (PythonParser.CssKeyValueContext cssKeyValueContext : ctx.cssKeyValue()) {
            properties.add((CssPropertyNode) visit(cssKeyValueContext));
        }

        for (CssNode node : cssNodes) {
            node.setProperties(properties);
        }
        return new CssBlockNode(cssNodes);
    }

    @Override
    public ASTNode visitCssSelector(PythonParser.CssSelectorContext ctx) {
        StringBuilder selectorName = new StringBuilder();

        if (ctx.DOT() != null) {
            selectorName.append(".");
        } else if (ctx.HASHTAG() != null) {
            selectorName.append("#");
        }

        selectorName.append(((IdentifierNode) visit(ctx.cssKey(0))).getName());

        for (int i = 1; i < ctx.cssKey().size(); i++) {
            selectorName.append(":")
                    .append(((IdentifierNode) visit(ctx.cssKey(i))).getName());
        }

        IdentifierNode selector = new IdentifierNode(selectorName.toString());
        return new CssNode(selector);
    }

    @Override
    public ASTNode visitCssKey(PythonParser.CssKeyContext ctx) {
        StringBuilder id = new StringBuilder();
        id.append(ctx.IDENTIFIER(0).getText());
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            id.append("-").append(ctx.IDENTIFIER(1).getText());
        }
        return new IdentifierNode(id.toString());
    }

    @Override
    public ASTNode visitCssKeyValue(PythonParser.CssKeyValueContext ctx) {
        ASTNode key = visit(ctx.cssKey());
        ASTNode value = visit(ctx.cssValue());
        return new CssPropertyNode(key, value);
    }

    @Override
    public ASTNode visitCssVNumber(PythonParser.CssVNumberContext ctx) {
        StringBuilder value = new StringBuilder();
        value.append(ctx.NUMBER().getText());
        if (ctx.TYPE() != null) {
            value.append(ctx.TYPE().getText());
        }
        return new NumberNode(value.toString());
    }

    @Override
    public ASTNode visitCssVId(PythonParser.CssVIdContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitCssVColor(PythonParser.CssVColorContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append('#').append(ctx.HASHTAG_VALUE().getText());
        return new IdentifierNode(sb.toString());
    }

    @Override
    public ASTNode visitCssVStr(PythonParser.CssVStrContext ctx) {
        String str = ctx.STRING().getText();
        return new StringNode(cleanString(str));
    }
}
