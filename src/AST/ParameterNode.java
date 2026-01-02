package AST;

public class ParameterNode extends ASTNode {
    private String name;
    private ASTNode defaultValue;

    public ParameterNode(String name, ASTNode defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public String getName() { return name; }

    public ASTNode getDefaultValue() { return defaultValue; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ParameterNode(" + name + ")" + getLineInfo()));
        if (defaultValue != null)
            sb.append(defaultValue.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }


    @Override
    public String toString() {
        if (defaultValue != null)
            return name + " = " + defaultValue;
        return name;
    }
}

