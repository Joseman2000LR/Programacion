package ies.puerto.logica.facil;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class ContadorPalabraTest {
    ContadorPalabra contadorPalabra;
    
     @Test
    public void testVerificarPalindromo() {
        contadorPalabra = new ContadorPalabra();
        String texto = "Hola hola mundo HOLA";
        
        assertEquals(3, contadorPalabra.contador(texto), "La palabra 'hola' debería aparecer 3 veces en el texto");
        
    }
}
