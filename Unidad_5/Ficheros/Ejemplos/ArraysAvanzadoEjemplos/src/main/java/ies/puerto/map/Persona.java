package ies.puerto.map;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return " nombre='" + getNombre() + "'" +
                ", dni='" + getDni();
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Persona persona = (Persona) object;
        return java.util.Objects.equals(dni, persona.dni);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), dni);
    }
}
