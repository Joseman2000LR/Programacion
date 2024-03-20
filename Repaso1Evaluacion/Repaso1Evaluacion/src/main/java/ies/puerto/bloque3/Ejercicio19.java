package ies.puerto.bloque3;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y
 * muestre la concatenación de ambas, así como su longitud.
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        String concatenacion = cadena1 + cadena2;
        System.out.println("La concatenación de las cadenas es: " + concatenacion);
        System.out.println("La longitud de la cadena resultante es: " + concatenacion.length());

    }
}