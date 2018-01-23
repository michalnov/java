package sk.akademiasovy.points;

public class Triangle implements InterfaceTriangle{
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;

    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Line getSideC()
    {
       return new Line(this.pointA, this.pointB);
    }

    public Line getSideB()
    {
        return new Line(this.pointA, this.pointC);
    }

    public Line getSideA()
    {
        return new Line(this.pointC, this.pointB);
    }

    @Override
    public double getPerimeter()
    {
        Line lineA = new Line(this.pointA, this.pointB);
        Line lineB = new Line(this.pointB, this.pointC);
        Line lineC = new Line(this.pointC, this.pointA);
        return (lineA.getLineLenght() + lineB.getLineLenght() + lineC.getLineLenght());
    }

    @Override
    public double getArea()
    {
        double s = (getPerimeter() / 2);
        double area = Math.sqrt((s*(s-new Line(this.pointA, this.pointB).getLineLenght())*(s-new Line(this.pointB, this.pointC).getLineLenght())*(s-new Line(this.pointC, this.pointA).getLineLenght())));
        return area;
    }

    @Override
    public boolean isRightAngled() {
        if (Math.pow(getSideA().getLineLenght(),2) + Math.pow(getSideB().getLineLenght(),2) == Math.pow(getSideC().getLineLenght(),2))
            return true;
        else if (Math.pow(getSideA().getLineLenght(),2) + Math.pow(getSideC().getLineLenght(),2) == Math.pow(getSideB().getLineLenght(),2))
            return true;
        else if (Math.pow(getSideC().getLineLenght(),2) + Math.pow(getSideB().getLineLenght(),2) == Math.pow(getSideA().getLineLenght(),2))
            return true;
        else
            return false;
    }

    @Override
    public boolean isEquilateral() {
        return (getSideA().getLineLenght() == getSideB().getLineLenght() && getSideB().getLineLenght() == getSideC().getLineLenght());
    }

    @Override
    public boolean isIsosceles() {
        return (getSideA().getLineLenght() == getSideB().getLineLenght() || getSideA().getLineLenght() == getSideC().getLineLenght() || getSideC().getLineLenght() == getSideB().getLineLenght());
    }

}
