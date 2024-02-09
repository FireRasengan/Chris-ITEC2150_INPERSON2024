package PointDemo;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point poObject) {
        /*if (this.x == poObject.x && this.y == poObject.y) {
            return true;
        } else {
            return false;
        }*/
        return (this.x == poObject.x && this.y == poObject.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
