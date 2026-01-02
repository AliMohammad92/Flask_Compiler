package AST;

public class LambdaNode extends ASTNode {
    private ParametersNode parameters;
    private ASTNode expression;

    public LambdaNode(ParametersNode parameters, ASTNode expression) {
        this.parameters = parameters;
        this.expression = expression;
    }

    public ParametersNode getParameters() {
        return parameters;
    }

    public void setParameters(ParametersNode parameters) {
        this.parameters = parameters;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "LambdaNode" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        if (parameters != null) {
            sb.append(parameters.toTreeString(newPrefix, false));
        }

        if (expression != null) {
            sb.append(expression.toTreeString(newPrefix, true));
        }
        return sb.toString();
    }
}