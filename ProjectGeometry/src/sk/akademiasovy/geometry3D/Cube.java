package sk.akademiasovy.geometry3D;

public class Cube implements Operation3D, Diagonal3D {
    private double sideA;

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        if (this.sideA < 0)
            return 0;
        else
            double area = 6 * this.sideA*this.sideA;
            return area;
    }

    @Override
    public double calculateVolume() {
        if (this.sideA < 0)
            return 0;
        else
            return (this.sideA*this.sideA*this.sideA);
    }

    @Override
    public double calculateDiagonal() {
        if (this.sideA < 0)
            return 0;
        else
            return (this.sideA*Math.sqrt(3));
    }
}
