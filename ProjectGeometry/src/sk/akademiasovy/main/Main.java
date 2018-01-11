package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Square obj1 = new Square(7.5f);

        System.out.println(obj1.getSideA());
        System.out.println(obj1.calculateArea());
        System.out.println(obj1.calculatePerimeter());
        System.out.println(obj1.calculateDiagonal());
    }

}
