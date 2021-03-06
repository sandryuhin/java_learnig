package ru.isys.trainings.task8;

import ru.isys.trainings.task8.unit1.WomenNames;
import ru.isys.trainings.task8.unit2.StringHelper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // unit1
        WomenNames wn = new WomenNames();
        String names = wn.getNames();

        List<String> namesList = Stream.of(names.split("\n"))
                .filter(item -> !item.equals("") && !item.startsWith("Имена для девочки на букву"))
                .map(item -> item.replaceAll(" .*", ""))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

//        namesList.forEach(System.out::println);

        // unit2
        List<String> vowels3 = namesList.stream()
                .filter(item -> StringHelper.getVowelsCount(item) == 3)
                .collect(Collectors.toList());

//        vowels3.forEach(System.out::println);

        List<String> vowels4 = namesList.stream()
                .filter(item -> StringHelper.getVowelsCount(item) == 4)
                .collect(Collectors.toList());

//        vowels4.forEach(System.out::println);

        List<String> vowels5 = namesList.stream()
                .filter(item -> StringHelper.getVowelsCount(item) == 5)
                .collect(Collectors.toList());

//        vowels5.forEach(System.out::println);

        String longName = namesList.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

//        System.out.println(longName);

        String shortName = namesList.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);

//        System.out.println(shortName);

        String nameHas_YEEEEE = namesList.stream()
                .filter(item -> item.startsWith("Е"))
                .findFirst()
                .orElse(null);

//        System.out.println(nameHas_YEEEEE);

        boolean allHaveVowels = namesList.stream()
                .allMatch(item -> StringHelper.getVowelsCount(item) > 0);

//        System.out.println(allHaveVowels);

        Map<String, Integer> namesMap = namesList.stream()
                .distinct()
                .collect(Collectors.toMap(item -> item, String::length));

//        namesMap.forEach((key, value) -> {
//            System.out.println(key + " => " + value);
//        });

        Map<Integer, List<Map.Entry<String, Integer>>> sortedGroupingMap = namesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.groupingBy(Map.Entry::getValue, TreeMap::new, Collectors.toList()));

//        sortedGroupingMap.forEach((key, value) -> {
//            System.out.println(key);
//            value.forEach(item -> System.out.println(item.getKey()));
//        });

        TreeMap<Integer, List<String>> newSortedGroupingMap = new TreeMap<>();
        namesMap.forEach((value, key) -> {
            if (!newSortedGroupingMap.containsKey(key)) {
                newSortedGroupingMap.put(key, new ArrayList<>());
            }

            List<String> listItem = newSortedGroupingMap.get(key);
            listItem.add(value);
        });

//        newSortedGroupingMap.forEach((key, value) -> {
//            System.out.println(key);
//            value.forEach(System.out::println);
//        });

        Map<Boolean, List<String>> separatedNames = namesList.stream()
                .collect(Collectors.partitioningBy(StringHelper::isVowel, Collectors.toList()));

        separatedNames.forEach((key, value) -> System.out.println(key + " " + value));

    }

}
