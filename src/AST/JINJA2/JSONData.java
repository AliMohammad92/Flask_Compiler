package AST.JINJA2;

import AST.ASTNode;

public class JSONData extends ASTNode {
    private ASTNode key;
    private ASTNode value;

    public JSONData(ASTNode key, ASTNode value) {
        this.key = key;
        this.value = value;
    }

    public ASTNode getKey() {
        return key;
    }

    public void setKey(ASTNode key) {
        this.key = key;
    }

    public ASTNode getValue() {
        return value;
    }

    public void setValue(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(formatLine(prefix, isTail, "JSONData" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        if (key != null) {
            sb.append(key.toTreeString(newPrefix, false));
        }

        if (value != null) {
            sb.append(value.toTreeString(newPrefix, true));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return key.toString() + " : " +
                value.toString();
    }
}
