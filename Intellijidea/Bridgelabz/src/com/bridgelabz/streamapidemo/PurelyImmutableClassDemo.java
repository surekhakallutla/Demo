package com.bridgelabz.streamapidemo;

final public class PurelyImmutableClassDemo {
    final int id;
    String name;

    public PurelyImmutableClassDemo(int id) {
        this.id = id;
    }

    public static void PurelyImmutableClassDemo() {
        System.out.println("Inside Demo");
    }
}

class A{
    public static void main(String[] args) {
        PurelyImmutableClassDemo d1 = new PurelyImmutableClassDemo(10);
        PurelyImmutableClassDemo d2 = new PurelyImmutableClassDemo(20);
        PurelyImmutableClassDemo.PurelyImmutableClassDemo();
    }
}