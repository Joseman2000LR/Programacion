package es.ies.puerto.services;


import es.ies.puerto.models.SongDto;
import es.ies.puerto.repositories.SongRepository;
import javax.ws.rs.*;
@Path("/")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class SongService {

    public SongService(SongRepository songRepository) {
        songRepository = new SongRepository();
    }

    private SongRepository songRepository ;

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public SongDto getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }
}
