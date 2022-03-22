var readline = require('readline-sync');

let x = readline.questionInt("Enter x Co-Ordinator Value ");
let y = readline.questionInt("Enter y Co-Ordinator Value ");

console.log("The (x, y) Co-Ordinator vaues are (",x,",",y,")");

function distance() {
    let distance = Math.sqrt(Math.pow(x, x) + Math.pow(y,y));
    console.log("The distance of (",x,",", y,") and ( 0 , 0 ) Co-Ordinates is ", distance);
}
distance();