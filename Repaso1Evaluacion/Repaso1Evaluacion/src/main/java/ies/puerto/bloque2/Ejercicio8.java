package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y
 * muestre su área.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        double radio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el radio de un circulo ");
        radio = scanner.nextInt();
        double area = radio * radio * 3.14;
        System.out.println("la area de circulo es : " + area);
    }
}