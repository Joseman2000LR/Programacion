package es.ies.puerto.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import es.ies.puerto.models.Artist;

@Component
public class ArtistRepositoryV2 {
    private List<Artist> list;
    private ArtistRepository artistRepository;


    @Autowired
    public void setSongRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public ArtistRepositoryV2(){
    }

    public List<Artist> getALL(){
            return artistRepository.getList();
    }
    public Artist getById(String id) {
         Artist song = new Artist(id);
        int indice = list.indexOf(song);
        if (indice >=0) {
            return list.get(indice);
        }
        return null;
    }
}
