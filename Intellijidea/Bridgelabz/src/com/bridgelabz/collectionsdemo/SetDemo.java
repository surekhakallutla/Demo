package com.bridgelabz.collectionsdemo;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(10);
        mySet.add(null);
        mySet.add(40);
        mySet.add(20);
        System.out.println(mySet);

        Set<Integer> myLinkSet = new LinkedHashSet<>();
        myLinkSet.add(10);
        myLinkSet.add(20);
        myLinkSet.add(30);
        myLinkSet.add(10);
        myLinkSet.add(null);
        myLinkSet.add(40);
        myLinkSet.add(20);
        System.out.println(myLinkSet);

//        Set<Integer> myTreeSet = new TreeSet<>();
        SortedSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(10);
        myTreeSet.add(20);
        myTreeSet.add(30);
        myTreeSet.add(10);
        myTreeSet.add(null);
        myTreeSet.add(40);
        myTreeSet.add(20);
        System.out.println(myTreeSet);




    }
}
