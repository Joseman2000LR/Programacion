package es.ies.puerto.modelo.dto;

import java.util.Set;

import es.ies.puerto.modelo.entidades.Alias;
import es.ies.puerto.modelo.entidades.Equipamiento;
import es.ies.puerto.modelo.entidades.Poder;

public class PersonajeDto {
    private String id;
    private String nombre;
    private String genero;

    private Alias alias;
    private Set<Equipamiento> equipamientos;
    private Set<Poder> poderes;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Alias getAlias() {
        return this.alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Equipamiento> getEquipamientos() {
        return this.equipamientos;
    }

    public void setEquipamientos(Set<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<Poder> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    public PersonajeDto() {
    

    }

    public PersonajeDto(String id) {
        this.id = id;
    }

    public PersonajeDto(String id, String nombre, String genero, Alias alias, Set<Equipamiento> equipamientos,
            Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
    }

}
