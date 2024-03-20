package ies.puerto;

abstract class Vehiculo {

    private String color;

    public Vehiculo() {

    }

    /**
     * Contrutor con todos los atributos Vehiculo
     * 
     * @param color
     */
    public Vehiculo(String color) {
        this.color = color;
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
