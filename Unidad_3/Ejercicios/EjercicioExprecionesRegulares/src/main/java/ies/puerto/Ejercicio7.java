package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un programa que cuente el número de palabras en una cadena de
 * texto. Considera que las palabras pueden estar separadas por espacios, comas
 * o puntos.
 */
public class Ejercicio7 {
    public static int contarPalabras(String texto) {
        String[] palabras = texto.split("[\\s,\\.]+");
        return palabras.length;
    }

    public static void main(String[] args) {

        String textoEjemplo = "Esta es una cadena de ejemplo, con varias palabras.";
        int numeroPalabras = contarPalabras(textoEjemplo);
        System.out.println("Numero de palabras en la cadena: " + numeroPalabras);
    }
}
