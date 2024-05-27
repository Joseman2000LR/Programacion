package es.ies.puerto.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import es.ies.puerto.models.Artist;

@Repository
public class ArtistRepository {
    private List<Artist> list;
    private SongRepository songRepository;

    public List<Artist> getList() {
        return this.list;
    }

    public void setList(List<Artist> list) {
        this.list = list;
    }

    public SongRepository getSongRepository() {
        return this.songRepository;
    }
    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }


    public ArtistRepository(){
        list = new ArrayList<>();
        list.add(new Artist("1","pepe"));
        list.add(new Artist("2","Michael"));

    }

    public Artist getByArtist(String id){
        Artist artist = new Artist(id);
        int indice = list.indexOf(artist);
        if (indice >=0) {
            
            artist= list.get(indice);
            artist.getSongs().add(songRepository.getSongById(id));
            return artist;
        }
        return null;
    }
}
