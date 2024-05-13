package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.dto.PersonajeDto;
import es.ies.puerto.modelo.entidades.Personaje;

public class MapperPersonaje {

    public static PersonajeDto personajeToPersonajeDto(Personaje personaje) {
        PersonajeDto personajeDto = null;
        if (personaje == null) {
            return personajeDto;
        }

        personajeDto = new PersonajeDto();
        personajeDto.setId(personaje.getId());
        personajeDto.setNombre(personaje.getNombre());
        personajeDto.setGenero(personaje.getGenero());
        personajeDto.setAlias(personaje.getAlias());
        personajeDto.setPoderes(personaje.getPoderes());
        personajeDto.setEquipamientos(personaje.getEquipamientos());
        return personajeDto;
    }

    public static Personaje personajeDtoTPersonaje(PersonajeDto personajeDto) {
        Personaje personaje = null;
        if (personajeDto == null) {
            return personaje;
        }

        personaje = new Personaje();
        personaje.setId(personajeDto.getId());
        personaje.setNombre(personajeDto.getNombre());
        personaje.setGenero(personajeDto.getGenero());
        personaje.setAlias(personajeDto.getAlias());
        personaje.setPoderes(personajeDto.getPoderes());
        personaje.setEquipamientos(personajeDto.getEquipamientos());
        return personaje;
    }

}
