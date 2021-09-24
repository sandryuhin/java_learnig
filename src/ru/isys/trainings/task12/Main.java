package ru.isys.trainings.task12;

import ru.isys.trainings.task11.unit2.factory.SingerFileDaoFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(SingerFileDaoFactory.getInstance().createSingerDao().findSingers());
    }

}
