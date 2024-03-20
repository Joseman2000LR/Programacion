package ies.puerto.negocio;

import ies.puerto.modelo.implementacion.Alimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author josem
 */
public class TiendaTest {
    Tienda tienda;
    String id = "idAlimento";
    String nombre = "nombreAliemnto";
    String nombreActualizar="nombreActualizar";
    String tipo="tipoAlimento";
    String Calorias="CaloriasAlimento";
    String proteinas="proteinasAlimento";
    String grasas="grasasAlimento";
    String carbohidratos="carbohidratosAlimento";
    Alimento alimento;
     
    
     @BeforeEach
    public void beforeEach() {
        tienda = new Tienda();
        alimento = new Alimento(id, nombre, tipo, Calorias, proteinas, grasas, carbohidratos);
        tienda.crearProducto(alimento);
    }

    @Test
    public void TiendaNotNullTest() {
        Assertions.assertNotNull(tienda, "no puede ser nulo");
    }

    @Test
    public void addAlimentoTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "no se ha obtenido el tamanio esperado");
    }

    @Test
    public void addAlimentoExisteTiendaTest() {
        tienda.crearProducto(alimento);
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "no se ha obtenido el tamanio esperado");
    }

    @Test
    public void EliminarAlimentoTiendaTest() {
        tienda.eliminarProducto(alimento);
        Assertions.assertEquals(0, tienda.obtenerProductos().size(), "no se ha obtenido el tamanio esperado");
    }

//    @Test
//    public void ObtenerAlimentoTiendaTest() {
//        Alimento alimentoBuscar = new Alimento(id);
//        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
//
//        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fEntrada, alimentoBuscar.getfEntrada(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fCaducidad, alimentoBuscar.getfCaducidad(),
//         "El valor no es el esperado");
//
//    }

    @Test
    public void ObtenerAlimentoNoExisteTiendaTest() {
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar, "no se ha obtenido el valor esperado");
    }
//
//    @Test
//    public void ActualizarAlimentoTiendaTest() {
//         Alimento alimentoActualizar = new Alimento(id, nombreActualizar, precioActualizar, fEntradaActualiza, fCaducidadActualiza);
//        tienda.actualizarProducto(alimentoActualizar);
//        Alimento alimentoBuscar = new Alimento(id);
//        Assertions.assertEquals(nombreActualizar, alimentoBuscar.getNombre(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(precioActualizar, alimentoBuscar.getPrecio(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fEntradaActualiza, alimentoBuscar.getfEntrada(),
//         "El valor no es el esperado");
//        Assertions.assertEquals(fCaducidadActualiza, alimentoBuscar.getfCaducidad(),
//         "El valor no es el esperado");
//    }
}
