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

        String key1 = "lalala";
        String val1 = "nanana";
        String key2 = "lalalab";
        String val2 = "nanana2";

        stringHashedMap.put(key1, val1);
        stringHashedMap.put(key2, val2);
        System.out.println(stringHashedMap.get(key1).getValue());
        System.out.println(stringHashedMap.get(key2).getValue());

        System.out.println(stringHashedMap.constraintsKey("xcxcxc"));
        System.out.println(stringHashedMap.constraintsValue(val1));
    }

}
