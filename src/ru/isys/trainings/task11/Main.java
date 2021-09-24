package ru.isys.trainings.task11;

import ru.isys.trainings.task11.unit1.Album;
import ru.isys.trainings.task11.unit1.Singer;
import ru.isys.trainings.task11.unit1.Song;
import ru.isys.trainings.task11.unit1.Sorter;
import ru.isys.trainings.task11.unit2.factory.SingerFileDaoFactory;
import ru.isys.trainings.task11.unit2.factory.SingerJdbcDaoFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Song> songsPack1 = new ArrayList<>();
        songsPack1.add(new Song("Song1", Duration.ofSeconds(200)));
        songsPack1.add(new Song("Song2", Duration.ofSeconds(200)));
        songsPack1.add(new Song("Song3", Duration.ofSeconds(200)));
        songsPack1.add(new Song("Song4", Duration.ofSeconds(200)));
        songsPack1.add(new Song("Song5", Duration.ofSeconds(200)));

        List<Song> songsPack2 = new ArrayList<>();
        songsPack1.add(new Song("LongSong1", Duration.ofSeconds(300)));
        songsPack1.add(new Song("LongSong2", Duration.ofSeconds(300)));
        songsPack1.add(new Song("LongSong3", Duration.ofSeconds(300)));
        songsPack1.add(new Song("LongSong4", Duration.ofSeconds(300)));
        songsPack1.add(new Song("LongSong5", Duration.ofSeconds(300)));

        List<Album> albums = new ArrayList<>();
        albums.add(new Album("FirstSong", "Pop", songsPack1));
        albums.add(new Album("SecondSong", "Rock", songsPack2));

        List<Singer> singers = new ArrayList<>();
        singers.add(new Singer("Bob", (byte) 35, Singer.Sex.MALE, albums));

        Sorter.sortByGenre(singers, "Pop").forEach(System.out::println);
        Sorter.sortByAlbumCount(singers, 1).forEach(System.out::println);

        System.out.println(SingerFileDaoFactory.getInstance().createSingerDao());
        System.out.println(SingerJdbcDaoFactory.getInstance().createSingerDao());

    }

}
