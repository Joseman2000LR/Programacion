package ies.puerto;

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numero1 = { 1, 2, 3 };
        int[] numero2 = { 5, 8, 9 };
        combinarArry(numero1, numero2);

    }

    public static void combinarArry(int[] numero1, int[] numero2) {
        int[] combinar = new int[numero1.length + numero2.length];

        for (int i = 0; i < numero1.length + numero2.length; i++) {
            combinar[i] = numero1[1];
        }
        for (int i = 0; i < numero1.length + numero2.length; i++) {
            combinar[i] = numero2[1];
        }
        ordenarMenorMayor(combinar);

        System.out.println("Copia del array original:");
        for (int elemento : combinar) {
            System.out.print(elemento + " ");
        }

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
}
