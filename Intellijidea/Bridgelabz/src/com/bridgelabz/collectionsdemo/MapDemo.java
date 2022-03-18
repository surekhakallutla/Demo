package com.bridgelabz.collectionsdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"a");
        myMap.put(2,"q");
        myMap.put(3,"t");
        myMap.put(1,"c");
        myMap.put(0,"c");
        myMap.put(null,"a");
        System.out.println(myMap);
        myMap.put(0,"b");
        System.out.println(myMap);

        for(Map.Entry<Integer, String> item : myMap.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }


        Map<Integer, String> mySynchronizedMap = Collections.synchronizedMap(new HashMap<>());
        myMap.put(1,"a");
        myMap.put(2,"q");
        myMap.put(3,"t");
        myMap.put(1,"c");
        myMap.put(0,"c");
        myMap.put(null,"a");
        System.out.println(myMap);

    }
}
