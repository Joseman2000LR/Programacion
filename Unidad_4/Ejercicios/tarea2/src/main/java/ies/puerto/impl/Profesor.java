package ies.puerto.impl;

import java.time.LocalDate;
import java.time.Period;

public class Profesor extends Empleado {
    private String especialidad;

    public Profesor(String nombre, String fechaNacimiento, float salario, String trabajo, String especialidad) {
        super(nombre, fechaNacimiento, salario, trabajo);
        this.especialidad = especialidad;
    }

    @Override
    public int anios() {
        // Implementación del cálculo de la edad
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

    @Override
    public float calcularSalario() {
        // Implementación del cálculo del salario para un profesor
        return salario + 500; // Supongamos un bono fijo de 500 para los profesores
    }

    @Override
    public String trabajar() {
        return "Impartir clases de " + especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", salario=" + salario +
                ", trabajo='" + trabajo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

}
