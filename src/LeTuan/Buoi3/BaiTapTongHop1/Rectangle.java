package LeTuan.Buoi3.BaiTapTongHop1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        //Kiem tr du lieu khoi tao
        setWidth(width);
        setHeight(height);
//        this.width = width;
//        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) return;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) return;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }
}
