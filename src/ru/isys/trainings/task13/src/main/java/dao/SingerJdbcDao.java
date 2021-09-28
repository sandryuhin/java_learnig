package ru.isys.trainings.task13.src.main.java.dao;

import entity.Album;
import entity.Singer;
import entity.Song;

import java.sql.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SingerJdbcDao implements SingerDao {
    @Override
    public List<Singer> findSingers() {

        List<Singer> singers = new ArrayList<>();

        try {

            Class.forName("org.postgresql.Driver");

            try (Connection connection = DriverManager.getConnection(PG_URL, PG_USER, PG_PASS)) {
                PreparedStatement statement = connection.prepareStatement(
                        "SELECT singers.name       SingerName,\n" +
                                "       albums.name    AlbumName,\n" +
                                "       genres.name    GenreName,\n" +
                                "       songs.name     SongName,\n" +
                                "       songs.duration SongDuration\n" +
                                "FROM singers\n" +
                                "         JOIN albums ON singers.id = albums.singer\n" +
                                "         JOIN genres ON albums.genre = genres.id\n" +
                                "         JOIN songs  ON albums.id = songs.album\n" +
                                "ORDER BY SingerName, AlbumName"
                );

                ResultSet rs = statement.executeQuery();

                Singer singer = null;
                Album album = null;

                while (rs.next()) {

                    String singerName = rs.getString("SingerName");
                    if (singer == null || !singer.getName().equals(singerName)) {

                        if (singer != null) {
                            singers.add(singer);
                        }

                        singer = new Singer(singerName, new ArrayList<>());
                    }

                    String albumName = rs.getString("AlbumName");
                    if (album == null || !album.getName().equals(albumName)) {
                        album = new Album(albumName, rs.getString("GenreName"), new ArrayList<>());
                        singer.getAlbums().add(album);
                    }

                    Duration songDuration = Duration.ofSeconds(rs.getInt("SongDuration"));
                    album.getSongs().add(new Song(rs.getString("SongName"), songDuration));

                }

                singers.add(singer);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return singers;
    }

    @Override
    public void saveSingers(List<Singer> singers) {

        try {

            Class.forName("org.postgresql.Driver");

            try (Connection connection = DriverManager.getConnection(PG_URL, PG_USER, PG_PASS)) {
                clearFilteredTables(connection);

                PreparedStatement singerStatement = connection.prepareStatement("INSERT INTO singers_filtred (name) VALUES (?) RETURNING id");
                PreparedStatement genreStatement = connection.prepareStatement("INSERT INTO genres_filtred (name) VALUES (?) RETURNING id");
                PreparedStatement albumStatement = connection.prepareStatement("INSERT INTO albums_filtred (name, genre, singer) VALUES (?,?,?) RETURNING id");
                PreparedStatement songStatement = connection.prepareStatement("INSERT INTO songs_filtred (name, duration, album) VALUES (?,?,?)");

                for (Singer singer : singers) {
                    // save Singer
                    singerStatement.setString(1, singer.getName());
                    singerStatement.execute();
                    int singerId = getEntityId(singerStatement);

                    for (Album album : singer.getAlbums()) {
                        // save Genre
                        String genreName = album.getGenre();
                        genreStatement.setString(1, genreName);
                        genreStatement.execute();
                        int genreId = getEntityId(genreStatement);
                        // save Album
                        albumStatement.setString(1, album.getName());
                        albumStatement.setInt(2, genreId);
                        albumStatement.setInt(3, singerId);
                        albumStatement.execute();
                        int albumId = getEntityId(albumStatement);
                        // save Song
                        for (Song song : album.getSongs()) {
                            songStatement.setString(1, song.getName());
                            songStatement.setInt(2, (int) song.getDuration().getSeconds());
                            songStatement.setInt(3, albumId);
                            songStatement.execute();
                        }

                    }

                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    private int getEntityId(PreparedStatement statement) throws SQLException {
        ResultSet rs = statement.getResultSet();
        rs.next();

        return rs.getInt("id");
    }

    private void clearFilteredTables(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "TRUNCATE TABLE albums_filtred, genres_filtred, singers_filtred, songs_filtred;"
        );

        statement.execute();
    }
}
