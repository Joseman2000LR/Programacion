package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Haz un programa que busque el número máximo en una matriz de 4x4 y muestre su
 * posición.
 */
public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[4][4];
        System.out.println("Ingrese los valores para la matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        int[] posicionMaximo = encontrarMaximo(matrizA);
        System.out.println("El número máximo en la matriz es " + matrizA[posicionMaximo[0]][posicionMaximo[1]] +
                " y se encuentra en la posición [" + posicionMaximo[0] + "][" + posicionMaximo[1] + "].");

    }

    public static int[] encontrarMaximo(int[][] matriz) {
        int[] posicionMaximo = { 0, 0 };
        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    posicionMaximo[0] = i;
                    posicionMaximo[1] = j;
                }
            }
        }

        return posicionMaximo;
    }

}
