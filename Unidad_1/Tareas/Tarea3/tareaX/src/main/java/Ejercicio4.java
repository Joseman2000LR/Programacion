package main.java;

import java.util.Scanner;

/**
 * @author Joseman2000LR
 */
public class Ejercicio4 {
    /**
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe
     * solicitar el número por teclado.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        int i;
        int contador = 0;
        int resultadoDigito;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        // funcion que comprueba los digitos que tiene el numero
        while (numero != 0) {
            numero = numero / 10;
            contador++;

        }
        resultadoDigito = numero / contador;
        System.out.println(contador);
        System.out.println(resultadoDigito);
        for (int j = numero; j < numero; j++) {

        }
    }

}
