package ies.puerto.imple;

import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class EliminarDuplicadosArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("perro");
        lista.add("gato");
        lista.add("perro");
        lista.add("loro");
        lista.add("gato");
        lista.add("perro");

        System.out.println("Lista original: " + lista);
        eliminarDuplicados(lista);
        System.out.println("Lista sin duplicados: " + lista);
    }

    public static void eliminarDuplicados(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            String elementoActual = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                if (elementoActual.equals(lista.get(j))) {
                    lista.remove(j);
                    j--; 
                }
            }
        }
    }
}
