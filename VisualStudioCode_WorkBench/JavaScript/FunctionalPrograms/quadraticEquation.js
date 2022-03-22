var readline = require('readline-sync');

let a = readline.questionInt("Enter a Value ");
let b = readline.questionInt("Enter b Value ");
let c = readline.questionInt("Enter c Value ");

function quadraticEquation() {
    var delta = (b*b) - (4*a*c);
    var xRoot1 = ((-b + Math.sqrt(delta)) / (2*a));
    var xRoot2 = ((-b - Math.sqrt(delta)) / (2*a));

    console.log("The roots of the Equation a*x*x + b*x + c  are ");
    console.log("Root 1 of x = ", xRoot1 ,"\tRoot 2 of x = ", xRoot2)
}
quadraticEquation();
