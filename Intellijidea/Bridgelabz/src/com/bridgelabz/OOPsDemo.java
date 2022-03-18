package com.bridgelabz;
//OOP
//Object: Realtime Entity
//Class: Blueprint of object / Structure to create objects of same type
//Inheritance: Acquiring properties and behavior of parent class from child class
//Polymorphism:
//Encapsulation:
//Abstraction:

class Z {
    public void methodZ() {
        System.out.println("In class Z: methodZ()");
    }
}

class X extends Z {
    public void methodX() {
        System.out.println("In class X: methodX()");
    }
}

class Y extends X {
    public void methodY() {
        System.out.println("In class Y: methodY()");
    }
}
public class OOPsDemo {
    public static void main(String[] args) {
        Y objY = new Y();
        objY.methodY();
        objY.methodX();
        objY.methodZ();

        X objX = new Y();
        objX.methodX();
        objX.methodZ();
    }
}
