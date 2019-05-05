
const separators = [" ", "\t", "\n", "\r", ".", ",", ";", "(", ")", "{", "}", "[", "]"];
const operators = ["+", "-", "*", "/", "=", "==", "<", ">"]

class Helper{

    /**
     * Method checking if a given element belongs to the given list.
     * @param element
     * @param list
     * @returns {boolean}
     */
    static isIn(element, list){
        for(let listElement of list){
            if(element === listElement || element == listElement){
                return true;
            }
        }
        return false;
    }
    /**
     * Checking if a sign is a separator
     * @param str
     * @param index
     * @return {boolean}
     */
    static isSeparator(str, index){
        return this.isIn(str[index], separators);
    }

    /**
     * Checking if a sign is an operator
     * @param str
     * @param index
     * @return {boolean}
     */
    static isOperator(str, index){
        return this.isIn(str[index], operators);
    }

    /**
     *
     * @param str
     * @param index
     * @return {{operatorValue: string, offset: number}}
     */
    static scanOperator(str, index){
        let operatorValue = "";

        if(this.isIn(str[index], operators)){

            while(true){
                if(!Helper.isIn(str[index], operators)){
                    break;
                }

                operatorValue += str[index];
                index ++;
            }
            return {
                operatorValue: operatorValue,
                offset: operatorValue.length
            }
        }
    }




    /**
     * Method checking if there is a keyword in the code
     * @param str
     * @param index
     * @returns {{isKeyword: boolean, keywordName: string, offset: number}}
     */
    static checkIfKeyword(str, index){

        let keywords = ["if", "else", "for", "var", "while"];
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

    static checkIfBoolLiteral(str, index){
        if(str.substring(index, index + 4) === "true"){
            return {
                isLiteral: true,
                literalValue: "true",
                offset: 4
            }
        }
        if(str.substring(index, index + 5) === "false"){
            return {
                isLiteral: true,
                literalValue: "false",
                offset: 5
            }
        }

        return {
            isLiteral: false,
            literalValue: "",
            offset: ""
        }

    }

    static checkIfNumericLiteral(str, index){

        let numRe = /^[0-9]$/;
        let num = "";
        let isLiteral = false;

        while(true){

            if(!numRe.test(str[index])){
                break;
            }

            isLiteral = true;
            num += str[index];
            index++;
        }

        return {
            isLiteral: isLiteral,
            literalValue: num,
            offset: num.length
        }

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

    /**
     * Checking if we go in "string" mode
     * @param str
     * @param index
     * @returns {boolean}
     */
    static isString(str, index){
        if(str[index] === "\""){
            return true;
        }
    }


    static scanString(str, index){

            let stringValue = "";

            while(true){
                if(str[index] === '"'){
                    break;
                }
                stringValue += str[index];
                index ++;
            }
            return {
                isLiteral: true,
                literalValue: stringValue,
                offset: stringValue.length
            }

    }
}

module.exports = Helper;

//console.log(Helper.scanString(`var tmp= "ab"; if(a>b){varxd = 22}"`, 10));