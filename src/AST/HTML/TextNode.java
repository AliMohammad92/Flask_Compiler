package AST.HTML;

import AST.ASTNode;

public class TextNode extends ASTNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return prefix + (isTail ? "└── " : "├── ") + text + "\n";
    }
}
