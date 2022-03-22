var readline = require('readline-sync');

let number = readline.questionInt("Enter a number ");
console.log("Number = ",number);

function primeFactors(number) {
    for( let i = 2; i < number; i++) {
        while(number % i == 0) {
            console.log(i," ");
            number = number / i;
        }
    }
     if ( number > 2) {
         alert(number);
     }
}
console.log("The prime Factors of ",number ," are ");
primeFactors(number);
