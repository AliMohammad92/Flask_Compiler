package AST;

import org.antlr.runtime.tree.TreeWizard;

public class AssignmentNode extends ASTNode{
    public String variableName;
    public ASTNode value;

    public AssignmentNode(String variableName, ASTNode value) {
        this.variableName = variableName;
        this.value = value;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(formatLine(prefix, isTail, "AssignmentNode(" + variableName + ")"));

        if (value != null) {
            sb.append(value.toTreeString(nextPrefix(prefix, isTail), true));
        }

        return sb.toString();
    }
}
