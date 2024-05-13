package es.ies.puerto.repositories;

import es.ies.puerto.models.SongDto;

public class SongRepository {

    public SongDto getSongById(String id) {
        return new SongDto(id, "Karma Police","4.00");
    }
}
