package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.*;

public class PrintNode extends ASTNode {
    private List<ASTNode> contents;

    public PrintNode(List<ASTNode> contents) {
        this.contents = contents;
    }

    public List<ASTNode> getContents() { return contents; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "PrintNode" + getLineInfo()));
        for (int i = 0; i < contents.size(); i++)
            sb.append(contents.get(i).toTreeString(nextPrefix(prefix, isTail), i == contents.size() - 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "PrintNode" + contents;
    }
}
