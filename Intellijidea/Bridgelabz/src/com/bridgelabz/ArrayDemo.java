package com.bridgelabz;

public class ArrayDemo {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        myArray[0] = 10;
        myArray[3] = 30;
        for(int i = 0 ; i <= myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
