package sk.akademiasovy.main;

import sk.akademiasovy.geometry2D.Circle;
import sk.akademiasovy.geometry2D.Rectangle;
import sk.akademiasovy.geometry2D.Square;
import sk.akademiasovy.geometry2D.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Square obj1 = new Square(7.5f);

        System.out.println(obj1.getSideA());
        System.out.println(obj1.calculateArea());
        System.out.println(obj1.calculatePerimeter());
        System.out.println(obj1.calculateDiagonal());

        Circle obj2 = new Circle(12.5f);
        System.out.println("area: "+obj2.calculateArea());
        System.out.println("perimeter: "+obj2.calculatePerimeter());
        System.out.println("radius: "+obj2.calculateRadius());
        System.out.println("diameter: "+obj2.getRadius());

        Rectangle obj3 = new Rectangle(11.3f, 5.3f);
        System.out.println("side A: "+obj3.getSideA());
        System.out.println("side B: "+obj3.getSideB());
        System.out.println("area: "+obj3.calculateArea());
        System.out.println("perimeter: "+obj3.calculatePerimeter());
        System.out.println(" diagonal: "+obj3.calculateDiagonal());

        Triangle obj4 = new Triangle();
        System.out.println(obj4.calculatePerimeter());
        System.out.println(obj4.calculateArea());
        System.out.println(obj4.isRectangular());

        obj4.setSideA(8);
        System.out.println(obj4.isRectangular());
    }

}
