package AST;

import java.util.ArrayList;
import java.util.List;

public class TupleNode extends ASTNode {
    public List<ASTNode> elements = new ArrayList<>();

    public void addElement(ASTNode element) {
        this.elements.add(element);
    }

    public List<ASTNode> getElements() {
        return elements;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "TupleNode"));
        for (int i = 0; i < elements.size(); i++)
            sb.append(elements.get(i).toTreeString(nextPrefix(prefix, isTail), i == elements.size() - 1));
        return sb.toString();
    }


    @Override
    public String toString() {
        return "TupleNode{" +
                "elements=" + elements.toString() +
                '}';
    }
}
