package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 *         Descripcion del ejercico 6
 */
public class Ejercicio6 {
    /**
     * un algoritmo que permita leer un valor entero positivo N y determinar si es
     * primo o no
     * 
     * @param args
     */

    public static String esPrimo(int numero) {
        String noPrimo = "El numero no es primo";
        String primo = "El numero  es primo";
        // 0,1,4 no son primos
        if (numero / numero == 0 || numero == 1 || numero == 4) {
            return noPrimo;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return noPrimo;
            }
        }
        // si no se pudo dividir , es primo

        return primo;
    }

    public static void main(String[] args) {
        int numero;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca  el Primer numero ");
        numero = lectura.nextInt();

        // verificacion si en un numero positivo
        if (numero < 0) {
            System.out.println("El numero introducido es negativo");
        }
        System.out.println(esPrimo(numero));

    }
}
