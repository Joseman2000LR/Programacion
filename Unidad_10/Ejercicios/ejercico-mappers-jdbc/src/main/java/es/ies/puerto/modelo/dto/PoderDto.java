package es.ies.puerto.modelo.dto;

import java.util.Objects;

public class PoderDto {
    private String id;
    private String nombre;

    public PoderDto() {

    }

    public PoderDto(String id) {
        this.id = id;

    }

    public PoderDto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PoderDto)) {
            return false;
        }
        PoderDto poderDto = (PoderDto) o;
        return Objects.equals(id, poderDto.id);
    }

}
