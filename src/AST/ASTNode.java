package AST;

import java.util.List;

public abstract class ASTNode {
    public String toTreeString() {
        return toTreeString("", true);
    }

    public abstract String toTreeString(String prefix, boolean isTail);

    protected String formatLine(String prefix, boolean isTail, String text) {
        return prefix + (isTail ? "└── " : "├── ") + text + "\n";
    }
    protected String nextPrefix(String prefix, boolean isTail) {
        return prefix + (isTail ? "    " : "│   ");
    }
}
