
package ies.puerto.modelo.entity;

import ies.puerto.modelo.abstractas.ProductoAbstract;
import ies.puerto.modelo.entity.interfaces.IRecomendable;

/**
 *
 * @author josem
 */
public class ProductoRecomendable extends ProductoAbstract implements IRecomendable{

    public ProductoRecomendable(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada);
    }

    public ProductoRecomendable(String id) {
        super(id);
    }

    @Override
    public float precioMaximo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float cantidadDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean recomendarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularPopularidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
