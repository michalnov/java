package school;

import java.awt.*;

public class person {
    private String name;
    private int age;
    private double salary;
    private String surname;


    //METHODS

    public void about() {
        System.out.println("Name: " + name + ", age: " + age + "Salary: " + salary);
    }

    //SETER

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    //GETER


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    //CONSTRUCTOR

    public person() {
        this.age = 20;
        this.name = "John";
        this.surname = "Smith";
        this.salary = 1000;
    }

    public person(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }


}


