package ies.puerto.bloque8;

import java.util.Scanner;

/**
 * Haz un programa que calcule el promedio de las notas almacenadas en un array
 * de decimales.
 */
public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();
        double[] notas = new double[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double promedio = calcularPromedio(notas);
        System.out.println("El promedio de las notas es: " + promedio);
    }

    

    public static double calcularPromedio(double[] array) {
        if (array.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double nota : array) {
            suma += nota;
        }
        return suma / array.length;
    }
}
