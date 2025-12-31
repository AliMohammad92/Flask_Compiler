package AST.Flask;

import AST.ASTNode;
import AST.FunctionNode;

import java.util.List;

public class FlaskDecoratorNode extends ASTNode {
    private String decoratorType; // route, login, error
    private String path;
    private List<String> methods;
    private FunctionNode targetFunction;

    public FlaskDecoratorNode(String type, String path, List<String> methods, FunctionNode func) {
        this.decoratorType = type;
        this.path = path;
        this.methods = methods;
        this.targetFunction = func;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "FlaskDecoratorNode (" + decoratorType + ")"));
        if (path != null) sb.append(formatLine(nextPrefix(prefix, true), false, "Path: " + path));
        if (methods != null) sb.append(formatLine(nextPrefix(prefix, true), false, "Methods: " + methods));
        if (targetFunction != null) sb.append(targetFunction.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }
}
