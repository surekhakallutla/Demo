function sum() {
    console.log(10+10);
}

const sum = sum();

//constructor function with parameter
function User(name) {
    this.name = name;
    this.isAdmin = false;
}

let user = new user("Jack");

alert(user.name);
alert(user.isAdmin);
