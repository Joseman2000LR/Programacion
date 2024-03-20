package ies.puerto.logica.facil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class PalindramoTest {
    
    Palindramo palindramo;
    
    @Test
    public void palidromoTest(){
        palindramo = new Palindramo();
        String palabra1 = "reconocer";
        String palabra2 = "cívico";
        String palabra3 = "Hola";
        
        Assertions.assertTrue(palindramo.verificar(palabra1), "La palabra 'reconocer' debería ser un palíndromo");
        Assertions.assertFalse(palindramo.verificar(palabra3), "La palabra 'Hola' no debería ser un palíndromo");
    }
    
}
