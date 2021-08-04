package ru.isys.trainings.task4;

import ru.isys.trainings.task4.figure.rectangle.Rectangle;
import ru.isys.trainings.task4.figure.rectangle.Square;
import ru.isys.trainings.task4.figure.triangle.EquilateralTriangle;
import ru.isys.trainings.task4.figure.triangle.RectTriangle;
import ru.isys.trainings.task4.figure.triangle.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // task3
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

        // task6
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(30, 40));
        rectangleList.add(new Rectangle(40, 50));
        rectangleList.add(new Rectangle(50, 60));
        rectangleList.add(new Rectangle(10, 20));
        rectangleList.add(new Rectangle(20, 30));

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new RectTriangle(10, 20));
        triangleList.add(new EquilateralTriangle(10));
        triangleList.add(new RectTriangle(20, 30));
        triangleList.add(new EquilateralTriangle(20));

        rectangleList.sort(Comparator.naturalOrder());
        triangleList.sort(Comparator.naturalOrder());

        System.out.println(rectangleList);
        System.out.println(triangleList);

        Triangle triangle1 = new EquilateralTriangle(20);
        Triangle triangle2 = new RectTriangle(10, 20);

        System.out.println(Triangle.triangleSort.compare(triangle1, triangle2));

    }

}
