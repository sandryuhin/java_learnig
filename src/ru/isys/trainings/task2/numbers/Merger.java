package ru.isys.trainings.task2.numbers;

public class Merger {

    public int[] mergeSortedArrays(int[] first, int[] second) {

        int[] resultArray = new int[first.length + second.length];

        int positionFirst = 0;
        int positionSecond = 0;

        for (int index = 0; index < resultArray.length; index++) {

            if (positionFirst > first.length - 1) {
                resultArray[index] = second[positionSecond];
                positionSecond++;
            } else if (positionSecond > second.length - 1) {
                resultArray[index] = first[positionFirst];
                positionFirst++;
            } else if (first[positionFirst] < second[positionSecond]) {
                resultArray[index] = first[positionFirst];
                positionFirst++;
            } else {
                resultArray[index] = second[positionSecond];
                positionSecond++;
            }

        }

        return resultArray;

    }

}
