package AST;

import org.antlr.runtime.tree.TreeWizard.Visitor;

public class NumberNode extends ASTNode {
    public String value;

    public NumberNode(String value) {
        this.value = value;
    }

    public String getType() {
        if (value.contains("."))
            return "double";
        else
            return "int";
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return formatLine(prefix, isTail, "NumberNode(" + value + ")");
    }

    @Override
    public String toString() {
        return "NumberNode{" +
                "value=" + value +
                '}';
    }
}
