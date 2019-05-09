/**
 @AUTHORS Łukasz Bednarski & Patryk Papiór
*/

grammar JavaDog;
// Keywords
AND           : 'and'        ;
FUNCTION      : 'func'       ;
IF            : 'if'         ;
INTEGER       : 'Integer'    ;
REAL          : 'Real'       ;
VAR           : 'claim'      ;
STRING        : 'String'     ;
BEGIN_MARKUP  : '<JD'       ;
END_MARKUP    : 'JD>'       ;
// Operators
ASSIGN        : '='          ;
COMMA         : ','          ;
EQUAL         : '=='         ;
PLUS          : '+'          ;
MINUS         : '-'          ;
STAR          : '*'          ;
SLASH         : '/'          ;
SEMICOLON     : ';'          ;
LPAREN        : '('          ;
RPAREN        : ')'          ;
LCURL         : '{'          ;
RCURL         : '}'          ;
DOT           : '.'          ;


// Atomic values definition
identifier
   : REGEX_ID
   ;
string
    : STRING_REGEX
    ;

unsignedNumber
    : unsignedInteger | unsignedReal
    ;

unsignedInteger
    : REGEX_INT
    ;

unsignedReal
    : REGEX_REAL
    ;

// Program Structure
root
    :  BEGIN_MARKUP body END_MARKUP
    ;

body
    : ( declaration | statement )*
    ;

// declaration
declaration
    : varDeclaration  | functionDeclaration
    ;

varDeclaration
    : VAR identifier SEMICOLON
    ;

functionDeclaration
    : FUNCTION identifier parameters LCURL body RCURL
    ;

parameters
    : LPAREN (singleParameter (COMMA singleParameter)*)* RPAREN
    ;

singleParameter
    : identifier
    ;

statement
    : assignmentStatement | functionCall
    ;

assignmentStatement
    : VAR identifier ASSIGN expression SEMICOLON | identifier ASSIGN expression SEMICOLON
    ;

expression
    : expressionOperand (operator expressionOperand)*
    ;

expressionOperand
    : value | functionCall | identifier
    ;

functionCall
    : identifier parameters SEMICOLON
    ;

value
    : string | unsignedNumber
    ;
operator
    : (STAR | SLASH | PLUS | MINUS)
    ;

REGEX_ID      : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
              ;

REGEX_INT     : ('0'..'9')+
              ;

REGEX_REAL    : ('0'..'9')+ DOT ('0'..'9')+
              ;

REGEX_STRING  : '\'' ('\'\'' | ~ ('\''))* '\''
              ;

REGEX_WS      : ( ' '
              |  '\t'
              |  '\f'
              |  (  '\r\n'
                 |  '\r'
                 |  '\n'
                 )
              )  -> skip
              ;

WS : (' ' | '\t'|'\n' | '\r')+ -> channel(HIDDEN);
