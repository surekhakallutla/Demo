var readline = require('readline-sync');

let number = readline.questionInt("Enter a number ");
console.log("Number = ",number);

console.log("The Harmonic Series of number ", number, " is ");
function harmonicNumber() {
    var result = 0.0;
    for(let i = number; i > 0; i--) {
        result = result + parseFloat(1 / i);
        console.log(result,", ");
    }
}
harmonicNumber();

