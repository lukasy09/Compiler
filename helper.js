class Helper{

    static isIn(element, list){
        for(let listElement of list){
            if(element === listElement || element == listElement){
                return true;
            }
        }
        return false;
    }

    static checkIfKeyword(str, index){

        let keywords = ["if", "else", "for", "var"];
        let potentialKeyword = "";

        let keywordCharRe = /^[a-z]$/

        while(true){
            if(!keywordCharRe.test(str[index])){
                break;
            }
            potentialKeyword += str[index];
            index++;
        }

       return {
            isKeyword: Helper.isIn(potentialKeyword, keywords),
            keywordName: potentialKeyword,
            offset: potentialKeyword.length
       }
    }

    static checkIfLiteral(){

    }


    /**
     * Method checking if a part of string may be classified as identifier
     * @param str
     * @param index
     * @returns {{isIdentifier: boolean, identifierName: string, offset: number}}
     */
    static checkIfIdentifier(str, index){

        let reStart = /^([A-Za-z_])$/;
        let identifierName = "";
        let identifierRe = /^([A-Za-z0-9_]$)/;

        let start = true;
        let isIdentifier = true;

        while(true){
            if(start){
                if(!reStart.test(str[index])){
                    isIdentifier = false;
                    break;
                }
                start = false;
                identifierName += str[index];
                index++;

            }else{
                if(!identifierRe.test(str[index])){
                    break;
                }
                identifierName += str[index];
                index++;
            }
        }

        return {
            isIdentifier: isIdentifier,
            identifierName: identifierName,
            offset: identifierName.length
        }

    }
}

module.exports = Helper;

console.log(Helper.checkIfIdentifier("2sdr=4", 0));