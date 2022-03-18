package com.bridgelabz;

//Regular Expressions (RegEx)
//to initialize Regex start with capcharacter(^)
//1. first char ,ust be cap
//2. min 3 char from second character on-words
//3. after 1st char all other char must be small
//4. end RegEx with $ symbol
//^[A-Z]{1}[a-z]{5}$
//syntax:
// [] -> set
//[a-z] -> k
//[A-Z] -> k
//[0-9] ->8

//{} -> count
//[A-z]{1}
//[a-z]{2,5}

//Mobile Number
//1.Exactly 10 digits
//2.Must start from [6789] or [6-9]

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEXDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstName = scn.next();

        System.out.println(firstName);
      /*
        //1st way(lengthy way)
        //Pattern(regex) -> compile
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        //match -> input with pattern
        Matcher m = p.matcher(firstName);//Kalpesh contains same pattern
        //if(both are match or not -> true or false
        boolean b = m.matches();
        System.out.println(b);
     */
        //2nd way
        String regex = "^[A-Z]{1}[a-z]{2,3}$";
        System.out.println(firstName + " :"+Pattern.matches(regex,firstName));


        //RegEx for mobilenumber
       // String mobileNumber = scn.next();
        String mobileNumber = ScannerUtility.StringInput();
        String mobileNumberRegex = "^[6789]{1}[0-9]{9}";
        System.out.println(mobileNumber + " :"+isMatches(regex,mobileNumber));

    }

    //creating a separate method for Pattern.matches(regex,userInput)
    private static boolean isMatches(String regex, String userInput) {
        return Pattern.matches(regex,userInput);
    }


}
