let Helper = require("./helper.js");

class Lexer {

    constructor() {
        this.tokens = [];

        this.separators = [" ", "\t", "\n", ".", ",", ";", "(", ")", "{", "}", "[", "]"];
        this.operators = ["+", "-", "*", "/", "=", "==", "<", ">"]
    }

    lex(str) {

        let index = 0;
        let char = str[index];
        while (char !== undefined) {

            if (Helper.isIn(char, this.separators)) {
                this.tokens.push(["separator", char]);
            } else if (Helper.checkIfKeyword(str, index).isKeyword) {
                let obj = Helper.checkIfKeyword(str, index);
                this.tokens.push(["keyword", obj.keywordName]);
                index += obj.offset;
                char = str[index];
                continue;

            } else if (Helper.checkIfBoolLiteral(str, index).isLiteral) {
                let obj = Helper.checkIfBoolLiteral(str, index);
                this.tokens.push(["literal", obj.literalValue]);
                index += obj.offset;
                char = str[index];
                continue;

            } else if (Helper.checkIfNumericLiteral(str, index).isLiteral) {
                let obj = Helper.checkIfNumericLiteral(str, index);
                this.tokens.push(["literal", obj.literalValue]);
                index += obj.offset;
                char = str[index];
                continue;
            }
            else if (Helper.isString(str, index)) {
                let obj = Helper.scanString(str, index + 1);
                this.tokens.push(["literal", obj.literalValue]);
                index += obj.offset + 2;
                char = str[index];
                continue;

            } else if (Helper.isIn(char, this.operators)) {
                this.tokens.push(["operator", char]);


            } else if (Helper.checkIfIdentifier(str, index).isIdentifier) {
                let obj = Helper.checkIfIdentifier(str, index);
                this.tokens.push(["identifier", obj.identifierName]);
                index += obj.offset;
                char = str[index];
                continue;
            }

            index++;
            char = str[index];

        }
    }
}

lexer = new Lexer();
lexer.lex(`var tmp= "ab"; if(a>b){varxd = 22}`);

console.log(lexer.tokens);