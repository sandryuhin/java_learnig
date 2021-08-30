package ru.isys.trainings.task8;

import ru.isys.trainings.task8.unit1.WomenNames;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        WomenNames wn = new WomenNames();
        String names = wn.getNames();

        List<String> stream = Stream.of(names.split("\n"))
                .filter(item -> !item.equals("") && item.lastIndexOf("Имена для девочки на букву") == -1)
                .map(item -> item.replaceAll(" .*",""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        stream.forEach(System.out::println);
    }

}
