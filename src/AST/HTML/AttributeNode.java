package AST.HTML;

import AST.ASTNode;

public class AttributeNode extends ASTNode {
    private String name;
    private String value;

    public AttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return prefix + (isTail ? "└── " : "├── ") + name + "=\"" + value + "\"\n";
    }
}
