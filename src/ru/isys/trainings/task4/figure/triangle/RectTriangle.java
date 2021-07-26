package ru.isys.trainings.task4.figure.triangle;

public class RectTriangle extends Triangle {

    public RectTriangle(double weight, double height) {
        super(weight, height, 90);
    }

    @Override
    public double getPerimeter() {
        double weight = getWeight();
        double height = getHeight();
        return Math.sqrt((Math.pow(weight, 2) * Math.pow(height, 2)) - (2 * weight * height * Math.cos(getAlpha()) + weight + height));
    }

    @Override
    public String toString() {
        return "RectTriangle{" +
                "leg1=" + getWeight() +
                ", leg2=" + getHeight() +
                ", alpha=" + getAlpha() +
                '}';
    }
}
