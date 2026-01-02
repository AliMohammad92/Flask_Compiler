package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends ASTNode {
    private ASTNode condition;
    private List<ASTNode> body;
    private List<ElifNode> elifs;
    private ElseNode elseNode;

    public IfNode(ASTNode condition) {
        this.condition = condition;
        this.elifs = new ArrayList<>();
    }

    public void addElif(ElifNode elifNode) {
        this.elifs.add(elifNode);
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public void setElse(ElseNode elseNode) {
        this.elseNode = elseNode;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "IfNode" + getLineInfo()));
        String newPrefix = nextPrefix(prefix, isTail);
        sb.append(formatLine(newPrefix, false, "Condition"));
        sb.append(condition.toTreeString(nextPrefix(newPrefix, false), true));
        sb.append(formatLine(newPrefix, false, "Body"));
        for (int i = 0; i < body.size(); i++)
            sb.append(body.get(i).toTreeString(nextPrefix(newPrefix, false), i == body.size() - 1));
        if (elifs != null && !elifs.isEmpty()) {
            sb.append(formatLine(newPrefix, false, "Elifs"));
            for (int i = 0; i < elifs.size(); i++)
                sb.append(elifs.get(i).toTreeString(nextPrefix(newPrefix, false), i == elifs.size() - 1));
        }
        if (elseNode != null)
            sb.append(elseNode.toTreeString(newPrefix, true));
        return sb.toString();
    }


    @Override
    public String toString() {
        return "IfNode(condition=" + condition +
                ", body=" + body +
                ", elifs=" + elifs +
                ", else=" + elseNode + ")";
    }
}
