package ru.isys.trainings.task4;

import ru.isys.trainings.task4.figure.rectangle.Rectangle;
import ru.isys.trainings.task4.figure.rectangle.Square;
import ru.isys.trainings.task4.figure.triangle.EquilateralTriangle;
import ru.isys.trainings.task4.figure.triangle.RectTriangle;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());

        rectangle.setWeight(15);
        rectangle.setWeight(25);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());

        Square square = new Square(10);
        System.out.println(square);
        System.out.println(square.getPerimeter());
        System.out.println(square.getSquare());

        RectTriangle rectTriangle = new RectTriangle(5, 10);

        System.out.println(rectTriangle);
        System.out.println(rectTriangle.getPerimeter());
        System.out.println(rectTriangle.getSquare());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);

        System.out.println(equilateralTriangle);
        System.out.println(equilateralTriangle.getPerimeter());
        System.out.println(equilateralTriangle.getSquare());

    }

}
