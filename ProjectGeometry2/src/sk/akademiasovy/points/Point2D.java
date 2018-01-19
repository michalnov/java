package sk.akademiasovy.points;

import java.util.Random;

public class Point2D implements Geometry{
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        if (x == -1 && y == -1)
            generateRandom();
    }

    public Point2D() {
        this(0,0);
        //this musi byt prve v konstruktore ... lebo musi najprv robit zakladne nastavenie
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant()
    {
        if (this.x == 0 || this.y == 0)
            return 0;
        else {
            if (this.x > 0 && this.y > 0)
                return 1;
            else if (this.x < 0 && this.y > 0)
                return 2;
            else if (this.x < 0 && this.y < 0)
                return 3;
            else if (this.x > 0 && this.y < 0)
                return 4;
            else
                return 0;
        }
    }

    public void printInfo()
    {
        System.out.println("position X = "+this.x);
        System.out.println("position Y = "+this.y);
        if (getQuadrant() == 0)
        {
            System.out.println("Point Is on the axyes");
        }
        else
        {
            System.out.println("Point is in quadrant: "+getQuadrant());
        }
        System.out.println("Distance from ROOT is: "+calculateZeroDistance());
    }

    public void printInfo2D()
    {
        System.out.println("position X = "+this.x);
        System.out.println("position Y = "+this.y);
    }

    public void generateRandom()
    {
        Random random = new Random();
        this.x = random.nextInt(41) - 20;
        this.y = random.nextInt(41) - 20;
    }

    public double calculateZeroDistance()
    {
        //return Math.sqrt((double)(this.x*this.x)+(double)(this.y*this.y));
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double calculateDistaneFromPoint(Point2D other)
    {
        return Math.sqrt(Math.pow((this.x-other.getX()),2) + Math.pow((this.y-other.getY()),2));
    }

    public void doAxialSimetry(char type)
    {
        if (type == 'x' || type == 'y')
        {
            if (type == 'x')
            {
                this.y = (-1)*this.y;
            }
            else
            {
                this.x = (-1)*this.x;
            }
        } else {
            return;
        }
    }

    public void doPointReflection()
    {
        this.x = (-1)*this.x;
        this.y = (-1)*this.y;
    }

}
