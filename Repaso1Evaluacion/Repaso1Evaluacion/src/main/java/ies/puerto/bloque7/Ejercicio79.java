package ies.puerto.bloque7;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero ingresado por el usuario y
 * cuente cuántos dígitos tiene utilizando un bucle for.
 */
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        String numeroComoCadena = Integer.toString(numero);
        int contadorDigitos = 0;

        for (int i = 0; i < numeroComoCadena.length(); i++) {
            if (Character.isDigit(numeroComoCadena.charAt(i))) {
                contadorDigitos++;
            }
        }
        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");

    }
}
