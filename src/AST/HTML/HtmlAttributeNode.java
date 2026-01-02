package AST.HTML;

import AST.ASTNode;

public class HtmlAttributeNode extends ASTNode {
    private ASTNode key;
    private ASTNode value;

    public HtmlAttributeNode(ASTNode key, ASTNode value) {
        this.key = key;
        this.value = value;
    }

    public ASTNode getKey() {
        return key;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("Attribute: ");

        if (key != null)
            sb.append(key.toString().trim());
        else
            sb.append("null");

        sb.append(": ");

        if (value != null)
            sb.append(value.toString().trim());
        else
            sb.append("null");

        sb.append(getLineInfo()).append("\n");
        return sb.toString();
    }
}
