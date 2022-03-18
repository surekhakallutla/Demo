package com.bridgelabz;

public class OperatorsDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1 == str2); //true checking on memory location
        System.out.println(str1.equals(str2)); //true checking on values

        System.out.println(str1 == str3); //false
        System.out.println(str1.equals(str3)); //true
    }
}
