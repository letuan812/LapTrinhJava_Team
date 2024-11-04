package LeTuan.Buoi3.BaiTapTongHop1;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.highest;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.sqrt;

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
        double hypotenuse = sqrt(square(height) + square(base) );

        return base + height + hypotenuse;
    }
}
