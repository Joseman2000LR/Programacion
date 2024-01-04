package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Escribe un programa que multiplique dos matrices de dimensiones 2x3 y 3x2, y
 * muestre el resultado.
 */
public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[3][2];
        System.out.println("Ingrese los valores para la matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingrese los valores para la matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        multiplicarMatrices(matrizA, matrizB);
        mostrarMatriz(matrizB);
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        mostrarMatriz(resultado);
        return resultado;
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
