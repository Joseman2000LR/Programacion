package ies.puerto.entity;

import ies.puerto.modelo.entity.Alimento;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author josem
 */
public class AlimentoTest {
   Alimento alimento;
   
    String id = "id";
    String nombre = "nombre";
    float precio = 2f;
    String fEntrada = "01/03/2024";
    String fCaducidad = "05/03/2024";
    
    @BeforeEach
    public void beforeEach() {
        alimento = new Alimento(id, nombre, precio, fEntrada, fCaducidad);
        
    }
    
    @Test 
    public void SetFCaducidadTest(){
        alimento.setfCaducidad(fCaducidad);
        Assertions.assertEquals(fCaducidad, alimento.getfCaducidad(),"no se ha obtenido el fecha prevista");
        
    }
    
    @Test
    public void precioMaximoTest(){
        Assertions.assertEquals(2.700000047683716, alimento.precioMaximo(),"no se ha obtenido el precio previsto");
    }
}
