package AST;

import java.util.List;

public class ImportedListNode extends ASTNode {
    private List<ASTNode> importedNames;

    public ImportedListNode(List<ASTNode> importedNames) {
        this.importedNames = importedNames;
    }

    public List<ASTNode> getImportedNames() { return importedNames; }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ImportedListNode"));
        for (int i = 0; i < importedNames.size(); i++) {
            sb.append(importedNames.get(i).toTreeString(nextPrefix(prefix, isTail), i == importedNames.size() - 1));
        }
        return sb.toString();
    }
}
