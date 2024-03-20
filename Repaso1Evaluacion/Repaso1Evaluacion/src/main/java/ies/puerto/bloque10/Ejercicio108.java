package ies.puerto.bloque10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Desarrolla un método para ordenar un array de objetos Persona por edad, de
 * menor a mayor.
 */
public class Ejercicio108 {
    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio108(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Ejercicio108[] personas = new Ejercicio108[3];

        personas[0] = new Ejercicio108("Juan", "Pérez", 25);
        personas[1] = new Ejercicio108("María", "Gómez", 30);
        personas[2] = new Ejercicio108("Carlos", "López", 22);
        Arrays.sort(personas, Comparator.comparingInt(Ejercicio108::getEdad));

        System.out.println("Información de todas las personas después de ordenar por edad:");
        for (Ejercicio108 persona : personas) {
            persona.mostrarInformacion();
        }
    }

}