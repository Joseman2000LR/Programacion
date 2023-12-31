package ies.puerto.bloque4;

import java.util.Scanner;

/**
 * Escribe un programa que determine si una variable booleana ingresada por el
 * usuario es verdadera o falsa y muestre un mensaje correspondiente.
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor booleano (true/false) ");
        boolean valorBooleano = scanner.nextBoolean();
        if (valorBooleano) {
            System.out.println("El valor ingresado es verdadero.");
        } else {
            System.out.println("El valor ingresado es falso.");
        }

    }

}