package ru.isys.trainings.task12;

import ru.isys.trainings.task11.unit1.Singer;
import ru.isys.trainings.task11.unit1.Sorter;
import ru.isys.trainings.task11.unit2.factory.AbstractSingerDaoFactory;
import ru.isys.trainings.task11.unit2.factory.SingerFileDaoFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        AbstractSingerDaoFactory abstractSingerDaoFactory = SingerFileDaoFactory.getInstance();
        List<Singer> singersSortedByAlbumCount = Sorter.sortByAlbumCount(abstractSingerDaoFactory.createSingerDao().findSingers(), 1);
        List<Singer> singersSortedByGenre = Sorter.sortByGenre(abstractSingerDaoFactory.createSingerDao().findSingers(), "Genre3");

        System.out.println(SingerFileDaoFactory.getInstance().createSingerDao().findSingers());
    }

}
