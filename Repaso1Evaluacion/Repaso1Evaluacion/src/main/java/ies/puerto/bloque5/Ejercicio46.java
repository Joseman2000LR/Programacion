package ies.puerto.bloque5;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo
 * permitido para la temperatura. Luego, pide al usuario ingresar una
 * temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio46 {
    private static final double TEMPERATURA_MAXIMA = 100.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();
        if (temperatura <= TEMPERATURA_MAXIMA) {
            System.out.println("La temperatura esta dentro del rango permitido");
        } else {
            System.out.println("La temperatura esta fuera del rango permitido");
        }
    }

}