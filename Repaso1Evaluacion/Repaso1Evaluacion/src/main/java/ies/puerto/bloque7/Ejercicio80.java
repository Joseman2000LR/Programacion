package ies.puerto.bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que incluya un bucle while que se ejecute
 * infinitamente. Asegúrate de proporcionar una condición de salida adecuada.
 */
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Este bucle se ejecuta infinitamente. Para salir, ingrese 'salir': ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del bucle.");
                break;
            }
        }
    }
}
