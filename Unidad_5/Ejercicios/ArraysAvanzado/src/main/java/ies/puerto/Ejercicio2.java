package ies.puerto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa que declare un arrat de diez elementos enteros y pida números para
 * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
 * Entonces se debe imprimir el array (sólo los elementos introducidos).
 */
public class Ejercicio2 {

    ArrayList<Integer> elementos = new ArrayList<Integer>();

    public Ejercicio2() {

    }

    /**
     * Contrutor con el elemento de la lista
     * 
     * @param elementos
     */

    public Ejercicio2(ArrayList<Integer> elementos) {
        this.elementos = elementos;
    }

    public ArrayList<Integer> getelementos() {
        return this.elementos;
    }

    public void setelementos(ArrayList<Integer> elementos) {
        this.elementos = elementos;
    }

    /**
     * Metodo que introduce elementos a una lista
     * 
     * @param elementos
     * @return
     */
    public ArrayList<Integer> insertarNumero(ArrayList<Integer> elementos) {
        Scanner lectura = new Scanner(System.in);
        int valor = 0;
        for (int i = 0; i < elementos.size() | valor < 0; i++) {
            System.out.println("dime la nota");
            valor = lectura.nextInt();
            valor = elementos.get(i);
        }
        return elementos;
    }

    /**
     * Metodo que muestra los elementos de una lista
     * 
     * @param elementos
     * @return
     */
    public String mostarLista(ArrayList<Integer> elementos) {
        String resultado = "";
        for (int i = 0; i < elementos.size(); i++) {
            resultado = " " + elementos.get(i);
        }
        return resultado;
    }

}
