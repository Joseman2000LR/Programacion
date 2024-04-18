package es.ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();

    }

    @Test
    public void tradicionalTest() {
        int numero = 2;
        int potencial = 5;
        int resultadook = 32;
        int resultado = ejercicio.potencialTradicional(numero, potencial);
        assertEquals(resultado, resultadook, "error");
    }

    @Test
    public void RecursivoTest() {
        int numero = 2;
        int potencial = 5;
        int resultadook = 32;
        int resultado = ejercicio.potencialRecursivo(numero, potencial);
        assertEquals(resultado, resultadook, "error");
    }


}
