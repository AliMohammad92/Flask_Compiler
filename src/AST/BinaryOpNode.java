package AST;

import org.antlr.runtime.tree.TreeWizard;

public class BinaryOpNode extends ASTNode {
    public String operator;
    public ASTNode left;
    public ASTNode right;

    public BinaryOpNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "BinaryOpNode(" + operator + ")" + getLineInfo()));
        sb.append(left.toTreeString(nextPrefix(prefix, false), false));
        sb.append(right.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }


    @Override
    public String toString() {
        return "BinaryOpNode{" +
                "operator='" + operator + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
