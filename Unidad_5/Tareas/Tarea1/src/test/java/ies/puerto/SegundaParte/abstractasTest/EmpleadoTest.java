package ies.puerto.SegundaParte.abstractasTest;

import ies.puerto.SegundaParte.abstractas.Empleado;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class EmpleadoTest {
    @Test
    public void testConstructor() {
        Empleado empleado = new Empleado("John Doe", "123456789A", "01/01/1990", 2500f) {};
        assertEquals("John Doe", empleado.getNombre()); 
        assertEquals("123456789A", empleado.getDni()); 
    }
}
