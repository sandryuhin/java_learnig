package ru.isys.trainings.task4.figure.rectangle;

import ru.isys.trainings.task4.figure.Figure;

public class Rectangle implements Figure, Comparable<Rectangle> {

    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (weight + height) * 2;
    }

    @Override
    public double getSquare() {
        return weight * height;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        return Double.compare(this.getSquare(), rectangle.getSquare());
    }
}
