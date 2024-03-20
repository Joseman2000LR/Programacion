package ies.puerto;

/**
 * Implementa un programa que convierta una cadena de texto a minúsculas y otra
 * a mayúsculas.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        String minusculas;
        String mayusculas;
        minusculas = cadena.toLowerCase();
        mayusculas = cadena.toUpperCase();
        System.out.println(minusculas);
        System.out.println(mayusculas);
    }
}
