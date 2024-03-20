package main.ies.puerto;

/**
 * Escribe un programa que imprima todos los números impares del 1 al 20, usando
 * continue para omitir los números pares.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("numeros pares " + i);
                continue;
            }
            System.out.println("Numeros impar" + i);
        }
    }
}
