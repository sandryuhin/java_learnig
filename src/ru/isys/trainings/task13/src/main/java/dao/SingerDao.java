package dao;

import entity.Singer;

import java.io.IOException;
import java.util.List;

public interface SingerDao {

    String PG_URL = "jdbc:postgresql://localhost:5432/test_db";
    String PG_USER = "test_user";
    String PG_PASS = "test_pass";

    List<Singer> findSingers() throws IOException;

    void saveSingers(List<Singer> singers) throws IOException;

}
