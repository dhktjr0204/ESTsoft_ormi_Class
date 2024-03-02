package MiddleTest.test1;

import java.math.BigDecimal;

public class Triangle implements Shape{
    double height;
    double width;

    public Triangle(double height, double width) {
        if (width < 0 || height < 0) throw new IllegalArgumentException("밑변 또는 높이는 음수가 될 수 없습니다.");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width/2.0;
    }
}
