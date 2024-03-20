package ies.puerto.SegundaParte.impleTest;

import ies.puerto.SegundaParte.imple.Alumno;
import ies.puerto.SegundaParte.imple.Aula;
import ies.puerto.SegundaParte.imple.Colegio;
import ies.puerto.SegundaParte.imple.Nota;
import ies.puerto.SegundaParte.imple.Profesor;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class ColegioTest {
    List<Aula> aulas = new ArrayList<>();
    Colegio colegio = new Colegio("Colegio Test", "Dirección", "Ubicación", aulas);
    Aula aula;
    Profesor profesor;
    Nota nota1 = new Nota("Matemáticas", 4.0f);
    Nota nota2 = new Nota("Física", 3.0f);
    Nota nota3 = new Nota("Química", 4.0f);
   
    
     @Test
    public void testNotaMaxAlumno() {
        List<Aula> aulas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();
        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas = new ArrayList<>();
        alumnos.add(new Alumno("Alice", "54511548j", "10/08/1978", notas));
        alumnos.add(new Alumno("Pepe", "545115558H", "10/08/1978", notas1));
        
        Aula aula = new Aula("Matemáticas", new Profesor("Juan", "25478695G", "04/07/1980",1200, "Matematico"), alumnos);
        Colegio colegio = new Colegio("Colegio Test", "Dirección", "Ubicación", aulas);

        assertEquals(null, colegio.notaMaxAlumno(aulas));
       
    }
    
    @Test
    public void testNotaAvgClase() {
       List<Aula> aulas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();
        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas = new ArrayList<>();
        alumnos.add(new Alumno("Alice", "54511548j", "10/08/1978", notas));
        alumnos.add(new Alumno("Pepe", "545115558H", "10/08/1978", notas1));
        
        Aula aula = new Aula("Matemáticas", new Profesor("Juan", "25478695G", "04/07/1980",1200, "Matematico"), alumnos);
        Colegio colegio = new Colegio("Colegio Test", "Dirección", "Ubicación", aulas);

        assertEquals(0.0f, colegio.notaAvgClase(aulas, "Aula1"), 0.01);
    

    }
    
    @Test
    public void testMediaVacia() {
        List<Alumno> alumnos = new ArrayList<>();
        List<Aula> aulas = new ArrayList<>();
        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas = new ArrayList<>();
        alumnos.add(new Alumno("Alice", "54511548j", "10/08/1978", notas));
        alumnos.add(new Alumno("Pepe", "545115558H", "10/08/1978", notas1));
        Aula aula = new Aula("Matemáticas", new Profesor("Juan", "25478695G", "04/07/1980",1200, "Matematico"), alumnos);
        Colegio colegio = new Colegio("Colegio Test", "Dirección", "Ubicación", aulas);

        assertEquals(0.0f, colegio.media(), 0.01);
       
    }
      @Test
      public void testEdadMediaColegioVacias(){
        List<Aula> aulas = new ArrayList<>();
        Colegio colegio = new Colegio("Colegio Test", "Dirección", "Ubicación", aulas);
          assertEquals(0.0f, colegio.edadMediaColegio(),0.01);
      }
}
