package sk.akademiasovy.geometry2D;

public class Square implements Operation, Diagonal {
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

    @Override
    public double calculateArea()
    {
        double area = (this.sideA * this.sideA);
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        double circuit = (this.sideA*4);
        return circuit;
    }

    @Override
    public double calculateDiagonal()
    {
        double diagonal = Math.sqrt((double) (this.sideA*this.sideA)+(this.sideA*this.sideA));
        return diagonal;
    }
}
