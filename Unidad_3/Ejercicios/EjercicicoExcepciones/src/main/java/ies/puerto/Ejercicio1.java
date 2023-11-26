package ies.puerto;

import java.util.Scanner;

/***
 * Escribe un programa que solicite al usuario dos números e imprima el
 * resultado de la división. Asegúrate de manejar la excepción
 * ArithmeticException si el segundo número ingresado es 0.
 */
/***
 * @author
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = divicion(numero1, numero2);
        System.out.println("Resultado de la divicion: " + resultado);
    }

    /**
     * Fincion que pide por teclado un numero
     * 
     * @return numero obtenido
     */
    public static int solicitarNumero() {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduca un valor : ");
        numero = scanner.nextInt();

        return numero;
    }

    /**
     * Funcion que realiza una divicion de dos numero
     * 
     * @param dividendo de la divicion
     * @param divisor   de la divicion
     * @return resultado
     */
    public static int divicion(int dividendo, int divisor) throws Exception {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        } catch (ArithmeticException e) {
            String mensajeError = "Se intenta una divicion por 0";
            System.out.println("Mensaje de println " + mensajeError);
            throw new Exception(mensajeError);
        }

        return resultado;
    }
}
