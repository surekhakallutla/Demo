package com.bridgelabz.streamapidemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class IntSummaryStatisticsDemo {
    List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50, 60);
    long total = 0;
    for(int i = 0; i < myList.size(); i++) {
        total = total + myList.get(i);
    }
    System.out.println(total);

    long sum = myList.stream().reduce(0, (one, two) -> one + two);
    System.out.println(sum);

    IntSummaryStatistics stats = myList.stream().mapToInt(x -> x).summaryStatistics();
    System.out.println(stats.getSum());
    System.out.println(stats.getMax());
    System.out.println(stats.getMin());
}
