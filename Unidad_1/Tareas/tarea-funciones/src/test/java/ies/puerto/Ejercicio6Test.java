package ies.puerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void testFahrenheitACelsius() {
        double fahrenheit = 0.0;
        double resultado = ejercicio6.fahrenheitACelsius(32.0);
        assertEquals(fahrenheit, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void testFahrenheitACelsiusNegativo() {
        double fahrenheit = -40.0;
        double resultado = ejercicio6.fahrenheitACelsius(-40.0);
        assertEquals(fahrenheit, resultado, "No se ha obtenido el resultado esperado"); 
    }
}