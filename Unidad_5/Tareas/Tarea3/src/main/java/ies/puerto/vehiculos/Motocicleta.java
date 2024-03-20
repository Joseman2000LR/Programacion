package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

/**
 *
 * @author josem
 */
public class Motocicleta extends Vehiculo {

    //Contrutor por defecto
    public Motocicleta() {
    }


    public Motocicleta(String matricula) {
        super(matricula);
    }

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
    
    @Override
    public int velocidadMaxima() {
      
        return 120;
    }


    
}
