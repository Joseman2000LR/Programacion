package ies.puerto;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    Producto producto;
    List<Producto> inventario;
    Tienda tienda = new Tienda(inventario);

    @BeforeEach
    public void beforeEach() {
        producto = new Producto("Camiseta", 20.0, 100);
    }

    @Test
    public void testAgregarProducto() {
        tienda.agregarProducto(producto);

    }

}
