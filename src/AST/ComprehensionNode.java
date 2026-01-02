package AST;

public class ComprehensionNode extends ASTNode {
    private ASTNode elementExpression;
    private ASTNode variable;
    private ASTNode iterable;
    private ASTNode condition;

    public ComprehensionNode(ASTNode elementExpression, ASTNode variable, ASTNode iterable, ASTNode condition) {
        this.elementExpression = elementExpression;
        this.variable = variable;
        this.iterable = iterable;
        this.condition = condition;
    }

    public ASTNode getElementExpression() {
        return elementExpression;
    }

    public ASTNode getVariable() {
        return variable;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix)
                .append(isTail ? "└── " : "├── ").append("ComprehensionNode(for ").append(variable).append(" in ...)").append(getLineInfo()).append("\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");
        sb.append(elementExpression.toTreeString(childPrefix, false));
        sb.append(iterable.toTreeString(childPrefix, condition == null));
        if (condition != null)
            sb.append(condition.toTreeString(childPrefix, true));
        return sb.toString();
    }
}
