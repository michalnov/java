package sk.akademiasovy.points;

import sk.akademiasovy.myDate.MyDate;

public class Main {
    public static void main(String[] args) {
        /*Point2D A = new Point2D(2,2);
        A.printInfo();

        Point2D B = new Point2D(-1,-1);
        B.printInfo();

        Point2D C = new Point2D(1,2);

        System.out.println("distance is: "+C.calculateDistaneFromPoint(A));
        System.out.println();

        C.printInfo();

        //Point2D D = new Point2D()

        C.doAxialSimetry('x');
        C.printInfo();

        C.doPointReflection();
        C.printInfo();

        System.out.println();

        Point3D AA = new Point3D(2, 2,2);
        Point3D BB = new Point3D(3, 3, 3);
        AA.printInfo();
        BB.printInfo();
        System.out.println("distance From ZEro is: "+AA.calculateZeroDistance());
        System.out.println("distance From Zero is: "+BB.calculateZeroDistance());
        System.out.println("distance between A and B is: "+AA.calculatePointsDistance(BB));

        */

        //Object o1 = new Point2D();
        /*
        Geometry g1 = new Point2D(5, -9);

        ((Point2D)g1).printInfo();

        System.out.println();
        System.out.println();

        Point3D[] array = new Point3D[11];
        for (int i = 0; i < 10 ; i++)
        {
            array[i] = new Point3D();
            array[i].generateRandom();
        }

        for (int i = 0; i < 10 ; i++)
        {
            array[i].printInfo();
            System.out.println();
        }
        */

        Point2D linePointA = new Point2D(2,5);
        Point2D linePointB = new Point2D(4,7);
        Line line1 = new Line(linePointA, linePointB);

        // alebo sa to da aj takto ....

        Point2D line2PointA = new Point2D(0,-5);
        Line line2 = new Line(line2PointA, new Point2D(7,7)); // new point priamo ako vstupný parameter

        Line line3 = new Line(1,2,3,4);

        System.out.println("Lenght of line is: "+line3.getLineLenght());

        MyDate today = new MyDate();
        today.formatedDate();




    }
}
