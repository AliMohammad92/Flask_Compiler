package AST.JINJA2;

import AST.ASTNode;
import java.util.Map;

public class JSONNode extends ASTNode {
    private Map<String, ASTNode> jsonData;

    public JSONNode(Map<String, ASTNode> jsonData) {
        this.jsonData = jsonData;
    }

    public void addData(String key, ASTNode value) {
        this.jsonData.put(key, value);
    }

    public ASTNode getByKey(String key) {
        return this.jsonData.get(key);
    }

    public Map<String, ASTNode> getJsonData() {
        return jsonData;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ")
                .append("JSONNode\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");
        int i = 0;
        int size = jsonData.size();

        for (Map.Entry<String, ASTNode> entry : jsonData.entrySet()) {
            boolean last = (++i == size);
            sb.append(childPrefix)
                    .append(last ? "└── " : "├── ")
                    .append("\"")
                    .append(entry.getKey())
                    .append("\": ");

            ASTNode value = entry.getValue();
            if (value != null) {
                String valueStr = value.toTreeString(childPrefix + (last ? "    " : "│   "), true).trim();
                if (!valueStr.contains("\n"))
                    sb.append(valueStr).append("\n");
                else
                    sb.append("\n").append(valueStr).append("\n");
            } else {
                sb.append("null\n");
            }
        }

        return sb.toString();
    }
}
