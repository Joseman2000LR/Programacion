package ies.puerto;

public class Gato extends Especies {

    public Gato(String nombre, String chip) {
        super(nombre, chip);

    }

    @Override
    public String suSonido() {
        return "miau";
    }

    

}
