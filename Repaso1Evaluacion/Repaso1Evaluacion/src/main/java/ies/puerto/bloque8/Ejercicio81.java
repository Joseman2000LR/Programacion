package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Escribe un programa que sume todos los elementos de un array de enteros
 * y muestre el resultado. Solicita el tamaño del array, e introduce los
 * valores,
 * para ejecutar la suma.
 */
public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = scanner.nextInt();
        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }
        sumar(tamano, array);
    }

    public static void sumar(int tamano, int[] array) {
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += array[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
