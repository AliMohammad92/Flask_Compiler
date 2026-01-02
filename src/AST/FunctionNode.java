package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends ASTNode {
    private String name;
    private ParametersNode parameters;
    private List<ASTNode> body;
    private List<DecoratorNode> decorators;

    public FunctionNode(String name, ParametersNode parameters, List<ASTNode> body) {
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
        sb.append(formatLine(prefix, isTail, "FunctionNode: " + name + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        List<Object> children = new ArrayList<>();
        if (decorators != null && !decorators.isEmpty()) children.add(decorators);
        if (parameters != null) children.add(parameters);
        if (body != null && !body.isEmpty()) children.add(body);

        int count = children.size();
        int current = 0;

        if (decorators != null && !decorators.isEmpty()) {
            current++;
            boolean last = (current == count);
            sb.append(formatLine(newPrefix, last, "Decorators"));
            String childPrefix = nextPrefix(newPrefix, last);
            for (int i = 0; i < decorators.size(); i++) {
                sb.append(decorators.get(i).toTreeString(childPrefix, i == decorators.size() - 1));
            }
        }

        if (parameters != null) {
            current++;
            boolean last = (current == count);
            // بننادي الـ toTreeString تبع عقدة الباراميترات وهي بتطبع حالها واللي تحتها
            sb.append(parameters.toTreeString(newPrefix, last));
        }

        if (body != null && !body.isEmpty()) {
            current++;
            boolean last = (current == count);
            sb.append(formatLine(newPrefix, last, "Body"));
            String childPrefix = nextPrefix(newPrefix, last);
            for (int i = 0; i < body.size(); i++) {
                sb.append(body.get(i).toTreeString(childPrefix, i == body.size() - 1));
            }
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}