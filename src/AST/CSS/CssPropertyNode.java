package AST.CSS;

import AST.ASTNode;
import java.util.List;

public class CssPropertyNode extends ASTNode {
    private ASTNode key;
    private List<ASTNode> values;

    public CssPropertyNode(ASTNode key, List<ASTNode> values) {
        this.key = key;
        this.values = values;
    }

    public ASTNode getKey() {
        return key;
    }

    public List<ASTNode> getValues() {
        return values;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "CssPropertyNode" + getLineInfo()));

        String newPrefix = nextPrefix(prefix, isTail);

        if (key != null) {
            sb.append(formatLine(newPrefix, values == null || values.isEmpty(), "Key"));
            sb.append(key.toTreeString(nextPrefix(newPrefix, values == null || values.isEmpty()), true));
        }

        if (values != null && !values.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "Values"));
            String valPrefix = nextPrefix(newPrefix, true);

            for (int i = 0; i < values.size(); i++) {
                boolean last = (i == values.size() - 1);
                sb.append(values.get(i).toTreeString(valPrefix, last));
            }
        }

        return sb.toString();
    }
}
