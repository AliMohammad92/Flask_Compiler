package AST;

import java.util.List;

public class ReturnNode extends ASTNode {
    private List<ASTNode> values;

    public ReturnNode(List<ASTNode> values) {
        this.values = values;
    }

    public List<ASTNode> getValues() {
        return values;
    }


    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ReturnNode" + getLineInfo()));

        if (values != null && !values.isEmpty()) {
            for (int i = 0; i < values.size(); i++) {
                ASTNode v = values.get(i);
                boolean last = (i == values.size() - 1);
                sb.append(v.toTreeString(nextPrefix(prefix, !last), last));
            }
        }

        return sb.toString();
    }
}
