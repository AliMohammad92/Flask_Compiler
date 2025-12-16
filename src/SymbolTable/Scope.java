package SymbolTable;

import java.util.*;

public class Scope {
    String name;
    public Map<String, Symbol> symbols = new HashMap<>();
    Scope parent;

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }

    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
    }

    public Symbol resolve(String name) {
        Symbol sym = symbols.get(name);
        if (sym != null) return sym;
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public void printScope(String indent) {
        System.out.println(indent + "Scope: " + name);
        System.out.println(indent + "Symbols:");
        for (Symbol sym : symbols.values()) {
            System.out.println(indent + "  " + sym);
        }
        System.out.println();
    }

}
