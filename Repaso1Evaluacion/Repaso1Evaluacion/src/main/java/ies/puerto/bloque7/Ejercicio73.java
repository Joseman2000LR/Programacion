package ies.puerto.bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome una cadena ingresada por el usuario y cuente
 * cuántas vocales (a, e, i, o, u) contiene. Utiliza un bucle while.
 */
public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        cadena = cadena.toLowerCase();
        contarVocales(cadena);
    }

    public static void contarVocales(String cadena) {
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        int i = 0;
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);

            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }

            i++;
        }

        System.out.println("Número de vocales 'a': " + contadorA);
        System.out.println("Número de vocales 'e': " + contadorE);
        System.out.println("Número de vocales 'i': " + contadorI);
        System.out.println("Número de vocales 'o': " + contadorO);
        System.out.println("Número de vocales 'u': " + contadorU);
    }
}
