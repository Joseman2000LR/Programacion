package ies.puerto;

/**
 * Escribe un programa que compare dos cadenas de texto e indique si son iguales
 * o diferentes.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena1 = "";
        String cadena2 = "";
        if (compararCadena(cadena1, cadena2) == true) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("Son diferente");
        }
    }

    public static boolean compararCadena(String cadena1, String cadena2) {
        boolean resultado = cadena1.equals(cadena2);
        return resultado;
    }

}
