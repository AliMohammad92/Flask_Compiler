package AST.CSS;

import AST.ASTNode;

import java.util.List;

public class CssBlockNode extends ASTNode {
    private List<CssNode> elements;

    public CssBlockNode(List<CssNode> elements) {
        this.elements = elements;
    }

    public List<CssNode> getElements() {
        return elements;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("CssBlockNode\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");

        for (int i = 0; i < elements.size(); i++) {
            CssNode node = elements.get(i);
            sb.append(node.toTreeString(childPrefix, i == elements.size() - 1));
        }

        return sb.toString();
    }
}