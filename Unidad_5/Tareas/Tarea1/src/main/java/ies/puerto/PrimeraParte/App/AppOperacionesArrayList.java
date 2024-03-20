package ies.puerto.PrimeraParte.App;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppOperacionesArrayList {
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
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(2);
        numeros.add(30);
        numeros.add(2);
        numeros.add(30);
        numeros.add(6);

        ArrayList<Integer> numerosPares = obtenerNumerosPares(numeros);
       
        System.out.println("Numeros pares: " + numerosPares);
         boolean todosMayoresQue10 = sonTodosMayoresQue10(numeros);
        System.out.println(" Todos los números son mayores que 10" + numeros);
    }

    /**
     * Metodo
     * 
     * @param cadena
     * @return
     */
    public static boolean comienzaPorA(String cadena) {
        String regex = "^[a|A].*";
        if (Pattern.matches(regex, cadena)) {
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> obtenerNumerosPares(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }
    
     public static boolean sonTodosMayoresQue10(ArrayList<Integer> numeros) {
        for (Integer numero : numeros) {
            if (numero <= 10) {
                return false;
            }
        }
        return true;
    }
}
