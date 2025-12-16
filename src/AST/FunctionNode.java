package AST;

import org.antlr.runtime.tree.TreeWizard;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private List<ParameterNode> parameters;
    private List<ASTNode> body;
    private List<DecoratorNode> decorators;

    public FunctionNode(String name, List<ParameterNode> parameters, List<ASTNode> body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public void setDecorators(List<DecoratorNode> decorators) {
        this.decorators = decorators;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "FunctionNode(" + name + ")"));
        String newPrefix = nextPrefix(prefix, isTail);
        if (parameters != null && !parameters.isEmpty()) {
            sb.append(formatLine(newPrefix, false, "Parameters"));
            for (int i = 0; i < parameters.size(); i++)
                sb.append(parameters.get(i).toTreeString(nextPrefix(newPrefix, false), i == parameters.size() - 1));
        }
        if (body != null && !body.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "Body"));
            for (int i = 0; i < body.size(); i++)
                sb.append(body.get(i).toTreeString(nextPrefix(newPrefix, true), i == body.size() - 1));
        }
        if (decorators != null && !decorators.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "Decorators"));
            for (int i = 0; i < decorators.size(); i++)
                sb.append(decorators.get(i).toTreeString(nextPrefix(newPrefix, true), i == decorators.size() - 1));
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return name;
    }
}