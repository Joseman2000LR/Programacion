package ies.puerto;

public class Triangulo extends Figura {
    public Triangulo(float base, float altura) {
        super(base, altura);

    }

    @Override
    public float calucularArea() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public String toString() {
        return "Base: " + getBase() + ", altura" + getAltura();
    }
}
