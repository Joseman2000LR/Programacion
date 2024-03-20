package es.ies.puerto.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.modelo.Alimento;

public class TiendaTest {
    Tienda tienda;
    String id = "idAlimento";
    String nombre = "nombreAliemnto";
    String nombreActualizar="nombreActualizar";
    float precio = 2f;
    float precioActualizar = 3f;
    String fEntradaActualiza = "11/03/2024";
    String fCaducidadActualiza= "25/03/2024";
    String fEntrada = "01/03/2024";
    String fCaducidad = "05/03/2024";
    Alimento alimento;

    @BeforeEach
    public void beforeEach() {
        tienda = new Tienda();
        alimento = new Alimento(id, nombre, precio, fEntrada, fCaducidad);
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

    @Test
    public void ObtenerAlimentoTiendaTest() {
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);

        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntrada, alimentoBuscar.getfEntrada(),
         "El valor no es el esperado");
        Assertions.assertEquals(fCaducidad, alimentoBuscar.getfCaducidad(),
         "El valor no es el esperado");

    }

    @Test
    public void ObtenerAlimentoNoExisteTiendaTest() {
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar, "no se ha obtenido el valor esperado");
    }

    @Test
    public void ActualizarAlimentoTiendaTest() {
         Alimento alimentoActualizar = new Alimento(id, nombreActualizar, precioActualizar, fEntradaActualiza, fCaducidadActualiza);
        tienda.actualizarProducto(alimentoActualizar);
        Alimento alimentoBuscar = new Alimento(id);
        Assertions.assertEquals(nombreActualizar, alimentoBuscar.getNombre(),
         "El valor no es el esperado");
        Assertions.assertEquals(precioActualizar, alimentoBuscar.getPrecio(),
         "El valor no es el esperado");
        Assertions.assertEquals(fEntradaActualiza, alimentoBuscar.getfEntrada(),
         "El valor no es el esperado");
        Assertions.assertEquals(fCaducidadActualiza, alimentoBuscar.getfCaducidad(),
         "El valor no es el esperado");
    }

}
