package ies.puerto;

import java.util.Scanner;

/**
 * Clase que tiene como objetivo realizar calcular Palidromo de un numero
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        int original;
        int inverso = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();
        calcularPalidromo(numero);
    }

    /**
     * Funcion que calcula palidromo de un numero
     * 
     * @param numero dado para la operacion
     * @return
     */
    public static String calcularPalidromo(int numero) {
        String resultado = "";
        int original;
        int inverso = 0;
        original = numero;
        // bucle que desgloza en numero en un digito
        while (numero > 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        if (inverso == original) {
            resultado = original + " es un número palíndromo.";
        } else {
            resultado = original + " no es un número palíndromo.";
        }
        return resultado;
    }

}