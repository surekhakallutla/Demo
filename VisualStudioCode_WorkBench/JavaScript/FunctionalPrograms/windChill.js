var readline = require('readline-sync');

let t = readline.questionInt("Enter Temperature in Fahrenheit ");
console.log("Temperature = ",t);

let v = readline.questionInt("Enter TWind Speed in Miles per Hour ");
console.log("Wind Speed = ",v);

var w = 0;

function windChill() {
    
    if(t <= 50 || (v > 120 || v < 3)) {
		console.log("Invalid Input");
    }		
	else {
		w = 35.74 + (0.6215 * t) +(((0.4275 * t )- 35.75) * Math.pow( v, 0.16));
		console.log("The Wind Chill is "+w);
	}
}
windChill();