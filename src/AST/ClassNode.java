package AST;

import org.antlr.runtime.tree.TreeWizard;

import java.util.ArrayList;
import java.util.List;

public class ClassNode extends ASTNode {
    private String name;
    private String baseClass;
    private List<AssignmentNode> variables;
    private List<FunctionNode> methods;
    private List<ClassNode> nestedClasses;
    private List<DecoratorNode> decorators;


    public ClassNode(String name, String baseClass) {
        this.name = name;
        this.baseClass = baseClass;
        this.variables = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.nestedClasses = new ArrayList<>();
    }

    public void addVariable(AssignmentNode var) {
        variables.add(var);
    }

    public void addMethod(FunctionNode fn) {
        methods.add(fn);
    }

    public void addNestedClass(ClassNode cls) {
        nestedClasses.add(cls);
    }

    public void setDecorators(List<DecoratorNode> decorators) {
        this.decorators = decorators;
    }

    public List<AssignmentNode> getVariables() {
        return variables;
    }

    public List<FunctionNode> getMethods() {
        return methods;
    }

    public List<ClassNode> getNestedClasses() {
        return nestedClasses;
    }

    @Override
    public String toTreeString(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(formatLine(prefix, isTail, "ClassNode(" + name + (baseClass != null ? " : " + baseClass : "") + ")" + getLineInfo()));
        String newPrefix = nextPrefix(prefix, isTail);
        if (variables != null && !variables.isEmpty()) {
            sb.append(formatLine(newPrefix, false, "Variables" + getLineInfo()));
            for (int i = 0; i < variables.size(); i++)
                sb.append(variables.get(i).toTreeString(nextPrefix(newPrefix, false), i == variables.size() - 1));
        }
        if (methods != null && !methods.isEmpty()) {
            sb.append(formatLine(newPrefix, false, "Methods" + getLineInfo()));
            for (int i = 0; i < methods.size(); i++)
                sb.append(methods.get(i).toTreeString(nextPrefix(newPrefix, false), i == methods.size() - 1));
        }
        if (nestedClasses != null && !nestedClasses.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "NestedClasses" + getLineInfo()));
            for (int i = 0; i < nestedClasses.size(); i++)
                sb.append(nestedClasses.get(i).toTreeString(nextPrefix(newPrefix, true), i == nestedClasses.size() - 1));
        }

        if (decorators != null && !decorators.isEmpty()) {
            sb.append(formatLine(newPrefix, true, "Decorators" + getLineInfo()));
            for (int i = 0; i < decorators.size(); i++)
                sb.append(decorators.get(i).toTreeString(nextPrefix(newPrefix, true), i == decorators.size() - 1));
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return name;
    }
}