package ies.puerto.modelo.entity;

import ies.puerto.modelo.abstractas.ProductoAbstract;


public class Aparato extends ProductoAbstract {

    public Aparato(String id) {
        super(id);
    }

    public Aparato(String id, String nombre, float precio, String fEntrada) {
        super(id, nombre, precio, fEntrada);
    }

  
   

    @Override
    public float precioMaximo() {
       return (float) 1.45*getPrecio();
    }

    @Override
    public float cantidadDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
