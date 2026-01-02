package AST;

import org.antlr.runtime.tree.TreeWizard;

public class IndexAccessNode extends ASTNode {
    public ASTNode object;
    public ASTNode index;

    public IndexAccessNode(ASTNode object, ASTNode index) {
        this.object = object;
        this.index = index;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "IndexAccessNode" + getLineInfo()));
        sb.append(object.toTreeString(nextPrefix(prefix, false), false));
        sb.append(index.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }

}
