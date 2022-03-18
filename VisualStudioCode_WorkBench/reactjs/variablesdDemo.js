//Scope of let variable is within the declared block only
let num = 10;

//Constant variables which wont be changed further
const pi = 3.14;

let a;

//static way to create an object
let person={
    name: "Rekha",
    add:"Proddatur"
}
console.log("Hello Java Script", person);

//Dynamic way to create an object
let person1 = new Object();
person1.name="Sai"
console.log("Hello Java Script", person1);

function personData() {
    let person={
        name: "Rekha",
        add:"Proddatur"
    }
    let person1 = new Object();

    person1.name="Sai"
    console.log("Hello Java Script", person1);

}
personData();