package com.bridgelabz;

import java.util.Scanner;
//calling parent class RuntimeException
class AgeInvalidException extends RuntimeException {
    public AgeInvalidException() {
        super();
    }
    public AgeInvalidException(String str) {
        super(str);
    }
}
//calling Super parent class Exception
class AgeInvalidException1 extends Exception {
    public AgeInvalidException1() {
        super();
    }
    public AgeInvalidException1(String str) {
        super(str);
    }
}

public class CustomExceptionDemo {
    //throws exception at main method
    public static void main(String[] args) throws AgeInvalidException1 {
        Scanner scn = new Scanner(System.in);
        age(scn.nextInt());

        //throwed exception at main method
        age1(scn.nextInt());

        //or we can use try catch method for exceptions instead of throwing exception at main method
        /*
        try{
            age1(scn.nextInt());
        }
        catch (AgeInvalidException e){
        System.out.println(e);
        }
         */
    }

    public static void age(int a) {
        if(a >= 18)
            System.out.println("Welcome");
        else
            throw new AgeInvalidException("Hey your age is not valid...");

    }

    //throws keyword is used for exception using at method level
    public static void age1(int a1) throws AgeInvalidException1{
        if(a1 >= 18)
            System.out.println("Welcome");
        else
            throw new AgeInvalidException("Hey your age is not valid...");

    }
}
