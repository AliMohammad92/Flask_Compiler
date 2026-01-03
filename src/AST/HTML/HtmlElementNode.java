package AST.HTML;

import AST.ASTNode;
import AST.HTML.Behaviors.FormBehavior;
import AST.HTML.Behaviors.TagBehavior;
import AST.IdentifierNode;
import gen.ANTLR.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlElementNode extends ASTNode {
    private IdentifierNode tagName;
    private List<ASTNode> children = new ArrayList<>();
    private List<HtmlAttributeNode> attributes = new ArrayList<>();
    private static final Map<String, TagBehavior> behaviorTable = new HashMap<>();

    public HtmlElementNode(IdentifierNode tagName) {
        this.tagName = tagName;
    }

    static {
        behaviorTable.put("form", new FormBehavior());
    }

    public IdentifierNode getTagName() {
        return tagName;
    }

    public void setTagName(IdentifierNode tagName) {
        this.tagName = tagName;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public void setChildren(List<ASTNode> children) {
        this.children = children;
    }

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HtmlAttributeNode> attributes) {
        this.attributes = attributes;
    }

    public Map<String, TagBehavior> getBehaviorTable() {
        return behaviorTable;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(formatLine(prefix, isTail, "HtmlElementNode <" + tagName.getName() + ">" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        if (!attributes.isEmpty()) {
            for (int i = 0; i < attributes.size(); i++) {
                boolean isLastAttribute = (i == attributes.size() - 1) && children.isEmpty();
                sb.append(attributes.get(i).toTreeString(newPrefix, isLastAttribute));
            }
        }

        if (!children.isEmpty()) {
            for (int i = 0; i < children.size(); i++) {
                boolean isLastChild = (i == children.size() - 1);
                sb.append(children.get(i).toTreeString(newPrefix, isLastChild));
            }
        }
        return sb.toString();
    }
}
