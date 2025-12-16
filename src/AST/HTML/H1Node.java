package AST.HTML;

import AST.ASTNode;

import java.util.List;
import java.util.Map;

public class H1Node extends HtmlElementNode {
    public H1Node(String tagName, List<AttributeNode> attributes, List<ASTNode> children) {
        super(tagName, attributes, children);
    }
}
