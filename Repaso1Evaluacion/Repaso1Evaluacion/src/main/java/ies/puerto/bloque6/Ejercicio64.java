package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número ingresado como cadena y lo
 * convierta a un valor entero, luego multiplícalo por 2 y muestra el resultado.
 */
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número como cadena: ");
        String numeroComoCadena = scanner.nextLine();
        multiplicacion(numeroComoCadena);

    }

    public static void multiplicacion(String numeroComoCadena) {
        int numeroEntero = Integer.parseInt(numeroComoCadena);
        int resultado = numeroEntero * 2;
        System.out.println("El resultado de multiplicar " + numeroEntero + " por 2 es: " + resultado);
    }
}
