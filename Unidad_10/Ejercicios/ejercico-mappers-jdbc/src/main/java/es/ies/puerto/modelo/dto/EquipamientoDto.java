package es.ies.puerto.modelo.dto;

import java.util.Objects;

public class EquipamientoDto {

    private String id;
    private String nombre;
    private String descripcion;
    private String personaje_id;

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

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return this.personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }

    public EquipamientoDto() {

    }

    public EquipamientoDto(String id) {
        this.id = id;

    }

    public EquipamientoDto(String id, String nombre, String descripcion, String personaje_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EquipamientoDto)) {
            return false;
        }
        EquipamientoDto equipamientoDto = (EquipamientoDto) o;
        return Objects.equals(id, equipamientoDto.id);
    }

}
