package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar un número como texto y
 * luego intente convertirlo a un entero. Maneja la excepción
 * NumberFormatException si el usuario ingresa algo que no es un
 */
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String strNumero = solicitarNumero();
        int numero = tranformarStrNumero(strNumero);
        System.out.println("valor del numero tranformado: " + numero);

    }

    /**
     * Fincion que pide por teclado un numero
     * 
     * @return numero obtenido
     */
    public static String solicitarNumero() {
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduca un valor : ");
        numero = scanner.nextLine();

        return numero;
    }

    public static int tranformarStrNumero(String strNumero) throws Exception {
        int resultdo = 0;
        try {
            resultdo = Integer.parseInt(strNumero);
        } catch (NumberFormatException e) {
            String mensajeError = "El valor pasado :" + strNumero + "No es un numero";
            throw new Exception(mensajeError);
        }

        return resultdo;
    }
}
