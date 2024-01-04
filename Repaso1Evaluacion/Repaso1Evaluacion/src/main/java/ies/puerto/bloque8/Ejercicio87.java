package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Crea un programa que tome una matriz de 3x3 y calcule su transpuesta.
 */
public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese los valores para la matriz :");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int[][] resultado = calcularTranspuesta(matriz);

        System.out.println("Matriz resultante de la suma:");
        mostrarMatriz(resultado);

    }

    public static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
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
