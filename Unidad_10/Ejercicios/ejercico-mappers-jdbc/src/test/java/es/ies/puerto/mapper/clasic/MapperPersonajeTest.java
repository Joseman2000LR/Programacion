package es.ies.puerto.mapper.clasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.dto.PersonajeDto;
import es.ies.puerto.modelo.entidades.Personaje;
import es.ies.puerto.modelo.mapper.MapperPersonaje;

public class MapperPersonajeTest extends MappersHelp {
    PersonajeDto personajeDtoMapper;
    Personaje personajeEntityMapper;

    @Test
    public void personajeTOPersonajeDTOTest() {
        personajeDtoMapper = MapperPersonaje.personajeToPersonajeDto(personajeEntityMapper);
        Assertions.assertEquals(personajeDtoMapper.getId(), personajeDtoMapper.getId());
        Assertions.assertEquals(personajeDtoMapper.getNombre(), personajeDtoMapper.getNombre());
        Assertions.assertEquals(personajeDtoMapper.getGenero(), personajeDtoMapper.getGenero());
        Assertions.assertEquals(personajeDtoMapper.getAlias(), personajeDtoMapper.getAlias());
        Assertions.assertEquals(personajeDtoMapper.getEquipamientos(), personajeDtoMapper.getEquipamientos());
        Assertions.assertEquals(personajeDtoMapper.getPoderes(), personajeDtoMapper.getPoderes());
    }

    @Test
    public void personajeDToTOPersonajeTest() {
        personajeEntityMapper = MapperPersonaje.personajeDtoTPersonaje(personajeDtoMapper);
        Assertions.assertEquals(personajeEntityMapper.getId(), personajeDtoMapper.getId());
        Assertions.assertEquals(personajeEntityMapper.getNombre(), personajeDtoMapper.getNombre());
        Assertions.assertEquals(personajeEntityMapper.getGenero(), personajeDtoMapper.getGenero());
        Assertions.assertEquals(personajeEntityMapper.getAlias(), personajeDtoMapper.getAlias());
        Assertions.assertEquals(personajeEntityMapper.getEquipamientos(), personajeDtoMapper.getEquipamientos());
        Assertions.assertEquals(personajeEntityMapper.getPoderes(), personajeDtoMapper.getPoderes());

    }

}
