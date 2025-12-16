package AST.HTML;

import AST.ASTNode;

import java.util.List;

public class HtmlNode extends HtmlElementNode {
    public HtmlNode(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        super(tagName, attributes, children);
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("<html>");

        if (attributes != null && !attributes.isEmpty()) {
            sb.append(" [");
            for (int i = 0; i < attributes.size(); i++) {
                AttributeNode attr = attributes.get(i);
                sb.append(attr.getName()).append("=").append(attr.getValue());
                if (i < attributes.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }
        sb.append("\n");
        return sb.toString();
    }
}
