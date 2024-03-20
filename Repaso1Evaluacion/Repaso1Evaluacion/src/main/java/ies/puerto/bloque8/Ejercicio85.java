package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Escribe un programa que cuente cuántas veces aparece un número específico en
 * un array de enteros.
 */
public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = scanner.nextInt();
        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }
       
    
        System.out.print("Ingrese el numero a contar: ");
        int numeroContar = scanner.nextInt();
        int frecuencia = contarNumero(array, numeroContar);
        System.out.println("El numero " + numeroContar + " aparece " + frecuencia + " veces en el array.");
    }


    public static int contarNumero(int[] array, int numeroContar) {
        int frecuencia = 0;
        for (int numero : array) {
            if (numero == numeroContar) {
                frecuencia++;
            }
        }
        return frecuencia;
    }

}
