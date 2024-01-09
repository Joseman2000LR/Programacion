package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();

    @Test
    public void testEliminarDuplicados() {
        int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
        int[] resultadoEsperado = { 1, 2, 3, 4, 5, 6 };
        int[] resultado = Ejercicio8.eliminarDuplicados(array);

        assertArrayEquals(resultadoEsperado, resultado, "No se ha ubtenido el valor esperado");
    }
}
