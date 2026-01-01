package AST.CSS;

import AST.ASTNode;

public class CssPropertyNode extends ASTNode {
    private ASTNode key;
    private ASTNode value;

    public CssPropertyNode(ASTNode key, ASTNode value) {
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

        sb.append(formatLine(prefix, isTail, "CssPropertyNode"));

        String newPrefix = nextPrefix(prefix, isTail);

        if (key != null) {
            sb.append(key.toTreeString(newPrefix, false));
        }

        if (value != null) {
            sb.append(value.toTreeString(newPrefix, true));
        }

        return sb.toString();
    }
}
