package main.java.ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private List<Float> calificaciones;

    public Alumno(String nombre, String apellidos, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = new ArrayList<>();
    }

    public Alumno(List<Float> calificaciones) {
        this.calificaciones = new ArrayList<>();
    }

    /***
     * 
     * @return
     */
    public float media() {
        float resultado = 0f;
        if (calificaciones.isEmpty()) {
            return resultado;
        }
        for (Float calificacion : calificaciones) {
            resultado = +calificacion;
        }
        return resultado / calificaciones.size();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Float> getCalificaciones() {
        return this.calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Alumno alumno = (Alumno) object;
        return java.util.Objects.equals(nombre, alumno.nombre) && java.util.Objects.equals(apellidos, alumno.apellidos)
                && java.util.Objects.equals(calificaciones, alumno.calificaciones);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, apellidos, calificaciones);
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", apellidos='" + getApellidos() + "'" +
                ", calificaciones='" + getCalificaciones() + "'" +
                "}";
    }

}
