package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void CalcularPromedioTest() {
        float promedio;
        float promedioOk = 3.5f;
        promedio = ejercicio2.calcularPromedio();
        Assertions.assertEquals(promedio, promedioOk,
        "no se a podido obtener  el resultado correcto");
    }
}
