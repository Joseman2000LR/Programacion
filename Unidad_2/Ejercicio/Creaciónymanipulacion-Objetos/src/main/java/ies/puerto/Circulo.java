package ies.puerto;

public class Circulo {
    private int radio;

    public Circulo() {

    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * metodo que realiza el area de un circulo
     * 
     * @param radio
     * @return
     */
    public double calcularArea(int radio) {
        double area;
        area = 3.14 * (radio * radio);
        return area;
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
