package ies.puerto;

/**
 * Clase que dice que numero es mayor que otro
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int mayorNumero(int numero1, int numero2) {
        int resultado;
        if (numero1 > numero2) {
            resultado = numero1;
        } else {
            resultado = numero2;
        }
        return resultado;
    }

    public int mayorNumero(int numero1, int numero2, int numero3) {
        int resultado = mayorNumero(numero1, numero2);
        return mayorNumero(resultado, numero3);
    }
}