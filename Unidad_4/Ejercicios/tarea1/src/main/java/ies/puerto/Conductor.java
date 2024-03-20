package ies.puerto;

public class Conductor extends Persona {

    Coche coche;
    Motocicleta motocicleta;

    public Conductor() {
    }
    /**
     * Contrutor con todos los atributos Conductor
     * @param nombre
     * @param edad
     * @param dni
     * @param coche
     * @param motocicleta
     */
    public Conductor(String nombre, int edad, String dni, Coche coche, Motocicleta motocicleta) {
        super(nombre, edad, dni);
        this.coche = coche;
        this.motocicleta = motocicleta;
    }

    public Coche getCoche() {
        return this.coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Motocicleta getMotocicleta() {
        return this.motocicleta;
    }

    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }

    @Override
    public String toString() {
        return "Soy un Conductor " + "dni :" + getDni() +
                " Nombre :" + getNombre() + " Edad :" + getEdad() +
                " coche : " + "mi color es " + coche.getColor() + "mi matricula es :" + coche.getMatricula() +
                "y motocicleta :" + ", con talla " + motocicleta.getTalla() + ", y color " + motocicleta.getColor();

    }

}
