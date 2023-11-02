package ies.puerto;

import java.util.Arrays;

/**
 * La clase contiene métodos para: ordenar lista en orden creciente y en orden
 * decreciente.
 */

public class Ejercicio3 {
    /**
     * 
     */
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 5, 4 };
        ordenarMayorMenor(numeros);
        ordenarMenorMayor(numeros);
    }

    /**
     * Funcion que ordena una lista de numeros de mayor a menor
     * 
     * @param numeros La lista de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static String ordenarMenorMayor(int[] numeros) {
        Arrays.sort(numeros);
        String resultado = "Numeros en orden creciente: ";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }
        return resultado;
    }

    /**
     * Funcion que ordena una lista de numeros de menor a mayor
     * 
     * @param numeros La lista de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static String ordenarMayorMenor(int[] numeros) {
        Arrays.sort(numeros);
        String resultado = "Numeros en orden decreciente: ";
        for (int i = numeros.length - 1; i >= 0; i--) {
            resultado += numeros[i] + " ";
        }
        return resultado;
    }

    /***
     * Metodo que te dice el valor mayor de una lista
     * 
     * @return
     */
    public int mayor() {
        int[] array = { 1, 2, 3, 4, 5 };
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[1];
            }
        }
        return mayor;
    }

    /**
     * metodo que te dice el valor menor de una lista
     * 
     * @return
     */
    public int menor() {
        int[] array = { 1, 2, 3, 4, 5 };
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[1];
            }
        }
        return menor;
    }

}
