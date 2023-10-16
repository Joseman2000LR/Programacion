package ies.puerto;

/**
 * Clase que tiene como objectivo el calculo del fratorial
 * 
 * @author Joseman2000LR
 */
public class CalculoFactorial {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando el factorial de : " + numero +
                ", resultado : " + calculoFactorial(numero));
    }

    /**
     * Metodo que reaiza el calculo del factorial.
     * 
     * @param numero valor sobre el que realiza el calculo.
     * @return factorial del numero dado.
     */
    public static int calculoFactorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}