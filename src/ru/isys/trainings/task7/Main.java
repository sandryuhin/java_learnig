package ru.isys.trainings.task7;

import ru.isys.trainings.task7.unit1.LinkList;

public class Main {

    public static void main(String[] args) {

        LinkList<String> linkList = new LinkList<>();

        linkList.add("test1");
        linkList.add("test2");
        linkList.add("test3");

        linkList.add(3, "LA LA LA");

        for (String llValue : linkList) {
            System.out.println(llValue);
        }

    }

}