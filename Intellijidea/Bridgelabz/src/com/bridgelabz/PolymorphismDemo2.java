package com.bridgelabz;
//Method Overriding
//1.Name must be same
//2.No.and type of parameters same
//Signature must be same

class A {
    public void add() {
        System.out.println("In Class A : add()");
    }
}

class B extends A {
    @Override
    public void add() {
        super.add();//calling parent class add() method
        System.out.println("In Class B: add()");
    }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        B objB  = new B();
        objB.add();
    }
}
