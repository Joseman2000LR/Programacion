package ies.puerto;

import java.util.Scanner;

/**
 * Programa que declare tres array ‘array1’, ‘array2’ y ‘array3’ de cinco
 * enteros cada uno, pida valores para ‘array1’ y ‘array2’ y calcule
 * array3=array1+array2, posición a posición y el total de ambos array sumados.
 */
public class Ejercicio3 {
    int[] array1;
    int[] array2;
    int[] array3;

    public Ejercicio3() {

    }

    /**
     * Contrutor con las 3 arrays
     * 
     * @param array1
     * @param array2
     * @param array3
     */
    public Ejercicio3(int[] array1, int[] array2, int[] array3) {
        this.array1 = array1;
        this.array2 = array2;
        this.array3 = array3;
    }

    public int[] getArray1() {
        return this.array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return this.array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public int[] getArray3() {
        return this.array3;
    }

    public void setArray3(int[] array3) {
        this.array3 = array3;
    }

    public void pedirElementos(int[] arrays1, int[] arrays2) {
        Scanner lectura = new Scanner(System.in);
        arrays1 = new int[5];
        arrays2 = new int[5];
        int valor;

        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("dime la nota");
            valor = lectura.nextInt();
            valor = arrays1[i];
        }

        for (int i = 0; i < arrays2.length; i++) {
            System.out.println("dime la nota");
            valor = lectura.nextInt();
            valor = arrays2[i];
        }

        combinarElementos(arrays1, arrays2);

    }

    public void combinarElementos(int[] arrays1, int[] arrays2) {
        int tamanio = arrays1.length + arrays2.length;
        array3 = new int[tamanio];

    }

    public void sumarElementos(int[] arrays1, int[] arrays2) {
        int suma;

    }

}
