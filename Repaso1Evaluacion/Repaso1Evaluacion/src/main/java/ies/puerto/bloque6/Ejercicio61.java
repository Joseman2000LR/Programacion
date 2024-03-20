package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número entero ingresado por el usuario y
 * lo convierta a una cadena, luego muestre la longitud de esa cadena.
 */
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        comvertirCadena(numero);
    }

    public static void comvertirCadena(int numero) {
        String cadenaNumero = Integer.toString(numero);
        int longitud = cadenaNumero.length();
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}
