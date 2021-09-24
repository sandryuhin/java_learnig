package ru.isys.trainings.task11.unit2.dao;

import ru.isys.trainings.task11.unit1.Singer;

import java.io.IOException;
import java.util.List;

public interface SingerDao {

    List<Singer> findSingers() throws IOException;

    void saveSingers(List<Singer> singers) throws IOException;

}
