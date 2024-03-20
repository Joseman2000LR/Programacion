package ies.puerto.bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número decimal, lo convierta a una cadena
 * y muestre cuántos dígitos tiene después del punto decimal.
 */
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        puntoDecimal(numeroDecimal);
    }

    public static void puntoDecimal(double numeroDecimal) {
        String cadenaDecimal = Double.toString(numeroDecimal);
        int posicionPunto = cadenaDecimal.indexOf('.');
        int digitosDespuesDelPunto = cadenaDecimal.length() - posicionPunto - 1;
        System.out.println("El número tiene " + digitosDespuesDelPunto + " dígitos después del punto decimal.");
    }
}
