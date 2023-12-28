package ies.puerto.bloque3;

/**
 * Escribe un programa que declare dos variables de tipo entero e imprima su
 * suma, resta, multiplicación y división.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 2;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double divicion = numero1 / numero2;
        System.out.println("la suma de los 2 numeros son: " + suma);
        System.out.println("la resta de los 2 numeros son: " + resta);
        System.out.println("la multiplicación de los 2 numeros son: " + multiplicacion);
        System.out.println("la divicion de los 2 numeros son: " + divicion);
    }

}