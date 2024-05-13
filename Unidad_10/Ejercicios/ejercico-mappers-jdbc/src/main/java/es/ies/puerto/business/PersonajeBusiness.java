package es.ies.puerto.business;

import es.ies.puerto.modelo.dto.PersonajeDto;
import es.ies.puerto.modelo.entidades.Alias;
import es.ies.puerto.modelo.entidades.Personaje;
import es.ies.puerto.modelo.mapper.MapperAlias;
import es.ies.puerto.modelo.mapper.MapperPersonaje;

public class PersonajeBusiness {
    public PersonajeDto obtenPersonaje(PersonajeDto personajeDto) {
        if (personajeDto == null) {
            return null;
        }
        Personaje personaje = MapperPersonaje.personajeDtoTPersonaje(personajeDto);

        PersonajeDto respuesta = MapperPersonaje.personajeToPersonajeDto(personaje);
        return respuesta;

    }

    public PersonajeDto obtenPersonaje(String id) {
        if (id == null) {
            return null;
        }
        PersonajeDto personajeDto = new PersonajeDto(id);
        return obtenPersonaje(personajeDto);
    }
}
