package AST.CSS;

import AST.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssNode extends ASTNode {
    private ASTNode selector;
    private List<CssPropertyNode> properties = new ArrayList<>();

    public CssNode(ASTNode selector) {
        this.selector = selector;
    }

    public void setSelector(ASTNode selector) {
        this.selector = selector;
    }

    public void addProperty(CssPropertyNode property) {
        this.properties.add(property);
    }

    public void setProperties(List<CssPropertyNode> properties) {
        this.properties = properties;
    }

    public List<CssPropertyNode> getProperties() {
        return properties;
    }

    public ASTNode getSelector() {
        return selector;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("CssNode\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");

        if (selector != null) {
            sb.append(childPrefix)
                    .append("├── Selector: ")
                    .append(selector.getClass().getSimpleName())
                    .append("(")
                    .append(selector.toString().trim())
                    .append(")\n");
        }

        for (int i = 0; i < properties.size(); i++) {
            CssPropertyNode prop = properties.get(i);
            sb.append(prop.toTreeString(childPrefix, i == properties.size() - 1));
        }

        return sb.toString();
    }

}
