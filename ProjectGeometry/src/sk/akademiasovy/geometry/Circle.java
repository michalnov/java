package sk.akademiasovy.geometry;

public class Circle {
    private float diameter;

    public Circle(float diameter) {
        this.diameter = diameter;
    }

    public Circle() {
        this.diameter = 0;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float calculateRadius()
    {
        return 2*this.diameter;
    }

    public double calculatePerimeter()
    {
        double perimeter = Math.PI*2*this.diameter;
        return perimeter;
    }

    public double calculateArea()
    {
        double area = Math.PI*(this.diameter*this.diameter);
        return area;
    }
}
