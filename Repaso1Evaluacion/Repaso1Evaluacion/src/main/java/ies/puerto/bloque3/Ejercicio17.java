package ies.puerto.bloque3;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero y un número decimal ingresados por
 * el usuario y muestre su suma, considerando conversiones necesarias
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        double suma = numeroEntero + numeroDecimal;
        System.out.println("La suma de " + numeroEntero + " y " + numeroDecimal + " es: " + suma);
    }
}