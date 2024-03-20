package ies.puerto.App;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {
    static List<String> miListaString;

    public static void main(String[] args) {
        miListaString = new ArrayList<>();
        String dni = "5451565F";
        String dni2 = "5418651T";
        miListaString.add(dni);
        miListaString.add(dni2);

        System.out.println(miListaString);
        boolean existe = existeElemento(dni);
        if (existe) {
            System.out.println("Existe el elemento " + dni + " , en la lista " + miListaString);

        }
        existe = existeElemento("1234");
        if (!existe) {
            System.out.println("NO exite existe el elemento  1234" + " , en la lista " + miListaString);

        }
    }

    public static boolean existeElemento(String elemento) {
        return miListaString.contains(elemento);
    }

}
