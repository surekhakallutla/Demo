package com.bridgelabz.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

class Student {
    int no;
    String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
public class CollectionDemo {
    public static void main(String[] args) {
       List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10, "rekha"));
        studentList.add(new Student(10, "rekha"));
        studentList.add(new Student(10, "rekha"));
        System.out.println(studentList);
        studentList.size();
        studentList.get(1);


    }
}
