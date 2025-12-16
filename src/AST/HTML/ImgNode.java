package AST.HTML;

import AST.ASTNode;

import java.util.List;

public class ImgNode extends HtmlElementNode {
    public ImgNode(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        super(tagName, attributes, children);
    }

    public String getSrc() {
        for (AttributeNode node : attributes) {
            if (node.getName().equals("src")) {
                return node.getValue();
            }
        }
        return null;
    }
}
