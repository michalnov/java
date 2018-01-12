package sk.akademiasovy.geometry2D;

public class Rectangle implements Operation, Diagonal {
    private float sideA;
    private float sideB;

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(float sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
    }

    public Rectangle() {
        this.sideA = 0;
        this.sideB = 0;
    }

    @Override
    public double calculateArea()
    {
        double area = this.sideA * this.sideB;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        double area = this.sideA + this.sideB;
        return area;
    }

    @Override
    public double calculateDiagonal()
    {
        double diagonal = Math.sqrt((double) (this.sideA*this.sideB)+(this.sideA*this.sideB));
        return diagonal;
    }

    public void transposed()
    {
        float swap = this.sideB;
        this.sideB = this.sideA;
        this.sideA = swap;
    }

}
