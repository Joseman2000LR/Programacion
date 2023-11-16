package ies.puerto;

import java.util.Scanner;

/**
 * Programa que declare un array de diez elementos enteros y pida números para
 * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
 * Entonces se debe imprimir el array (sólo los elementos introducidos).
 */
public class Ejercicio2 {

    int[] elemento = new int[10];

    public Ejercicio2() {

    }

    /**
     * Contrutor con el elemento de la lista
     * 
     * @param elementos
     */

    public Ejercicio2(int[] elemento) {
        this.elemento = elemento;
    }

    public int[] getElemento() {
        return this.elemento;
    }

    public void setElemento(int[] elemento) {
        this.elemento = elemento;
    }

    /**
     * Metodo que introduce elementos a una lista
     * 
     * @param elementos
     * @return
     */
    public void insertarNumero(int[] elemento) {
        Scanner lectura = new Scanner(System.in);
        int valor = 0;
        int i = 0;
        boolean salir = false;
        do {
            System.out.println("dime la nota" + (i + 1));
            valor = lectura.nextInt();
            if (valor < 0) {
                salir = true;
                elemento[i] = valor;
            } else {
                elemento[i] = valor;
                i++;
            }
            valor = lectura.nextInt();
            valor = elemento[i];
        } while (i < elemento.length && !salir);
        mostarLista(elemento, i);

    }

    /**
     * Metodo que muestra los elementos de una lista
     * 
     * @param elementos
     * @return
     */
    public void mostarLista(int[] elemento, int total) {
        for (int i = 0; i < total; i++) {
            System.out.println(" " + elemento[i]);
        }
    }

}
