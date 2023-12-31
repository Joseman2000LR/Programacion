package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de
 * 18, entre 18 y 65 o mayor de 65 años.
 */
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad < 18) {
            System.out.println("Eres menor de 18 años.");
        } else if (edad >= 18 && edad <= 65) {
            System.out.println("Tienes entre 18 y 65 años.");
        } else {
            System.out.println("Eres mayor de 65 años.");
        }
    }

}