package com.bridgelabz;

//Encapsulation Method
class Result {
    int add;
    double sub;
}

public class EncapsulationDemo {
    public static void main(String[] args) {

    }

    public static Result operation(int a, int b) {

        Result r = new Result();

        r.add = a+b;
        r.sub = a-b-2.22;
        return r;
    }
}
