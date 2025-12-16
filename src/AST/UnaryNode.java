package AST;

import org.antlr.runtime.tree.TreeWizard;

public class UnaryNode extends ASTNode {
    public String operator;
    public ASTNode expression;

    public UnaryNode(String operator, ASTNode expression) {
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "UnaryNode(" + operator + ")"));
        sb.append(expression.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "UnaryNode{" +
                "operator='" + operator + '\'' +
                ", expression=" + expression +
                '}';
    }
}
