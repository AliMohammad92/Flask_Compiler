package AST;

import java.util.List;

public class HtmlInTripleString extends ASTNode {
    List<ASTNode> elements;

    public HtmlInTripleString(List<ASTNode> elements) {
        this.elements = elements;
    }
    @Override
    public String toTreeString(String indent, boolean last) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        if (last) {
            sb.append("└─");
            indent += "  ";
        } else {
            sb.append("├─");
            indent += "│ ";
        }
        sb.append("HtmlInTripleString").append(getLineInfo()).append("\n");

        for (int i = 0; i < elements.size(); i++) {
            ASTNode elem = elements.get(i);
            boolean isLast = (i == elements.size() - 1);
            sb.append(elem.toTreeString(indent, isLast));
        }

        return sb.toString();
    }
}
