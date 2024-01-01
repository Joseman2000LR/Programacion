package ies.puerto.bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar números con un bucle
 * while y calcule la suma de esos números. Termina el bucle cuando la suma
 * alcance o supere 100.
 */
public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (suma < 100) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            suma += numero;
            System.out.println("Suma actual: " + suma);
        }

        System.out.println("La suma ha alcanzado o superado 100");

    }
}
