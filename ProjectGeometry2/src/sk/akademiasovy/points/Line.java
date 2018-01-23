package sk.akademiasovy.points;

public class Line {
    private Point2D pointA;
    private Point2D pointB;

    public Line(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line(int pointAX, int pointAY, int pointBX, int pointBY) {
        this.pointA = new Point2D(pointAX, pointAY);
        this.pointB = new Point2D(pointBX, pointBY);
    }

    public double getLineLenght()
    {
        return pointA.calculateDistaneFromPoint(pointB);
    }

    public Point2D getMidlePoint()
    {
        return new Point2D((pointA.getX() + pointB.getX())/2,((pointA.getY() + pointB.getY())/2));
    }

    public boolean isParallelToX()
    {
        if (pointA.getY() == pointB.getY())
            return true;
        else
            return false;
    }

    public boolean isParallelToY()
    {
        return (pointA.getX() == pointB.getX()); // da sa aj takto
    }
}
