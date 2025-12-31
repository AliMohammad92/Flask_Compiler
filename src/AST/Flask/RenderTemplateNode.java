package AST.Flask;

import AST.ASTNode;

import java.util.List;

public class RenderTemplateNode extends ASTNode {
    private String templateName;
    private List<ASTNode> arguments;

    public RenderTemplateNode(String templateName, List<ASTNode> arguments) {
        this.templateName = templateName;
        this.arguments = arguments;
    }

    public String getTemplateName() {
        return templateName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "RenderTemplateNode"));
        sb.append(formatLine(nextPrefix(prefix, true), false, "Template: " + templateName));

        if (arguments != null && !arguments.isEmpty()) {
            sb.append(formatLine(nextPrefix(prefix, true), false, "Arguments:"));
            for (int i = 0; i < arguments.size(); i++) {
                boolean last = (i == arguments.size() - 1);
                sb.append(arguments.get(i).toTreeString(nextPrefix(prefix, !last), last));
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "RenderTemplateNode{" +
                "templateName='" + templateName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
