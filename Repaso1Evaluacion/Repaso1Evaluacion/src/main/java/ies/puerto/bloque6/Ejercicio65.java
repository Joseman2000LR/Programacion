package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero ingresado por el usuario, lo
 * convierta a un valor double y muestre la raíz cuadrada de ese número.
 */
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        double numeroDouble = (double) numeroEntero;
        raizCuadrada(numeroDouble);
    }

    public static void raizCuadrada(double numeroDouble) {
        if (numeroDouble >= 0) {
            double raizCuadrada = Math.sqrt(numeroDouble);
            System.out.println("La raíz cuadrada de " + numeroDouble + " es: " + raizCuadrada);
        } else {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        }
    }
}
