package ru.isys.trainings.task3;

import ru.isys.trainings.task3.unit1.Reflect;
import ru.isys.trainings.task3.unit2.Printer;
import ru.isys.trainings.task3.unit2.Student;
import ru.isys.trainings.task3.unit3.Timer;
import ru.isys.trainings.task3.unit4.SelectionSort;
import ru.isys.trainings.task3.unit4.StandartSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Reflect reflect = new Reflect();
        System.out.println(reflect.getGetterSource("firstName"));
        System.out.println(reflect.getSetterSource(String.class, "firstName"));

        Student[] students = new Student[] {
                new Student(1, "Nik", 1000d),
                new Student(2, "Samantha", 500d),
                new Student(3, "Jack", null)
        };

        Printer printer = new Printer();
        printer.print(students);

        Timer.getSeconds();

        String[] testSortArray = {"Barbara", "Nik", "Tom", "Jack", "Sandra"};

        StandartSort standartSort = new StandartSort();
        System.out.println(Arrays.toString(standartSort.sortArray(testSortArray)));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sortArray(testSortArray)));
    }

}
