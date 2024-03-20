package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Desarrolla un programa que ordene un array de enteros en orden ascendente y
 * luego lo muestre. Solicita el tamaño del array, e introduce los valores.
 */
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = scanner.nextInt();
        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }
        ordenar(tamano, array);
    }

    public static void ordenar(int tamano, int[] array) {
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado en orden ascendente:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
