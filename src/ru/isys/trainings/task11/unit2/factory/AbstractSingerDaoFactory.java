package ru.isys.trainings.task11.unit2.factory;

import ru.isys.trainings.task11.unit2.dao.SingerDao;

public interface AbstractSingerDaoFactory {

    public SingerDao createSingerDao();

}
