package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Haz un programa que tome una frase y una palabra ingresada por el usuario,
 * luego determine si la palabra está contenida en la frase.
 */
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        buscarPalabra(frase, palabra);

    }

    public static void buscarPalabra(String frase, String palabra) {
        if (frase.contains(palabra)) {
            System.out.println("La palabra '" + palabra + "' está contenida en la frase.");
        } else {
            System.out.println("La palabra '" + palabra + "' no está contenida en la frase.");
        }
    }
}
