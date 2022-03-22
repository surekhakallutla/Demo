var readline = require('readline-sync');

let counter = readline.questionInt("How many times do you want to Flip the coin? ");
console.log("counter = ",counter);

var headCounter = 0;
var tailCounter = 0;

if (counter > 0){
	flipCoin(counter);

	let headPercentage = (parseFloat(headCounter) / counter) * 100;
    let tailPercentage = (parseFloat(tailCounter) / counter) * 100;

	console.log("Head count percentage : " , headPercentage , "\nTail count percentage : " , tailPercentage);
} 
else 
	console.log("Invalid input");
 
    
function flipCoin(count) {
    for (let i = 0; i < count; i++) 
			{				
				let result = Math.floor(Math.random() * 2);
				console.log("Random Value -> ",result);
				
				if (result < 0.5) 
					tailCounter++;
				 else 
					headCounter++;
			}
}
