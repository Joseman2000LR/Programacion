package ies.puerto.SegundaParte.impleTest;

import ies.puerto.SegundaParte.imple.Alumno;
import ies.puerto.SegundaParte.imple.Aula;
import ies.puerto.SegundaParte.imple.Nota;
import ies.puerto.SegundaParte.imple.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class AulaTest {
    Aula aula;
    Profesor profesor;
    Nota nota1 = new Nota("Matemáticas", 4.0f);
    Nota nota2 = new Nota("Física", 3.0f);
    Nota nota3 = new Nota("Química", 4.0f);
    
    @Test
    public void testMediaAlumno() {
        List<Alumno> alumnos = new ArrayList<>();
        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas = new ArrayList<>();
        notas.add(nota1);
        notas1.add(nota2);
        alumnos.add(new Alumno("Alice", "54511548j", "10/08/1978", notas));
        alumnos.add(new Alumno("Pepe", "545115558H", "10/08/1978", notas1));
        
        Aula aula = new Aula("Matemáticas", new Profesor("Juan", "25478695G", "04/07/1980",1200, "Matematico"), alumnos);
        assertEquals(3.5, aula.media(), 0.01);
    }
     @Test
    public void testMediaAlumno2() {
        List<Alumno> alumnos = new ArrayList<>();
        Aula aula = new Aula("Matemáticas", new Profesor("Juan", "25478695G", "04/07/1980",1200, "Matematico"), alumnos);
        assertEquals(0, aula.media(), 0.01);
    }

     @Test
    public void testNombre() {
        Aula aula = new Aula("Física");
        assertEquals("Física", aula.getNombre());
    }
    
    @Test
    public void testProfesor() {
        Profesor profesor = new Profesor("Juan");
        Aula aula = new Aula("Química", profesor, new ArrayList<>());
        assertEquals(profesor, aula.getProfesor());
    }
    
    @Test
    public void testAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas = new ArrayList<>();
        notas.add(nota1);
        notas1.add(nota2);
        alumnos.add(new Alumno("Alice", "54511548j", "10/08/1978", notas));
        alumnos.add(new Alumno("Pepe", "545115558H", "10/08/1978", notas1));
        Aula aula = new Aula("Dam1", new Profesor("Juan"), alumnos);
        assertEquals(alumnos, aula.getAlumnos());
    }

    
}
