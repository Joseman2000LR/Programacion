package es.ies.puerto.modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Alias implements Serializable {
    String id;
    String descripcion;
    String personaje_id;

    public Alias() {
    }

    public Alias(String id) {
        this.id = id;
    }

    public Alias(String id, String descripcion, String personaje_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }

}
