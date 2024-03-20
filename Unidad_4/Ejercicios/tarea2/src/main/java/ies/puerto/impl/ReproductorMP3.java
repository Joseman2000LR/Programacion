package ies.puerto.impl;

import ies.puerto.interfaz.IReproductor;

public class ReproductorMP3 implements IReproductor {

    @Override
    public String reproducir() {
        return "reproduciendo Mp3";
    }

    @Override
    public String detener() {
        return "";
    }

}
