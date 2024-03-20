package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

/**
 *
 * @author josem
 */
public class Coche extends Vehiculo{

    // Contrutor por defecto
    public Coche() {
    }

    public Coche(String matricula) {
        super(matricula);
    }
    

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
    
    @Override
    public int velocidadMaxima() {
      
        return 180;
    }
    
    
    
}
