package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.List;

public class ElifNode extends ASTNode {
    private ASTNode condition;
    private List<ASTNode> body;

    public ElifNode(ASTNode condition, List<ASTNode> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ElifNode"));
        String newPrefix = nextPrefix(prefix, isTail);
        sb.append(formatLine(newPrefix, false, "Condition"));
        sb.append(condition.toTreeString(nextPrefix(newPrefix, false), true));
        sb.append(formatLine(newPrefix, true, "Body"));
        for (int i = 0; i < body.size(); i++)
            sb.append(body.get(i).toTreeString(nextPrefix(newPrefix, true), i == body.size() - 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ElifNode(condition=" + condition + ", body=" + body + ")";
    }
}

