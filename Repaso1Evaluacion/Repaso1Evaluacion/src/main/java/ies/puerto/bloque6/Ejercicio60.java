package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos cadenas ingresadas por el usuario y
 * determine si son iguales o diferentes.
 */
public class Ejercicio60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

    }
}
