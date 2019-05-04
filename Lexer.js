let Helper = require("./helper.js");

class Lexer{

    constructor(){
        this.tokens = [];

        this.separators = [" ", "\t","\n", ".", ",", "(", ")", "{", "}", "[", "]"];
        this.operators = ["+", "-", "*", "/"]
    }

    lex(str){

        let index = 0;
        let char = str[index];
        while(char !== undefined){

            if(Helper.isIn(char,this.separators)){
                this.tokens.push(["separator", char]);
            }else if(Helper.checkIfKeyWord(str, index)) {
                this.tokens.push(["keyword", char]);
                index += 3;
                char = str[index];
                continue;
            } else if(Helper.isIn(char, this.operators)){
                this.tokens.push(["operator", char]);
            }else if(Helper.checkIfIdentifier(str, index).isIdentifier) {

                let obj = Helper.checkIfIdentifier(str,index);
                this.tokens.push("IDENTIFIER", obj.identifierName);
                index += obj.offset;
            }


            index++;
            char = str[index];

        }
    }
}

lexer = new Lexer();
lexer.lex(`var ax= 3+4;var xx =4;`);

console.log(lexer.tokens);