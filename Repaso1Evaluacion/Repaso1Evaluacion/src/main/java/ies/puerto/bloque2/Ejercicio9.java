package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario su edad y luego muestre si es
 * mayor de edad o no.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime tu edad");
        int edad;
        edad = scanner.nextInt();
        if (edad < 18) {
            System.out.println("es menor de edad");
        }
        System.out.println("es mayor de edad");
    }
}