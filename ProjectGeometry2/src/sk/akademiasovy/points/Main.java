package sk.akademiasovy.points;

public class Main {
    public static void main(String[] args) {
        Point2D A = new Point2D(2,2);
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

        

    }
}
