package SymbolTable;

import java.util.*;

public class SymbolTable {
    public Deque<Scope> scopes = new ArrayDeque<>();
    List<Scope> allScopes = new ArrayList<>();

    public void enterScope(String name) {
        Scope newScope = new Scope(name, currentScope());
        scopes.push(newScope);
        allScopes.add(newScope);
    }

    public void exitScope() {
        if (currentScope() != null) {
            scopes.pop();
        }
    }

    public Scope currentScope() {
        return scopes.peek();
    }

    public void define(Symbol sym) {
        currentScope().define(sym);
    }

    public Symbol resolve(String name) {
        return currentScope().resolve(name);
    }

    public void printTable() {
        System.out.println("=== Symbol Table ===");
        for (Scope scope : allScopes) {
            scope.printScope("  ");
        }
    }

}
