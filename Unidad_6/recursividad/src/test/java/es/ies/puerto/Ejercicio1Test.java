package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    public static final String no_se_obtenido_el_valor =  "no_se_obtenido_el_valor";
    Ejercicio1 ejercicio;
    int resultado =24;
    @BeforeEach
    public void beforeEach() {
        ejercicio =new Ejercicio1();
    }

    @Test
    public void ejercicio1TradicionalTest() {
        Assertions.assertEquals(resultado,ejercicio.factorialTradicional(4),no_se_obtenido_el_valor);

    }
    @Test
    public void ejercicio1RecursivoTest() {
        Assertions.assertEquals(resultado,ejercicio.factorial(4),no_se_obtenido_el_valor);

    }
}
