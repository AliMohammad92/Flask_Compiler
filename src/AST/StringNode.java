package AST;

import org.antlr.runtime.tree.TreeWizard;

public class StringNode extends ASTNode {
    public String text;

    public StringNode(String text) {
        this.text = text;
    }

    public String getValue() {
        return text;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return formatLine(prefix, isTail, "StringNode(" + text + ")" + getLineInfo());
    }

    @Override
    public String toString() {
        return text;
    }
}
