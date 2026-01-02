package AST.JINJA2;

import AST.ASTNode;
import AST.CSS.CssNode;

import java.util.List;

public class JSONNode extends ASTNode {
    private List<JSONData> data;

    public JSONNode(List<JSONData> data) {
        this.data = data;
    }

    public List<JSONData> getData() {
        return data;
    }

    public void setData(List<JSONData> data) {
        this.data = data;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();

        sb.append(prefix)
                .append(isTail ? "└── " : "├── ").append("JSONNode").append(getLineInfo()).append("\n");

        String childPrefix = prefix + (isTail ? "    " : "│   ");

        for (int i = 0; i < data.size(); i++) {
            JSONData node = data.get(i);
            sb.append(node.toTreeString(childPrefix, i == data.size() - 1));
        }

        return sb.toString();
    }
}
