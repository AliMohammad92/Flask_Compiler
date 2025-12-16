package AST;
import org.antlr.runtime.tree.TreeWizard.Visitor;

import java.util.*;

public class ProgramNode extends ASTNode {
    public List<ASTNode> statements = new ArrayList<>();

    public void addStatement(ASTNode node) {
        statements.add(node);
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ProgramNode"));
        for (int i = 0; i < statements.size(); i++)
            sb.append(statements.get(i).toTreeString(nextPrefix(prefix, isTail), i == statements.size() - 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ProgramNode{" +
                "statements=" + statements.toString() +
                '}';
    }
}
