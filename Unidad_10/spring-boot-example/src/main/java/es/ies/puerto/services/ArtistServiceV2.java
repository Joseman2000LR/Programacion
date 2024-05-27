package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.ArtistRepository;
import es.ies.puerto.repositories.ArtistRepositoryV2;
import es.ies.puerto.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/v2/artist")
public class ArtistServiceV2 {
    private static Logger LOG = LoggerFactory.getLogger(ArtistServiceV2.class);

    private ArtistRepositoryV2 artistRepositoryV2;

    public ArtistServiceV2() {
    }
    

    @Autowired
    public void setSongRepository(ArtistRepositoryV2 artistRepositoryV2) {
        this.artistRepositoryV2 = artistRepositoryV2;
    }
    @GetMapping("/")
    public List<Artist> getArtist(){
        return artistRepositoryV2.getALL();
    }
   
}
