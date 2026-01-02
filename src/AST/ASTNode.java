package AST;

public abstract class ASTNode {
    protected int lineNumber = 0;

    public int getLineNumber(){
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineInfo() {
        if (lineNumber > 0)
            return " [Line: " + lineNumber + "]";
        return "";
    }

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
