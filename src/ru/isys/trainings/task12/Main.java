package ru.isys.trainings.task12;

import ru.isys.trainings.task11.unit1.Singer;
import ru.isys.trainings.task11.unit1.Sorter;
import ru.isys.trainings.task11.unit2.dao.SingerFileDao;
import ru.isys.trainings.task11.unit2.factory.SingerFileDaoFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        SingerFileDao singerFileDao = SingerFileDaoFactory.getInstance().createSingerDao();
        List<Singer> singersSortedByAlbumCount = Sorter.sortByAlbumCount(singerFileDao.findSingers(), 2);
//        List<Singer> singersSortedByGenre = Sorter.sortByGenre(singerFileDao.findSingers(), "Genre3");

        singerFileDao.saveSingers(singersSortedByAlbumCount);
    }

}
