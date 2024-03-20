package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y
 * verifique si es par o impar utilizando los métodos de la clase
 * Integer. Controla las exeption que pudiera generar.
 */
public class Ejercicio1 {

    public static boolean verificarParoImpar(int numero) {
        return Integer.remainderUnsigned(numero, 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (verificarParoImpar(numero)) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");

        }

    }

}
