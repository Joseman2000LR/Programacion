package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.dto.PersonajeDto;
import es.ies.puerto.modelo.dto.PoderDto;
import es.ies.puerto.modelo.entidades.Poder;

public class MapperPoder {
    public static PoderDto poderTPoderDTo(Poder poder) {
        PoderDto poderDto = null;
        if (poder == null) {
            return poderDto;
        }

        poderDto = new PoderDto();
        poderDto.setId(poder.getId());
        poderDto.setNombre(poder.getNombre());
        return poderDto;
    }

    public static Poder poderDTOTOPoder(PoderDto poderDto) {
        Poder poder = null;
        if (poderDto == null) {
            return poder;
        }

        poder = new Poder();
        poder.setId(poderDto.getId());
        poder.setNombre(poderDto.getNombre());
        return poder;
    }
}
