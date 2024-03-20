package ies.puerto;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null.
 * Por ejemplo un String. Maneja la excepción NullPointerException.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String miString = null;
        try {
            int tamanio = miString.length();
            System.out.println("La longitud de la cadena es : " + tamanio);
        } catch (NullPointerException e) {
            System.out.println("Error  se ha producido un error : " + e);
        }
    }
}
