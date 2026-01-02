package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.ArrayList;
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
        sb.append(formatLine(prefix, isTail, "FunctionNode(" + name + ")" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        List<String> sections = new ArrayList<>();
        if (decorators != null && !decorators.isEmpty()) sections.add("decorators");
        if (parameters != null && !parameters.isEmpty()) sections.add("parameters");
        if (body != null && !body.isEmpty()) sections.add("body");

        int sectionCount = sections.size();
        int currentSection = 0;

        if (decorators != null && !decorators.isEmpty()) {
            currentSection++;
            boolean isLastSection = (currentSection == sectionCount);
            sb.append(formatLine(newPrefix, isLastSection, "Decorators"));
            String childPrefix = nextPrefix(newPrefix, isLastSection);
            for (int i = 0; i < decorators.size(); i++) {
                sb.append(decorators.get(i).toTreeString(childPrefix, i == decorators.size() - 1));
            }
        }

        if (parameters != null && !parameters.isEmpty()) {
            currentSection++;
            boolean isLastSection = (currentSection == sectionCount);
            sb.append(formatLine(newPrefix, isLastSection, "Parameters"));
            String childPrefix = nextPrefix(newPrefix, isLastSection);
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).toTreeString(childPrefix, i == parameters.size() - 1));
            }
        }

        if (body != null && !body.isEmpty()) {
            currentSection++;
            boolean isLastSection = (currentSection == sectionCount);
            sb.append(formatLine(newPrefix, isLastSection, "Body"));
            String childPrefix = nextPrefix(newPrefix, isLastSection);
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