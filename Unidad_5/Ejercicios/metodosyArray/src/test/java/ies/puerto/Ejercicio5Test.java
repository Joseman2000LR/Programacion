package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void buscarElementoTest() {
        int indicador = 10;
        int posicion = 9;
        String resultado = "El numero esta en la posicion " + posicion;
        String resultadoOk = "";
        resultadoOk = ejercicio5.buscarElemento(indicador);
        Assertions.assertEquals(resultado, resultadoOk, "No se a obtenido el resutado indicado");
    }

    @Test
    public void buscarElementoNoListaTest() {
        int indicador = 11;
        String resultado = "El numero indicado " + indicador + " no esta en la lista";
        String resultadoOk = "";
        resultadoOk = ejercicio5.buscarElemento(indicador);
        Assertions.assertEquals(resultado, resultadoOk, "No se a obtenido el resutado indicado");
    }
}
