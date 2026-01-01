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

        // 1. طباعة اسم النود الأساسي
        sb.append(formatLine(prefix, isTail, "CssNode"));

        String newPrefix = nextPrefix(prefix, isTail);

        // 2. طباعة الـ Ancestor (إذا كان موجوداً - حالة الـ Descendant Selector)
        if (ancestor != null) {
            // إذا كان الـ Descendant والـ Properties موجودين، فهذا ليس الأخير
            boolean isLast = (descendant == null && properties.isEmpty());
            sb.append(ancestor.toTreeString(newPrefix, isLast));
        }

        // 3. طباعة الـ Descendant (السلكتور الأساسي أو الابن)
        if (descendant != null) {
            boolean isLast = properties.isEmpty();
            sb.append(descendant.toTreeString(newPrefix, isLast));
        }

        // 4. طباعة قائمة الخصائص
        for (int i = 0; i < properties.size(); i++) {
            boolean lastProp = (i == properties.size() - 1);
            sb.append(properties.get(i).toTreeString(newPrefix, lastProp));
        }

        return sb.toString();
    }
}
