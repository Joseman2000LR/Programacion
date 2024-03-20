package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si
 * contiene la letra 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        if (cadena.contains("a") || cadena.contains("A")) {
            System.out.println("La cadena contiene la letra 'a' ");
        } else {
            System.out.println("La cadena no contiene la letra 'a' ");
        }
    }

}