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
SET        : 'set';

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

// ------------------- Literals -------------------
NUMBER
    : ('+'|'-')? [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

//TEXT : (~[{] | '{' ~[{%#])*;

// ------------------- Identifiers -------------------
IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// ------------------- Whitespace & Indent -------------------
//NEWLINE
// : ('\r'? '\n') [ \t]* {
//       String text = getText().replaceAll("[\r\n]+", "");
//       int indent = text.length();
//
//       // skip blank lines
//       if (text.isEmpty()) {
//           skip();
//           return;
//       }
//
//       int previous = indents.isEmpty() ? 0 : indents.peek();
//
//       if (indent > previous) {
//           indents.push(indent);
//           addToken(createToken(PythonLexer.TAB_IN, "<TAB_IN>"));
//       } else if (indent < previous) {
//           while (!indents.isEmpty() && indent < indents.peek()) {
//               indents.pop();
//               addToken(createToken(PythonLexer.TAB_OUT, "<TAB_OUT>"));
//           }
//       }
//
//       // always add NEWLINE token
//       addToken(createToken(NEWLINE, "\n"));
// }
// ;

// ------------------- Skip Spaces -------------------
COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WS : [ \t\r\n]+ -> skip;
