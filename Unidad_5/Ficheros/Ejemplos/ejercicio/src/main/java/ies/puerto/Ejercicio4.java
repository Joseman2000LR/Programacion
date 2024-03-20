package main.java.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Ejercicio4 {
    static List<Integer> lista1;
    static List<Integer> lista2;
    static List<Integer> listaNoComun;

    public static void main(String[] args) {
        lista1 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1, 2, 4));
        lista2 = new ArrayList<>(Arrays.asList(10, 20, 5, 6, 4, 9));
        listaNoComun = new ArrayList<>(Arrays.asList(10, 20, 5, 6, 9));
        System.out.println("las lista tienen elementos comunes " + elementoComun(lista1, lista2));
        System.out.println("las lista tienen elementos comunes " + elementoComun(lista1, listaNoComun));
    }

    /***
     * Funcion que un elemento de una lista existe en otra lista
     * 
     * @param lista1 Integer
     * @param lista2 Integer
     * @return true/false
     */
    public static boolean elementoComun(List<Integer> lista1, List<Integer> lista2) {
        if (lista2.size() > lista1.size()) {
            List<Integer> temporal = lista1;
            lista1 = lista2;
            lista2 = temporal;
        }
        for (Integer elemento : lista1) {
            if (lista2.contains(elemento)) {
                return true;
            }

        }
        return false;
    }

    public static boolean elementoComunRecursivo(List<Integer> lista1, List<Integer> lista2) {
        boolean resultado = false;
        if (lista2.size() > lista1.size()) {
            resultado = elementoComunRecursivo(lista2, lista1);
        }
        for (Integer elemento : lista1) {
            if (lista2.contains(elemento)) {
                return true;
            }

        }
        return resultado;
    }

}