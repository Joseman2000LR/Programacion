package ies.puerto;

public class Bicicleta extends Vehiculo {

    private String talla;

    public Bicicleta(String talla, String color) {
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
        return "Yo soy una bicicleta , con talla " + this.getTalla() + ", y color " + this.getColor();
    }

}
