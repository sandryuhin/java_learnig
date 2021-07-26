package ru.isys.trainings.task3.unit4;

import java.util.Arrays;

public class StandartSort implements Sortable {

    @Override
    public String[] sortArray(String[] array) {
        Arrays.sort(array);

        return array;
    }
}
