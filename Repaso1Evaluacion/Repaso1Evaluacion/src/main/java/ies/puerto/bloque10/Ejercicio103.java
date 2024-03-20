package ies.puerto.bloque10;

/**
 * Desarrolla un método en la clase Ejercicio103 para mostrar toda la
 * información de
 * una Ejercicio103 (nombre, apellido y edad). Implementa el método main para
 * verificar que funciona correctamente.
 */
public class Ejercicio103 {
    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio103(String nombre, String apellido, int edad) {
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
        Ejercicio103 ejercicio103jercicio103 = new Ejercicio103("Juan", "Pérez", 25);

        System.out.println("Nombre: " + ejercicio103jercicio103.getNombre());
        System.out.println("Apellido: " + ejercicio103jercicio103.getApellido());
        System.out.println("Edad: " + ejercicio103jercicio103.getEdad());

        ejercicio103jercicio103.setNombre("María");
        ejercicio103jercicio103.setApellido("Gómez");
        ejercicio103jercicio103.setEdad(30);

        System.out.println("Información después de modificar:");
        System.out.println("Nombre: " + ejercicio103jercicio103.getNombre());
        System.out.println("Apellido: " + ejercicio103jercicio103.getApellido());
        System.out.println("Edad: " + ejercicio103jercicio103.getEdad());
    }
}