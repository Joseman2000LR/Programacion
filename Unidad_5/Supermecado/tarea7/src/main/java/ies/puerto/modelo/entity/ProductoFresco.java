package ies.puerto.modelo.entity;

import ies.puerto.modelo.abstractas.ProductoAbstract;
import ies.puerto.modelo.entity.interfaces.ISaludable;

/**
 *
 * @author josem
 */
public class ProductoFresco extends ProductoAbstract implements ISaludable{

    public ProductoFresco(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada);
    }
    
    
    public ProductoFresco(String id) {
        super(id);
    }

    @Override
    public float diasRestantesCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean verificarCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    

   

    
    
   

    
}
