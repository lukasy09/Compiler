let Helper = require("./helper.js");

class Lexer{

    constructor(){
        this.tokens = [];
        this.whiteSpace = [" ", "\n"];

    }

    lex(str){

        let index = 0;
        let char = str[index];
        while(char !== undefined){

            if(Helper.isIn(char,this.whiteSpace)){
                    // pass
            }else if(Helper.isIn(char,)){

            }

            index++;
            char = str[index];

        }
    }
}

lexer = new Lexer();
lexer.lex("var a=4;");