package exercise;

// BEGIN
class Segment {
    Point point1;
    Point point2;

    Segment (Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return point1;
    }

    public Point getEndPoint() {
        return point2;
    }

    public Point getMidPoint() {
        var x = (point1.getX() + point2.getX()) / 2;
        var y = (point1.getY() + point2.getY()) / 2;
        return new Point(x, y);
    }
}
// END
