package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio {

    /**
     * Desarrolle un algoritmo que permita calcular Promedio de Notas;
     * finaliza cuando N = 0.
     * 
     * @param args
     */

    public static void main(String[] args) {
        double promedio;
        double suma = 0;
        double numero;
        double contador = 0;
        int n;
        Scanner lectura = new Scanner(System.in);
        System.out.println("dime cuantas notas tienes que calcular");
        n = lectura.nextInt();
        contador = n;
        // bucle que suma las notas
        while (n > 0) {
            System.out.println("dime una  la nota ");
            numero = lectura.nextDouble();
            suma += numero;
            --n;
        }
        // operacion para sacar la media
        promedio = suma / contador;
        System.out.println("El promedio de las notas es : " + promedio);
    }
}