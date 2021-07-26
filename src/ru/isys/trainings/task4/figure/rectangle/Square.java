package ru.isys.trainings.task4.figure.rectangle;

public class Square extends Rectangle {

    public Square(double weight) {
        super(weight, weight);
    }

    @Override
    public String toString() {
        return "Square{weight=" + getWeight() + '}';
    }
}
