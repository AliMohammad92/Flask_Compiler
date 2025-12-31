package AST.CSS;

import AST.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssNode extends ASTNode {
    private ASTNode ancestor;
    private ASTNode descendant;
    private List<CssPropertyNode> properties = new ArrayList<>();

    public CssNode(ASTNode ancestor, ASTNode descendant) {
        this.ancestor = ancestor;
        this.descendant = descendant;
    }

    public void addProperty(CssPropertyNode property) {
        this.properties.add(property);
    }

    public ASTNode getAncestor() {
        return ancestor;
    }

    public void setAncestor(ASTNode ancestor) {
        this.ancestor = ancestor;
    }

    public ASTNode getDescendant() {
        return descendant;
    }

    public void setDescendant(ASTNode descendant) {
        this.descendant = descendant;
    }

    public List<CssPropertyNode> getProperties() {
        return properties;
    }

    public void setProperties(List<CssPropertyNode> properties) {
        this.properties = properties;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("CssNode\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");

        if (descendant != null) {
            sb.append(childPrefix)
                    .append("├── Descendant: ")
                    .append(descendant.getClass().getSimpleName())
                    .append("(")
                    .append(descendant.toString().trim())
                    .append(")\n");
        }

        for (int i = 0; i < properties.size(); i++) {
            CssPropertyNode prop = properties.get(i);
            sb.append(prop.toTreeString(childPrefix, i == properties.size() - 1));
        }

        return sb.toString();
    }

}
