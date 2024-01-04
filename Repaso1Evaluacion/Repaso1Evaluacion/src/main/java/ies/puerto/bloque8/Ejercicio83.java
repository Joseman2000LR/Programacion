package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Crea un programa que busque un número específico en un array y muestre su
 * posición si se encuentra, o un mensaje indicando que no se encontró
 */
public class Ejercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = scanner.nextInt();
        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();
        int posicion = buscarNumero(array, numeroBuscar);
        if (posicion != -1) {
            System.out
                    .println("El número " + numeroBuscar + " se encuentra en la posición " + posicion + " del array.");
        } else {
            System.out.println("El número " + numeroBuscar + " no se encontró en el array.");
        }
    }

    public static int buscarNumero(int[] array, int numeroBuscar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscar) {
                return i;
            }
        }
        return -1;
    }
}
