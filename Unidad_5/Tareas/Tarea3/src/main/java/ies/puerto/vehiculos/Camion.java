package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Camion extends Vehiculo {

    public Camion() {
    }

    public Camion(String matricula) {
        super(matricula);
    }

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
    
    
    public int velocidadMaxima() {

        return 160;
    }
}
