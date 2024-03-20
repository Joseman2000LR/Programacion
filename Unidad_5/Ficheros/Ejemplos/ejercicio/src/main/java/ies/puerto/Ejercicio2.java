package main.java.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    static List<String> listaCadena;

    public static void main(String[] args) {
        listaCadena = new ArrayList<>();
        listaCadena.add("no comienzo con A");
        listaCadena.add("Aveces comienzo con A");
        listaCadena.add("Adios mundo cruel");
        listaCadena.add("Tampoco enpiezo con A");
        listaCadena.add("Le vamos a traer una caja de dulces");
        listaCadena.add("Angelo trae una caja de dulces");
        int contador = 0;
        for (String cadena : listaCadena) {
            if (comienzaPorA(cadena)) {
                contador++;
            }

        }
    }
    public boolean comienzaPorA(String cadena) {
        String regex ="^[a|A].*";
        cadena.
        if (Pattern.matches(regex,cadena)){
            return  true;
        }
        return false;
    }
}
