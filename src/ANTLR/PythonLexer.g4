lexer grammar PythonLexer;

// Keywords
FALSE      : 'False';
AWAIT      : 'await';
ELSE       : 'else';
IMPORT     : 'import';
PASS       : 'pass';
NONE       : 'None';
BREAK      : 'break';
EXCEPT     : 'except';
IN         : 'in';
RAISE      : 'raise';
TRUE       : 'True';
CLASS      : 'class';
FINALLY    : 'finally';
IS         : 'is';
RETURN     : 'return';
AND        : 'and';
CONTINUE   : 'continue';
FOR        : 'for';
LAMBDA     : 'lambda';
TRY        : 'try';
AS         : 'as';
DEF        : 'def';
FROM       : 'from';
NONLOCAL   : 'nonlocal';
WHILE      : 'while';
ASSERT     : 'assert';
DEL        : 'del';
GLOBAL     : 'global';
NOT        : 'not';
WITH       : 'with';
ASYNC      : 'async';
ELIF       : 'elif';
IF         : 'if';
OR         : 'or';
YIELD      : 'yield';

// Operation
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';

// Sympols
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LT: '<';
GT: '>';
ASSIGN: '=';
EQUAL: '==';
STRICT_EQUAL: '===';
NEQ: '!=';
STRICT_NEQ: '!==';
MOD: '%';
SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
QUESTION: '?';


NUMBER: ('+' | '-')? ([0-9]+ ('.' [0-9]+)? ([eE] ('+' | '-')? [0-9]+)? );
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';
WS: [ \t\r\n] -> skip;