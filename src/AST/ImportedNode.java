package AST;

public class ImportedNode extends ASTNode {
    private ASTNode name;
    private ASTNode alias;

    public ImportedNode(ASTNode name, ASTNode alias) {
        this.name = name;
        this.alias = alias;
    }

    public ASTNode getName() {
        return name;
    }

    public ASTNode getAlias() {
        return alias;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ImportedNameNode"));
        sb.append(name.toTreeString(nextPrefix(prefix, isTail), alias == null));
        if (alias != null)
            sb.append(alias.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }
}
