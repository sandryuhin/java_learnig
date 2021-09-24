package ru.isys.trainings.task11.unit2.dao;

import ru.isys.trainings.task11.unit1.Singer;

import java.util.List;

public interface SingerDao {

    public List<Singer> findSingers();

    public void saveSingers(List<Singer> singers);

}
