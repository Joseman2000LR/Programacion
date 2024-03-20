package ies.puerto.App;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppListaInteger {
    static List<Integer> miListaEnteros;

    public static void main(String[] args) {
        miListaEnteros = new ArrayList<>();
        addElemento(1);
        addElemento(2);
        List<Integer> subSUbLista = new ArrayList<>();
        subSUbLista.add(3);
        addSublista(subSUbLista);
        System.out.println(miListaEnteros);

    }

    public static boolean addElemento(Integer elemento) {
        return miListaEnteros.add(elemento);
    }

    public static boolean removeElemento(Integer elemento) {
        return miListaEnteros.remove(elemento);
    }

    public static boolean addSublista(Collection sublista) {
        return miListaEnteros.addAll(sublista);
    }

    
}
