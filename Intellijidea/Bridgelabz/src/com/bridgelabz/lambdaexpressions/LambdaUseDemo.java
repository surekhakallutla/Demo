package com.bridgelabz.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class LambdaUseDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,20,30,40,50,60,70);
        //for loop to print myList
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + " ");
        }
        //enhanced for loop to print myList
        for(Integer item : myList) {
            System.out.println(item + " ");
        }
        //Lambda Expression to print myList
        //myList.forEach((Integer item) -> {System.out.println(item + " ");});
        myList.forEach(item -> System.out.println(item + " "));



    }
}
