package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    Rectangulo rectangulo1 = new Rectangulo();
    Rectangulo rectangulo = new Rectangulo(2, 2);

    @Test
    public void areaRectanguloTest() {
        int resultado = 4;
        int resultadoOk = rectangulo.areaRectangulo(2, 2);
        Assertions.assertEquals(resultado, resultadoOk, "El valor obtenido ");
    }

    @Test
    public void perimetroReectanguloTest() {
        int resultado = 8;
        int resultadoOk = rectangulo.perimetroRectangulo(2, 2);
        Assertions.assertEquals(resultado, resultadoOk, "El valor obtenido ");
    }

    @Test
    public void toStringTest() {
        rectangulo1.setLargo(2);
        rectangulo1.setAncho(2);
        String resultado = " largo='" + 2 + "'" +
                ", ancho='" + 2;
        String resultadoOk = rectangulo.toString();
        Assertions.assertEquals(resultado, resultadoOk);
    }
}
