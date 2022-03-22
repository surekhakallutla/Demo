var readline = require('readline-sync');

let year = readline.questionInt("Enter 4 digit Year ");
console.log("Year = ",year);

function leapYear() {
    if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
			console.log(year, " is a Leap Year");
		
		else 
			console.log(year, " is not a Leap Year");
}
leapYear();