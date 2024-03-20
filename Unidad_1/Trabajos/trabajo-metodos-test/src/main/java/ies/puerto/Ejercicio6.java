package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     * Escribe un programa en Java que encuentre todos los números Armstrong
     * entre 1 y 1000.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = teclado.nextInt();

    }

    /**
     * Funcion que verifica si es un numero es amstrong
     * 
     * @param numero para realizar la verificarcion
     * @return boolean true/false con el resultado
     */
    public boolean verificarAmstrong(int numero) {
        boolean resultado = false;
        int numDigitos = 0;
        int calcularDigitos = numero;
        int suma = 0;
        while (calcularDigitos > 0) {
            calcularDigitos = calcularDigitos / 10;
            numDigitos++;
            for (int i = 0; i < numDigitos; i++) {
                suma = suma;
            }
        }

        return resultado;
    }
}