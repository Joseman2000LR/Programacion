package ies.puerto;

/**
 * Clase que tiene dos funciones una que verifica si los numeros son positivo o
 * negativo
 * y la otra es si es par o impar
 */
public class Ejercicio2 {
    /**
     * Funcion que verifica si es positivo o negativo
     * 
     * @param numero variable de entrada
     * @return true/false
     */
    public boolean verificacionNumero(double numero) {
        boolean resultado;
        if (numero >= 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;

    }

    /**
     * Funcion que es el numero es par o impar
     * 
     * @param numero variable de entrada
     * @return true/false
     */
    public boolean parImpar(double numero) {
        boolean resultado;
        if (numero % 2 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
