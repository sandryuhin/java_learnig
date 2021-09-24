package ru.isys.trainings.task11.unit2.factory;

import ru.isys.trainings.task11.unit2.dao.SingerFileDao;

public class SingerFileDaoFactory implements AbstractSingerDaoFactory {

    private static volatile SingerFileDaoFactory instance;

    public static SingerFileDaoFactory getInstance() {

        if (instance == null) {
            synchronized (SingerFileDaoFactory.class) {
                if (instance == null) {
                    instance = new SingerFileDaoFactory();
                }
            }
        }

        return instance;

    }

    private SingerFileDaoFactory() {
    }

    @Override
    public SingerFileDao createSingerDao() {
        return new SingerFileDao();
    }
}
