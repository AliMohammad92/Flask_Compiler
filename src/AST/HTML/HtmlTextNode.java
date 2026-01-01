package AST.HTML;

import AST.ASTNode;

import java.util.List;

public class HtmlTextNode extends ASTNode {
    private final List<ASTNode> segments;

    public HtmlTextNode(List<ASTNode> segments) {
        this.segments = segments;
    }

    public List<ASTNode> getSegments() {
        return segments;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(formatLine(prefix, isTail, "HtmlTextNode"));

        String newPrefix = nextPrefix(prefix, isTail);

        for (int i = 0; i < segments.size(); i++) {
            boolean lastChild = (i == segments.size() - 1);
            sb.append(segments.get(i).toTreeString(newPrefix, lastChild));
        }
        return sb.toString();
    }
}

