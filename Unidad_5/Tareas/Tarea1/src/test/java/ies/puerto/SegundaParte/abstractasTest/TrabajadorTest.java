package ies.puerto.SegundaParte.abstractasTest;

import ies.puerto.SegundaParte.abstractas.Trabajador;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class TrabajadorTest {
    
    @Test
    public void testSetSalario() {
        Trabajador trabajador = new Trabajador("John Doe") {};
        trabajador.setSalario(3000f);
        assertEquals(3000f, trabajador.getSalario(), 0.01); 
    }
    
     @Test
    public void testToString() {
        Trabajador trabajador = new Trabajador("John Doe", "123456789A", "01/01/1990", 2500f) {};
        assertEquals("Trabajador tiene" + "salario :" + trabajador.getSalario(), trabajador.toString());
    }
}
