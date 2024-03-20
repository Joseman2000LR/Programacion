package ies.puerto;

public abstract class Animal {
    private String chip;
    private String nombre;

    public Animal() {

    }

    public Animal(String chip, String nombre) {
        this.chip = chip;
        this.nombre = nombre;
    }

    public String suSonido() {
        return "soy un sonido";
    }

    public String getChip() {
        return this.chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " Nombre :" + getNombre() +
                ", Chip :" + getChip();
    }

}