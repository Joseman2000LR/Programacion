package ies.puerto.bloque7;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar números positivos
 * utilizando un bucle do-while. El bucle debe continuar hasta que el usuario
 * ingrese un número negativo.
 */
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.print("Ingrese un número positivo o un número negativo para salir ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                System.out.println("Número válido.");
            } else {
                System.out.println("Saliendo del programa.");
            }
        } while (numero >= 0);

    }
}
