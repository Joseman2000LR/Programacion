package ies.puerto;

public class Rectangulo extends Figura {
    public Rectangulo() {

    }

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    @Deprecated
    public float calucularArea() {
        return Area();
    }

    public float Area() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return "Base" + getBase() + "Altura " + getAltura();
    }

}
