package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
    }

    public Bicicleta(String matricula) {
        super(matricula);
    }

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    public int velocidadMaxima() {

        return 40;
    }
}
