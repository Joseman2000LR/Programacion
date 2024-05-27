package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.ArtistRepository;
import es.ies.puerto.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/v1/artist")
public class ArtistService {
    private static Logger LOG = LoggerFactory.getLogger(ArtistService.class);

    private ArtistRepository artistRepository;

    public ArtistService() {
    }
    

    @Autowired
    public void setSongRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }
   @GetMapping("/")
    public List<Artist> getArtist(){
        return artistRepository.getList();
    }
}
