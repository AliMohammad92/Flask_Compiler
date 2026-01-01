package AST;

import java.util.List;

public class ImportedListNode extends ASTNode {
    private List<ImportedNameNode> importedNames;

    public ImportedListNode(List<ImportedNameNode> importedNames) {
        this.importedNames = importedNames;
    }

    public List<ImportedNameNode> getImportedNames() { return importedNames; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ImportedListNode"));

        String newPrefix = nextPrefix(prefix, isTail);

        for (int i = 0; i < importedNames.size(); i++) {
            boolean last = (i == importedNames.size() - 1);
            sb.append(importedNames.get(i).toTreeString(newPrefix, last));
        }
        return sb.toString();
    }
}
