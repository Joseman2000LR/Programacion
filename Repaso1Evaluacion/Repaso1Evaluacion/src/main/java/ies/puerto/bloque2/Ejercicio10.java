package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome el precio de un producto ingresado por el
 * usuario y muestre el precio final con el 7% de IGIC incluido .
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime el precio del producto");
        double precio;
        precio = scanner.nextDouble();
        double resultado = precio + ((7 / 100) * precio) + (0.07 * precio);
        System.out.println("el precio final es de : " + resultado);
    }
}