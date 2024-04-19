package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    /**
     * Fibonacci
     */

    public List<Integer> fibonacci(int i, int j, int k) {
        int resultado = i + j;
        List<Integer> lista = new ArrayList<>();
        if (i == 0 && j == 1) {
            k -= 2;
            lista.add(i);
            lista.add(j);
            lista.add(resultado);

            if (k > 0) {
                lista.addAll(fibonacci(i, resultado, k - 1));
            }
        }
        return lista;

    }
}
