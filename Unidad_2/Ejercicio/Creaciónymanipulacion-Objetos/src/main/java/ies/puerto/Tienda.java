package ies.puerto;

import java.util.List;

public class Tienda {
    Producto producto;
    private List<Producto> inventario;

    public Tienda() {

    }

    public Tienda(Producto producto) {
        this.producto = producto;
    }

    public Tienda(List<Producto> inventario) {
        this.inventario = inventario;
    }

    /**
     * Metodo que agrega a una lista un objecto
     * 
     * @param producto
     */
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    /**
     * Metodo que elimina la cantidad de un producto en una lista
     * 
     * @param nombreProducto
     * @param cantidad
     * @return
     */
    public String venderProducto(String nombreProducto, int cantidad) {
        String venta;
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreProducto)) {
                if (producto.getStock() >= cantidad) {
                    producto.setStock(producto.getStock() - cantidad);
                    return venta = "Se vendieron " + cantidad + " unidades de " + nombreProducto;
                }
                return venta = "No hay suficiente stock de " + nombreProducto + " para vender " + cantidad
                        + " unidades";

            }
        }
        return venta = nombreProducto + " no se encontró en el inventario.";
    }

    /**
     * metodo que muestra la lista
     * 
     * @return
     */
    public String mostrarInventario() {
        String mostar = "";
        if (inventario.isEmpty()) {
            return mostar = "El inventario está vacío.";
        }
        for (Producto producto : inventario) {
            mostar = "Inventario de la tienda:" + "Nombre: " + producto.getNombre() + ", Precio: "
                    + producto.getPrecio() + ", Stock: " + producto.getStock();
        }
        return mostar;
    }

    public List<Producto> getInventario() {
        return this.inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return " inventario='" + getInventario();
    }
}
