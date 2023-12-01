package ies.puerto;

/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con
 * una subcadena específica.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = "hola mundo esta es una cadena de texto fin";
        verificarCadena(cadena);
    }

    public static void verificarCadena(String cadena) {
        boolean comienza = cadena.startsWith("hola");
        boolean finaliza = cadena.endsWith("fin");
        if (comienza == true) {
            System.out.println("La cadena enpieza bien");
        } else {
            System.out.println("La cadena empieza mal");
        }

        if (finaliza == true) {
            System.out.println("La cadena termina bien");
        } else {
            System.out.println("La cadena termina mal");
        }

    }
}
