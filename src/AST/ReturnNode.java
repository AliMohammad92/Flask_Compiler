package AST;

import org.antlr.runtime.tree.TreeWizard;

public class ReturnNode extends ASTNode {
    private ASTNode value;

    public ReturnNode(ASTNode value) {
        this.value = value;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ReturnNode"));
        if (value != null)
            sb.append(value.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ReturnNode{" +
                "value=" + value +
                '}';
    }
}
