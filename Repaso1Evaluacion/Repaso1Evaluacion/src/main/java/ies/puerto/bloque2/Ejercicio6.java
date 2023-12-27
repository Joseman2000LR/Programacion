package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario dos números y luego muestre los dos
 * números y su suma.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime el primer numero ");
        int numero1 = scanner.nextInt();
        System.out.println("dime el segundo numero ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("los numero son : el primero " + numero1 + " segundo " + numero2 + " y la suma es: " + suma);
    }
}