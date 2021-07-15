package ru.isys.trainings.task2.numbers;

public class Sum {

    public double getExp(double x, int n) {

        Sequence sequence = new Sequence();

        int[] factorialArray = sequence.getFactorialArray(n);
        double[] expArray = sequence.getExpArray(x, n);

        double exp = 1;

        for (int index = 0; index < n; index++) {
            exp += expArray[index] / factorialArray[index];
        }

        return exp;

    }

}
