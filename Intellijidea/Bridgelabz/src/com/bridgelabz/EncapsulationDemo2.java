package com.bridgelabz;

//read only write only
class Employee {
    private int id;
    double salary;
    String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age <= 15)
            System.out.println("Throws Exception Error");
        else {
            System.out.println("The given Age is Valid");
            this.age = age;
        }
    }

}
public class EncapsulationDemo2 {
    public static void main(String[] args) throws Exception{
        Employee emp1 = new Employee();

        emp1.setId(10);
        //emp1.id = 10;
        System.out.println(emp1.getId());
        emp1.salary = 248.93;
        System.out.println(emp1.salary);
        emp1.name = "ABC";
        System.out.println(emp1.name);
        emp1.setAge(15);
        System.out.println(emp1.getAge());
        emp1.setAge(18);
        System.out.println(emp1.getAge());

    }
}
