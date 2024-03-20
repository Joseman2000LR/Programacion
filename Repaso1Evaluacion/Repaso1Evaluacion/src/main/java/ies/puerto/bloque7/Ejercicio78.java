package ies.puerto.bloque7;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la
 * computadora utilizando un bucle do-while. El juego debe continuar hasta que
 * el usuario elija salir.
 */
public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            System.out.print("Elige 'piedra', 'papel', 'tijera' o 'salir': ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            if (eleccionUsuario.equals("salir")) {
                System.out.println("¡Gracias por jugar! Hasta luego.");
                break;
            }

            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel")
                    && !eleccionUsuario.equals("tijera")) {
                System.out.println("Elección no válida. Por favor, elige 'piedra', 'papel', 'tijera' o 'salir'.");
                continue;
            }

            String[] opcionesComputadora = { "piedra", "papel", "tijera" };
            int indiceAleatorio = random.nextInt(opcionesComputadora.length);
            String eleccionComputadora = opcionesComputadora[indiceAleatorio];

            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección de la computadora: " + eleccionComputadora);
            determinarGanador(eleccionUsuario, eleccionComputadora);

        } while (true);

    }

    public static void determinarGanador(String usuario, String computadora) {
        if (usuario.equals(computadora)) {
            System.out.println("¡Es un empate!");
        } else if ((usuario.equals("piedra") && computadora.equals("tijera")) ||
                (usuario.equals("papel") && computadora.equals("piedra")) ||
                (usuario.equals("tijera") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡La computadora gana!");
        }
    }
}
