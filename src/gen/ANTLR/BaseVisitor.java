package gen.ANTLR;

import gen.ANTLR.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends PythonParserBaseVisitor<Object> {

    @Override
    public Object visitAssignment(PythonParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.value());
        System.out.println(varName + " = " + value);
        return value;
    }

    @Override
    public Object visitValue(PythonParser.ValueContext ctx) {
        if (ctx.atom() != null) return visit(ctx.atom());
        else if (ctx.list() != null) return visit(ctx.list());
        else if (ctx.operations() != null) return visit(ctx.operations());
        return null;
    }

    @Override public Object visitId(PythonParser.IdContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override public Object visitNumber(PythonParser.NumberContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override public Object visitString(PythonParser.StringContext ctx) {
        return ctx.STRING().getText();
    }

//    @Override public Object visitParen(PythonParser.ParenContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTrue(PythonParser.TrueContext ctx) {
        return ctx.TRUE().getText();
    }

    @Override public Object visitFalse(PythonParser.FalseContext ctx) {
        return ctx.FALSE().getText();
    }

    @Override public Object visitList(PythonParser.ListContext ctx) {
        List<Object> results = new ArrayList<>();
        if (ctx.elements() != null) {
            for (PythonParser.ValueContext v : ctx.elements().value()) {
                Object value = visit(v);
                results.add(value);
            }
        }
        return results;
    }

    @Override
    public Object visitLtOp(PythonParser.LtOpContext ctx) {
        return (int)visit(ctx.left) < (int)visit(ctx.right);
    }

    @Override
    public Object visitGtOp(PythonParser.GtOpContext ctx) {
        return (int)visit(ctx.left) > (int)visit(ctx.right);
    }

    @Override
    public Object visitEqOp(PythonParser.EqOpContext ctx) {
        return visit(ctx.left).equals(visit(ctx.right));
    }

    @Override
    public Object visitStrictEqOp(PythonParser.StrictEqOpContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return left.equals(right) && left.getClass() == right.getClass();
    }

    @Override
    public Object visitNeqOp(PythonParser.NeqOpContext ctx) {
        return !visit(ctx.left).equals(visit(ctx.right));
    }

    @Override
    public Object visitStrictNeqOp(PythonParser.StrictNeqOpContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return !left.equals(right) || left.getClass() != right.getClass();
    }

    @Override
    public Object visitAddOp(PythonParser.AddOpContext ctx) {
        return (int)visit(ctx.left) + (int)visit(ctx.right);
    }

    @Override
    public Object visitSubOp(PythonParser.SubOpContext ctx) {
        return (int)visit(ctx.left) - (int)visit(ctx.right);
    }

    @Override
    public Object visitMulOp(PythonParser.MulOpContext ctx) {
        return (int)visit(ctx.left) * (int)visit(ctx.right);
    }

    @Override
    public Object visitDivOp(PythonParser.DivOpContext ctx) {
        return (int)visit(ctx.left) / (int)visit(ctx.right);
    }

    @Override
    public Object visitModOp(PythonParser.ModOpContext ctx) {
        return (int)visit(ctx.left) % (int)visit(ctx.right);
    }

    @Override
    public Object visitParen(PythonParser.ParenContext ctx) {
        return super.visitParen(ctx);
    }
}
