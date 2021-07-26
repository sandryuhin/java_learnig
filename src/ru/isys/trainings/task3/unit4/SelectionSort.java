package ru.isys.trainings.task3.unit4;

public class SelectionSort implements Sortable {

    @Override
    public String[] sortArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            String min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(min) < 0) {
                    pos = j;
                    min = array[j];
                }
            }

            array[pos] = array[i];
            array[i] = min;
        }

        return array;
    }

}
