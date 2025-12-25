parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// ------------------- Program -------------------
program
    : (statement)* EOF
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
    : pythonImport
    | assignment
    | printStatement
    | returnStatement
    | functionCall
    | globalStatement
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
    | json
    | functionCall
    | listComprehension
    ;

list
    : LBRACK elements RBRACK
    ;

listComprehension
    : LBRACK atom FOR IDENTIFIER IN value (IF expressions)? RBRACK
    ;

tuple
    : LPAREN elements RPAREN
    ;

elements
    : value? (COMMA value)*
    ;

json
    : LCBRACK (jsonData (COMMA jsonData)*)? RCBRACK
    ;

jsonData
    :  STRING COLON value
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
    | valuesExp                                                                #ValueExp
    ;

logicalExpressions
    : left=logicalExpressions (AND | S_AND) right=logicalExpressions           #AndExp
    | left=logicalExpressions (OR  | S_OR) right=logicalExpressions            #OrExp
    | NOT item=logicalExpressions                                              #NotExp
    | comparisonExpressions                                                    #CompAsLogical
    | valuesExp                                                                #ValuesAsLogical
    ;

valuesExp
    : atom
    | functionCall
    ;

atom
    : primaryAtom postfix*   #AtomWithAccess
    ;

primaryAtom
    : IDENTIFIER                 #Id
    | NUMBER                     #Number
    | STRING                     #String
//    | LPAREN expressions RPAREN  #Paren
    | TRUE                       #True
    | FALSE                      #False
    ;

postfix
    : DOT (IDENTIFIER | functionCall)     #DotAccess
    | LBRACK (expressions | atom) RBRACK  #IndexAccess
    ;

globalStatement
    : GLOBAL IDENTIFIER (COMMA IDENTIFIER)*
    ;
// ------------------- Import Statement -------------------

pythonImport
    : importSyntax
    | fromImport
    ;

importSyntax
    : IMPORT IDENTIFIER (AS IDENTIFIER)? #idImport
    | IMPORT STRING (AS IDENTIFIER)?     #strImport
    ;

fromImport
    : FROM IDENTIFIER IMPORT importedNames #idFromImport
    | FROM STRING IMPORT importedNames     #strFromImport
    ;

importedNames
    : importsAliases (COMMA importsAliases)*
    ;

importsAliases
    : IDENTIFIER (AS IDENTIFIER)?
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
    : IF LPAREN? condition=logicalExpressions RPAREN? block
    ;

elifBlock
    : ELIF LPAREN? condition=logicalExpressions RPAREN? block
    ;

elseBlock
    : ELSE block
    ;

// ------------------- Loops -------------------
forLoop
    : FOR IDENTIFIER IN iterable=value block;

whileLoop
    : WHILE LPAREN expressions RPAREN block;

// ------------------- Function -------------------
function
    : decorator_rule* DEF IDENTIFIER LPAREN parameters? RPAREN block;

parameters
    : parameter (COMMA parameter)*;

parameter
    : IDENTIFIER (ASSIGN value)?;

returnStatement
    : RETURN value?
    ;

functionCall
    : IDENTIFIER LPAREN argument* RPAREN
    ;

argument
    : (IDENTIFIER ASSIGN)? value COMMA?
    ;

decorator_rule
    : AT atom  #Decorator
    ;

// ------------------- CLASS -------------------
classDef
    : decorator_rule* CLASS IDENTIFIER baseClass? block
    ;

baseClass: (LPAREN IDENTIFIER RPAREN);

// ------------------- JINJA2 -------------------
jinjaBody
    : jinjaExpression
    | jinjaStatement
    | jinjaComment
    ;

jinjaExpression
    : EXPR_START (atom | expressions | value) jinjaFilter* EXPR_END
    ;

jinjaFilter
    : PIPE (IDENTIFIER | functionCall)
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
    | importSyntax STMT_END
    | fromImport STMT_END
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

// ------------------- FLASK -------------------
//flask
//    : pythonImport
//    ;

// ------------------- HTML -------------------
html
    : htmlElement+
    ;

htmlElement
    : htmlTag
    | selfClosingTag
    | htmlText
    ;

htmlTag
    : styleTag
    | genericHtml
    ;

styleTag
    : LT STYLE htmlAttributes* GT css* LT SLASH STYLE GT
    ;

genericHtml
    : LT IDENTIFIER htmlAttributes* GT htmlBody? LT SLASH IDENTIFIER GT
    ;

selfClosingTag
    : LT IDENTIFIER htmlAttributes* SLASH GT
    ;

htmlAttributes
    : attributeName ASSIGN attributeValue
    ;

attributeName
    : IDENTIFIER
    | CLASS
    ;

attributeValue
    : STRING
    ;

htmlBody
    : (htmlElement
    | htmlText
    | jinjaBody
    )+
    ;

htmlText
    : (IDENTIFIER
    | STRING
    | jinjaExpression
    )+
    ;

// ------------------- CSS -------------------
css
    : cssSelector (COMMA cssSelector)* LCBRACK (cssKeyValue)* RCBRACK
    | cssComment
    ;

cssSelector
    : (DOT | HASHTAG)? cssKey (COLON cssKey)*
    ;

cssKeyValue
    : cssKey COLON cssValue SEMI?
    ;

cssKey
    : IDENTIFIER (MINUS IDENTIFIER?)*
    ;

cssValue
    : NUMBER (TYPE)?                    #cssVNumber
    | IDENTIFIER                        #cssVId
    | HASHTAG_VALUE                     #cssVColor
    | STRING                            #cssVStr
    | jinjaExpression                   #cssVJinja
    ;

cssComment
    : CSS_COM_S (.)? CSS_COM_E
    ;