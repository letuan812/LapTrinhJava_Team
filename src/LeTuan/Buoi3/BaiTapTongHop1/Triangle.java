package LeTuan.Buoi3.BaiTapTongHop1;


import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        setBase( base);
        setHeight( height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base)
    {
        if (base<=0) return;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height)
    {
        if (height<=0) return;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return base*0.5 * height;
    }

    @Override
    double calculatePerimeter() {
        //Tinh huong tim chu vi tam gia vuong;
        double hypotenuse = sqrt( Math.pow(height,2) + Math.pow(base,2) );

        return base + height + hypotenuse;
    }
}
