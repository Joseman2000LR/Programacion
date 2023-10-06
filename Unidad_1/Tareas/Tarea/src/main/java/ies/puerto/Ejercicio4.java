package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio4 {

    /**
     * Algoritmo que permmita leer un valor cualquiera N y escriba si es par o impar
     * 
     * @param args
     */
    public static void main(String[] args) {
        int valorN;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca  valor que quieras saber si es par o impar");
        valorN = lectura.nextInt();
        System.out.println("Valor de la variable es  : " + valorN);
        if (valorN % 2 == 0) {
            System.out.println("El numero " + valorN + " es par");
        } else {
            System.out.println("El numero " + valorN + " es impar");
        }

    }
}