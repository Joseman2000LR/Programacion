package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mayorPrimerNumero() {
        int numero1 = 2;
        int numero2 = 1;
        int resultadoOk = 2;
        int resultado;
        resultado = ejercicio4.mayorNumero(numero1, numero2);
        Assertions.assertEquals(resultado, resultadoOk, "");
    }

    @Test
    public void mayorSegundoNumero() {
        int numero1 = 1;
        int numero2 = 2;
        int resultadoOk = 2;
        int resultado;
        resultado = ejercicio4.mayorNumero(numero1, numero2);
        Assertions.assertEquals(resultado, resultadoOk, "");
    }

    @Test
    public void mayorTerceroNumero() {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int resultadoOk = 3;
        int resultado;
        resultado = ejercicio4.mayorNumero(numero1, numero2, numero3);
        Assertions.assertEquals(resultado, resultadoOk, "ee");
    }

}