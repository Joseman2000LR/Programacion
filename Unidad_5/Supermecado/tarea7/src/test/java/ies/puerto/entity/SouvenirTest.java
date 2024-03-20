package ies.puerto.entity;

import ies.puerto.modelo.entity.Souvenir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class SouvenirTest {
    Souvenir souvenir;
    
    float precio = 2f;
    @BeforeEach
    public void beforeEach() {
        souvenir = new Souvenir("", "", precio, "");
        
    }
    
    
    @Test
    public void precioMaximoTest(){
        Assertions.assertEquals(2.5999999046325684, souvenir.precioMaximo(),"no se ha obtenido el precio previsto");
    }
}
