package AST;

public class FromImportNode extends ASTNode {
    private ASTNode name;
    private ASTNode importedList; // key = original name, value = alias (nullable)

    public FromImportNode(ASTNode name, ASTNode importedList) {
        this.name = name;
        this.importedList = importedList;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(formatLine(prefix, isTail, "FromImportNode"));

        boolean hasImports = importedList != null;

        if (name != null) {
            sb.append(name.toTreeString(nextPrefix(prefix, isTail), !hasImports));
        }

        if (importedList != null) {
            sb.append(importedList.toTreeString(nextPrefix(prefix, isTail), true));
        }

        return sb.toString();
    }


}
