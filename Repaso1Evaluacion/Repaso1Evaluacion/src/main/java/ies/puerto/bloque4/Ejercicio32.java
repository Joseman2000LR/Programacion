package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el
 * usuario es positivo, negativo o cero.
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println(numero + " es un numero positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es un numero negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }
    }

}