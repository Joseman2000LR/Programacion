package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void buscarParesTest() {
        String resultado;
        String resultadoOk = "24";
        resultado = ejercicio4.buscarPares();
        Assertions.assertEquals(resultado, resultadoOk,
                "no se a podido obtener  el resultado correcto");

    }

    @Test
    public void esParTest() {
        boolean resultado = true;
        int numero = 2;
        resultado = ejercicio4.esPar(numero);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void noEsParTest() {
        boolean resultado = false;
        int numero = 3;
        resultado = ejercicio4.esPar(numero);
        Assertions.assertFalse(resultado);
    }
}
