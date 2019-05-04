let Helper = require("./helper.js");

class Lexer {

    constructor() {
        this.tokens = [];

        this.separators = [" ", "\t", "\n", ".", ",", "(", ")", "{", "}", "[", "]"];
        this.operators = ["+", "-", "*", "/"]
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
            } else if (Helper.checkIfLiteral(str, index)) {


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
lexer.lex(`var xTest=5; if(true){}`);

console.log(lexer.tokens);