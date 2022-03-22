var readline = require('readline-sync');

let dividend = readline.questionInt("Enter value of Dividend ");
console.log("Dividend = ",dividend);

let divisor = readline.questionInt("Enter value of Divisor ");
console.log("Divisor = ",divisor);

let quotient = dividend / divisor;
console.log("The Quotient = ", quotient);

let remainder = dividend % divisor;
console.log("The Remainder = ",remainder);
