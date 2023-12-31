package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos números enteros ingresados por el usuario
 * y muestre cuál es mayor o si son iguales.
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos numeros son iguales");
        }

    }

}