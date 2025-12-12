//package gen.ANTLR;
//
//import SymbolTable.SymbolTable;
//import SymbolTable.Symbol;
//import org.antlr.v4.runtime.tree.ParseTree;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class BaseVisitor extends PythonParserBaseVisitor<Object> {
//
//    private SymbolTable table = new SymbolTable();
//
//    public SymbolTable getSymbolTable() {
//        return table;
//    }
//
//    @Override
//    public Void visitProgram(PythonParser.ProgramContext ctx) {
//        table.enterScope("global");
//        super.visitProgram(ctx);
//        table.exitScope();
//        return null;
//    }
//
//    // ----------------------------
//    // Assignments and Values
//    // ----------------------------
//
//    @Override
//    public Object visitAssignment(PythonParser.AssignmentContext ctx) {
//        String varName = ctx.IDENTIFIER().getText();
//        Object value = visit(ctx.value());
//
//        if (table.currentScope().symbols.containsKey(varName)) {
//            System.err.println("Warning: variable '" + varName + "' redefined at line " + ctx.start.getLine());
//        }
//
//        // store the evaluated value instead of null
//        table.define(new Symbol(varName, "variable", value, ctx.start.getLine()));
//
//        System.out.println(varName + " = " + value);
//        return value;
//    }
//
//
//    @Override
//    public Object visitValue(PythonParser.ValueContext ctx) {
//        if (ctx.atom() != null) return visit(ctx.atom());
//        else if (ctx.list() != null) return visit(ctx.list());
//        else if (ctx.expressions() != null) return visit(ctx.expressions());
//        return null;
//    }
//
//    // ----------------------------
//    // Atomic values
//    // ----------------------------
//
//    @Override
//    public Object visitId(PythonParser.IdContext ctx) {
//        String varName = ctx.IDENTIFIER().getText();
//        Symbol sym = table.resolve(varName);
//
//        if (sym == null) {
//            System.err.println("Error: variable " + varName + " not defined at line " + ctx.start.getLine());
//            return 0; // or throw an error / return default value
//        }
//
//        // Return the stored value instead of null
//        return sym.value;
//    }
//
//    @Override public Object visitNumber(PythonParser.NumberContext ctx) {
//        return Integer.parseInt(ctx.NUMBER().getText());
//    }
//
//    @Override public Object visitString(PythonParser.StringContext ctx) {
//        return ctx.STRING().getText().replaceAll("^['\"]|['\"]$", "");
//    }
//
//    @Override public Object visitTrue(PythonParser.TrueContext ctx) {
//        return true;
//    }
//
//    @Override public Object visitFalse(PythonParser.FalseContext ctx) {
//        return false;
//    }
//
//    @Override public Object visitList(PythonParser.ListContext ctx) {
//        List<Object> results = new ArrayList<>();
//        if (ctx.elements() != null) {
//            for (PythonParser.ValueContext v : ctx.elements().value()) {
//                results.add(visit(v));
//            }
//        }
//        return results;
//    }
//
//    @Override
//    public Object visitParen(PythonParser.ParenContext ctx) {
//        return visit(ctx.expressions());
//    }
//
//    // ----------------------------
//    // Logical Expressions
//    // ----------------------------
//
//    @Override
//    public Object visitLtExp(PythonParser.LtExpContext ctx) {
//        return (int) visit(ctx.left) < (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitGtExp(PythonParser.GtExpContext ctx) {
//        return (int) visit(ctx.left) > (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitLteExp(PythonParser.LteExpContext ctx) {
//        return (int) visit(ctx.left) <= (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitGteExp(PythonParser.GteExpContext ctx) {
//        return (int) visit(ctx.left) >= (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitEqExp(PythonParser.EqExpContext ctx) {
//        return visit(ctx.left).equals(visit(ctx.right));
//    }
//
//    @Override
//    public Object visitStrictEqExp(PythonParser.StrictEqExpContext ctx) {
//        Object left = visit(ctx.left);
//        Object right = visit(ctx.right);
//        return left.equals(right) && left.getClass() == right.getClass();
//    }
//
//    @Override
//    public Object visitNeExp(PythonParser.NeExpContext ctx) {
//        return !visit(ctx.left).equals(visit(ctx.right));
//    }
//
//    @Override
//    public Object visitStrictNeqExp(PythonParser.StrictNeqExpContext ctx) {
//        Object left = visit(ctx.left);
//        Object right = visit(ctx.right);
//        return !left.equals(right) || left.getClass() != right.getClass();
//    }
//
//    // ----------------------------
//    // Mathematical Expressions
//    // ----------------------------
//
//    @Override
//    public Object visitAddExp(PythonParser.AddExpContext ctx) {
//        return (int) visit(ctx.left) + (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitSubExp(PythonParser.SubExpContext ctx) {
//        return (int) visit(ctx.left) - (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitMulExp(PythonParser.MulExpContext ctx) {
//        return (int) visit(ctx.left) * (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitDivExp(PythonParser.DivExpContext ctx) {
//        return (int) visit(ctx.left) / (int) visit(ctx.right);
//    }
//
//    @Override
//    public Object visitModExp(PythonParser.ModExpContext ctx) {
//        return (int) visit(ctx.left) % (int) visit(ctx.right);
//    }
//
//    // ----------------------------
//    // Print Statements
//    // ----------------------------
//
//    @Override
//    public Object visitPrintStatement(PythonParser.PrintStatementContext ctx) {
//        for (ParseTree child : ctx.children) {
//            Object value = visit(child);
//            if (value != null) {
//                System.out.print(value + " ");
//            }
//        }
//        System.out.println();
//        return null;
//    }
//
//    // ----------------------------
//    // If Statements
//    // ----------------------------
//
//
//    @Override
//    public Object visitIfStatement(PythonParser.IfStatementContext ctx) {
//        if ((Boolean) visit(ctx.ifBlock())) {
//            return null;
//        }
//
//        for (PythonParser.ElifBlockContext elif : ctx.elifBlock()){
//            if ((Boolean) visit(elif)) {
//                return null;
//            }
//        }
//        if (ctx.elseBlock() != null) {
//            visit(ctx.elseBlock());
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitIfBlock(PythonParser.IfBlockContext ctx) {
//        boolean cond = (Boolean) visit(ctx.condition);
//        if (cond) {
//            visit(ctx.block());
//        }
//
//        return cond;
//    }
//
//    @Override
//    public Object visitElifBlock(PythonParser.ElifBlockContext ctx) {
//        boolean cond = (Boolean) visit(ctx.condition);
//        if (cond) {
//            visit(ctx.block());
//        }
//
//        return cond;
//    }
//
//    @Override
//    public Object visitElseBlock(PythonParser.ElseBlockContext ctx) {
//        if (ctx.ELSE() != null){
//            return visit(ctx.block());
//        }
//        return true;
//    }
//
//    // ----------------------------
//    // Loop Statements
//    // ----------------------------
//
//    @Override
//    public Object visitForLoop(PythonParser.ForLoopContext ctx) {
//        return super.visitForLoop(ctx);
//    }
//
//    @Override
//    public Object visitWhileLoop(PythonParser.WhileLoopContext ctx) {
//        return super.visitWhileLoop(ctx);
//    }
//
//    // ----------------------------
//    // Functions Statements
//    // ----------------------------
//
//
//    @Override
//    public Object visitFunction(PythonParser.FunctionContext ctx) {
//        return super.visitFunction(ctx);
//    }
//
//    @Override
//    public Object visitParameters(PythonParser.ParametersContext ctx) {
//        return super.visitParameters(ctx);
//    }
//
//    @Override
//    public Object visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
//        return super.visitReturnStatement(ctx);
//    }
//
//    @Override
//    public Object visitFunctionCall(PythonParser.FunctionCallContext ctx) {
//        return super.visitFunctionCall(ctx);
//    }
//}
