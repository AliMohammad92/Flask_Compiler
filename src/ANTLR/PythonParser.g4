parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// ------------------- Program -------------------
program
    : (statement | NEWLINE)* EOF
    ;

// ------------------- Statements -------------------
statement
    : simpleStatement (SEMI simpleStatement)*
    | compoundStatement
    | html
    | css
    | jinjaBody
    ;

simpleStatement
    : assignment
    | printStatement
    | returnStatement
    ;

compoundStatement
    : ifStatement
    | forLoop
    | whileLoop
    | function
    | classDef
    | expressions
    ;

// ------------------- Assignments & Values -------------------
assignment
    : IDENTIFIER ASSIGN value
    ;

value
    : atom
    | expressions
    | list
    | tuple
    | functionCall
    ;

list
    : LBRACK elements RBRACK
    ;

tuple
    : LPAREN elements RPAREN
    ;

elements
    : value? (COMMA value)*
    ;

// ------------------- Expressions -------------------
expressions
    : logicalExpressions
    | comparisonExpressions
    | mathematicalExpressions
    ;

comparisonExpressions
    : left=mathematicalExpressions LT right=mathematicalExpressions            #LtExp
    | left=mathematicalExpressions GT right=mathematicalExpressions            #GtExp
    | left=mathematicalExpressions LTE right=mathematicalExpressions           #LteExp
    | left=mathematicalExpressions GTE right=mathematicalExpressions           #GteExp
    | left=mathematicalExpressions EQUAL right=mathematicalExpressions         #EqExp
    | left=mathematicalExpressions STRICT_EQ right=mathematicalExpressions     #StrictEqExp
    | left=mathematicalExpressions NEQ right=mathematicalExpressions           #NeExp
    | left=mathematicalExpressions STRICT_NEQ right=mathematicalExpressions    #StrictNeqExp
    | left=mathematicalExpressions IS NOT? right=mathematicalExpressions       #IdComparison
    | left=mathematicalExpressions IN right=mathematicalExpressions            #MembershipTest
    ;

mathematicalExpressions
    : left=mathematicalExpressions PLUS right=mathematicalExpressions          #AddExp
    | left=mathematicalExpressions MINUS right=mathematicalExpressions         #SubExp
    | left=mathematicalExpressions MULTIPLY right=mathematicalExpressions      #MulExp
    | left=mathematicalExpressions SLASH right=mathematicalExpressions         #DivExp
    | left=mathematicalExpressions MOD right=mathematicalExpressions           #ModExp
    | atom                                                                     #AtomMath
    ;

logicalExpressions
    : left=logicalExpressions (AND | S_AND) right=logicalExpressions           #AndExp
    | left=logicalExpressions (OR  | S_OR) right=logicalExpressions            #OrExp
    | NOT item=logicalExpressions                                              #NotExp
    | comparisonExpressions                                                    #CompAsLogical
    | atom                                                                     #AtomAsLogical
    ;

atom
    : primaryAtom postfix*   #AtomWithAccess
    ;

primaryAtom
    : IDENTIFIER                 #Id
    | NUMBER                     #Number
    | STRING                     #String
    | LPAREN expressions RPAREN  #Paren
    | TRUE                       #True
    | FALSE                      #False
    ;

postfix
    : DOT IDENTIFIER                      #DotAccess
    | LBRACK (expressions | atom) RBRACK  #IndexAccess
    ;

// ------------------- Print Statement -------------------
printStatement
    : PRINT LPAREN printArgs? RPAREN
    ;

printArgs
    : value (COMMA value)*
    | expressions (COMMA? expressions)*
    ;

// ------------------- Block -------------------
block
    : LCBRACK statement* RCBRACK
    ;

// ------------------- If / Conditional Statements -------------------
ifStatement
    : ifBlock (elifBlock)* (elseBlock)?
    ;

ifBlock
    : IF LPAREN condition=logicalExpressions RPAREN block
    ;

