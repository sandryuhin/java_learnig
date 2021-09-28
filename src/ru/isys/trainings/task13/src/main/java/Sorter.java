import entity.Singer;

import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    public static List<Singer> sortByGenre(List<Singer> singers, String genre) {
        return singers.stream().filter(
                singer -> singer.getAlbums().stream().anyMatch(album -> album.getGenre().equals(genre))
        ).collect(Collectors.toList());
    }

    public static List<Singer> sortByAlbumCount(List<Singer> singers, int albumCount) {
        return singers.stream().filter(singer -> singer.getAlbums().size() >= albumCount).collect(Collectors.toList());
    }

}
