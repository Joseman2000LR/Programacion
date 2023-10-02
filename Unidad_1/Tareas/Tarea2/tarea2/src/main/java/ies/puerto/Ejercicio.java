package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio {

    /**
     * un programa que encuentre e imprima todos los números perfectos en un rango
     * dado
     * (por ejemplo, entre 1 y 1000).
     * 
     * @param args
     */

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int acumulador = 0;
        int resultado;
        int valor0 = 0;
        Scanner lectura = new Scanner(System.in);
        // hacer mcm
        System.out.println("dime primer numero");
        numero1 = lectura.nextInt();
        // System.out.println("dime segundo numero");
        // numero2 = lectura.nextInt();
        while (numero1 >= 1) {
            if (numero1 / 2 == valor0) {
                valor0 = 0;
                System.out.println(valor0);
                break;
            } else {
                acumulador = numero1 / 2;
                resultado = numero1 / acumulador;
                numero1 = resultado;
            }
            numero1++;
        }

    }
}