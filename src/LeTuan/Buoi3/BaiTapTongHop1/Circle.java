package LeTuan.Buoi3.BaiTapTongHop1;

public class Circle extends Shape {
    private final double pi = 3.14159;
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) return;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * pi * radius;
    }

}
