package com.bridgelabz;

import java.util.Scanner;

//Throwable
//|-> Exception
//          |-> Checked/Compile time Exception
//                  |->syntax error,
//          |-> Unchecked/ Run time Exception
//                  |->Arithmetic Exception, ArrayOutOfBound Exception
// |->Sql Exception
// |->FileNotFoundException
// |-> IOException
// |-> Error
public class ExceptionClassDemo {
    public static void main(String[] args) {
        operation();
    }

    public static void operation() {
        System.out.println("1");
        //Arithmetic Exception
        //int result = 10 / 0;

        /*
        //using try, catch blocks to avoid exception
        try {
            int result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        */
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();

        //if we have multiple exceptions
        int arr[] = new int[3];
        try{
            System.out.println(arr[5]);
            int result = 10 / 0;
        }
        catch(ArithmeticException e) {
            //if we want the default exception message
            //will call default constructor of ArithmeticException Class
            System.out.println(e);
            //if we want the custom exception message
            //will call parameterized constructor of Arithmetic Exception Class
            throw new ArithmeticException("This is divided by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //not mandatory if we have already called particular exception methods it will help with code performance
        catch(Exception e) {
            System.out.println(e);
        }
        //Finally Block
        finally {
            System.out.println("In FInal Block");
            scn.close();
        }
        System.out.println("2");
    }
}
