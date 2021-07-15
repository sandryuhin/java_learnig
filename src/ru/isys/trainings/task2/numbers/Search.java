package ru.isys.trainings.task2.numbers;

public class Search {

    public int indexWithMaxValue(int[] arrayOfInteger) throws Exception {

        if (arrayOfInteger.length <= 0) {
            throw new Exception("Array is empty");
        }

        int arrayCounter = arrayOfInteger.length;
        int maximum = arrayOfInteger[0];
        int maximumIndex = 0;

        for (int i = 0; i < arrayCounter; i++) {
            if (arrayOfInteger[i] > maximum) {
                maximum = arrayOfInteger[i];
                maximumIndex = i;
            }
        }

        return maximumIndex;

    }

    public int indexWithMinValue(int[] arrayOfInteger) throws Exception {

        if (arrayOfInteger.length <= 0) {
            throw new Exception("Array is empty");
        }

        int arrayCounter = arrayOfInteger.length;
        int minimum = arrayOfInteger[0];
        int minimumIndex = 0;

        for (int i = 0; i < arrayCounter; i++) {
            if (arrayOfInteger[i] < minimum) {
                minimum = arrayOfInteger[i];
                minimumIndex = i;
            }
        }

        return minimumIndex;

    }

}
