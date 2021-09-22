package ru.isys.trainings.task11.unit2.dao;

import java.util.List;

public abstract class Dao<K, E> {

    public abstract List<E> getAll() throws DaoAccessException;

    public abstract void insert(E entity) throws DaoAccessException;

    public abstract void update(K id, E entity) throws DaoAccessException;

    public abstract void delete(K id) throws DaoAccessException;

}
