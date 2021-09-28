package ru.isys.trainings.task13.src.main.java.dao;

import entity.Album;
import entity.Singer;
import entity.Song;
import parse.Parser;
import parse.SingerEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SingerFileDao implements SingerDao {
    @Override
    public List<Singer> findSingers() throws IOException {
//        Stubbier.subDao(SingerFileDao.class, "findSingers"); task11

        // я не стал фантазировать на счет названий, оставил как есть, только Durations проставил числовыми значениями
        Path filePath = Paths.get("D:\\Projects\\java\\learning\\task1\\src\\ru\\isys\\trainings\\task12\\singers.txt");
        List<String> fileStrings = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        Parser parser = new Parser();

        List<Singer> singers = new ArrayList<>();
        for (String fileString : fileStrings) {
            int lastSingerIndex = singers.size() == 0 ? 0 : singers.size() - 1;

            if (parser.isSinger(fileString)) {
                List<String> entityData = parser.getEntityData(SingerEntity.SINGER.getName(), fileString);
                String singerName = entityData.get(0);

                singers.add(new Singer(singerName, new ArrayList<>()));
            } else if (parser.isAlbum(fileString)) {
                List<String> entityData = parser.getEntityData(SingerEntity.ALBUM.getName(), fileString);
                String albumName = entityData.get(0);
                String albumGenre = entityData.get(1);

                Singer singer = singers.get(lastSingerIndex);

                singer.getAlbums().add(new Album(albumName, albumGenre, new ArrayList<>()));
            } else if (parser.isSong(fileString)) {
                List<String> entityData = parser.getEntityData(SingerEntity.SONG.getName(), fileString);
                String songName = entityData.get(0);
                Duration songDuration = Duration.ofSeconds(Integer.parseInt(entityData.get(1)));

                int lastAlbumIndex = singers.get(lastSingerIndex).getAlbums().size() - 1;
                Singer singer = singers.get(lastSingerIndex);
                Album album = singer.getAlbums().get(lastAlbumIndex);

                album.getSongs().add(new Song(songName, songDuration));
            }
        }

        return singers;
    }

    @Override
    public void saveSingers(List<Singer> singers) throws IOException {
//        Stubbier.subDao(SingerFileDao.class, "saveSingers"); task11

        List<String> stringList = singers.stream().map(Singer::toString).collect(Collectors.toList());

        Path filePath = Paths.get("D:\\Projects\\java\\learning\\task1\\src\\ru\\isys\\trainings\\task12\\filtered_singers.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Files.write(filePath, stringList, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}
