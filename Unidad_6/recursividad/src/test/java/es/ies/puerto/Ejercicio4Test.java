package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test {
    Ejercicio4 ejercicio;
    List<Integer>resulatdoEsperado;
    List<Integer>resulatdoEsperado1;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
        resulatdoEsperado = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
        resulatdoEsperado1 = new ArrayList<>(Arrays.asList(10,8,6,4,2,0));
    }

    @Test
    public void paresTest() {
        Assertions.assertEquals(resulatdoEsperado,ejercicio.paresTradicional(10),"Error");
    }
    @Test
    public void paresRecursivoTest() {
        Assertions.assertEquals(resulatdoEsperado1,ejercicio.paresRecursivo(10),"Error");
    }
}
