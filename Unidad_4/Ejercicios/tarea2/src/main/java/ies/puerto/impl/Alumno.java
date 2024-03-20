package ies.puerto.impl;

import java.time.LocalDate;
import java.time.Period;

import ies.puerto.abstarc.Persona;

public class Alumno extends Persona {
    private String nivel;

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    @Override
    public int anios() {

        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

    public void estudiar() {
        System.out.println("Estudiando...");
    }
}
