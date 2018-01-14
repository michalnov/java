package sk.akademiasovy.geometry2D;

public class Circle {
    private float radius;

    public Circle(float diameter) {
        this.radius = diameter;
    }

    public Circle() {
        this.radius = 0;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calculateRadius()
    {
        return 2*this.radius;
    }

    public double calculatePerimeter()
    {
        double perimeter = Math.PI*2*this.radius;
        return perimeter;
    }

    public double calculateArea()
    {
        double area = Math.PI*(this.radius *this.radius);
        return area;
    }
}
