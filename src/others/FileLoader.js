let fs = require('fs');

export function loadContentFromFile(path) {

   return fs.readFileSync(path, 'utf8');
}