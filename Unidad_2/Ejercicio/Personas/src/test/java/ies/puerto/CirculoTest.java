package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circulo = new Circulo();
    Circulo circulo2 = new Circulo(5);

    @Test
    public void circuloTest() {
        circulo.setRadio(2);
        String resultado = "radio= " + 2;
        Assertions.assertEquals(resultado, circulo.toString());
    }
}
