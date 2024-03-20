package ies.puerto;

import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por
 * ejemplo, "2 + abc") y trata de evaluarla. Maneja la excepción
 * ArithmeticException u otra excepción adecuada.
 */
public class Ejercicio5 {
    public static void pedirExpresion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una expresión matemática  ");
        String expresion = scanner.nextLine();
        try {
            double resultado = evaluarExpresion(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }
    }

    /**
     * 
     * @param expresion
     * @return
     */
    public static Double evaluarExpresion(String expresion) {
        return Double.parseDouble(expresion);
    }

    public static void main(String[] args) {
        pedirExpresion();
    }

}
