package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    /*
    * Cuenta recurviva
    * */

    public List<Integer> cuentaDecendente(int numero){
        List<Integer> lista = new ArrayList<>();
        for (int i = numero; i >=0; i--) {
            lista.add(i);
        }
        return lista;
    }

    public List<Integer> cuentaDecendenteRecursiva(int numero){
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if (numero==0){
            return lista;
        }
         lista.addAll(cuentaDecendenteRecursiva(numero-1))  ;
        return lista;
    }
}
