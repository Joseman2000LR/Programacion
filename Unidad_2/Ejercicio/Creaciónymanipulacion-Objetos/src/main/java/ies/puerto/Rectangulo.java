package ies.puerto;

public class Rectangulo {
    int largo;
    int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    /**
     * funcion que realiza el calculo del area de un rectangulo
     * 
     * @param a
     * @param b
     * @return
     */
    public int areaRectangulo(int a, int b) {
        return (a * b);
    }

    public int perimetroRectangulo(int largo, int ancho) {
        return (2 * largo) + (2 * ancho);
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return " largo='" + getLargo() + "'" +
                ", ancho='" + getAncho();
    }



}
