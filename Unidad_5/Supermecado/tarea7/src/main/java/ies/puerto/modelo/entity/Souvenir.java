

package ies.puerto.modelo.entity;

import ies.puerto.modelo.abstractas.ProductoAbstract;



/**
 *
 * @author josem
 */
public class Souvenir extends ProductoAbstract {

    public Souvenir(String id) {
        super(id);
    }

    public Souvenir(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada);
    }

   

    @Override
    public float precioMaximo() {
       return  (float) 1.3*getPrecio();
    }

    @Override
    public float cantidadDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
