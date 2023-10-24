package ies.puerto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase contiene métodos para: pedir 5 números, mostrar los 5
 * números, muestra la suma y los muestra en orden creciente y en orden
 * decreciente.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, numero5;
        Scanner lectura = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Introduce primer número: ");
        numero1 = lectura.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = lectura.nextInt();
        System.out.println("Introduce tercero número: ");
        numero3 = lectura.nextInt();
        System.out.println("Introduce tercero número: ");
        numero4 = lectura.nextInt();
        System.out.println("Introduce tercero número: ");
        numero5 = lectura.nextInt();

    }

    public int sumar(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int suma;
        suma = numero1 + numero2 + numero3 + numero4 + numero5;
        return suma;
    }
}
