package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.dto.EquipamientoDto;
import es.ies.puerto.modelo.entidades.Equipamiento;

public class MapperEquipamineto {
    public static EquipamientoDto equipamientoToeEquipamientoDto(Equipamiento equipamiento) {
        EquipamientoDto equipamientoDto = null;

        if (equipamiento == null) {
            return equipamientoDto;
        }
        equipamientoDto = new EquipamientoDto();
        equipamientoDto.setId(equipamiento.getId());
        equipamientoDto.setDescripcion(equipamiento.getDescripcion());
        equipamientoDto.setNombre(equipamiento.getNombre());
        equipamientoDto.setPersonaje_id(equipamiento.getPersonaje_id());

        return equipamientoDto;
    }

    public static Equipamiento equipamientoDtoTEquipamiento(EquipamientoDto equipamientoDto) {
        Equipamiento equipamiento = null;

        if (equipamientoDto == null) {
            return null;
        }

        equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDto.getId());
        equipamiento.setDescripcion(equipamientoDto.getDescripcion());
        equipamiento.setNombre(equipamientoDto.getNombre());
        equipamiento.setPersonaje_id(equipamiento.getPersonaje_id());
        
        return equipamiento;
    }
}
