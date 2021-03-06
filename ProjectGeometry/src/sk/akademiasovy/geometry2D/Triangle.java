package sk.akademiasovy.geometry2D;

public class Triangle implements Operation {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
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

    public Triangle() {
        sideA = 3;
        sideB = 4;
        sideC = 5;
    }

    @Override
    public double calculatePerimeter()
    {
        double perimeter = this.sideA+this.sideB+this.sideC;
        return perimeter;
    }

    @Override
    public double calculateArea()
    {
        double s = (calculatePerimeter() / 2);
        double area = Math.sqrt((s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC)));
        return area;
    }

    public boolean isRectangular()
    {
        double squareA = this.sideA * this.sideA;
        double squareB = this.sideB * this.sideB;
        double squareC = this.sideC * this.sideC;
        if (squareA+squareB == squareC)
            return true;
        else if (squareA+squareC == squareB)
            return true;
        else if (squareC+squareB == squareA)
            return true;
        else
            return false;
    }

    public boolean isExisting()
    {
        if ((this.sideA+this.sideB>this.sideC)&&(this.sideB+this.sideC>this.sideA)&&(this.sideA+this.sideC>this.sideB))
            return true;
        else
            return false;
    }

    public boolean isEqualSides()
    {
        if (isExisting() == false)
            return false;
        else

        if (this.sideC==this.sideB && this.sideA==this.sideC)
            return true;
        else
            return false;
    }

    public boolean isIsosceles()
    {
        if (isExisting() == false)
            return false;
        else

        if (this.sideA == this.sideB)
            return true;
        else if (this.sideA == this.sideC)
            return true;
        else if (this.sideC == this.sideB)
            return true;
        else
            return false;
    }


}
