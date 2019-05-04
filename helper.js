class Helper{

    static isIn(element, list){
        for(let listElement of list){
            if(element === listElement || element == listElement){
                return true;
            }
        }
        return false;
    }
}

module.exports = Helper;