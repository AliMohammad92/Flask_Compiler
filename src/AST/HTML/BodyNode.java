package AST.HTML;

import AST.ASTNode;

import java.util.List;
import java.util.Map;

public class BodyNode extends HtmlElementNode {
    public BodyNode(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        super(tagName, attributes, children);
    }
}
