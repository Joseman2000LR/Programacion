package main.java.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicico7 {
    static List<String> lista;

    public static void main(String[] args) {
        lista = new ArrayList<>(Arrays.asList("uno" + "dos" + "leche" + "agua" + "dos"));
        System.out.println("lista sin duplicado :" + eliminarCadenaDuplicadas(lista));

    }

    /***
     * Funcion que un elemento de una lista existe en otra lista
     * 
     * @param lista1 Integer
     * @param lista2 Integer
     * @return true/false
     */
    public static List<String> eliminarCadenaDuplicadas(List<String> lista) {
        List<String> resultado = new ArrayList<>();
        for (String elemnto : resultado) {
            if (!resultado.contains(resultado)) {
                resultado.add(elemnto);
            }
        }

        return resultado;
    }
}
