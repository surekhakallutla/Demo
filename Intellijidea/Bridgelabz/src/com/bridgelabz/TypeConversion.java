package com.bridgelabz;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        //implicit type casting
        float b = a;
        System.out.println(a);
        System.out.println(b);

        double c = 10;
        //explicit type casting
        float d = (float) c;
        System.out.println(c);
        System.out.println(d);

        String str = "123";
        System.out.println(str instanceof String);
        System.out.println(str);

        //Wrapper class conversion
        int intVal = Integer.parseInt(str);
        System.out.println(intVal);


    }
}
