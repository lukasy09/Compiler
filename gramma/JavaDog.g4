/**
 @AUTHORS Łukasz Bednarski & Patryk Papiór
*/

grammar JavaDog;
// Keywords
AND           : 'and'        ;
FUNCTION      : 'func'       ;
IF            : 'if'         ;
WHILE         : 'while'      ;
INTEGER       : 'Integer'    ;
RETURN        : 'return'     ;
REAL          : 'Real'       ;
VAR           : 'claim'      ;
STRING        : 'String'     ;
BEGIN_MARKUP  : '<?JD'       ;
END_MARKUP    : '?JD>'       ;
// Operators
ASSIGN        : '='          ;
COMMA         : ','          ;
EQUAL         : '=='         ;
LESS_THAN     : '<'          ;
MORE_THAN     : '>'          ;
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
    : INT_REGEX
    ;

unsignedReal
    : REAL_REGEX
    ;

// Program Structure
root
    :  BEGIN_MARKUP body END_MARKUP
    ;

body
    : ( declaration | statement | functionDefinition )*
    ;

// declaration
declaration
    : varDeclaration
    ;

varDeclaration
    : VAR identifier SEMICOLON
    ;

functionDefinition
    : FUNCTION identifier parameters LCURL body RCURL
    ;

// Provides a list of parameters passed into our function definition e.g func foo(str_1, num_1,str_2) { //body... }
parameters
    : LPAREN (singleParameter (COMMA singleParameter)*)* RPAREN
    ;

singleParameter
    : identifier
    ;

statement
    : (assignmentStatement | functionCall | instruction)
    ;

assignmentStatement
    : VAR identifier ASSIGN expression SEMICOLON | identifier ASSIGN expression SEMICOLON | VAR identifier ASSIGN functionCall SEMICOLON | identifier ASSIGN functionCall SEMICOLON
    ;

instruction
    : ifStatement | whileLoop
    ;

ifStatement
    : IF LPAREN (boolValue | expression) RPAREN LCURL (statement)* RCURL
    ;

whileLoop
    : WHILE LPAREN boolValue RPAREN LCURL (statement)* RCURL
    ;

boolValue
    : value | expressionOperand
    ;
expression
    : expressionOperand (operator expressionOperand)*
    ;

expressionOperand
    : value | functionCall | identifier
    ;

functionCall
    : identifier arguments SEMICOLON
    ;

arguments
    : LPAREN (singleArgument (COMMA singleArgument)*)* RPAREN
    ;


singleArgument
    : identifier | value
    ;

value
    : string | unsignedNumber
    ;

operator
    : (STAR | SLASH | PLUS | MINUS | LESS_THAN | MORE_THAN | EQUAL)
    ;

REGEX_ID      : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
              ;

INT_REGEX     : ('0'..'9')+
              ;

REAL_REGEX    : ('0'..'9')+ DOT ('0'..'9')+
              ;

STRING_REGEX  : '\'' ('\'\'' | ~ ('\''))* '\''
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
