package ies.puerto;

public class Circulo {
    private int radio;

    public Circulo() {

    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "radio= " + getRadio();
    }
}
