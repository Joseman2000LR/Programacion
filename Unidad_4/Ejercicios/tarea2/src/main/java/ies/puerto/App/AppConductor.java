package ies.puerto.App;

import ies.puerto.impl.Automovil;

public class AppConductor {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.arrancar();
        automovil.conducir();
        automovil.detener();
    }
}
