package ies.puerto.bloque5;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o
 * decimal) y determine si es divisible por 5.
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número (puede ser entero o decimal): ");
        double numero = scanner.nextDouble();

        // Verificar si el número es divisible por 5
        if (numero / 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
        } else {
            System.out.println(numero + " no es divisible por 5.");
        }
    }

}