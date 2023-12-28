package ies.puerto.bloque3;

/**
 * Escribe un programa que declare una variable double y otra int, luego realiza
 * una conversión explícita de double a int y muestre el resultado.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        double numeroDouble = 123.456;
        int numeroEntero;

        numeroEntero = (int) numeroDouble;
        System.out.println("El número double " + numeroDouble + " convertido a int es: " + numeroEntero);
    }

}