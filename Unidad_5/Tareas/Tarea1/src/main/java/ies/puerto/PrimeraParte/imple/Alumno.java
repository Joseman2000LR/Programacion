package ies.puerto.imple;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author josem
 */
public class Alumno {
   private String nombre;
   private String apellido;
   private List<Float> calificaciones;

    public Alumno(String nombre, String apellido, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }
     public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * 
     * @return
     */
    public float calcularPromedioCalificaciones() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }

        return suma / calificaciones.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.apellido);
        hash = 13 * hash + Objects.hashCode(this.calificaciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.calificaciones, other.calificaciones);
    }

    @Override
    public String toString() {
        return "Alumno " + "nombre= " + nombre + ", apellido= " + apellido + ", calificaciones= " + calificaciones;
    }

}
