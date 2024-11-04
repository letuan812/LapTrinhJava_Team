package LeTuan.Buoi3.BaiTapTongHop1;

import java.lang.Math;

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
        return pi * Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter() {
        return 2*pi*  radius;
    }
}
