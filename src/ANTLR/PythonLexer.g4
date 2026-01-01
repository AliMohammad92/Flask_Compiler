lexer grammar PythonLexer;

tokens { TAB_IN, TAB_OUT }

@header {
import java.util.*;
}

@members {
    Deque<Integer> indents = new ArrayDeque<>();
    LinkedList<Token> tokens = new LinkedList<>();
    Token lastToken = null;

    void addToken(Token t) {
        tokens.add(t);
    }

    Token createToken(int type, String text) {
        CommonToken t = new CommonToken(type, text);
        t.setLine(getLine());
        t.setCharPositionInLine(getCharPositionInLine());
        return t;
    }

    @Override
    public Token nextToken() {
        if (!tokens.isEmpty()) return tokens.poll();

        Token next = super.nextToken();

        if (next.getType() == EOF) {
            while (!indents.isEmpty()) {
                indents.pop();
                addToken(createToken(TAB_OUT, "<TAB_OUT>"));
            }
            addToken(next);
            return tokens.poll();
        }

        addToken(next);
        if (next.getChannel() != HIDDEN) lastToken = next;
        return tokens.poll();
    }
}

// --- Template Delimiters ---
EXPR_START    : '{{' -> pushMode(JINJA_MODE);
STMT_START    : '{%' -> pushMode(JINJA_MODE);
COMMENT_START : '{#' -> pushMode(JINJA_MODE);

// ------------------- Keywords -------------------
IMPORT     : 'import';
FROM       : 'from';
TRUE       : 'True';
FALSE      : 'False';
NONE       : 'None';
IF         : 'if';
ELIF       : 'elif';
ELSE       : 'else';
FOR        : 'for';
WHILE      : 'while';
DEF        : 'def';
RETURN     : 'return';
PRINT      : 'print';
CLASS      : 'class';
SELF       : 'self';
BREAK      : 'break';
CONTINUE   : 'continue';
PASS       : 'pass';
TRY        : 'try';
EXCEPT     : 'except';
FINALLY    : 'finally';
S_AND      : 'and';
S_OR       : 'or';
NOT        : 'not';
IN         : 'in';
IS         : 'is';
AS         : 'as';
SET        : 'set';
PIPE       : '|';
GLOBAL     : 'global';

// ------------------- Operators -------------------
PLUS       : '+';
MINUS      : '-';
MULTIPLY   : '*';
SLASH      : '/';
MOD        : '%';
LT         : '<';
GT         : '>';
LTE        : '<=';
GTE        : '>=';
EQUAL      : '==';
NEQ        : '!=';
STRICT_EQ  : '===';
STRICT_NEQ : '!==';
ASSIGN     : '=';
AND        : '&&';
OR         : '||';

// ------------------- Symbols -------------------
LPAREN     : '(';
RPAREN     : ')';
LBRACK     : '[';
RBRACK     : ']';
LCBRACK    : '{';
RCBRACK    : '}';
COLON      : ':';
SEMI       : ';';
COMMA      : ',';
DOT        : '.';
HASHTAG    : '#';
AT         : '@';
// ----------------- HTML & CSS -------------------
HTML_START  : '<html>'  -> pushMode(HTML_MODE);

TRIPLE_STRING
    : '"""' .*? '"""'
    ;

