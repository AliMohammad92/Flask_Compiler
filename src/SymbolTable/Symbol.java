package SymbolTable;

import AST.ASTNode;

public class Symbol {
    public String name;
    public enum SymbolType {
        VARIABLE,
        FUNCTION,
        CLASS,
        IDENTIFIER,
        DECORATOR
    }
    private SymbolType type;
    private Object value;
    private String dataType;
    private int line;

    public Symbol(String name, SymbolType type, Object value, String dataType, int line) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.dataType = dataType;
        this.line = line;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-8s | %-19s | %-10s | line %d",
                name,
                type,
                value,
                dataType,
                line);
    }
}
