package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstrac implements IFormaGeometrica {
    public Cuadrado(float lado) {
        super(lado, lado);
    }

    public Cuadrado(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return getAltura() * getBase();
    }

}
