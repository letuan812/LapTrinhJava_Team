package LeTuan.Buoi3.BaiTapTongHop1;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void calculateArea() {

    }

    @Override
    void calculatePerimeter() {

    }
}
