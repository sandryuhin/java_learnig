package ru.isys.trainings.task4.figure.triangle;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double lengthOfSide) {
        super(lengthOfSide, lengthOfSide, 60);
    }

    @Override
    public double getPerimeter() {
        return getWeight() * 3;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{lengthOfSide=" + getWeight() + "alpha=" + getAlpha() + '}';
    }
}
