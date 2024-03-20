package ies.puerto.bloque10;

/**
 * Crea una clase Ejercicio101 con atributos como nombre, apellido y edad.
 * Proporciona un constructor para inicializar estos atributos. Implementa el
 * método main para verificar que funciona correctamente.
 */
public class Ejercicio101 {
    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio101(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Ejercicio101 ejercicio101 = new Ejercicio101("Juan", "Pérez", 25);

        // Mostrar información de la Ejercicio101
        System.out.println("Nombre: " + ejercicio101.getNombre());
        System.out.println("Apellido: " + ejercicio101.getApellido());
        System.out.println("Edad: " + ejercicio101.getEdad());
    }
}