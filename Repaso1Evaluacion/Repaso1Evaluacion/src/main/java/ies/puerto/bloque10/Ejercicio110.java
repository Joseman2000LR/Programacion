package ies.puerto.bloque10;

/**
 * Agrega un atributo dni (Documento Nacional de Identidad) a la clase Persona y
 * desarrolla un método para validar si un DNI ingresado es válido.
 */
public class Ejercicio110 {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public Ejercicio110(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("-----------------------");
    }

    public boolean validarDni(String dni) {
        if (dni.length() == 8 && dni.matches("\\d+")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Ejercicio110 persona1 = new Ejercicio110("Juan", "Pérez", 25, "12345678");

        Ejercicio110 persona2 = new Ejercicio110("María", "Gómez", 30, "abc12345");
        System.out.println("Información de la primera persona:");
        persona1.mostrarInformacion();

        System.out.println("Información de la segunda persona:");
        persona2.mostrarInformacion();

        System.out.println("Validación del DNI de la primera persona: " + persona1.validarDni(persona1.getDni()));
        System.out.println("Validación del DNI de la segunda persona: " + persona2.validarDni(persona2.getDni()));
    }

}