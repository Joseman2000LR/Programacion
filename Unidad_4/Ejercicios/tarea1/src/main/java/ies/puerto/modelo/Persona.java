package ies.puerto.modelo;

import ies.puerto.excepciones.ValidacionException;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String dni;
    Autenticacion autenticacion;

    public Persona() {

    }

    /**
     * Contrutor con todos los atributos de Persona
     * 
     * @param nombre
     * @param edad
     * @param dni
     * @throws ValidacionException
     */
    public Persona(String nombre, int edad, String dni) throws ValidacionException {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        autenticacion.verificarDni(dni);

    }

    public String saludar() {
        return "Hola soy generico";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return " nombre :" + getNombre() +
                ", edad :" + getEdad() +
                ", dni :" + getDni();
    }

}
