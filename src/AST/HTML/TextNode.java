package AST.HTML;

import AST.ASTNode;

public class TextNode extends ASTNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void appendText(String newText) {
        this.text += (" " + newText);
    }

    public String getText() {
        return text;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        return formatLine(prefix, isTail, "TextNode: " + text + getLineInfo());
    }
}
