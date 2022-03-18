package com.bridgelabz;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        First f = new Demo1();
        f.show("First");
        Second s = new Demo1();
        s.show("Second");
    }
}

interface First {
    public void show(String str);
}

interface Second {
    public void show(String str);
}

class Demo1 implements First,Second {
    public void show(String str) {
        System.out.println(str);
    }
}
