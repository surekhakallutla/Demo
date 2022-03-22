var readline = require('readline-sync');

let power = readline.questionInt("Enter power of 2 less than 31 ");
console.log("Power = ",power);

function powersOfTwo() {
    var result = 2;
    if(power < 31) {
        for(let i = 1; i < power; i++) {
            if (power == 0) {
                result = 1;
            }
            else {
                result = parseInt(Math.pow(2, power));
            }
        }
        console.log("The 2 Power ",2," value is ", result);
    }
    else {
        console.log("Invalid Input Enter valid Input");
    }
}
powersOfTwo();