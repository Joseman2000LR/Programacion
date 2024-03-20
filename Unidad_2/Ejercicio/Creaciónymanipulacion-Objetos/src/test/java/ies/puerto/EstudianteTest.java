package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    Estudiante estudiante = new Estudiante();
    Estudiante estudiante2 = new Estudiante("Pepe", 10, "Cocina", 6);

    @Test
    public void estudianteTest() {
        String nombre = "Pepe";
        int edad = 10;
        String carrera = "Cocina";
        int promedio = 6;
        Assertions.assertEquals(nombre, estudiante2.getNombre(), "no se a obtenido el valor indicado");
        Assertions.assertEquals(edad, estudiante2.getEdad(), "no se a obtenido el valor indicado");
        Assertions.assertEquals(carrera, estudiante2.getCarreta(), "no se a obtenido el valor indicado");
        Assertions.assertEquals(promedio, estudiante2.getPromedio(), "no se a obtenido el valor indicado");

    }

    @Test
    public void aprobadoTest() {
        int aprobado = 6;
        boolean aprobadoOk = estudiante.aprobado(aprobado);
        Assertions.assertTrue(aprobadoOk, "no se a obtenido el valor indicado");
    }

    @Test
    public void aprobadoNoTest() {
        int aprobado = 4;
        boolean aprobadoOk = estudiante.aprobado(aprobado);
        Assertions.assertFalse(aprobadoOk, "no se a obtenido el valor indicado");
    }

    @Test
    public void estudianteToStringTest() {
        estudiante.setNombre("Pepe");
        estudiante.setEdad(10);
        estudiante.setCarreta("Cocina");
        estudiante.setPromedio(6);
        String resultado = "nombre='Pepe', edad='10', carreta='Cocina', promedio='6'";
        Assertions.assertEquals(resultado, estudiante.toString());
    }
}
