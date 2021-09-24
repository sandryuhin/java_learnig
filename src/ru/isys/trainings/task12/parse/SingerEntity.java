package ru.isys.trainings.task12.parse;

public enum SingerEntity {

    SINGER("Singer"),
    ALBUM("Album"),
    SONG("Song");

    private final String name;

    SingerEntity(String entityName) {
        this.name = entityName;
    }

    public String getName() {
        return name;
    }

}
