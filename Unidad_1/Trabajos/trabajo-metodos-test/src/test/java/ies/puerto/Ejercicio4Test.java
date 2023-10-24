package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void calculoPalidromoTestOK() {
        String resultado = "";
        int resultadoOk = 11;
        int numero = 11;
        resultado = ejercicio4.calcularPalidromo(numero);
        Assertions.assertEquals(resultadoOk, numero, "No se obtenido el resultado correcto");

    }
}
