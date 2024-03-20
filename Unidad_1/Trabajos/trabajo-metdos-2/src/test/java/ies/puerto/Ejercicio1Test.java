package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest(){
        double resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100, resultado,"no se ha obtenido el resultado correpodiente");

    }
    @Test
    public void calcularSueldoHoras205OkTest(){
        double resultado = ejercicio1.calcularSueldoHoras(20.5f);
        Assertions.assertEquals(205, resultado,"no se ha obtenido el resultado correpodiente");

    }
}
