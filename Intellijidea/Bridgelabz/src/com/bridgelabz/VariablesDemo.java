package com.bridgelabz;

public class VariablesDemo {
    //instance variable
    int b; //if instance variable is not initialized then the default values were taken

    //use non-static var, method, object inside static method we need to create obj of class

    //static variable
    static int c = 10;
    //use static var, method, object inside static and non-static no need to create an object

    public static final strictfp void main(String[] args) {

        // a is local variable for method main
        int a; //initialization is must for local variables before reading them

        for(int i = 0; i < 10; i++) {
            // i is local variable for for loop
            System.out.println(i);
        }

        VariablesDemo obj = new VariablesDemo();
        System.out.println(obj.b);

        System.out.println(c);
    }

    public void add() {
        System.out.println(b);
        System.out.println(c);
    }
}
