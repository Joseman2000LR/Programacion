package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void fibonacciCaso0TestOK() {
        String resultado = "";
        int numero = 0;
        int resultadoOk = 55;
        resultado = ejercicio5.fibonacci(numero);
        assertEquals("0", ejercicio5.fibonacci(numero));
    }
}
