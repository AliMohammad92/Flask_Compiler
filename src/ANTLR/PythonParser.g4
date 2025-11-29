parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

program
        : statement* EOF
        ;

statement
        : assignment
        | value
        | list
        ;

assignment
        : IDENTIFIER ASSIGN value
        ;

operations
        : logicalOperations
        | mathematicalOperations
        ;

logicalOperations
    : left=atom LT right=atom            #LtOp
    | left=atom GT right=atom            #GtOp
    | left=atom EQUAL right=atom         #EqOp
    | left=atom STRICT_EQUAL right=atom  #StrictEqOp
    | left=atom NEQ right=atom           #NeqOp
    | left=atom STRICT_NEQ right=atom    #StrictNeqOp
    ;

mathematicalOperations
    : left=atom PLUS right=atom     #AddOp
    | left=atom MINUS right=atom    #SubOp
    | left=atom MULTIPLY right=atom #MulOp
    | left=atom DIVIDE right=atom   #DivOp
    | left=atom MOD right=atom      #ModOp
    ;

atom
    : IDENTIFIER #id
    | NUMBER #number
    | STRING #string
    | (LPAREN operations RPAREN) #paren
    | TRUE #true
    | FALSE #false
    ;

list
    : LBRACK elements? RBRACK;

elements
    : value (COMMA value)*
    ;

value
    : atom
    | operations
    | list
    ;