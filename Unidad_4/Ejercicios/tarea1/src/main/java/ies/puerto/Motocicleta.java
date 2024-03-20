package ies.puerto;

public class Motocicleta extends Vehiculo {

    private String talla;

    /**
     * Contrutor con todos los atributos Motocicleta
     * 
     * @param talla
     * @param color
     */
    public Motocicleta(String talla, String color) {
        super(color);
        this.talla = talla;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Yo soy una motocicleta , con talla " + this.getTalla() + ", y color " + this.getColor();
    }

}
