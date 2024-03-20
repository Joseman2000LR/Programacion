package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 * 
 */
public class Ejercicio9 {
    /**
     * Muestra los números del 1 al 100 (ambos incluidos)
     * 
     * @param args
     */
    public static void main(String[] args) {
        int i = -1;
        int numeroWhile = 0;
        int numeroFor = 0;
        // Muestra los números del 1 al 100 con While
        while (i <= 10) {
            numeroWhile = i + 1;
            System.out.println(numeroWhile);
            i++;
        }
        // Muestra los números del 1 al 100 con For
        for (int j = 0; j <= 10; j++) {
            System.out.println(numeroFor);
            numeroFor = j + 1;
        }

    }
}
