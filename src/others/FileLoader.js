let fs = require('fs');

function loadContentFromFile(path) {

   return fs.readFileSync(path, 'utf8');
}

module.exports = loadContentFromFile;