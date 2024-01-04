package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Desarrolla un programa que sume dos matrices de 3x3 y muestre el resultado.
 */
public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        System.out.println("Ingrese los valores para la matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingrese los valores para la matriz B:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        int[][] resultado = sumarMatrices(matrizA, matrizB);

        System.out.println("Matriz resultante de la suma:");
        mostrarMatriz(resultado);

    }

    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

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
