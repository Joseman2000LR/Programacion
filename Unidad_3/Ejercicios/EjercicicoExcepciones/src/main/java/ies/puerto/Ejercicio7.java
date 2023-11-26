package ies.puerto;

/**
 * v
 */
public class Ejercicio7 {

    public static int obtenerNumeroPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return numero;
    }

    public static void main(String[] args) {
        try {
            int numero = obtenerNumeroPositivo(-5);
            System.out.println("El número es: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
