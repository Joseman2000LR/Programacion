package ies.puerto.PrimeraParte.App;

import java.util.ArrayList;

public class AppComparadorArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(3);
        lista2.add(4);
        lista2.add(5);

        boolean tienenElementoComun = tienenElementoComun(lista1, lista2);
        System.out.println("Las listas tienen al menos un elemento en comun " + tienenElementoComun);
    }

    public static boolean tienenElementoComun(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        for (Integer elemento : lista1) {  
            if (lista2.contains(elemento)) {
                return true;
            }
        }
        return false;
    }
}
