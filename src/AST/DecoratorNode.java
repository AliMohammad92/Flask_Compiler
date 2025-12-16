package AST;

import java.util.List;

public class DecoratorNode extends ASTNode {
    private ASTNode name;
    private ASTNode target;

    public DecoratorNode(ASTNode name, ASTNode target) {
        this.name = name;
        this.target = target;
    }

    public void setTarget(ASTNode target) {
        this.target = target;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "DecoratorNode"));

        if (name != null) {
            sb.append(name.toTreeString(nextPrefix(prefix, true), false));
        }
        if (target != null) {
            sb.append(formatLine(nextPrefix(prefix, true), true, "Target: " + target.toString()));
        }

        return sb.toString();
    }
}
