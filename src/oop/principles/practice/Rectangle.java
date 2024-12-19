package oop.principles.practice;

public class Rectangle extends Figure implements WithDiagonal {

    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    @Override
    public double getArea() {
        return (rightLowerCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightLowerCorner.getY());
    }

    @Override
    public double getDiagonal() {
        return leftUpperCorner.distance(rightLowerCorner);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUpperCorner=" + leftUpperCorner +
                ", rightLowerCorner=" + rightLowerCorner +
                '}';
    }

    public Point getLeftUpperCorner() {
        return leftUpperCorner;
    }

    public Point getRightLowerCorner() {
        return rightLowerCorner;
    }
}
