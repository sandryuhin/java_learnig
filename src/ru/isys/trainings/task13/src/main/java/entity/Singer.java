package entity;

import java.util.List;

public class Singer {

    private String name;
    private List<Album> albums;

    public Singer(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Singer: " + name);

        for (Album album : getAlbums()) {
            output.append("\n   ").append(album.toString());
        }

        return output.toString();
    }
}
