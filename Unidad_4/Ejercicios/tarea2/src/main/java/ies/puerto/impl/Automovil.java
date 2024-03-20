package ies.puerto.impl;

public class Automovil implements Conductor {

    @Override
    public void arrancar() {
        System.out.println("El automóvil ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El automóvil se ha detenido.");
    }

    public void conducir() {
        System.out.println("El automóvil está en movimiento.");
    }

}
