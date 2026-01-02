package AST.JINJA2;

import AST.ASTNode;

public class ExtendNode extends ASTNode {
    private ASTNode template;

    public ExtendNode(ASTNode template) {
        this.template = template;
    }

    public ASTNode getTemplate() {
        return template;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "JinjaExtendsNode" + getLineInfo()));
        sb.append(template.toTreeString(nextPrefix(prefix, true), true));
        return sb.toString();
    }
}
