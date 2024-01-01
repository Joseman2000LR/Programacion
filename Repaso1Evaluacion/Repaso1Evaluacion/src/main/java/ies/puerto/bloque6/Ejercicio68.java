package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero y un número decimal ingresados
 * por el usuario, los multiplique y muestre el resultado en una cadena junto
 * con un mensaje.
 */
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        multiplicacion(numeroEntero, numeroDecimal);

    }

    public static void multiplicacion(int numeroEntero, double numeroDecimal) {
        double resultado = numeroEntero * numeroDecimal;
        System.out.println("El resultado de multiplicar " + numeroEntero + " y " + numeroDecimal + " es: " + resultado);
    }
}
