package AST.HTML;

import AST.ASTNode;

import java.util.List;
import java.util.Map;

public class HeadNode extends HtmlElementNode {
    public HeadNode(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        super(tagName, attributes, children);
    }
}
