package LeTuan.Buoi3.BaiTapTongHop1;

public class Circle extends Shape{
    private double radius;
private double pi = 3.14159;
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
        return pi* square( radius);
    }

    @Override
    void calculatePerimeter() {
        return 2*pi*  radius;
    }
}
