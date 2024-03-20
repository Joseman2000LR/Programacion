/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.SegundaParte.imple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author josemanuel
 */
public class Aula {
    private String nombre;
    Profesor profesor;
    List<Alumno> alumnos;

    public Aula(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Aula(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos =  new ArrayList<>();
    }
    /***
     * Funcion que da la media de alumnos de una aula
     * @return 
     */

    public float media() {
       float resultado = 0f;
        if (alumnos.isEmpty()) {
            return resultado;
        }
        for (Alumno alumno : alumnos) {
            resultado +=alumno.media();
        }
        return resultado / alumnos.size();
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
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
        final Aula other = (Aula) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Aula{" + "nombre=" + nombre + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }
    
    
    
}
