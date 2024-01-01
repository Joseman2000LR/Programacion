package ies.puerto.bloque5;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un carácter ingresado por el usuario y
 * determine si es una vocal o una consonante.
 */
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);

        if (caracter == 'a' || caracter == 'e' ||
                caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El caracter ingresado es una vocal.");
        } else {
            System.out.println("El caracter ingresado es una consonante.");
        }
    }

}