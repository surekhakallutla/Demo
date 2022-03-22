var readline = require('readline-sync');

let m =readline.questionInt("Enter number of rows ");
console.log("Rows = ",m);

let n =readline.questionInt("Enter number of columns ");
console.log("Columns = ",n);

var array = new Array(m,n);

function twoDArrayInt(a,b) {
    for(let i = 0; i < a; i++) {
        for(let j = 0 ; j < b ; j++) {
            array[i] = [];
        }
    }

    for(let i = 0; i < a; i++) {
        for(let j = 0 ; j < b ; j++) {
            array[i][j] = j;
        }
    }
    return array;
}
twoDArrayInt(m,n);