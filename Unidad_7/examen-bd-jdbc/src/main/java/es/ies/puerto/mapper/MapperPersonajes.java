package main.java.es.ies.puerto.mapper;

import es.ies.puerto.modelo.db.entidades.Personaje;
import main.java.es.ies.puerto.intercambio.PersonajeInt;

public class MapperPersonajes {
    public static Personaje personajeIntToPersonajeEntity(PersonajeInt personajeInt){
        Personaje personaje=null;
        if (personajeInt=null) {
            return null;
        }
        personaje = new Personaje();
        personaje.setId(personajeInt.getId());
        personaje.setAlias(MapperAlias.AliasIntToAlias(personajeInt.getAlias()));
    }
    public static PersonajeInt personajeEntityToPersonajeInt(Personaje personaje){
       PersonajeInt personajeInt=null;
       if (personaje=null) {
            return null;
       }
       personajeInt= new PersonajeInt();
       personajeInt.setId(personaje.getId());
       personajeInt.setAlias(MapperAlias.AliasToAliasInt(personaje.getAlias()));

    }
}
