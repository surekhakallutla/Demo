package com.bridgelabz;

public class ObjectClassDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClassDemo obj = new ObjectClassDemo();
        //getclass()
        System.out.println(obj.getClass()); // returns package along with class name
        System.out.println(obj);

        //tostring()
        System.out.println(obj instanceof ObjectClassDemo);
        String d = obj.toString();
        System.out.println(d);
        System.out.println(d instanceof String);

        //hashcode()
        System.out.println(obj.hashCode());
        ObjectClassDemo obj1 = new ObjectClassDemo();

        //equals()
        System.out.println(obj1.equals(obj)); //false
        ObjectClassDemo obj2 = obj;
        System.out.println(obj2.equals(obj)); //true
        System.out.println("obj: "+obj.hashCode());
        System.out.println("obj1: "+obj.hashCode());
        System.out.println("obj2: "+obj.hashCode());

        //clone()
        StudentDemo s1 = new StudentDemo(10,"sai");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        StudentDemo s2 = (StudentDemo) s1.clone();
        System.out.println(s2);
        System.out.println(s2.hashCode());


    }
}

class StudentDemo implements Cloneable{
    int roll;
    String name;

    public StudentDemo(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}