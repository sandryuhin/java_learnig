import dao.SingerDao;
import entity.Singer;
import factory.AbstractSingerDaoFactory;
import factory.FactoryIndex;
import factory.SingerJdbcDaoFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String factoryIndex = args[0];
        if (factoryIndex.equals(FactoryIndex.JDBC.name())) {
            AbstractSingerDaoFactory singerDaoFactory = new SingerJdbcDaoFactory();
            SingerDao singerDao = singerDaoFactory.createSingerDao();
            List<Singer> singers = singerDao.findSingers();

            List<Singer> singersSortedByAlbumsAmount = Sorter.sortByAlbumCount(singers, 2);
//        List<Singer> singersSortedByGenre = Sorter.sortByGenre(singers, "Genre3");

            singerDao.saveSingers(singersSortedByAlbumsAmount);
//        singerDao.saveSingers(singersSortedByGenre);
        } else {
            // use file singer factory
        }

    }

}
