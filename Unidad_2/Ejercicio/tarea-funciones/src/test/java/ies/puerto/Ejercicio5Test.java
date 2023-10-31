package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void primoOkTest() {
        boolean resultado;
        int numero = 2;
        resultado = ejercicio5.esPrimo(numero);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void noPrimoOkTest() {
        boolean resultado;
        int numero = 17;
        resultado = ejercicio5.esPrimo(numero);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void primoIgual1OkTest() {
        boolean resultado;
        int numero = 1;
        resultado = ejercicio5.esPrimo(numero);
        Assertions.assertFalse(resultado);
    }

  
}