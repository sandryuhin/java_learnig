package ru.isys.trainings.task13.src.main.java.entity;

import java.util.List;

public class Album {

    private String name;
    private String genre;
    private List<Song> songs;

    public Album(String name, String genre, List<Song> songs) {
        this.name = name;
        this.genre = genre;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Album: " + name + ", " + genre);

        for (Song song : getSongs()) {
            output.append("\n       ").append(song.toString());
        }

        return output.toString();
    }
}
