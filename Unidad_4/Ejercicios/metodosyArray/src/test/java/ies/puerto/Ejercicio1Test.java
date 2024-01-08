package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSumar() {
        int[] array = { 1, 2, 3, 4, 5 };
        int resutado = 15;
        int resutadoOk = ejercicio1.calcularSuma();
        Assertions.assertEquals(resutado, resutadoOk, "no se a podido obtener  el resultado correcto");
    }

    @Test
    public void mostrarResultado() {
        int resultado = 15;
        String resulatdoOk = "La suma de los elementos es: " + resultado;
        ejercicio1.mostrarResultado(resultado);
        Assertions.assertEquals(resulatdoOk, "La suma de los elementos es: " + resultado,
                "no se a podido obtener  el resultado correcto");

    }
}
