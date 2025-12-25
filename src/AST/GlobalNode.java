package AST;

import java.util.List;

public class GlobalNode extends ASTNode {
    private List<IdentifierNode> variables;

    public GlobalNode(List<IdentifierNode> variables) {
        this.variables = variables;
    }

    public List<IdentifierNode> getVariables() {
        return variables;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("GlobalNode\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");
        for (int i = 0; i < variables.size(); i++) {
            sb.append(childPrefix)
                    .append(i == variables.size() - 1 ? "└── " : "├── ")
                    .append(variables.get(i))
                    .append("\n");
        }
        return sb.toString();
    }
}
