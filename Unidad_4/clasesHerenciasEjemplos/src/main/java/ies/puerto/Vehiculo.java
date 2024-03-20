package ies.puerto;

/**
 * 
 */
public class Vehiculo {

    private String color;

    public Vehiculo() {

    }

    public Vehiculo(String color) {
        this.color = color;
    }

    public void micolor() {
        System.out.println("Mi color es :" + color);
    }

    public void mover() {
        System.out.println("mover");
    }

    private void apagar() {

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Mi color es :" + color;

    }

}
