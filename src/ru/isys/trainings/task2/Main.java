package ru.isys.trainings.task2;

import ru.isys.trainings.task2.numbers.Merger;
import ru.isys.trainings.task2.numbers.Search;
import ru.isys.trainings.task2.numbers.Sequence;
import ru.isys.trainings.task2.numbers.Sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();
        sequence.divisionOn3WithoutRemainder();
        sequence.divisionOnParameterWithoutRemainder(100, 7);

        Search search = new Search();

        try {
            System.out.println(search.indexWithMaxValue(new int[]{-100, -2, -3, -4, -5}));
            System.out.println(search.indexWithMinValue(new int[]{1, 2, 3, -300, -5, 6, 7, 8, 9}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Arrays.toString(sequence.getFactorialArray(5)));
        System.out.println(Arrays.toString(sequence.getExpArray(5, 5)));

        Sum sum = new Sum();
        System.out.println(sum.getExp(5, 5));

        Merger merger = new Merger();
        System.out.println(Arrays.toString(merger.mergeSortedArrays(new int[]{1, 4, 7, 10, 15, 20}, new int[]{3, 8, 17, 18, 22})));

    }

}
