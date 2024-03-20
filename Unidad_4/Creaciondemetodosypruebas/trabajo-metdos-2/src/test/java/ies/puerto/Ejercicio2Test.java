package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void numeroPositivoTest() {
        boolean resultado;
        resultado = ejercicio2.verificacionNumero(2);
        Assertions.assertTrue(resultado);

    }

    @Test
    public void numeroNegativoTest() {
        boolean resultado;
        resultado = ejercicio2.verificacionNumero(-1);
        Assertions.assertFalse(resultado);

    }

    @Test
    public void numeroParTest() {
        boolean resultado;
        resultado = ejercicio2.parImpar(2);
        Assertions.assertTrue(resultado);

    }

    @Test
    public void numeroImparTest() {
        boolean resultado;
        resultado = ejercicio2.parImpar(3);
        Assertions.assertFalse(resultado);

    }
}
