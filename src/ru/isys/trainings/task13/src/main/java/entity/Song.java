package entity;

import java.time.Duration;

public class Song {

    private String name;
    private Duration duration;

    public Song(String name, Duration duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song: " + name + ", " + duration.getSeconds();
    }
}
