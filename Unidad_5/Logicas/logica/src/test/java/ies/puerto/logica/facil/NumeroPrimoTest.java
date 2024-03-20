package ies.puerto.logica.facil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class NumeroPrimoTest {
    NumeroPrimo numeroPrimo ;
     
    @Test
    public void numerosPrimmosTest(){
        numeroPrimo = new NumeroPrimo();
        int numero=3;
        Assertions.assertFalse(numeroPrimo.numeroPrimmo(10), "10 no debería ser primo");
        Assertions.assertTrue(numeroPrimo.numeroPrimmo(numero), "7 debería ser primo");
    }
}
