package ies.puerto;

public class Tienda {
    Producto producto1 = new Producto("Tornillo", 0.5, 5);

    public void agregarProducto(String nombre, int precio, double stock) {
        Producto producto2 = new Producto(nombre, precio, precio);
    }

    public void vender() {

    }

    public void mostarProducto() {

    }
}
