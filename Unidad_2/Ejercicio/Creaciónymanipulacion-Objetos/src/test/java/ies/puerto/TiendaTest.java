package ies.puerto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TiendaTest {
    Tienda tienda = new Tienda();
    Producto producto = new Producto("Camiseta", 20.0, 100);

    @Test
    public void testAgregarProducto() {
        tienda.agregarProducto(producto);
        assertTrue(tienda.mostrarInventario().contains("Camiseta"));
    }

    @Test
    public void testVenderProducto() {

        tienda.agregarProducto(producto);
        tienda.venderProducto("Camiseta", 10);
        assertEquals(90, producto.getStock());
    }
}
