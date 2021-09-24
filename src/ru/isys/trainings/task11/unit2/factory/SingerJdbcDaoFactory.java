package ru.isys.trainings.task11.unit2.factory;

import ru.isys.trainings.task11.unit2.dao.SingerJdbcDao;

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

    private SingerJdbcDaoFactory() {
    }

    @Override
    public SingerJdbcDao createSingerDao() {
        return new SingerJdbcDao();
    }
}
