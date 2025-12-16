package AST.JINJA2;

import AST.ASTNode;

public class JinjaExpressionNode extends ASTNode {
    public ASTNode expression;

    public JinjaExpressionNode(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "JinjaExpressionNode"));
        if (expression != null)
            sb.append(expression.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }
}
