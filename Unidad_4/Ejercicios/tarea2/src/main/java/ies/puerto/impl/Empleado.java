package ies.puerto.impl;

import ies.puerto.abstarc.Persona;
import ies.puerto.interfaz.ITrabajador;

public abstract class Empleado extends Persona implements ITrabajador {
    public float salario;
    public String trabajo;

    public Empleado(String nombre, String fechaNacimiento, float salario, String trabajo) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }

    public abstract float calcularSalario();

    public abstract String toString();
}
