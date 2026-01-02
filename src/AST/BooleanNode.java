package AST;

import org.antlr.runtime.tree.TreeWizard;

public class BooleanNode extends ASTNode {
    public boolean value;

    public BooleanNode(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return formatLine(prefix, isTail, "BooleanNode(" + value + ")" + getLineInfo());
    }

    @Override
    public String toString() {
        return  "" + value;
    }
}
