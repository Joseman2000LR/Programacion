package ies.puerto.bloque7;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que simule un juego de adivinanza. Elige un número aleatorio
 * entre 1 y 10 y pide al usuario que adivine. Utiliza un bucle do-while para
 * continuar el juego hasta que el usuario adivine el número.
 */
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(10) + 1;
        int intentoUsuario;
        int intentos = 0;
        do {
            System.out.print("Adivina el número (entre 1 y 10): ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroAdivinar) {
                System.out.println("Correcto Has adivinado el número en " + intentos + " intentos.");
            } else {
                System.out.println("Incorrecto. Inténtalo de nuevo.");
            }
        } while (intentoUsuario != numeroAdivinar);

    }
}
