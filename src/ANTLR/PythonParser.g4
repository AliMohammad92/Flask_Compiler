parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// ------------------- Program -------------------
program
    : (statement)* EOF
    ;
// ------------------- Statements -------------------
statement
    : jinjaBody
    | compoundStatement
    | css
    | simpleStatement (SEMI simpleStatement)*
    | html
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
    : tripleString
    | atom
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
    : IMPORT importSource importName
    ;

fromImport
    : FROM importSource IMPORT importList
    ;

importSource
    : IDENTIFIER #importID
    | STRING     #importSTR
    ;

importList
    : importName (COMMA importName)
    ;

importName
    : IDENTIFIER aliasName?
    ;

aliasName
    : AS IDENTIFIER
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
    : RETURN value (COMMA value)*          #returnValue
    ;

tripleString
    : TRIPLE_STRING
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
    : jinjaIf (jinjaElif)* (jinjaElse)? STMT_START JINJA_ENDIF STMT_END;

jinjaIf
    : JINJA_IF condition=expressions STMT_END templateBody
    ;

jinjaElif
    : STMT_START JINJA_ELIF condition=expressions STMT_END templateBody
    ;

jinjaElse
    : STMT_START JINJA_ELSE STMT_END templateBody
    ;

jinjaFor
    : JINJA_FOR IDENTIFIER IN value STMT_END templateBody STMT_START JINJA_ENDFOR STMT_END
    ;

jinjaSet
    : JINJA_SET IDENTIFIER ASSIGN expressions STMT_END
    ;

jiniaExtends
    : JINJA_EXTENDS atom STMT_END;

jinjaInclude
    : JINJA_INCLUDE atom
      (JINJA_IGNORE JINJA_MISSING)?
      ((JINJA_WITH | JINJA_WITHOUT) JINJA_CONTEXT)?
      STMT_END
    ;


jinjaBlock
    : JINJA_BLOCK IDENTIFIER STMT_END templateBody STMT_START JINJA_ENDBLOCK (IDENTIFIER)? STMT_END
    ;

jinjaLocalVariable
    : JINJA_WITH IDENTIFIER ASSIGN expressions STMT_END templateBody STMT_START JINJA_ENDWITH STMT_END
    ;

// --- Template Body ---
templateBody
    : (htmlElement | jinjaBody | statement)*
    ;

// ------------------- FLASK -------------------
//flask
//    : pythonImport
//    ;
// ------------------- HTML -------------------
html
    : HTML_START htmlElement* HTML_END
    ;

htmlElement
    : htmlTag
    | selfClosingTag
    | jinjaBody
    | htmlText
    ;

htmlTag
    : styleTag
    | genericHtml
    ;

styleTag
    : HTML_STYLE_START css* STYLE_END
    ;

genericHtml
    : TAG_OPEN name=HTML_TAG_NAME htmlAttributes* TAG_CLOSE
      htmlElement*
      TAG_OPEN TAG_SLASH HTML_TAG_NAME TAG_CLOSE
    ;

selfClosingTag
    : TAG_OPEN name=HTML_TAG_NAME htmlAttributes* TAG_SLASH TAG_CLOSE
    ;

htmlAttributes
    : (HTML_ATTR_NAME | CLASS | IDENTIFIER) HTML_ASSIGN attributeValue
    ;

attributeValue
    : STRING                #strAttrValue
    | NUMBER                #numAttrValue
    | IDENTIFIER            #idAttrValue
    | jinjaExpression       #jnjiaAttrValue
    ;

htmlText
    : (parts+=htmlTextPart)+
    ;

htmlTextPart
    : HTML_TEXT          #normalText
    | STRING             #quotedText
    | HTML_TAG_NAME      #tagAsText
    | HTML_ATTR_NAME     #attrAsText
    | IDENTIFIER         #idAsText
    | CLASS              #classAsText
    | NUMBER             #numberAsText
    | jinjaExpression    #jinjaAsText
    ;

// ------------------- CSS -------------------
css
    : cssSelector CSS_PROPERTY_START cssKeyValue* CSS_PROPERTY_END
    ;

cssSelector
    : DOT selectorName                             #classSelector
    | HASHTAG selectorName                         #idSelector
    | selectorName                                 #simpleSelector
    | left=cssSelector CSS_WS right=cssSelector    #descendantSelector
    ;

selectorName
    : CSS_ID (MINUS CSS_ID)*
    ;

cssKeyValue
    : CSS_ID CSS_COLON cssValue CSS_SEMI?
    ;

cssValue
    : CSS_HEX                   #cssHexValue
    | CSS_NUMBER (CSS_TYPE)?    #cssNumValue
    | CSS_ID                    #cssIdValue
    | STRING                    #cssStrValue
    | jinjaExpression           #cssJinjaValue
    ;