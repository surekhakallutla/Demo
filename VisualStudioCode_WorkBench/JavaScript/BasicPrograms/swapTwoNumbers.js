var readline = require('readline-sync');

let firstNumber = readline.questionInt("Enter value of First Number ");
console.log("First Number = ",firstNumber);

let secondNumber = readline.questionInt("Enter value of Second Number ");
console.log("Second Number = ",secondNumber);

function swap() {
    let temp = firstNumber;
    firstNumber = secondNumber;
    secondNumber = temp;
}

swap();

console.log("After Swapping \n First Number = ",firstNumber,"\n Second Number = ", secondNumber);
