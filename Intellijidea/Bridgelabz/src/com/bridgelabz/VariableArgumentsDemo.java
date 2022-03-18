package com.bridgelabz;

public class VariableArgumentsDemo {
    public static void main(String[] args) {

        System.out.println(add(10,20.23));
        System.out.println(add(10,20,30));
        System.out.println(add(10,20,30,40,50,60));

    }
    public static double add(int a, double b) {
        System.out.println("In Add Method");
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    //Variable Type Arguments
    public static long add(int... arr) {
        System.out.println("In Var-args");
        long result = 0;
        for(int i = 0 ; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}