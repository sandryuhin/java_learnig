package ru.isys.trainings.task11.unit2.dao;

import ru.isys.trainings.task11.unit1.Singer;

import java.util.List;

public class SingerFileDao implements SingerDao {
    @Override
    public List<Singer> findSingers() {
        Stubbier.subDao(SingerFileDao.class, "findSingers");
        return null;
    }

    @Override
    public void saveSingers(List<Singer> singers) {
        Stubbier.subDao(SingerFileDao.class, "saveSingers");
    }
}
