package student_regina_svistunov.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return  2 * (sideA + sideB);
    }
}
