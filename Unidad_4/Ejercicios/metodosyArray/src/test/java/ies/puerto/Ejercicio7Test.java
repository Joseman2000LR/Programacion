package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void ordenarMayorMenorNumeroOkTest() {
        String resultado = "Numeros en orden decreciente: 5 4 3 2 1 ";
        String resultadoOrdenado = ejercicio7.ordenarMayorMenor();
        Assertions.assertEquals(resultado, resultadoOrdenado,
                "no se a podido obtener  el resultado correcto");
    }
}
