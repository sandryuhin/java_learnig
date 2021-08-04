package ru.isys.trainings.task5.unit3;

import ru.isys.trainings.task5.unit3.exception.UnsupportedArraySizeException;
import ru.isys.trainings.task5.unit3.exception.WrongArrayDataException;

public class ArrayTransform {

    public static int[][] transform(String[][] arrayToTransform) throws UnsupportedArraySizeException, WrongArrayDataException {

        int rowsCount = arrayToTransform.length;
        if (rowsCount != 4) {
            throw new UnsupportedArraySizeException("Array has rows is not 4");
        }

        int[][] resultArray = new int[4][4];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < arrayToTransform[i].length; j++) {
                if (arrayToTransform[i].length != 4) {
                    throw new UnsupportedArraySizeException("Array has cols is not 4");
                }

                try {
                    resultArray[i][j] = Integer.parseInt(arrayToTransform[i][j]);
                } catch (NumberFormatException e) {
                    throw new WrongArrayDataException("Can't parse cell[" + i + "][" + j + "] like int");
                }

            }
        }

        return resultArray;
    }

}
