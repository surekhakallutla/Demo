package com.bridgelabz.lambdaexpressions;
//() -> {};
public class LambdaExpressionsDemo {

    public static void main(String[] args) {

        //Anonymous Functions

        Operation add = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(add.operation(5,7));

        Operation sub = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };
        System.out.println(sub.operation(5,7));

        //LambdaExpressions
        Operation addition = (int a, int b) -> {return a + b;};
        System.out.println(addition.operation(5,7));

        Operation subtraction = (int a, int b) -> {return a - b;};
        System.out.println(subtraction.operation(5,7));

        Operation multiplication = (int a, int b) -> {return a - b;};
        System.out.println(multiplication.operation(5,7));

    }
}

@FunctionalInterface
interface Operation {
    public int operation(int a, int b);
}

/*
class AddDemo implemnets Operation {

    public int add(int a, int b) {
        return a+b;
    }
}
*/