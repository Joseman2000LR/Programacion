package ies.puerto;

public class Cuadrado extends Rectangulo {
    public Cuadrado() {

    }

    public Cuadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public float calucularArea() {
        return getAltura() * getAltura();
    }

    @Override
    public String toString() {
        return "lado A " + getAltura() + "lado B " + getBase();
    }
}
