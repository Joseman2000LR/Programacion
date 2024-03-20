package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1{
    static List <Integer> listaEnteros;

    public static void main(String[] args) {
        listaEnteros= new ArrayList<>();
        for (int i= 1; i<10;i++) {
            if(esPar(i)){
                listaEnteros.add(i);
            }

        }
        System.out.println(listaEnteros);
        System.out.println("Tamanio= "+ listaEnteros.size());
    }

    /**
     * Funcion que verifica si un numero es parar
     * @param i numero que verifica
     * @return true/false si es par o no
     */
    public static boolean esPar(int i) {
        if (i%2==0){
            return  true;
        }
        return  false  ;
    }
}