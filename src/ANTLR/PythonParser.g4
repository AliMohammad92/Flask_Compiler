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
//    | flask
    ;

simpleStatement
    : pythonImport
    | assignment
    | printStatement
    | returnStatement
    | functionCall
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
//    | LPAREN expressions RPAREN  #Paren
    | TRUE                       #True
    | FALSE                      #False
    ;

postfix
    : DOT (IDENTIFIER | functionCall)     #DotAccess
    | LBRACK (expressions | atom) RBRACK  #IndexAccess
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

function: decorator_rule* DEF IDENTIFIER LPAREN parameters? RPAREN block;

parameters: parameter (COMMA parameter)*;

parameter: IDENTIFIER (ASSIGN value)?;

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
    | htmlButton
    | htmlForm
    | htmlText
    ;

htmlTag
    : LT HTML htmlAttributes* GT htmlBody LT SLASH HTML GT           #htmlRoot
    | LT HEAD htmlAttributes* GT htmlBody LT SLASH HEAD GT           #headTag
    | LT BODY htmlAttributes* GT htmlBody LT SLASH BODY GT           #bodyTag
    | LT DIV htmlAttributes* GT htmlBody LT SLASH DIV GT             #divTag
    | LT SPAN htmlAttributes* GT htmlBody LT SLASH SPAN GT           #spanTag
    | LT P htmlAttributes* GT htmlBody LT SLASH P GT                 #pTag
    | LT A htmlAttributes* GT htmlBody LT SLASH A GT                 #aTag
    | LT H1 htmlAttributes* GT htmlBody LT SLASH H1 GT               #h1Tag
    | LT H2 htmlAttributes* GT htmlBody LT SLASH H2 GT               #h2Tag
    | LT H3 htmlAttributes* GT htmlBody LT SLASH H3 GT               #h3Tag
    | LT H4 htmlAttributes* GT htmlBody LT SLASH H4 GT               #h4Tag
    | LT H5 htmlAttributes* GT htmlBody LT SLASH H5 GT               #h5Tag
    | LT H6 htmlAttributes* GT htmlBody LT SLASH H6 GT               #h6Tag
    | LT TABLE htmlAttributes* GT htmlBody LT SLASH TABLE GT         #tableTag
    | LT TR htmlAttributes* GT htmlBody LT SLASH TR GT               #trTag
    | LT TD htmlAttributes* GT htmlBody LT SLASH TD GT               #tdTag
    | LT TH htmlAttributes* GT htmlBody LT SLASH TH GT               #thTag
    | LT UL htmlAttributes* GT htmlBody LT SLASH UL GT               #ulTag
    | LT OL htmlAttributes* GT htmlBody LT SLASH OL GT               #olTag
    | LT LI htmlAttributes* GT htmlBody LT SLASH LI GT               #liTag
    ;


selfClosingTag
    : LT META htmlAttributes* SLASH GT
    | LT LINK htmlAttributes* SLASH GT
    | LT IMG htmlAttributes* SLASH GT
    | LT INPUT htmlAttributes* SLASH GT
    | LT BR SLASH GT
    | LT HR SLASH GT
    ;

htmlAttributes
    : attributeName ASSIGN attributeValue
    ;

attributeName
    : CLASS
    | ID
    | NAME
    | TYPE
    | VALUE
    | HREF
    | SRC
    | ALT
    | REL
    | CONTENT
    | LANG
    ;

attributeValue
    : STRING
    ;

htmlBody
    : htmlElement*
    ;

htmlButton
    : LT BUTTON htmlAttributes* GT htmlBody LT SLASH BUTTON GT
    ;

htmlForm
    : LT FORM htmlAttributes* GT htmlBody LT SLASH FORM GT
    ;

htmlText
    : (HTMLTEXT | jinjaExpression | jinjaStatement)+
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

cssComment
    : CSS_COM_S (.)? CSS_COM_E
    ;