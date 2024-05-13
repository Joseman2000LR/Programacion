package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.dto.AliasDto;
import es.ies.puerto.modelo.entidades.Alias;

public class MapperAlias {
    public static AliasDto aliasToAliasDto(Alias alias) {
        AliasDto aliasDto = null;

        if (alias == null) {
            return aliasDto;
        }
        aliasDto = new AliasDto();
        aliasDto.setId(alias.getId());
        aliasDto.setDescripcion(alias.getDescripcion());
        aliasDto.setPersonaje_id(alias.getPersonaje_id());
        return aliasDto;
    }

    public static Alias aliasDtoToAlias(AliasDto aliasDto) {
        Alias alias = null;
        if (aliasDto == null) {
            return alias;
        }

        alias = new Alias();
        alias.setId(aliasDto.getId());
        alias.setDescripcion(aliasDto.getDescripcion());
        alias.setPersonaje_id(aliasDto.getPersonaje_id());
        return alias;
    }
}
