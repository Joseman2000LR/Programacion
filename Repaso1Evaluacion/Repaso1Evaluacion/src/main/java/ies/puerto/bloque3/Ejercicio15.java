package ies.puerto.bloque3;

/**
 * Desarrolla un programa que declare una variable de tipo char y muestre su
 * valor ASCII.
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        char miCaracter = 'A';

        int valorAscii = (int) miCaracter;
        System.out.println("El valor ASCII de '" + miCaracter + "' es: " + valorAscii);
    }
}