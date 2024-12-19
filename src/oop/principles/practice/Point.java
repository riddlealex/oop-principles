package oop.principles.practice;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
