package ies.puerto.SegundaParte.impleTest;

import ies.puerto.SegundaParte.imple.Nota;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class NotaTest {

    @Test
    public void testEquals() {
        Nota nota1 = new Nota("Matemáticas", 4.5f);
        Nota nota2 = new Nota("Matemáticas", 4.5f);
        Nota nota3 = new Nota("Física", 3.8f);

        assertTrue(nota1.equals(nota2)); // Deben ser iguales
        assertFalse(nota1.equals(nota3)); // Deben ser diferentes
    }

    @Test
    public void testToString() {
        Nota nota = new Nota("Historia", 3.9f);
        assertEquals("Nota nombre=Historia, valor=3.9", nota.toString());
    }

    @Test
    public void testConstructorAndGetters() {
        Nota nota = new Nota("Matemáticas", 4.0f);
        assertEquals("Matemáticas", nota.getNombre());
        assertEquals(4.0f, nota.getValor());
    }

    @Test
    public void testSetters() {
        Nota nota = new Nota("Física", 3.0f);
        nota.setNombre("Química");
        nota.setValor(4.0f);
        assertEquals("Química", nota.getNombre());
        assertEquals(4.0f, nota.getValor());
    }
}
