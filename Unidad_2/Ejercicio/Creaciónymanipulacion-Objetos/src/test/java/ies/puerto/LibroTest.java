package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {
    Libro libro = new Libro();
    Libro libro2;

    @BeforeEach
    public void beforeEach() {
         libro2 = new Libro("Cervantes", "Juan", "2000");
    }

    @Test
    public void LibroTest() {
        libro.setTitulo("java");
        libro.setAnioPublicacion("2000");
        String resultado = "Titulo : " + "java" + " " + "Anio de publicacion " + "2000";
        Assertions.assertEquals(resultado, libro.imprimirLibro(), "no se a podido obtener el valor indicado");
    }

    @Test
    public void libro2Test() {
        String resultado = " titulo='" + "Cervantes" + "'" +
                ", autor='" + "Juan" + "'" +
                ", anioPublicacion='" + "2000";
        Assertions.assertEquals(resultado, libro2.toString(), "no se ha obtenido el valor indicado");
    }

}
