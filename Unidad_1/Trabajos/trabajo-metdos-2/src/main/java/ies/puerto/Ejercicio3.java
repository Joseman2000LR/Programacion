package ies.puerto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * La clase contiene métodos para: pedir 5 números, mostrar los 5
 * números, muestra la suma y los muestra en orden creciente y en orden
 * decreciente.
 */

public class Ejercicio3 {
    /**
     * 
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Los numero son : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("La suma es : " + sumar(numeros));
        System.out.println("mayor a menor : " + ordenarMayorMenor(numeros));
        System.out.println("menor a mayor  : " + ordenarMenorMayor(numeros));

    }

    /**
     * Funcion que suma numero int
     * 
     * @param numeros parametro "numeros" de una lista .
     * @return el metodo devuelve los elementos de la lista de numeros
     */
    public static int sumar(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += i;
        }

        return suma;
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
    /**
     * Funcion que ordena una  de numeros de menor a mayor
     * 
     * @param numeros  de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static int ordenarMayorMenorNumero(int numero1 , int numero2 ) {
       int resultado =numero1;
       if(numero2>numero1){
        resultado=numero2;
       }
       return resultado;
    }

     /**
     * Funcion que ordena una  de numeros de menor a mayor
     * 
     * @param numeros  de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static int ordenarMayorMenorNumero(int numero1 , int numero2,int numero3) {
       int resultado =ordenarMayorMenorNumero(numero1,numero2);
       resultado =ordenarMayorMenorNumero(resultado,numero3);
       return resultado;

    }

    /**
     * Funcion que ordena una  de numeros de
     * 
     * @param numeros  de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static int ordenarMenorMayorNumero(int numero1 , int numero2 ) {
       int resultado =numero1;
       if(numero2<numero1){
        resultado=numero2;
       }
       return resultado;
    }

    /** Funcion que ordena una  de numeros de menor a mayor
     * 
     * @param numeros  de numeros a ordenar
     * @return resultado que es String que concaderna lo que contiene la lista
     */
    public static int ordenarMenorMayorNumero(int numero1 , int numero2,int numero3) {
       int resultado =ordenarMayorMenorNumero(numero1,numero2);
       resultado =ordenarMayorMenorNumero(resultado,numero3);
       return resultado;

    }


// falta hacer test y documentar

    public static String mostar(int numero1 , int numero2,int numero3){
        String resultado="";
        int valorMenor=ordenarMenorMayorNumero(numero1,numero2,numero3);
        int valorMayor=ordenarMayorMenorNumero(numero1,numero2,numero3);
        int intermedio=suma(numero1,numero2,numero3)-valorMayor-valorMenor;
        resultado=" "+valorMenor+intermedio+valorMayor;
        return  resultado;
    }
    public static int suma(int numero1 , int numero2){
        int resultado;
        
        return resultado=numero1+numero2;
    }
    public static int suma(int numero1 , int numero2,int numero3){
        int resultado=suma(numero1,numero2);
        resultado=suma(resultado,numero3);
        return resultado;
    }

}
