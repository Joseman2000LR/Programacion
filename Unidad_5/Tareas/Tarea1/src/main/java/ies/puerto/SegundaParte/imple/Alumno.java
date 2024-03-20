/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.SegundaParte.imple;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ies.puerto.SegundaParte.abstractas.Persona;

/**
 *
 * @author josemanuel
 */
public class Alumno extends Persona {
    List<Nota> notas;

    public Alumno(String dni) {
        super(dni);
    }

    public Alumno(String dni, List<Nota> notas) {
        super(dni);
        this.notas = new ArrayList<>();// #1 corregir ento en las demas
    }

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    /**
     * Funcion que da la media de las notas de alumno
     * 
     * @return
     */
    public float media() {
        float resultado = 0f;
        if (notas.isEmpty()) {
            return resultado;
        }
        for (Nota nota : notas) {
             resultado += nota.getValor();
        }
        return resultado / notas.size();

    }

    /**
     *
     * @return
     */
    //#1
    public float notaMaxima() {
        float resultado = 0f;
        if (notas.isEmpty()) {
            return resultado;
        }
        for (Nota nota : notas) {
            if( nota.getValor() > resultado){
                resultado = nota.getValor();
            }
        }
        return resultado;

    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.notas);
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
        return Objects.equals(this.notas, other.notas);
    }

    @Override
    public String toString() {
        return "Alumno{" + "notas=" + notas + '}';
    }

}
