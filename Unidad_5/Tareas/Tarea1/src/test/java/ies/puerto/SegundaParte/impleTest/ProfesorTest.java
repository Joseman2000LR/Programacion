package ies.puerto.SegundaParte.impleTest;

import ies.puerto.SegundaParte.imple.Profesor;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josemanuel
 */
public class ProfesorTest {
    Profesor profesor;
    
    @Test
    public void testMediaProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        profesores.add(new Profesor("Juan", "43689612P", "10/06/1987", 2000, "Física"));
        profesores.add(new Profesor("Física", "45789612R", "10/08/1989", 1800, "especialidad"));
        profesores.add(new Profesor("Química" ,"4368921L","10/06/1999", 1500, "especialidad"));

        Profesor profesor = new Profesor("Juan", "43689612P", "10/06/1987", 2000, "Física");
        assertEquals(0.0, profesor.media(profesores), 0.01);
    }
    
     @Test
    public void testMediaProfesores2() {
        List<Profesor> profesores = new ArrayList<>();

        Profesor profesor = new Profesor("juan");
        assertEquals(0.0, profesor.media(profesores), 0.01);
    }
    
    @Test
    public void testMaxAndMinProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        profesores.add(new Profesor("Juan", "43689612P", "10/06/1987", 2000, "Física"));
        profesores.add(new Profesor("Física", "45789612R", "10/08/1989", 1800, "especialidad"));
        profesores.add(new Profesor("Química" ,"4368921L","10/06/1999", 1500, "especialidad"));

        Profesor profesor = new Profesor("Juan", "43689612P", "10/06/1987", 2000, "Física");
        profesores.add(new Profesor("Física", "45789612R", "10/08/1989", 1800, "especialidad"));
        assertEquals("El salario minimo es :0.0Y el maximo es :0.0", profesor.MaxAndMin(profesores));
    }
    @Test
    public void testMaxAndMinWithoutProfesores() {
        List<Profesor> profesores = new ArrayList<>();

       
        Profesor profesor = new Profesor("juan");
        assertEquals("La lista esta vacia", profesor.MaxAndMin(profesores));
    }
}
