package ies.puerto;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String chip, String nombre) {
        super(chip, nombre);
    }

    @Override
    public String suSonido() {
        return "gua";
    }
}