// ------------------- Literals -------------------
NUMBER
    : ('+'|'-')? [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

// ------------------- Identifiers -------------------

IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;
// ------------------- Skip Spaces -------------------
COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WS : [ \t\r\n]+ -> skip;


mode JINJA_MODE;
    EXPR_END : '}}' -> popMode;
    STMT_END : '%}' -> popMode;
    COMMENT_END : '#}' -> popMode;

    JINJA_PIPE : '|' ;
    JINJA_DOT : '.' ;
    JINJA_LPAREN : '(' ;
    JINJA_RPAREN : ')' ;
    JINJA_COMMA : ',' ;
    JINJA_COLON : ':' ;
    JINJA_ASSIGN : '=' -> type(ASSIGN);

    // Keywords
    JINJA_IF : 'if' ;
    JINJA_ELIF : 'elif' ;
    JINJA_ELSE : 'else' ;
    JINJA_ENDIF : 'endif' ;
    JINJA_FOR : 'for' ;
    JINJA_ENDFOR : 'endfor' ;
    JINJA_SET : 'set' ;
    JINJA_BLOCK : 'block' ;
    JINJA_ENDBLOCK : 'endblock' ;
    JINJA_EXTENDS : 'extends' ;
    JINJA_INCLUDE : 'include' ;
    JINJA_IGNORE  : 'ignore';
    JINJA_MISSING : 'missing';
    JINJA_WITH : 'with';
    JINJA_ENDWITH : 'endwith';
    JINJA_WITHOUT : 'without';
    JINJA_CONTEXT : 'context';
    JINJA_IN      : 'in'  -> type(IN);
    JINJA_IS      : 'is'  -> type(IS);


    JINJA_IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*  -> type(IDENTIFIER);
    JINJA_STRING : ('"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'') -> type(STRING);
    JINJA_NUMBER : [0-9]+ ('.' [0-9]+)? -> type(NUMBER);

    JINJA_TRUE  : 'True'  -> type(TRUE);
    JINJA_FALSE : 'False' -> type(FALSE);
    JINJA_NONE  : 'None'  -> type(NONE);

    // --- Comparison Operators ---
    J_LT         : '<'   -> type(LT);
    J_GT         : '>'   -> type(GT);
    J_LTE        : '<='  -> type(LTE);
    J_GTE        : '>='  -> type(GTE);
    J_EQUAL      : '=='  -> type(EQUAL);
    J_NEQ        : '!='  -> type(NEQ);
    J_STRICT_EQ  : '===' -> type(STRICT_EQ);
    J_STRICT_NEQ : '!==' -> type(STRICT_NEQ);

    // --- Mathematical Operators ---
    J_PLUS       : '+'   -> type(PLUS);
    J_MINUS      : '-'   -> type(MINUS);
    J_MULTIPLY   : '*'   -> type(MULTIPLY);
    J_SLASH      : '/'   -> type(SLASH);
    J_MOD        : '%'   -> type(MOD);

    // --- Logical Operators (Jinja-style) ---
    J_AND_WORD   : 'and' -> type(S_AND);
    J_OR_WORD    : 'or'  -> type(S_OR);
    J_NOT_WORD   : 'not' -> type(NOT);

    J_AND_SYM    : '&&'  -> type(AND);
    J_OR_SYM     : '||'  -> type(OR);

    JINJA_WS : [ \t\r\n]+ -> skip ;
    //JINJA_COMMENT : . -> skip ;

mode CSS_MODE;
    CSS_WS : [ \t\r\n]+ -> skip;
    CSS_EXPR_START  : '{{' -> type(EXPR_START), pushMode(JINJA_MODE);
    CSS_PROPERTY_START : '{' ;
    CSS_PROPERTY_END : '}' ;
    CSS_COLON : ':' ;
    CSS_SEMI : ';' ;
    CSS_NUMBER : ('+'|'-')? [0-9]+ ('.' [0-9]+)? ;
    CSS_TYPE   : ('px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'deg' | 's' | 'ms') ;
    CSS_COM_S  : '/*';
    CSS_COM_E  : '*/';

    STYLE_END : '</style>' -> popMode;

    CSS_ID : [a-zA-Z_][a-zA-Z_\-0-9]* ;
    CSS_HEX : '#' [a-fA-F0-9]+ ;

    CSS_UNKOWN: . -> popMode;

mode HTML_MODE;

    HTML_EXPR_START  : '{{' -> type(EXPR_START), pushMode(JINJA_MODE);
    HTML_STMT_START  : '{%' -> type(STMT_START), pushMode(JINJA_MODE);

    HTML_STYLE_START : '<style>' -> pushMode(CSS_MODE);
    HTML_END         : '</html>' -> popMode;

    TAG_OPEN         : '<';
    TAG_CLOSE        : '>';
    TAG_SLASH        : '/';
    HTML_ASSIGN      : '=';

    HTML_STRING      : ('"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'') -> type(STRING);

    HTML_NUMBER      : ('+'|'-')? [0-9]+ ('.' [0-9]+)? -> type(NUMBER);
    HTML_CLASS       : 'class'                         -> type(CLASS);
    HTML_TAG_NAME    : [a-zA-Z][a-zA-Z0-9]*;
    HTML_ATTR_NAME   : [a-zA-Z_][a-zA-Z0-9_-]*;

    HTML_TEXT        : ~[<>{}/ \t\r\n='"]+ ;

    HTML_WS : [ \t\r\n]+ -> skip;