package ies.puerto.negocio;

import ies.puerto.modelo.entity.Alimento;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class TiendaTest {
    Tienda tienda;
   private static final String id = "idAlimento";
  private static final  String nombre = "nombreAliemnto";
   private static final String nombreActualizar="nombreActualizar";
   private static final String tipo="tipoAlimento";
  private static final  String Calorias="CaloriasAlimento";
  private static final  String proteinas="proteinasAlimento";
  private static final  String grasas="grasasAlimento";
  private static final  String carbohidratos="carbohidratosAlimento";
    Alimento alimentoNuevo;
     List<Alimento> alimentos;
    
     @BeforeEach
    public void beforeEach() {
        tienda = new Tienda();
         alimentos = tienda.getAlimentos();
        alimentoNuevo= new Alimento(id, nombre, tipo, Calorias, proteinas, grasas, carbohidratos);
        tienda.crearProducto(alimentoNuevo);
    }
    
    @AfterEach
    public  void afterEach(){
       tienda.setAlimentos(alimentos);

    }

    @Test
    public void TiendaNotNullTest() {
        Assertions.assertNotNull(tienda, "no puede ser nulo");
    }

    @Test
    public void addAlimentoTiendaTest() {
        Assertions.assertEquals(tienda.obtenerProducto(id),alimentoNuevo);
    }

   

}
