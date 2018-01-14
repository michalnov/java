package sk.akademiasovy.geometry3D;

public class Ball implements Operation3D {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (this.radius < 0)
            return 0;
        else
            return (4*Math.PI*this.radius*this.radius);
    }

    @Override
    public double calculateVolume() {
        if (this.radius < 0)
            return 0;
        else
            return ((4/3)*Math.PI*this.radius*this.radius*this.radius);
    }
}
