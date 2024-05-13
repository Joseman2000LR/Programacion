package es.ies.puerto.modelo.dto;

import java.util.Objects;

public class AliasDto {
    private String id;
    private String descripcion;
    private String personaje_id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AliasDto() {

    }

    public AliasDto(String id) {
        this.id = id;

    }

    public AliasDto(String id, String descripcion, String personaje_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AliasDto)) {
            return false;
        }
        AliasDto aliasDto = (AliasDto) o;
        return Objects.equals(id, aliasDto.id) && Objects.equals(descripcion, aliasDto.descripcion)
                && Objects.equals(personaje_id, aliasDto.personaje_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
