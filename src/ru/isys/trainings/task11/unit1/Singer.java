package ru.isys.trainings.task11.unit1;

import java.util.List;

public class Singer {

    public enum Sex {
        MALE,
        FEMALE
    }

    private String name;
    private List<Album> albums;

    public Singer(String name, byte age, Sex sex, List<Album> albums) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.albums = albums;
    }

    private byte age;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
