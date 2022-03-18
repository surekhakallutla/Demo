package com.bridgelabz;

public class StaticMethodDemo {

    static int a= 10;

    //constructor
    public StaticMethodDemo() {
        System.out.println("In Constructor");
    }

    //Static Block
    static {
        System.out.println("In Static Block");
    }

    //Non-static Block
    {
        System.out.println("In Initialization Block");
    }

    public static void main(String[] args) {
        System.out.println("In Main Method");

        StaticMethodDemo obj = new StaticMethodDemo();
        System.out.println("Static Variable: "+ a);
        display();
        StaticMethodDemo obj1 = new StaticMethodDemo();
    }

    public static  void display() {
        System.out.println("In Static method");
    }
}
