package ies.puerto;

/**
 * Desarrolla un programa que elimine los espacios en blanco al principio y al
 * final de una cadena de texto.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = "   hola      mundo      e   ";
        elimanarEspacios(cadena);
    }

    public static void elimanarEspacios(String cadena) {
        String resultado;
        resultado = cadena.trim();
        System.out.println(resultado);
    }
}
