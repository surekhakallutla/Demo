var readline = require('readline-sync');
let number = readline.questionInt("Enter a number ");
console.log("number = ",number);

if(number % 2 == 0)
	console.log("The number " , number , " is even");
else
	console.log("The number " , number , " is odd");