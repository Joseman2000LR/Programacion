package ies.puerto.modelo.entity;

public class CuidadoPersonal extends ProductoRecomendable{
   private int popularidad;

    public CuidadoPersonal(String id, String nombre, float precio, String fEntrada ,int popularidad) {
        super(id, nombre, precio, fEntrada);
        this.popularidad = popularidad;
    }
    public CuidadoPersonal(String id) {
        super(id);
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
   

    @Override
    public float precioMaximo() {
       return  (float) 1.8*getPrecio();
    }

    @Override
    public float cantidadDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
