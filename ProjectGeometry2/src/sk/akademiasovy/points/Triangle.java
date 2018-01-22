package sk.akademiasovy.points;

public class Triangle {
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;

    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getPerimeter()
    {
        Line lineA = new Line(this.pointA, this.pointB);
        Line lineB = new Line(this.pointB, this.pointC);
        Line lineC = new Line(this.pointC, this.pointA);
        return (lineA.getLineLenght() + lineB.getLineLenght() + lineC.getLineLenght());
    }

    public double getArea()
    {
        double s = (getPerimeter() / 2);
        double area = Math.sqrt((s*(s-new Line(this.pointA, this.pointB).getLineLenght())*(s-new Line(this.pointB, this.pointC).getLineLenght())*(s-new Line(this.pointC, this.pointA).getLineLenght())));
        return area;
    }

}
