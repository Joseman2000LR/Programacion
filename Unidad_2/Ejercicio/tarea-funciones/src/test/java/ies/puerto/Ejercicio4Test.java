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
        resultado = ejercicio4.mayorNumero(1, 2);
        Assertions.assertEquals(resultado, resultadoOk, "no se ha obtenido el resultado corecto");
    }

    @Test
    public void mayorSegundoNumero() {
        int resultadoOk = 2;
        int resultado;
        resultado = ejercicio4.mayorNumero(1, 2);
        Assertions.assertEquals(resultado, resultadoOk, "no se ha obtenido el resultado corecto");
    }

    @Test
    public void mayorTerceroNumero() {
        int resultadoOk = 3;
        int resultado;
        resultado = ejercicio4.mayorNumero(1, 2, 3);
        Assertions.assertEquals(resultado, resultadoOk, "no se ha obtenido el resultado corecto");
    }

}