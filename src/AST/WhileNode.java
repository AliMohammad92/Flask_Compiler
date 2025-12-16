package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.List;

public class WhileNode extends ASTNode {
    private ASTNode expression;
    private List<ASTNode> body;

    public WhileNode(ASTNode expression, List<ASTNode> body) {
        this.expression = expression;
        this.body = body;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "WhileNode"));
        String newPrefix = nextPrefix(prefix, isTail);
        sb.append(formatLine(newPrefix, false, "Expression"));
        sb.append(expression.toTreeString(nextPrefix(newPrefix, false), true));
        sb.append(formatLine(newPrefix, true, "Body"));
        for (int i = 0; i < body.size(); i++)
            sb.append(body.get(i).toTreeString(nextPrefix(newPrefix, true), i == body.size() - 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nWhileNode{ " +
                "expression=" + expression +
                ", body=" + body +
                '}';
    }
}