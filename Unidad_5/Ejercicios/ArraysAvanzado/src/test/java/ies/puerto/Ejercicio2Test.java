package ies.puerto;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();
    ArrayList<Integer> elemento = new ArrayList<Integer>();

    @Test
    public void mostarListaTEst() {
        lista();
        String resultado = "";
        String resultadoOK = ejercicio2.mostarLista(elemento);
        Assertions.assertEquals(resultado, resultadoOK, "");
    }

    public void lista() {
        int valor = (int) Math.random();
        for (int i = 0; i < elemento.size(); i++) {
            elemento.get(valor);
        }

    }
}
