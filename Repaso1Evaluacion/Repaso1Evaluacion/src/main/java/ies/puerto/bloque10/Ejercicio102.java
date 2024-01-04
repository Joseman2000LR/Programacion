package ies.puerto.bloque10;

/**
 * Añade métodos en la clase Ejercicio102 para establecer y obtener el nombre,
 * apellido y edad. (Gettes/Setters). Implementa el método main para verificar
 * que funciona correctamente.
 */
public class Ejercicio102 {

    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio102(String nombre, String apellido, int edad) {
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

    public static void main(String[] args) {
        Ejercicio102 Ejercicio1021 = new Ejercicio102("Juan", "Pérez", 25);
        System.out.println("Nombre: " + Ejercicio1021.getNombre());
        System.out.println("Apellido: " + Ejercicio1021.getApellido());
        System.out.println("Edad: " + Ejercicio1021.getEdad());
        Ejercicio1021.setNombre("María");
        Ejercicio1021.setApellido("Gómez");
        Ejercicio1021.setEdad(30);

        System.out.println("Información después de modificar:");
        System.out.println("Nombre: " + Ejercicio1021.getNombre());
        System.out.println("Apellido: " + Ejercicio1021.getApellido());
        System.out.println("Edad: " + Ejercicio1021.getEdad());
    }
}