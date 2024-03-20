package ies.puerto.bloque10;

/**
 * Crea un array de objetos Persona y llena la lista con varias instancias.
 * Luego, muestra la información de todas las personas.
 */
public class Ejercicio105 {
    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio105(String nombre, String apellido, int edad) {
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
        Ejercicio105[] personas = new Ejercicio105[3];

        personas[0] = new Ejercicio105("Juan", "Pérez", 25);
        personas[1] = new Ejercicio105("María", "Gómez", 30);
        personas[2] = new Ejercicio105("Carlos", "López", 22);

        System.out.println("Información de todas las personas:");
        for (Ejercicio105 persona : personas) {
            persona.mostrarInformacion();
        }
    }

}