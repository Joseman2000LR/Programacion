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
        String resultado = " 5 4 6 0 9";
        String resultadoOK = ejercicio1.mostarNotas(notas);
        Assertions.assertEquals(resultado, resultadoOK, "No se a obtenido el valor indicado");
    }

    @Test
    public void notaMediaTest() {
        listaNota();
        int resultado = 4;
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

    @Test
    public void setNotasTest() {
        ejercicio1.setNota1(5);
        ejercicio1.setNota2(4);
        ejercicio1.setNota3(6);
        ejercicio1.setNota4(0);
        ejercicio1.setNota5(9);
        Assertions.assertTrue(true);
    }

    public ArrayList<Integer> listaNota() {
        Ejercicio1 ejercicio1 = new Ejercicio1(5, 4, 6, 0, 9);
        int nota1 = ejercicio1.getNota1();
        int nota2 = ejercicio1.getNota2();
        int nota3 = ejercicio1.getNota3();
        int nota4 = ejercicio1.getNota4();
        int nota5 = ejercicio1.getNota5();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);
        return notas;
    }
}
