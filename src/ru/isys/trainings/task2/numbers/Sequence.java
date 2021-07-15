package ru.isys.trainings.task2.numbers;

public class Sequence {

    public void divisionOn3WithoutRemainder() {

        for (int i = 0; i < 100; i++) {
            if ((i % 3 == 0)) {
                System.out.println(i);
            }
        }

    }

    public void divisionOnParameterWithoutRemainder(int count, int parameter) {

        for (int i = 0; i <= count; i++) {
            if ((i % parameter == 0)) {
                System.out.println(i);
            }
        }

    }

    public int[] getFactorialArray(int n) {

        int[] factorialArray = new int[n];

        for (int value = 1, index = 0; value <= n; value++, index++) {
            if (value == 1) {
                factorialArray[index] = value;
            } else {
                factorialArray[index] = factorialArray[index - 1] * value;
            }
        }

        return factorialArray;

    }

    public double[] getExpArray(double x, int n) {

        double[] expArray = new double[n];

        for (int item = 1; item <= n; item++) {
            expArray[item - 1] = Math.pow(x, item);
        }

        return expArray;
    }

}
