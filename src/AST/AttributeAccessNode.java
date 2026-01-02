package AST;

public class AttributeAccessNode extends ASTNode {
    public ASTNode object;
    public ASTNode attribute;

    public AttributeAccessNode(ASTNode object, ASTNode attribute) {
        this.object = object;
        this.attribute = attribute;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "AttributeAccessNode" + getLineInfo()));

        if (object != null) {
            sb.append(object.toTreeString(nextPrefix(prefix, isTail), false));
        }

        if (attribute != null) {
            sb.append(attribute.toTreeString(nextPrefix(prefix, true), true));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return object.toString();
    }
}