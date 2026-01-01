package AST;

public class ImportedNameNode extends ASTNode {
    private ASTNode name;
    private ASTNode alias;

    public ImportedNameNode(ASTNode name, ASTNode alias) {
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

        String newPrefix = nextPrefix(prefix, isTail);

        if (name != null) {
            sb.append(name.toTreeString(newPrefix, alias == null));
        }

        if (alias != null) {
            sb.append(alias.toTreeString(newPrefix, true));
        }

        return sb.toString();
    }
}
