package sk.akademiasovy.points;

import java.util.Random;

public class Point3D extends Point2D {

    private int z;

    public int getZ() {
        return z;
    }

    public Point3D() {
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y); // musi byt ako prvé.... volá konstruktor triedy Point2D ktorý ma 2 parametre
        this.z = z;
    }

    @Override
    public double calculateZeroDistance() {
        return Math.sqrt((Math.pow(getX(), 2))+(Math.pow(getY(), 2))+(Math.pow(getZ(), 2)));
    }

    @Override
    public void generateRandom() {
        Random random = new Random();
        this.z = random.nextInt(41)-20;
        super.generateRandom();
    }

    public double calculatePointsDistance(Point3D other)
    {
        return Math.sqrt(Math.pow((getX()-other.getX()),2) + Math.pow((getY()-other.getY()),2) + Math.pow((getZ()-(double)other.getZ()),2));
    }

    @Override
    public void printInfo() {
        super.printInfo2D();
        System.out.println("position Z = "+this.z);
    }
}
