package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mayorNumero() {
        int numero1 = 1;
        int numero2 = 2;
        int resultadoOk = 1;
        int resultado;
        resultado = ejercicio4.mayorNumero(numero1, numero2);
        Assertions.assertEquals(resultado, resultadoOk, "");
    }

}