package com.bridgelabz.streamapidemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
    Integer rollNo;
    String name;
    Double fees;

    public Student(Integer rollNo, String name, Double fees) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }

    public Integer getRollNo() {return rollNo;}
    public String getName() {return name;}
    public Double getFees() {return fees;}

}

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> blz = new ArrayList<>();

        blz.add(new Student(1,"Abc", 100.30));
        blz.add(new Student(2,"Pqr", 200.30));
        blz.add(new Student(3,"Xyz", 300.30));
        blz.add(new Student(4,"Klm", 400.30));
        blz.add(new Student(5,"Efg", 400.30));
        blz.add(new Student(6,"Hij", 100.30));

        double total = 0;
        for(Student stud : blz) {
            if(stud.getFees() > 150)
                System.out.println(stud.getRollNo()+ " : "+ stud.getName() + " : "+stud.getFees());
            total = total + stud.getFees();
        }
        System.out.println(total);

        Double myResult = blz.stream()
                .map(stud -> stud.getFees()) //function<T, R> Interface -> R accept(T)
                .filter(fees -> fees > 150) // Predicate<T> Interface -> boolean test (T)
                .reduce(0.0 , (result, fees) -> result + fees);//BiFUnction<T,U,R> Interface -> R apply(T, U)
        System.out.println(myResult);

        blz.stream()
                .filter(fees -> fees.getFees() > 150) // Predicate<T> Interface -> boolean test (T)
                .forEach( stud -> System.out.println(stud.getRollNo()+ " : "+ stud.getName() + " : "+stud.getFees()));
        //Consumer<T> Interface void accept(T)

        //to find max and min values of fees
       Student maxFeesStudent = blz.stream().max((stud1, stud2) -> stud1.getFees() > stud1.getFees() ? 1 : -1).get();
       System.out.println(maxFeesStudent.getName());

       //To convert one datatype list to another datatype list
        Set<Double> feesList = blz.stream()
                .map(stud -> stud.getFees())
                .collect(Collectors.toSet());
        feesList.forEach(item -> System.out.println(item));

    }
}