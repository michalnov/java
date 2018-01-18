package sk.akademiasovy.geometry3D;

public class Cuboid implements Operation3D, Diagonal3D {

    private double sideA;
    private double sideB;
    private double sideC;

    public Cuboid(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        if (this.sideA < 0 || this.sideB < 0 || this.sideC < 0)
            return 0;
        else
            return (2*(this.sideA*this.sideB)+2*(this.sideB*this.sideC)+2*(this.sideC*this.sideA));
    }

    @Override
    public double calculateVolume() {
        if (this.sideA < 0 || this.sideB < 0 || this.sideC < 0)
            return 0;
        else
            return (this.sideA*this.sideB*this.sideC);
    }

    @Override
    public double calculateDiagonal() {
        if (this.sideA < 0 || this.sideB < 0 || this.sideC < 0)
            return 0;
        else
            return (Math.sqrt((this.sideA*this.sideA)+(this.sideB*this.sideB)+(this.sideC*this.sideC)));
    }

    public void abc()
    {

    }

}
