package ru.isys.trainings.task13.src.main.java.parse;

import java.util.List;

public class Parser {

    public List<String> getEntityData(String entityName, String entityString) {
        return List.of(entityString
                .replace(" ", "")
                .replace(entityName + ":", "")
                .split(","));
    }

    public boolean isSinger(String someString) {
        return someString.contains(SingerEntity.SINGER.getName());
    }

    public boolean isAlbum(String someString) {
        return someString.contains(SingerEntity.ALBUM.getName());
    }

    public boolean isSong(String someString) {
        return someString.contains(SingerEntity.SONG.getName());
    }

}
