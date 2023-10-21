package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el factorial de un numero.
 * 
 * @author
 */
public class Ejercicio1 {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" e");
    }

    /**
     * Funcion que calcula el factorial de un numero
     * 
     * @param numero de enttrada del calculo
     * @return resultado de la operacion
     */
    public int calcularFactorial(int numero) {
        int resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

}