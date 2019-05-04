let Helper = require("./helper.js");

class Lexer{

    constructor(){
        this.tokens = [];

        this.whiteSpace = [" ", "\n"];
        this.operators = ["+", "-", "*", "/"]
    }

    lex(str){

        let index = 0;
        let char = str[index];
        while(char !== undefined){

            if(Helper.isIn(char,this.whiteSpace)){
                    // pass
            }else if(Helper.checkIfVarDeclaration(str, index)){
                this.tokens.push(["Variable declaration", ""]);
                index += 3;
                char = str[index];
                continue;
            }
            else if(Helper.isIn(char, this.operators)){
                this.tokens.push([char, ""]);
            }

            console.log(char);

            index++;
            char = str[index];

        }
    }
}

lexer = new Lexer();
lexer.lex(`var a= 3+4;var x =4;`);

console.log(lexer.tokens);