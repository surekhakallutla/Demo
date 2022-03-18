const readline = require('readline-sync'); //es5

let userName = readline.question("Enter your name ");
console.log("User Name -> ", userName);

let num = readline.questionInt("Enter any Number");
console.log("Entered Number = ", num);

//Type Casting
// let num2 = parseInt(userName);

function largestNumber(){
    let a = 10;
    let b = 20;
    //let a = readline.questionInt("Enter a value");
    //let b = readline.questionInt("Enter b value");
    if(a>b) {
        console.log("a is greater");
    }
    else {
        console.log("b is greater");
    }
}
largestNumber();