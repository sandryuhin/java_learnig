package ru.isys.trainings.task4.figure.triangle;

import ru.isys.trainings.task4.figure.Figure;

public abstract class Triangle implements Figure {

    private double weight;
    private double height;
    // alpha - an angle, in radians
    private double alpha;

    public Triangle(double weight, double height, double alpha) {
        this.weight = weight;
        this.height = height;
        this.alpha = (alpha * Math.PI / 180);
    }

    @Override
    public abstract double getPerimeter();

    @Override
    public double getSquare() {
        return 0.5 * weight * height * Math.sin(alpha);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "weight=" + weight +
                ", height=" + height +
                ", alpha=" + alpha +
                '}';
    }
}
