package ies.puerto;

/**
 * Implementa un programa que invierta una cadena de texto dada.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "Hola";
        invertirCadena(cadena);
    }

    public static void invertirCadena(String cadena) {
        char posicion;
        int i;
        for (i = cadena.length() - 1; i < cadena.length(); i--) {
            posicion = cadena.charAt(i);
            System.out.print(posicion);

        }
    }
}
