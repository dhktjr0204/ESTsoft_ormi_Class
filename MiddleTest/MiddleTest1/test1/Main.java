package MiddleTest.test1;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(2.0);
            Rectacgle rectacgle = new Rectacgle(4.0, 2.0);
            Triangle triangle = new Triangle(4.0, 2.0);

            System.out.println("원 넓이:" + circle.getArea());
            System.out.println("사각형 넓이:" + rectacgle.getArea());
            System.out.println("삼각형 넓이:" + triangle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
