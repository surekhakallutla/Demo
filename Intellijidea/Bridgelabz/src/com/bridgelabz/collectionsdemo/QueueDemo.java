package com.bridgelabz.collectionsdemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(10);
        myQueue.add(40);
        myQueue.add(null);
        myQueue.add(40);
        System.out.println(myQueue);

        Queue<Character> myQueueChar = new PriorityQueue<>();
        myQueueChar.add('a');
        myQueueChar.add('b');
        myQueueChar.add('c');
        myQueueChar.add('a');
        myQueueChar.add('d');
        System.out.println(myQueueChar);
        System.out.println(myQueueChar.peek());
        System.out.println(myQueueChar.poll());
        System.out.println(myQueueChar);


        Deque <Character> myDeque = new ArrayDeque<>();
        myDeque.addFirst('a');
        myDeque.addFirst('b');
        myDeque.addLast('c');
        myDeque.add('d');
        System.out.println(myDeque);
        myDeque.remove();
        System.out.println(myDeque);
        myDeque.removeFirst();
        System.out.println(myDeque);
        myDeque.removeLast();
        System.out.println(myDeque);
        myDeque.peek();
        myDeque.poll();
        System.out.println(myDeque);


    }
}
