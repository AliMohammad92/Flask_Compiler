package AST;

public class ArgumentNode extends ASTNode {
    private String name;
    private ASTNode value;

    public ArgumentNode(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }

    public ASTNode getValue() { return value; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ArgumentNode(" + name + ")" + getLineInfo()));
        if (value != null)
            sb.append(value.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }
}
