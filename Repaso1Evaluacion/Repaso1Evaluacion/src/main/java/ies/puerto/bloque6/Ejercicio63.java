package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que tome tu nombre y apellido ingresados por separado y
 * muestre tu nombre completo en una sola línea.
 */
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre ");
        String nombre = scanner.nextLine();
        System.out.println("Dime tu apellido ");
        String apellido = scanner.nextLine();
        convinar(nombre, apellido);
    }

    public static void convinar(String nombre, String apellido) {
        System.out.println("Tu nombre es " + nombre + " y tu apellido es " + apellido);
    }
}
