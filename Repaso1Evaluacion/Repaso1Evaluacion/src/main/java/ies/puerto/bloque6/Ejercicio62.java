package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros ingresados por el usuario,
 * realice la suma y muestre el resultado
 */
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

    }

    public static void suma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
