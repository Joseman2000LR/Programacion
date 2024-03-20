package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Desarrolla un programa que rote una matriz de 3x3, 90º grados en sentido
 * antihorario.
 */
public class Ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizOriginal = new int[3][3];
        System.out.println("Ingrese los valores para la matriz A:");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz original:");
        mostrarMatriz(matrizOriginal);
        int[][] matrizRotada = rotarMatriz(matrizOriginal);

        System.out.println(" Matriz rotada 90 grados en sentido antihorario:");
        mostrarMatriz(matrizRotada);
    }

    public static int[][] rotarMatriz(int[][] matrizOriginal) {
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[columnas - j - 1][i] = matrizOriginal[i][j];
            }
        }

        return matrizRotada;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
