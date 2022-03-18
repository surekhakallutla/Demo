package com.bridgelabz;

public class VariableTest {
    static int i = 0;

    public VariableTest() {
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        VariableTest obj1 = new VariableTest();
        VariableTest obj2 = new VariableTest();
        VariableTest obj3 = new VariableTest();
    }

}
