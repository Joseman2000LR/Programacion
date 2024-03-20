package ies.puerto.modelo.entity;

public class Alimento extends ProductoFresco{
    
   private String fCaducidad;

    public Alimento(String id, String nombre, float precio, String fEntrada,String fCaducidad) {
        super(id, nombre, precio, fEntrada);
        this.fCaducidad = fCaducidad;
    }

    

    public Alimento(String id) {
        super(id);
    }

    public String getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }
    

  
    @Override
    public float precioMaximo() {
        return (float) (1.35 * getPrecio());
    }

    @Override
    public float cantidadDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
