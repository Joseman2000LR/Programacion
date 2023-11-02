package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {

    /**
     * Funcion que ordena una lista de numeros de menor a mayor
     * 
     * @param numeros La lista de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static String ordenarMayorMenor() {
        int[] numeros = { 1, 2, 3, 5, 4 };
        Arrays.sort(numeros);
        String resultado = "Numeros en orden decreciente: ";
        for (int i = numeros.length - 1; i >= 0; i--) {
            resultado += numeros[i] + " ";
        }
        return resultado;
    }

}
