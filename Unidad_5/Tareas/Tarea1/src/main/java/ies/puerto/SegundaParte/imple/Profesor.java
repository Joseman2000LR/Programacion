/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.puerto.SegundaParte.imple;

import ies.puerto.SegundaParte.abstractas.Trabajador;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author josemanuel
 */
public class Profesor extends Trabajador{
    private String especialidad;

    public Profesor(String nombre) {
        super(nombre);
    }
    
    
    public Profesor(String nombre, String dni, String fechaNacimiento, float salario ,String especialidad) {
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad=especialidad;
    }
    
    
     /**
     * Funcion que da la media de salario de Profesor
     * @return 
     */
    public float media(List<Profesor> profesores) {
       float resultado = 0f;
        if( profesores.isEmpty()) {
            return resultado;
        }
        for (Profesor profesor : profesores) {
            resultado =+profesor.getSalario();
        }
        return resultado / profesores.size();
        
    }
    /**
     * Funcion que da el salario del profesor con el mayor salario 
     * y el menor salario 
     * @param profesores
     * @return 
     */
    public String MaxAndMin(List<Profesor> profesores) {
        String resultado="";
        if (profesores.isEmpty()) {
            return resultado="La lista esta vacia";
        }
        float salarioMaximo = profesores.get(0).getSalario();
        
         for (Profesor profesor : profesores) {
            if (profesor.getSalario() > salarioMaximo) {
                salarioMaximo = profesor.getSalario();
            }
        }
        float salarioMinimo = profesores.get(2).getSalario();
        
        for (Profesor profesor : profesores) {
            if (profesor.getSalario() > salarioMaximo) {
                salarioMaximo = profesor.getSalario();
            }
        }
        return resultado="El salario minimo es :"+ salarioMinimo+"Y el maximo es :"+salarioMaximo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.especialidad);
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
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.especialidad, other.especialidad);
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    
    
}
