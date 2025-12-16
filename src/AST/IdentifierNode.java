package AST;

import org.antlr.runtime.tree.TreeWizard;

public class IdentifierNode extends ASTNode {
    public String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return formatLine(prefix, isTail, "IdentifierNode(" + name + ")");
    }

    @Override
    public String toString() {
        return name;
    }
}
