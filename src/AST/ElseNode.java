package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.List;

public class ElseNode extends  ASTNode {
    private List<ASTNode> body;

    public ElseNode(List<ASTNode> body) {
        this.body = body;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ElseNode" + getLineInfo()));
        for (int i = 0; i < body.size(); i++)
            sb.append(body.get(i).toTreeString(nextPrefix(prefix, isTail), i == body.size() - 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ElseNode{" +
                "body=" + body +
                '}';
    }
}
