package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTest {
    Libro libro = new Libro();
    Libro libro2 = new Libro("Cervantes", "Juan", "10:09:5248");

    @Test
    public void LibroTest() {
        libro.setTitulo("java");
        libro.setAnioPublicacion("15:01:4500");
        String resultado = "Titulo : " + "java" + " " + "Anio de publicacion " + "15:01:4500";
        Assertions.assertEquals(resultado, libro.imprimirLibro(), "no se a podido obtener el valor indicado");
    }

    @Test
    public void libro2Test() {
        String resultado = " titulo='" + "Cervantes" + "'" +
                ", autor='" + "Juan" + "'" +
                ", anioPublicacion='" + "10:09:5248";
        Assertions.assertEquals(resultado, libro2.toString());
    }

}
