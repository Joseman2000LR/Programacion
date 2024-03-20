package ies.puerto.bloque5;

import java.util.Scanner;

/**
 * Crea un programa que determine si un año ingresado por el usuario es bisiesto
 * o no (recuerda que un año es bisiesto si es divisible por 4, pero no por 100,
 * o si es divisible por 400).
 * 
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
