package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void sumarNumeroOkTest() {
        int resultado = 15;
        int[] numeros = { 1, 2, 3, 4, 5 };
        ejercicio3.sumar(numeros);
        Assertions.assertEquals(resultado, 15, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMayorMenorNumeroOkTest() {
        String resultado = "Numeros en orden decreciente: 5 4 3 2 1 ";
        int[] numeros = { 1, 2, 3, 4, 5 };
        String resultadoOrdenado = ejercicio3.ordenarMayorMenor(numeros);
        Assertions.assertEquals(resultado, resultadoOrdenado, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMenorMayorNumeroOkTest() {
        String resultado = "Numeros en orden creciente: 1 2 3 4 5 ";
        int[] numeros = { 1, 2, 3, 4, 5 };
        String resultadoOrdenado = ejercicio3.ordenarMenorMayor(numeros);
        Assertions.assertEquals(resultado, resultadoOrdenado, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMayorMenorNumeroV1OkTest() {
        int resultado = 5;
        int resultadoOrdendo = ejercicio3.ordenarMayorMenorNumero(4, 5);
        Assertions.assertEquals(resultado, resultadoOrdendo, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMayorMenorNumeroV2OkTest() {
        int resultado = 5;
        int resultadoOrdendo = ejercicio3.ordenarMayorMenorNumero(5, 4);
        Assertions.assertEquals(resultado, resultadoOrdendo, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMayorMenorNumeroV3OkTest() {
        int resultado = 6;
        int resultadoOrdendo = ejercicio3.ordenarMayorMenorNumero(5, 4, 6);
        Assertions.assertEquals(resultado, resultadoOrdendo, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMenorMayorNumeroV1OkTest() {
        int resultado = 4;
        int resultadoOrdendo = ejercicio3.ordenarMenorMayorNumero(4, 5);
        Assertions.assertEquals(resultado, resultadoOrdendo, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void ordenarMenorMayorNumeroV2OkTest() {
        int resultado = 4;
        int resultadoOrdendo = ejercicio3.ordenarMenorMayorNumero(5, 4);
        Assertions.assertEquals(resultado, resultadoOrdendo, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void mostarOkTest() {
        String resultado = " 123";
        String resultadoOrdenado = ejercicio3.mostar(1, 2, 3);
        Assertions.assertEquals(resultado, resultadoOrdenado, "no se a obtenido el valor indicado");

    }

}
