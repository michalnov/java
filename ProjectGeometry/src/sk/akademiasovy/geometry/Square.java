package sk.akademiasovy.geometry;

public class Square {
    private float sideA;


    // SET

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    // GET

    public float getSideA() {
        return sideA;
    }

    // CONSTRUCT

    public Square()
    {
        this.sideA = 0;
    }

    public Square(float sideA) {
        this.sideA = sideA;
    }

    public float calculateArea()
    {
        float area = (this.sideA * this.sideA);
        return area;
    }

    public float calculatePerimeter()
    {
        float circuit = (this.sideA*4);
        return circuit;
    }

    public double calculateDiagonal()
    {
        double diagonal = Math.sqrt((double) (this.sideA*this.sideA)+(this.sideA*this.sideA));
        return diagonal;
    }
}
