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
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        numero1 = lectura.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = lectura.nextInt();

        System.out.println("Los Numeros perfectos entre " + numero1 + " a " + numero2);

        for (int numero = numero1; numero <= numero2; numero++) {
            int sumaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == numero) {
                System.out.println(numero);
            }
        }

    }
}
