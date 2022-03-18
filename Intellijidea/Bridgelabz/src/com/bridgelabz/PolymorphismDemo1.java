package com.bridgelabz;

//Method Overloading
    //1. Method Name must be same
    //2.NO. and type of parameters must be different
    //3.Signature doesn't matters
    //AccessModifier AccessSpecifier returnType methodName(list of parameters)
    //method body
    //if returnType then return argument;

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        add(10,20);
        add(10.20f, 10.22f);
    }

    public static long add(long a, long b) {
        return a+b;
    }

    public static void add(float c, float d) {
        System.out.println(c+d);
    }

}

