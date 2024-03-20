package ies.puerto.PrimeraParte.App;

import java.util.ArrayList;
import java.util.List;

public class AppLista {
    static List <Integer> listaNUmerosPAres;
    static List <Integer> listaNUmerosInPares;

    public static void main(String[] args) {
        listaNUmerosPAres = new ArrayList<>();
        for (int i= 1; i<10;i++) {
            if(esPar(i)){
                listaNUmerosPAres.add(i);
            }else{
                listaNUmerosInPares.add(i);
            }
        }
        System.out.println("Lista de los numeros pares"+listaNUmerosPAres);
        System.out.println("Tamanio= "+ listaNUmerosPAres.size());
        System.out.println("Lista de los numeros in pares"+listaNUmerosInPares);
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
