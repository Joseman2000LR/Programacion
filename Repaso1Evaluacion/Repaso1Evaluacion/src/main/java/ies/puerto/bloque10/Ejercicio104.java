package ies.puerto.bloque10;

/**
 * Escribe un método en la clase Personas para comparar la edad de dos Personas
 * y
 * determinar cuál es mayor. Implementa el método main para verificar que
 * funciona correctamente.
 */
public class Ejercicio104 {

    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio104(String nombre, String apellido, int edad) {
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

    public static String compararEdad(Ejercicio104 persona, Ejercicio104 personas) {
        if (persona.getEdad() > personas.getEdad()) {
            return persona.getNombre() + " es mayor que " + personas.getNombre();
        } else if (persona.getEdad() < personas.getEdad()) {
            return personas.getNombre() + " es mayor que " + persona.getNombre();
        } else {
            return persona.getNombre() + " y " + personas.getNombre() + " tienen la misma edad";
        }
    }

    public static void main(String[] args) {
        Ejercicio104 persona = new Ejercicio104("Juan", "Pérez", 25);
        Ejercicio104 personas = new Ejercicio104("María", "Gómez", 30);

        System.out.println("Información de la primera persona:");
        persona.mostrarInformacion();

        System.out.println("\nInformación de la segunda persona:");
        personas.mostrarInformacion();
        String resultadoComparacion = compararEdad(persona, personas);
        System.out.println("\nResultado de la comparación de edades:");
        System.out.println(resultadoComparacion);
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}