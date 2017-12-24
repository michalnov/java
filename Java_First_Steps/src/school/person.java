package school;

import java.awt.*;

public class person {
    private String name;
    private int age;
    private double salary;

    public void about() {
        System.out.println("Name: " + name + ", age: " + age);
    }

    //SETTER

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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


    //CONSTRUCTOR




}


