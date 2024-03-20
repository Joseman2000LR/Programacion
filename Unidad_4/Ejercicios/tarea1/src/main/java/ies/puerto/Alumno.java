package ies.puerto;

public class Alumno extends Persona {

    public Alumno() {

    }

    /**
     * Contrutor con todos los atributos
     *      *  m nombre
     * 
     * @param edad
     * @param dni
     */
    public Alumno(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return " nombre :" + getNombre() +
                ", edad :" + getEdad() +
                "y dni :" + getDni();
    }

}
