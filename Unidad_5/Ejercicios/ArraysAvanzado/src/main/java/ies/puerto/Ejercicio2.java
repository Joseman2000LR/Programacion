package ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa que declare un arrat de diez elementos enteros y pida números para
 * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
 * Entonces se debe imprimir el array (sólo los elementos introducidos).
 */
public class Ejercicio2 {

    int[] elemento = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

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
    public int[] insertarNumero(int[] elemento) {
        Scanner lectura = new Scanner(System.in);
        int valor = 0;
        for (int i = 0; i < elemento.length | valor < 0; i++) {
            System.out.println("dime la nota");
            valor = lectura.nextInt();
            valor = elemento[i];
        }
        return elemento;
    }

    /**
     * Metodo que muestra los elementos de una lista
     * 
     * @param elementos
     * @return
     */
    public String mostarLista(int[] elemento) {
        String resultado = "";
        for (int i = 0; i < elemento.length; i++) {
            resultado = " " + elemento[i];
        }
        return resultado;
    }

}
