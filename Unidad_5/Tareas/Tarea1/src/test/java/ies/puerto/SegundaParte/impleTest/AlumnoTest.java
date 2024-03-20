package ies.puerto.SegundaParte.impleTest;

import ies.puerto.SegundaParte.imple.Alumno;
import ies.puerto.SegundaParte.imple.Nota;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class AlumnoTest {
    Nota nota1 = new Nota("Matemáticas", 4.0f);
    Nota nota2 = new Nota("Física", 3.0f);
    Nota nota3 = new Nota("Química", 4.0f);
    List<Nota> notas = new ArrayList<>();
    List<Nota> notasVacias = new ArrayList<>();
    Alumno alumno = new Alumno("Pepe", "54511548j", "10/08/1978", notas);

    @Test
    public void mediaTest() {
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        float mediaEsperada = (nota1.getValor() + nota2.getValor() + nota3.getValor()) / notas.size();
        assertEquals(mediaEsperada, alumno.media());

    }

    @Test
    public void media2Test() {
        float mediaEsperada = 0f;
        assertEquals(mediaEsperada, alumno.media());

    }

    public void testGetNotas() {
        assertEquals(notas, alumno.getNotas());
    }

    @Test
    public void testSetNotas() {
        List<Nota> nuevasNotas = new ArrayList<>();
        nuevasNotas.add(nota1);
        alumno.setNotas(nuevasNotas);
        assertEquals(nuevasNotas, alumno.getNotas());
    }

   
    @Test
    public void testToString() {
        String expectedToString = "Alumno{notas=" + notas + '}';
        assertEquals(expectedToString, alumno.toString());
    }

}
