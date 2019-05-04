class Helper{

    static isIn(element, list){
        for(let listElement of list){
            if(element === listElement || element == listElement){
                return true;
            }
        }
        return false;
    }

    static checkIfKeyWord(str, index){
        if(this.checkIfVarDeclaration(str, index)){
            return true;
        }


    }

    static checkIfVarDeclaration(str, index){

        if(index <= 0){

            if(str[index] === "v" && str[index+1] === "a" && str[index+2] === "r" && str[index +3] === " "){
                return true;
            }
        }else{
            let prevSigns = [" ", "", ";", "\n"];
            if(this.isIn(str[index-1], prevSigns) && str[index] === "v" && str[index+1] === "a" && str[index+2] === "r" && str[index +3] === " "){
                return true;
            }
        }

        return false;
    }

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