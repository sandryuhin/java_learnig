package ru.isys.trainings.task13.src.main.java.factory;

import dao.SingerDao;

public interface AbstractSingerDaoFactory {

    public SingerDao createSingerDao();

}
