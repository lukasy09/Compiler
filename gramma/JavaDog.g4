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
VAR           : 'make'       ;
STRING        : 'String'     ;
BEGIN_MARKUP  : '<JD '       ;
END_MARKUP    : ' JD>'       ;
// Operators
ASSIGN        : ':='         ;
EQUAL         : '='          ;
PLUS          : '+'          ;
MINUS         : '-'          ;
STAR          : '*'          ;
SLASH         : '/'          ;
SEMICOLON     : ';'          ;
LPAREN        : '('          ;
RPAREN        : ')'          ;

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
program
    :  BEGIN_MARKUP block END_MARKUP
    ;
