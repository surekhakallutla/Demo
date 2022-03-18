package com.bridgelabz.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.add(1,100);
        System.out.println(arrayList);

        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(null);
        System.out.println(linkedList);
        linkedList.add(1,100);
        System.out.println(linkedList);

        List<Integer> vectorList = new Vector<Integer>();
        vectorList.add(10);
        vectorList.add(20);
        vectorList.add(30);
        vectorList.add(40);
        vectorList.add(null);
        System.out.println(vectorList);
        vectorList.add(1,100);
        System.out.println(vectorList);
    }

}
