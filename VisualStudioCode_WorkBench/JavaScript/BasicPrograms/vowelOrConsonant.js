var readline = require('readline-sync');
let alphabet = readline.question("Enter an Alphabet ");
console.log("alphabet = ",alphabet);

if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' || alphabet == 'i' || alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U') {
    console.log("The given alphabet ", alphabet," is Vowel");
}
else if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
    console.log("The given alphabet ", alphabet," is Consonant");
} 
else {
    console.log("Invalid Input Enter Valid Input");
}

