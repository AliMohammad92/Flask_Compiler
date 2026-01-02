package AST;

public class NoneNode extends ASTNode {
    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return prefix + (isTail ? "└── " : "├── ") + "None\n";
    }
}
