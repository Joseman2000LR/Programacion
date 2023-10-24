package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

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

}
