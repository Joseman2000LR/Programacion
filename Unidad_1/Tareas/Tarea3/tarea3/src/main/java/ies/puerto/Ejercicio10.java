package ies.puerto;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio10 {
    /**
     * Calcular la suma de todos los números pares entre 1 y un número
     * ingresado por el usuario utilizando un bucle do-while
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int resultado = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("dime un numero ");
        numero = lectura.nextInt();

        do {
            if (numero % 2 == 0) {
                resultado = numero / 2;
                contador += 1;
            }
        } while (contador <= numero);
        System.out.println("la suma de todo los pares hasta " + numero +
                " es " + resultado);
    }
}
