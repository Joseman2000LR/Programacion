package ies.puerto;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();
    ArrayList<Integer> notas = new ArrayList<Integer>();

    @Test
    public void mostarNotasTest() {
        listaNota();
        String resultado = " 5 8 6 4 0 9";
        String resultadoOK = ejercicio1.mostarNotas(notas);
        Assertions.assertEquals(resultado, resultadoOK, "No se a obtenido el valor indicado");
    }

    @Test
    public void notaMediaTest() {
        listaNota();
        int resultado = 6;
        int resultadoOK = ejercicio1.notaMedia(notas);
        Assertions.assertEquals(resultado, resultadoOK, "No se a obtenido el valor indicado");
    }

    @Test
    public void notaAlta() {
        listaNota();
        int resultado = 9;
        int resultadoOK = ejercicio1.notaAlta(notas);
        Assertions.assertEquals(resultado, resultadoOK, "No se a obtenido el valor indicado");
    }

    @Test
    public void notaBaja() {
        listaNota();
        int resultado = 0;
        int resultadoOK = ejercicio1.notaBaja(notas);
        Assertions.assertEquals(resultado, resultadoOK, "No se a obtenido el valor indicado");
    }

    /***
     *
     * @return
     */
    public ArrayList<Integer> listaNota() {
        ArrayList<Integer> nota = new ArrayList<Integer>();
        notas.add(5);
        notas.add(8);
        notas.add(6);
        notas.add(4);
        notas.add(0);
        notas.add(9);
        return notas;
    }
}
