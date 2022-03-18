package com.bridgelabz;

//Abstract Class --> 0 - 100%
abstract class Calculation {
    public static int add(int a, int b) {
        return a+b;
    }
    //abstract menthod -->method doesn't have any body
    abstract public int sub(int a, int b);
}
//Interface-->contains multiple abstract methods
//functional interface --> interface with only one abstract method
interface FunctionalDemo {
    public int add(int a, int b);
}
//marker interface --> interface with empty class
interface MarkerDemo {

}
//interface
interface Demo {
    abstract public int sub(int a, int b);
    public int add(int a, int b);
}

class DemoOne implements Demo {

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculation.add(a,b);
        //Creating object of abstract class
        Calculation calc = new Calculator();
        calc.sub(a,b);
        //creating object for interface
        Demo d = new DemoOne();
        d.add(a,b);
        d.sub(a,b);

    }
}

class Calculator extends Calculation {
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}