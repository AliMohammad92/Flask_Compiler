package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.List;

public class ForNode extends ASTNode {
    private String variable;
    private ASTNode iterable;
    private List<ASTNode> body;


    public ForNode(String variable, ASTNode iterable, List<ASTNode> body) {
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    public String getVariable() {
        return variable;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ForNode(" + variable + ")" + getLineInfo()));
        String newPrefix = nextPrefix(prefix, isTail);
        sb.append(formatLine(newPrefix, false, "Iterable" + getLineInfo()));
        sb.append(iterable.toTreeString(nextPrefix(newPrefix, false), true));
        sb.append(formatLine(newPrefix, true, "Body"));
        for (int i = 0; i < body.size(); i++)
            sb.append(body.get(i).toTreeString(nextPrefix(newPrefix, true), i == body.size() - 1));
        return sb.toString();
    }


    @Override
    public String toString() {
        return "ForNode{" +
                "variable='" + variable + '\'' +
                ", iterable=" + iterable +
                ", body=" + body +
                '}';
    }
}
