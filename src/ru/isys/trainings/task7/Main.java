package ru.isys.trainings.task7;

import ru.isys.trainings.task7.unit1.LinkList;
import ru.isys.trainings.task7.unit2.HashedMap;

public class Main {

    public static void main(String[] args) {

        // unit1
        LinkList<String> linkList = new LinkList<>();

        linkList.add("test1");
        linkList.add("test2");
        linkList.add("test3");

        for (String llValue : linkList) {
            System.out.println(llValue);
        }

        // unit2
        HashedMap<String, String> stringHashedMap = new HashedMap<>();
        stringHashedMap.put("lalala", "nanana");
        stringHashedMap.put("lalala", "nanana");

    }

}
