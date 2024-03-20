package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    Producto producto;
    Producto producto2;

    @BeforeEach
    public void beforeEach() {
        producto = new Producto("Pepe", 20.0, 10);
        producto2 = new Producto();
    }

    @Test
    public void productoNombreTest() {
        String nombre = "Pepe";
        producto.setNombre(nombre);
        Assertions.assertEquals(nombre, producto.getNombre(), "no se a obtenido el valor indicado");
    }

    @Test
    public void productoPrecioTest() {
        double precio = 20.0;
        producto.setPrecio(precio);
        Assertions.assertEquals(precio, producto.getPrecio(), "no se a obtenido el valor indicado");

    }

    @Test
    public void productoStockTest() {
        int stock = 10;
        producto.setStock(stock);
        Assertions.assertEquals(stock, producto.getStock(), "no se a obtenido el valor indicado");
    }

    @Test
    public void productoToString() {
        producto2.setNombre("Tornillo");
        producto2.setPrecio(10);
        producto2.setStock(5);
        String resultado = "{" +
                " nombre='" + producto2.getNombre() + "'" +
                ", precio='" + producto2.getPrecio() + "'" +
                ", stock='" + producto2.getStock() + "'" +
                "}";
        Assertions.assertEquals(resultado, producto2.toString(), "No se ha obtenido el valor indicado");
    }

}
