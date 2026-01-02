package AST;

import java.util.List;

public class ParametersNode extends ASTNode {
    private List<ParameterNode> parameterList;

    public ParametersNode(List<ParameterNode> parameterList) {
        this.parameterList = parameterList;
    }

    public List<ParameterNode> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<ParameterNode> parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(isTail ? "└── " : "├── ").append("Parameters\n");

        String newPrefix = prefix + (isTail ? "    " : "│   ");
        for (int i = 0; i < parameterList.size(); i++) {
            builder.append(parameterList.get(i).toTreeString(newPrefix, i == parameterList.size() - 1));
        }
        return builder.toString();
    }
}