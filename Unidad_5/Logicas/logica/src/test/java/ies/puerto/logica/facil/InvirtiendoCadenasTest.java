
package ies.puerto.logica.facil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class InvirtiendoCadenasTest {

    InvirtiendoCadenas invirtiendoCadenas;
    
     @Test
    public void testInvertirCadena() {
        String entrada = "hola";
        String salidaEsperada = "aloh";

        String salidaReal = invirtiendoCadenas.invertirCadena(entrada);
        Assertions.assertEquals(salidaEsperada, salidaReal, "La cadena invertida no es la esperada");
    }

    @Test
    public void testInvertirCadenaCasoEspecial() {
       
        String entrada = "";
        String salidaEsperada = "";
        String salidaReal = invirtiendoCadenas.invertirCadena(entrada);

        Assertions.assertEquals(salidaEsperada, salidaReal, "La cadena invertida no es la esperada para un caso especial");
    }
}
