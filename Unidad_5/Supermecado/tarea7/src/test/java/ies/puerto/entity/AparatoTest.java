package ies.puerto.entity;

import ies.puerto.modelo.entity.Aparato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class AparatoTest {
    Aparato aparato;
    
    float precio = 2f;
    @BeforeEach
    public void beforeEach() {
        aparato = new Aparato("", "", precio, "");
        
    }
    
    
    @Test
    public void precioMaximoTest(){
        Assertions.assertEquals(2.9000000953674316, aparato.precioMaximo(),"no se ha obtenido el precio previsto");
    }
}
