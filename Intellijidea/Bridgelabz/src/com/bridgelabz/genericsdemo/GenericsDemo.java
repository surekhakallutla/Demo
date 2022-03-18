package com.bridgelabz.genericsdemo;

//At Encapsulated Class name need to user "<dataType>"
//Standard data types in generics
//T -> Type
//E -> Element
//K -> Key
//V -> Value
//S,R -> Extra Parameters

class UserInput <T> {
    private T a;
    private T b;

    public T getA() { return a; }

    public void setA(T a) { this.a = a; }

    public T getB() { return b; }

    public void setB(T b) { this.b = b; }
}

//2. When Creating an Object define datatype in <dataType>
public class GenericsDemo {
    public static void main(String[] args) {
        UserInput<Integer> intUser = new UserInput();
        UserInput<Double> doubleUser = new UserInput<Double>();
        add(intUser);
    }

    private static void add(UserInput<Integer> intUser) {
        System.out.println(intUser.getA() + intUser.getB());
    }

}
