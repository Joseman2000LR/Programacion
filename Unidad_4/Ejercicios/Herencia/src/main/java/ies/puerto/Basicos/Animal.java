package ies.puerto;

public class Animal {
    private String nombre;
    private int edad;

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

    /**
     * Metodo para las subclase
     */
    public void hacerSonido() {
        String mensaje = "";

    }
}
