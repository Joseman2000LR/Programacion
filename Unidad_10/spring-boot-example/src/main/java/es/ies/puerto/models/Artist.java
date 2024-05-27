package es.ies.puerto.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.repositories.ArtistRepository;
import java.util.Objects;

public class Artist implements Serializable{
    private String id;
    private String name;
    private List<Song> songs;


    public Artist() {
       
    }

    public Artist(String id, String name) {
        this.id = id;
        this.name = name;
        songs = new ArrayList<>();
    }
    public Artist(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) o;
        return Objects.equals(id, artist.id) && Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

   
}
