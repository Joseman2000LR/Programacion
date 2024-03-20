package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y
 * determine si tienen la misma longitud.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la primera cadena
        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();

        // Solicitar al usuario que ingrese la segunda cadena
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        // Verificar si las cadenas tienen la misma longitud
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas no tienen la misma longitud.");
        }

    }

}