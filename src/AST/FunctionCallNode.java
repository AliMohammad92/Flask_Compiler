package AST;

import java.util.List;

public class FunctionCallNode extends ASTNode {
    private String functionName;
    private List<ASTNode> arguments;

    public FunctionCallNode(String functionName, List<ASTNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "FunctionCallNode(" + functionName + ")"));
        String newPrefix = nextPrefix(prefix, isTail);
        if (arguments != null && !arguments.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "Arguments"));
            for (int i = 0; i < arguments.size(); i++)
                sb.append(arguments.get(i).toTreeString(nextPrefix(newPrefix, true), i == arguments.size() - 1));
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "FunctionCallNode(" + functionName + arguments + ")";
    }
}





