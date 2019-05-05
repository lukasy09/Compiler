let Helper = require("./Helper.js");
let loadContentFromFile = require('../others/FileLoader');

class Lexer {

    constructor() {
        this.tokens = [];
    }

    lex(str) {

        let index = 0;
        let char = str[index];
        let obj;
        while (char !== undefined) {

            if (Helper.isSeparator(str, index)) {
                this.tokens.push(["separator", char]);
                index++;
                char = str[index];
                continue;

            } else if (Helper.isOperator(str, index)) {
                obj = Helper.scanOperator(str, index);
                this.tokens.push(["operator", obj.operatorValue]);

            } else if (Helper.checkIfKeyword(str, index).isKeyword) {
                obj = Helper.checkIfKeyword(str, index);
                this.tokens.push(["keyword", obj.keywordName]);

            } else if (Helper.checkIfBoolLiteral(str, index).isLiteral) {
                obj = Helper.checkIfBoolLiteral(str, index);
                this.tokens.push(["literal", obj.literalValue]);

            } else if (Helper.checkIfNumericLiteral(str, index).isLiteral) {
               obj = Helper.checkIfNumericLiteral(str, index);
                this.tokens.push(["literal", obj.literalValue]);
            }

            else if (Helper.isString(str, index)) {
                obj = Helper.scanString(str, index + 1);
                this.tokens.push(["literal", obj.literalValue]);
                index += obj.offset + 2;
                char = str[index];
                continue;
            }
            else if (Helper.checkIfIdentifier(str, index).isIdentifier) {
                obj = Helper.checkIfIdentifier(str, index);
                this.tokens.push(["identifier", obj.identifierName]);

            }else{
                index++;
                char = str[index];
                console.log(char + "   " + "xddd")
            }

            index += obj.offset;
            char = str[index];
        }
    }
}

module.exports = Lexer;

let lexer = new Lexer();
let codeStr = loadContentFromFile("../../assets/test.jd");
lexer.lex(codeStr);
console.log(lexer.tokens);
