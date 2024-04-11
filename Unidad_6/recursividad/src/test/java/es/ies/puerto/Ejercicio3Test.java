package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio;
    int numeroEsperado=55;
    @BeforeEach
    public void beforeEach() {
        ejercicio=new Ejercicio3();
    }

    @Test
    public void numeroNaturalesTest() {
        Assertions.assertEquals(numeroEsperado,ejercicio.numeroNaturales(10),"Error");
    }


    @Test
    public void numeroNaturalesRecursivaTest() {
        Assertions.assertEquals(numeroEsperado,ejercicio.numeroNaturalesRecursiva(10),"Error");
    }
}
