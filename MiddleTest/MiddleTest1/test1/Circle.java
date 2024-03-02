package MiddleTest.test1;


public class Circle implements Shape{
    double radius;

    public Circle(double radius) {

        if(radius<0){
            throw  new IllegalArgumentException("반지름은 음수가 될 수 없습니다.");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