elifBlock
    : ELIF LPAREN condition=logicalExpressions RPAREN block
    ;

elseBlock
    : ELSE block
    ;

// ------------------- Loops -------------------

forLoop: FOR IDENTIFIER IN iterable=value block;
whileLoop: WHILE LPAREN expressions RPAREN block;

// ------------------- Function -------------------

function: DEF IDENTIFIER LPAREN parameters? RPAREN block;

parameters: parameter (COMMA parameter)*;

parameter: IDENTIFIER (ASSIGN value)?;

returnStatement
    : RETURN value?
    ;

functionCall
    : IDENTIFIER LPAREN (value (COMMA value)*)? RPAREN
    ;

// ------------------- CLASS -------------------

classDef
    : CLASS IDENTIFIER baseClass? block
    ;

baseClass: (LPAREN IDENTIFIER RPAREN);

// ------------------- JINJA2 -------------------
jinjaBody
    : jinjaExpression
    | jinjaStatement
    | jinjaComment
    ;

jinjaExpression
    : EXPR_START (expressions | atom) EXPR_END
    ;

jinjaComment
    : COMMENT_START .*? COMMENT_END
    ;

jinjaStatement
    : STMT_START jinjaStatementContent
    ;

jinjaStatementContent
    : jinjaIfStatements
    | jinjaFor
    | jinjaSet
    | jiniaExtends
    | jinjaInclude
    | jinjaBlock
    | jinjaLocalVariable
    | PRINT expressions
    ;

jinjaIfStatements
    : jinjaIf (jinjaElif)* (jinjaElse)? STMT_START ENDIF STMT_END;

jinjaIf
    : IF condition=expressions STMT_END templateBody
    ;

jinjaElif
    : STMT_START ELIF condition=expressions STMT_END templateBody
    ;

jinjaElse
    : STMT_START ELSE STMT_END templateBody
    ;

jinjaFor
    : FOR IDENTIFIER IN value STMT_END templateBody STMT_START ENDFOR STMT_END
    ;

jinjaSet
    : SET IDENTIFIER ASSIGN expressions STMT_END
    ;

jiniaExtends
    : EXTENDS atom STMT_END;

jinjaInclude
    : INCLUDE atom
      (IGNORE MISSING)?
      ((WITH | WITHOUT) CONTEXT)?
      STMT_END
    ;

jinjaBlock
    : BLOCK IDENTIFIER STMT_END templateBody STMT_START ENDBLOCK (IDENTIFIER)? STMT_END
    ;

jinjaLocalVariable
    : WITH IDENTIFIER ASSIGN expressions STMT_END templateBody STMT_START ENDWITH STMT_END
    ;

// --- Template Body ---
templateBody
    : (html | jinjaBody | statement)*
    ;

// ------------------- HTML -------------------
html
    : htmlElement+
    ;

htmlElement
    : htmlTag (htmlElement | htmlExpressions)* closingHtmlTag
    | selfClosingTag
    ;

htmlTag
    : LT IDENTIFIER htmlTagData* GT
    ;

closingHtmlTag
    : LT SLASH IDENTIFIER GT
    ;

selfClosingTag
    : LT IDENTIFIER htmlTagData* SLASH? GT
    ;

htmlTagData
    : IDENTIFIER ASSIGN STRING
    | CLASS ASSIGN STRING
    ;

htmlExpressions
    : STRING
    | NUMBER
    | IDENTIFIER
    ;

// ------------------- CSS -------------------
css
    : cssSelector (COMMA cssSelector)* LCBRACK (cssKeyValue)* RCBRACK
    ;

cssSelector
    : (DOT | HASHTAG)? cssKey (COLON cssKey)*
    ;

cssKey
    : IDENTIFIER (MINUS IDENTIFIER?)*
    ;

cssKeyValue
    : cssKey COLON cssValue (SEMI)?
    ;

cssValue
    : NUMBER (TYPE)?
    | IDENTIFIER
    | HASHTAG IDENTIFIER
    | STRING
    ;
