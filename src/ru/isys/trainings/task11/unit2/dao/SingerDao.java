package ru.isys.trainings.task11.unit2.dao;

import ru.isys.trainings.task11.unit1.Singer;

import java.util.List;

class SingerFactory extends Dao<Integer, Singer> implements Stubbier {
    @Override
    public List<Singer> getAll() {
        subDao(SingerFactory.class, "getAll");
        return null;
    }

    @Override
    public void insert(Singer entity) {
        subDao(SingerFactory.class, "insert");
    }

    @Override
    public void update(Integer id, Singer entity) {
        subDao(SingerFactory.class, "update");
    }

    @Override
    public void delete(Integer id) {
        subDao(SingerFactory.class, "delete");
    }
}
