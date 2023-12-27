package ies.puerto.bloque1;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario su nombre y luego muestre "¡Hola,
 * [nombre]!", donde [nombre] es el nombre proporcionado por el usuario.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre ");
        nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + " !");

    }
}