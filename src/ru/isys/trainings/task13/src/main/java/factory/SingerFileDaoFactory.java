package ru.isys.trainings.task13.src.main.java.factory;

import dao.SingerFileDao;

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

    public SingerFileDaoFactory() {
    }

    @Override
    public SingerFileDao createSingerDao() {
        return new SingerFileDao();
    }
}
