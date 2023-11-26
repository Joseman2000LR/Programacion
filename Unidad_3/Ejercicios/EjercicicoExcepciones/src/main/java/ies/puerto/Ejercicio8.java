package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números y realice la
 * división. Maneja la excepción InputMismatchException si el usuario ingresa
 * algo que no es un número.
 */
public class Ejercicio8 {
    public static void ingresarNumeros() {
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Dime el primer numero");
            numero1 = scanner.nextInt();
            throw new InputMismatchException("No es un numero Entero");
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e);
        }
        try {
            System.out.println("Dime el primer numero");
            numero2 = scanner.nextInt();
            throw new InputMismatchException("No es un numero Entero");
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String[] args) {
        ingresarNumeros();
    }
}
