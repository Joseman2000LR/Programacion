package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros y
 * muestre su equivalente en dólares solicitando el valor cambio.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime lo eros que quieres cambiar a dollar ");
        double euro;
        euro = scanner.nextDouble();
        double cambio;
        cambio = euro * 1.11;
        System.out.println("La convericio de euro a dollar es: " + cambio);
    }
}