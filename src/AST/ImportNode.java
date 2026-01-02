package AST;

public class ImportNode extends ASTNode{
    private ASTNode source;
    private ImportedNameNode imported;

    public ImportNode(ASTNode source, ImportedNameNode imported) {
        this.source = source;
        this.imported = imported;
    }

    public ASTNode getSource() {
        return source;
    }

    public ImportedNameNode getImported() {
        return imported;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ImportNode" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        if (source != null) {
            sb.append(source.toTreeString(newPrefix, imported == null));
        }

        if (imported != null) {
            sb.append(imported.toTreeString(newPrefix, true));
        }

        return sb.toString();
    }
}
