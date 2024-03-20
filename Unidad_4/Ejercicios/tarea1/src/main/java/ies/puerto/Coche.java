package ies.puerto;

public class Coche extends Vehiculo {
    private String matricula;

    public Coche() {

    }

    /**
     * Contrutor con todos los atributos Coche
     * 
     * @param color
     * @param matricula
     */
    public Coche(String color, String matricula) {
        super(color);
        this.matricula = matricula;

    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String mensaje = "Yo soy un Coche ";
        if (getColor() != null) {
            mensaje += " mi color es :" + getColor();
        }
        if (getMatricula() != null) {
            mensaje += " mi matricula es :" + getMatricula();
        }
        return mensaje;
    }

}
