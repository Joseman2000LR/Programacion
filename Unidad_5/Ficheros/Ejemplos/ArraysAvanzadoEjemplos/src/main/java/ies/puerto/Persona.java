package main.java.ies.puerto;

import java.util.List;
import java.util.Objects;

public class Persona {
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    List<Double> calificaciones;

    public Persona(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, List<Double> calificaciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calificaciones = calificaciones;
    }

    public Double media() {
        Double resultado = 0d;
        Double suma = 0d;
        if (calificaciones.isEmpty()) {
            return resultado;
        }

        for (Double nota : calificaciones) {
            suma = +nota;

        }
        return resultado = suma / calificaciones.size();
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "{" +
                " dni= " + getDni() +
                ", nombre= " + getNombre() +
                ", apellido1= " + getApellido1() +
                ", apellido2= " + getApellido2() +
                "}";
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Persona persona = (Persona) object;
        return Objects.equals(dni, persona.dni);
    }

    public int hashCode() {
        return Objects.hash(dni);
    }
}
