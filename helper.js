class Helper{

    static isIn(element, list){
        for(let listElement of list){
            if(element === listElement || element == listElement){
                return true;
            }
        }
        return false;
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
}

module.exports = Helper;