package ru.isys.trainings.task13.src.main.java.factory;

import dao.SingerJdbcDao;

public class SingerJdbcDaoFactory implements AbstractSingerDaoFactory {

    private static volatile SingerJdbcDaoFactory instance;

    public static SingerJdbcDaoFactory getInstance() {

        if (instance == null) {
            synchronized (SingerJdbcDaoFactory.class) {
                if (instance == null) {
                    instance = new SingerJdbcDaoFactory();
                }
            }
        }

        return instance;

    }

    public SingerJdbcDaoFactory() {
    }

    @Override
    public SingerJdbcDao createSingerDao() {
        return new SingerJdbcDao();
    }
}
