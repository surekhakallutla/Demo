package com.bridgelabz.streamapidemo;

public class SingletonDemo {
    private SingletonDemo() {
    }

    //1. Early
    //demoObj = 100 -> t1
    //demoObj = 200
//    private static Demo demoObj = new Demo();
//    public synchronized static Demo getInstance() {
//          return demoObj;
//    }
    //2. Lazy
    private static SingletonDemo demoObj;
    //    public static Demo getInstance() {
//        if (demoObj == null)
//            return new Demo();
//        return demoObj;
//    }
    //2. Lazy
    private static SingletonDemo demoObj1;
    //    public static Demo getInstance() {
//        if (demoObj == null)
//            return new Demo();
//        return demoObj;
//    }
    //demoObj = 100 -> t1 <= 100(t2)
    // demoObj = 200
//3. Synchronized
//    public synchronized static Demo getInstance() {
//        if (demoObj == null)
//            return new Demo();
//        return demoObj;
//    }
    //4. double check sync
    public static SingletonDemo getInstance() {
        if (demoObj == null) {
            synchronized (SingletonDemo.class) {
                if (demoObj == null)
                    return new SingletonDemo();
            }
        }
        return demoObj;
    }
}
class A1 {
    public static void main(String[] args) {
        SingletonDemo d1 = SingletonDemo.getInstance();
        SingletonDemo d2 = SingletonDemo.getInstance();
    }
}