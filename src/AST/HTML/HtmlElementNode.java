package AST.HTML;

import AST.ASTNode;
import java.util.List;
import java.util.Map;

public class HtmlElementNode extends ASTNode {
    protected String tagName;
    protected List<AttributeNode> attributes;
    protected List<ASTNode> children;

    public HtmlElementNode(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    public String getTagName() { return tagName; }
    public List<AttributeNode> getAttributes() { return attributes; }
    public List<ASTNode> getChildren() { return children; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(isTail ? "└── " : "├── ")
                .append("<").append(tagName).append(">");
        if (attributes != null && !attributes.isEmpty()) {
            sb.append(" ").append(attributes);
        }
        sb.append("\n");
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                boolean last = i == children.size() - 1;
                sb.append(children.get(i).toTreeString(prefix + (isTail ? "    " : "│   "), last));
            }
        }
        return sb.toString();
    }
}
