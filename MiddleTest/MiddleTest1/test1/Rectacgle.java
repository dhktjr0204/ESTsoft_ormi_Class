package MiddleTest.test1;

public class Rectacgle implements Shape{
    double height;
    double width;

    public Rectacgle(double height, double width) {

        if (width < 0 || height < 0) throw new IllegalArgumentException("가로 또는 세로 길이는 음수가 될 수 없습니다.");

        this.height = height;
        this.width = width;
    }


    @Override
    public double getArea() {
        return width*height;
    }
}
