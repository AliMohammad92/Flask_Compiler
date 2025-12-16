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
EXPR_START : '{{' ;
EXPR_END   : '}}' ;
STMT_START : '{%' ;
STMT_END   : '%}' ;
COMMENT_START : '{#' ;
COMMENT_END   : '#}' ;

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
TYPE       : 'type';
// ------------------- JINJA2 -------------------
INCLUDE    : 'include';
EXTENDS    : 'extends';
ENDIF      : 'endif';
ENDFOR     : 'endfor';
IGNORE     : 'ignore';
MISSING    : 'missing';
WITH       : 'with';
ENDWITH    : 'endwith';
WITHOUT    : 'without';
CONTEXT    : 'context';
BLOCK      : 'block';
ENDBLOCK   : 'endblock';

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

CSS_COM_S  : '/*';
CSS_COM_E  : '*/';

// ------------------- HTML -------------------
HTML       : 'html';
HEAD       : 'head';
BODY       : 'body';
TITLE      : 'title';
META       : 'meta';
LINK       : 'link';
STYLE      : 'style';
SCRIPT     : 'script';

DIV        : 'div';
SPAN       : 'span';
P          : 'p';
A          : 'a';
IMG        : 'img';
SRC        : 'src';
HREF       : 'href';
ALT        : 'alt';
LANG       : 'lang';

H1         : 'h1';
H2         : 'h2';
H3         : 'h3';
H4         : 'h4';
H5         : 'h5';
H6         : 'h6';

UL         : 'ul';
OL         : 'ol';
LI         : 'li';

TABLE      : 'table';
TR         : 'tr';
TD         : 'td';
TH         : 'th';

INPUT      : 'input';
FORM       : 'form';
BUTTON     : 'button';
LABEL      : 'label';
SELECT     : 'select';
OPTION     : 'option';
TEXTAREA   : 'textarea';

ID         : 'id';
NAME       : 'name';
VALUE      : 'value';
CONTENT    : 'content';
REL        : 'rel';

BR         : 'br';
HR         : 'hr';

// ------------------- Literals -------------------
NUMBER
    : ('+'|'-')? [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

// ------------------- Identifiers -------------------
HTMLTEXT
    : (~[<>{}] | '{' ~[{#%])*?
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// ------------------- Skip Spaces -------------------
COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WS : [ \t\r\n]+ -> skip;
